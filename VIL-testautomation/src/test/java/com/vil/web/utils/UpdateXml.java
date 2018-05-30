package com.vil.web.utils;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.vil.web.library.BaseLib;

public class UpdateXml {

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: find CAFid in xml file and take last three digits and
	 * replace the value in entire xml
	 * 
	 */
	public static void replaceCAFValue(String srcPath, String destPath, String replacement,String paymentType)
			throws SAXException, IOException {

		String filePath = srcPath;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filePath);
			doc.getDocumentElement().normalize();
			String regex = readACAFIDValue(doc, "DealerCode");
			String dom = convertDocumentToString(doc);
			System.out.println(dom);
			dom = replaceNodeValue(dom, regex, replacement);
			dom = dom.replaceAll(">\\s+<", "><");
			System.out.println(dom);
			doc = convertStringToDocument(dom);
			if (paymentType.equalsIgnoreCase("Prepaid")) {
				Map<String, String> tagsMap = new LinkedHashMap<String, String>();
				Random rnd = new Random();
				int n = 10000000 + rnd.nextInt(90000000);
				tagsMap.put("ExternalPrepaidSubscriberId", n + "");
				updateElementValue(doc, "TmCafMsisdnBc", tagsMap);
				Map<String, String> tagsMap1 = new LinkedHashMap<String, String>();
				tagsMap1.put("AssetIntegrationId", n + "");
				updateElementValue(doc, "TmCafItemsBc", tagsMap1);
				
			} else {
				Map<String, String> tagsMap = new LinkedHashMap<String, String>();
				Random rnd = new Random();
				int n = 10000000 + rnd.nextInt(90000000);
				tagsMap.put("ExternalPostpaidSubscriberId", n + "");
				updateElementValue(doc, "TmCafMsisdnBc", tagsMap);
				Map<String, String> tagsMap1 = new LinkedHashMap<String, String>();
				tagsMap1.put("AssetIntegrationId", n + "");
				updateElementValue(doc, "TmCafItemsBc", tagsMap1);
			}
			try {
				doc.getDocumentElement().normalize();
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(destPath));
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(source, result);
				System.out.println("XML file updated successfully");
			} catch (TransformerException te) {
				System.out.println(te.getMessage());
			}
		} catch (ParserConfigurationException pce) {
			System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: find Node from xml file and take value and replace
	 * 
	 */
	public static void modifyAllNodeValue(String srcPath, String destPath, String rootNode, Map<String, String> tagsMap)
			throws SAXException, IOException {

		String filePath = srcPath;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filePath);
			doc.getDocumentElement().normalize();
			updateElementValue(doc, rootNode, tagsMap);
			String dom = convertDocumentToString(doc);
			dom = dom.trim();
			doc = convertStringToDocument(dom);
			try {
				doc.getDocumentElement().normalize();
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(destPath));
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(source, result);
				System.out.println("XML file updated successfully");
			} catch (TransformerException te) {
				System.out.println(te.getMessage());
			}
		} catch (ParserConfigurationException pce) {
			System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: convert xml doc into string formate
	 * 
	 */
	private static String convertDocumentToString(Document doc) {
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tf.newTransformer();
			// below code to remove XML declaration
			// transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
			// "yes");
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			String output = writer.getBuffer().toString();
			return output;
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: convert String into xml doc formate
	 * 
	 */
	private static Document convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void addElement(Document doc) {
		NodeList employees = doc.getElementsByTagName("Employee");
		Element emp = null;

		// loop for each employee
		for (int i = 0; i < employees.getLength(); i++) {
			emp = (Element) employees.item(i);
			Element salaryElement = doc.createElement("salary");
			salaryElement.appendChild(doc.createTextNode("10000"));
			emp.appendChild(salaryElement);
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Delete Node Value
	 * 
	 */
	private static void deleteElement(Document doc) {
		NodeList employees = doc.getElementsByTagName("Employee");
		Element emp = null;
		// loop for each employee
		for (int i = 0; i < employees.getLength(); i++) {
			emp = (Element) employees.item(i);
			Node genderNode = emp.getElementsByTagName("gender").item(0);
			emp.removeChild(genderNode);
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Update Node Value
	 * 
	 */
	private static void updateElementValue(Document doc, String rootNode, Map<String, String> tagsMap) {
		NodeList root = doc.getElementsByTagName(rootNode);
		Element node = null;
		// loop for each employee
		Iterator<Entry<String, String>> itr = tagsMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			for (int i = 0; i < root.getLength(); i++) {
				node = (Element) root.item(i);
				Node name = node.getElementsByTagName(pair.getKey().toString()).item(0).getFirstChild();
				// name.setNodeValue(name.getNodeValue().toLowerCase());
				name.setNodeValue(pair.getValue().toString());
				System.out.println("---------------------" + name.toString());
			}
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Read Cafid value
	 * 
	 */
	private static String readACAFIDValue(Document doc, String tagName) {

		NodeList root = doc.getElementsByTagName("SiebelMessage");
		Element node = null;
		// loop for each employee
		String regex = "";
		for (int i = 0; i < root.getLength(); i++) {
			node = (Element) root.item(i);
			Node nodename = node.getElementsByTagName(tagName).item(0).getFirstChild();
			String name = node.getElementsByTagName(tagName).item(i).getFirstChild().getNodeValue();
			regex = name.substring(name.length()-3, name.length());
		}
		return regex;
	}

	private static String replaceNodeValue(String dom, String regex, String replacement) {

		
		return dom=dom.replaceAll(regex,replacement);
	}

	private static void updateAttributeValue(Document doc) {
		NodeList employees = doc.getElementsByTagName("Employee");
		Element emp = null;
		// loop for each employee
		for (int i = 0; i < employees.getLength(); i++) {
			emp = (Element) employees.item(i);
			String gender = emp.getElementsByTagName("gender").item(0).getFirstChild().getNodeValue();
			if (gender.equalsIgnoreCase("male")) {
				// prefix id attribute with M
				emp.setAttribute("id", "M" + emp.getAttribute("id"));
			} else {
				// prefix id attribute with F
				emp.setAttribute("id", "F" + emp.getAttribute("id"));
			}
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Convert XML file into String and segregate in one line
	 * 
	 */
	public static String getResponseXMLOneLiner(String srcPath, String rootNode, String tagName, String value)
			throws SAXException, IOException {

		String filePath = srcPath;
		String dom = "";
		Document doc = null;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(filePath);
			doc.getDocumentElement().normalize();

			NodeList root = doc.getElementsByTagName(rootNode);
			Element node = null;
			// loop for each employee
			for (int i = 0; i < root.getLength(); i++) {
				node = (Element) root.item(i);
				Node name = node.getElementsByTagName(tagName).item(0).getFirstChild();
				// name.setNodeValue(name.getNodeValue().toLowerCase());
				name.setNodeValue(value);
				System.out.println("---------------------" + name.toString());
			}

			dom = convertDocumentToString(doc);
			// System.out.println(dom);
			dom = dom.replaceAll(">\\s+<", "><");
			System.out.println(dom);
			// doc=convertStringToDocument(dom);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return dom;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Convert XML file into String with provided map and segregate
	 * in one line
	 * 
	 */
	public static String getResponseXMLOneLinerMap(String srcPath, String rootNode, Map<String, String> tagsMap)
			throws SAXException, IOException {

		String filePath = srcPath;
		String dom = "";
		Document doc = null;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(filePath);
			doc.getDocumentElement().normalize();

			NodeList root = doc.getElementsByTagName(rootNode);
			Element node = null;
			// loop for each employee

			Iterator<Entry<String, String>> itr = tagsMap.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry pair = (Map.Entry) itr.next();
				for (int i = 0; i < root.getLength(); i++) {
					node = (Element) root.item(i);
					Node name = node.getElementsByTagName(pair.getKey().toString()).item(0).getFirstChild();
					// name.setNodeValue(name.getNodeValue().toLowerCase());
					name.setNodeValue(pair.getValue().toString());
					System.out.println("---------------------" + name.toString());
				}

			}
			dom = convertDocumentToString(doc);
			// System.out.println(dom);
			dom.trim();
			dom = dom.replaceAll(">\\s+<", "><");
			dom.trim();
			// dom= dom.replaceAll(">\\s+<", "");
			System.out.println(dom);
			// doc=convertStringToDocument(dom);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return dom;
	}

	public static void traverseInXmlAndUpdate(String srcPath, String rootNode, Map<String, String> tagsMap) {

		String filePath = srcPath;
		String dom = "";
		Document doc = null;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName(rootNode);

			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {

				if(temp==12){
					NodeList root = doc.getElementsByTagName(rootNode);
					Element node = null;
					// loop for each employee

					Iterator<Entry<String, String>> itr = tagsMap.entrySet().iterator();
					while (itr.hasNext()) {
						Map.Entry pair = (Map.Entry) itr.next();
							node = (Element) root.item(12);
							Node name = node.getElementsByTagName(pair.getKey().toString()).item(0).getFirstChild();
							// name.setNodeValue(name.getNodeValue().toLowerCase());
							name.setNodeValue(pair.getValue().toString());
							System.out.println("---------------------" + name.toString());

					}
				}
				
				try {
					doc.getDocumentElement().normalize();
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult result = new StreamResult(new File(srcPath));
					transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
					transformer.setOutputProperty(OutputKeys.INDENT, "yes");
					transformer.transform(source, result);
					System.out.println("XML file updated successfully");
				} catch (TransformerException te) {
					System.out.println(te.getMessage());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: read caf id value
	 */
	public static String readCAFValue(String srcPath)
			throws Exception {

		String filePath = srcPath;
		File xmlFile = new File(filePath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		String name="";
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(filePath);
			doc.getDocumentElement().normalize();
			NodeList root = doc.getElementsByTagName("SiebelMessage");
			Element node = null;
			// loop for each employee
			for (int i = 0; i < root.getLength(); i++) {
				node = (Element) root.item(i);
				Node nodename = node.getElementsByTagName("CAFId").item(0).getFirstChild();
				 name= node.getElementsByTagName("CAFId").item(i).getFirstChild().getNodeValue();
			}
			return name;
			
		}catch (Exception e) {
			throw new Exception();
		}
	}
}