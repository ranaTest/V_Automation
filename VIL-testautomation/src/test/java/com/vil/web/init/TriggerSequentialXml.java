/***********************************************************************
 * @author 			:		Srinivas Hippargi
 * @description		: 		Trigger testng_web_sequential.xml through Java Main Method class
 */

package com.vil.web.init;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

public class TriggerSequentialXml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		String xmlFileName = "testng_web_sequential.xml";
		List<XmlSuite> suite;
		try {
			suite = (List<XmlSuite>) (new Parser(xmlFileName).parse());
			testng.setXmlSuites(suite);
			testng.run();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
