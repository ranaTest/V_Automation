/***********************************************************************
 * @author 			:		Rana Thakur
 * @description		: 		This class has code to generate testng.xml file based config.xlsx configuration setup
 * 							it will generate testng_web_sequential.xml and testng_web_parallel.xml file.
 */
package com.vil.web.init;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.vil.web.library.ExcelLibrary;
import com.vil.web.library.GenericLib;

public class GenerateXmlFile {

	/** The suite. */
	static XmlSuite suite = new XmlSuite();

	static String mappack = null;

	/** The par. */
	static Map<String, String> parameters = null;

	/** The suites. */
	static List<XmlSuite> suites = new ArrayList<XmlSuite>();

	/**
	 * Generates XML Class.
	 */
	public static int count = 1;
	public static int listner_count = 0;

	public static void xmlclassgeneration_sequential(ArrayList<String> moduleNames, HashMap<String, String> testCases,
			HashMap<String, String> testParameters) {
		XmlTest test = new XmlTest(suite);

		/**
		 * Add Listener Classes
		 */
		// Thread count need to be provided for running scripts sequential
		if (listner_count < count) {
			// add pdf listener
			suite.addListener("com.vil.web.reports.MyExtentListners");
			// suite.addListener("com.utteshappend.pdfngreport.PDFReportListener");
			listner_count = listner_count + 1;
		}
		/**
		 * Add Parameters for suite level
		 */
		HashMap<String, String> testParameters1 = new HashMap<String, String>();
		testParameters1.put("pdfngreport-properties", "pdfngreport.properties");
		suite.setParameters(testParameters1);
		suite.setGroupByInstances(false);
		suite.setThreadCount(1);
		Set<String> keys = testCases.keySet();
		ArrayList<String> testNames = new ArrayList<String>();
		for (String key : keys) {
			testNames.add(key);
		}
		/**
		 * Add classes based on module and class
		 */
		String testname = Arrays.toString(testNames.toArray());
		test.setName("Regression_Test");
		test.setPreserveOrder(true);
		test.setParameters(testParameters);
		ArrayList<XmlClass> classes = new ArrayList<XmlClass>();
		Iterator it = testCases.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			String[] testcases = pair.getValue().toString().replace(",", "").split(" ");
			for (int j = 0; j < testcases.length; j++) {
				String className = "com.vil.web.tests." + pair.getKey() + "." + testcases[j].replace("]", "");
				System.out.println(className);
				classes.add(new XmlClass(className));
			}

		}

		test.setXmlClasses(classes);
		it.remove(); // avoids a ConcurrentModificationException

		suites.add(suite);
		suite.setName("Suite");
		/**
		 * Create XML File
		 */
		try {
			FileWriter writer = new FileWriter("testng_" + "web_sequential" + ".xml");
			writer.write(suite.toXml());
			writer.flush();
			writer.close();
		} catch (Exception e) {

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void xmlclassgeneration_parallel_web(Integer noOfBrowsers, String executionType) {
		// TODO Auto-generated method stub
		System.out.println(noOfBrowsers);
		System.out.println(executionType);

		/**
		 * Add Listener Classes
		 */
		// Thread count need to be provided for running scripts sequential
		if (listner_count < count) {
			// add pdf listener
			suite.addListener("com.vil.web.reports.MyExtentListners");
			// suite.addListener("com.utteshappend.pdfngreport.PDFReportListener");
			listner_count = listner_count + 1;
		}

		/*
		 * Add Parameters for suite level
		 */

		HashMap<String, String> testParameters1 = new HashMap<String, String>();
		testParameters1.put("pdfngreport-properties", "pdfngreport.properties");
		suite.setParameters(testParameters1);
		suite.setGroupByInstances(false);
		suite.setThreadCount(noOfBrowsers);
		suite.setParallel("tests");

		// find total module count from ModuleExecutionControl
		// sheet config.xlsx file
		ArrayList<String> moduleNames = new ArrayList<String>();
		int totalModuleRowCount = ExcelLibrary.getExcelRowCount("./config/config.xlsx", "ModuleExecutionControl");
		for (int i = 1; i <= totalModuleRowCount; i++) {
			if (ExcelLibrary
					.getExcelData("./config/config.xlsx", "ModuleExecutionControl", i, GenericLib
							.getHeaderColumnIndex("./config/config.xlsx", "ModuleExecutionControl", "Execution_Status"))
					.trim().equals("Yes")) {
				moduleNames
						.add(ExcelLibrary.getExcelData("./config/config.xlsx", "ModuleExecutionControl", i, GenericLib
								.getHeaderColumnIndex("./config/config.xlsx", "ModuleExecutionControl", "ModuleName")));
			}
		}

		// Iterate loop based number of browsers to parameters to <test> in <suite>
		ArrayList<String> browserNames = new ArrayList<String>();
		for (int i = 1; i <= noOfBrowsers; i++) {
			browserNames.add(ExcelLibrary.getExcelData("./config/config.xlsx", "config", i,
					GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Browser Name")));
		}

		if (noOfBrowsers > 1) {
			if (moduleNames.size() != 0) {

				for (int i = 1; i <= noOfBrowsers; i++) {
					XmlTest test = new XmlTest(suite);
					HashMap<String, String> testCases = new HashMap<String, String>();

					for (int l = 0; l < moduleNames.size(); l++) {
						String modulenames[] = GenericLib.testConfigutration("./config/config.xlsx",
								moduleNames.get(l));
						testCases.put(moduleNames.get(l),
								Arrays.toString(modulenames).replace("[", "").replace("]", ""));
					}

					System.out.println("loop" + i);
					System.out.println(testCases.size());
					Set<String> keys = testCases.keySet();
					ArrayList<String> testNames = new ArrayList<String>();
					for (String key : keys) {
						testNames.add(key);
						System.out.println(key);
					}

					HashMap<String, String> testParameters = new HashMap<String, String>();

					testParameters.put(
							ExcelLibrary.getExcelData("./config/config.xlsx", "config", 0,
									GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Browser Name")),
							ExcelLibrary.getExcelData("./config/config.xlsx", "config", i,
									GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Browser Name")));
					for (Map.Entry entry : testParameters.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					String testname = Arrays.toString(testNames.toArray());
					// System.out.println(testname);

					test.setName("Regression_Test_" + browserNames.get(i - 1) + "_" + i);
					// test.setPreserveOrder("true");
					test.setPreserveOrder(true);
					test.setParameters(testParameters);
					// testParameters.clear();
					test.setThreadCount(noOfBrowsers);
					ArrayList<XmlClass> classes = new ArrayList<XmlClass>();
					Iterator it = testCases.entrySet().iterator();
					while (it.hasNext()) {
						System.out.println("inside");
						Map.Entry pair = (Map.Entry) it.next();
						System.out.println(pair.getKey() + " = " + pair.getValue());
						String[] testcases = pair.getValue().toString().replace(",", "").split(" ");
						System.out.println("Test cases length " + testcases.length);

						// Add all test cases in before creating xml file
						for (int k = 0; k < testcases.length; k++) {
							String className = "com.vil.web.tests." + pair.getKey() + "."
									+ testcases[k].replace("]", "");
							System.out.println(className);
							classes.add(new XmlClass(className));
						}

						test.setXmlClasses(classes);
						it.remove();

					}
				}

			}
		} else if (moduleNames.size() == 0) {
			System.out.println(
					"Please select modules which you wan execute in under config_execution --> Test Execution Control");
		} else {
			System.out.println("Please configure > 1 browser in config.xlsx--> config for Parallel execution");
		}

		suites.add(suite);
		suite.setName("Suite");
		try {
			FileWriter writer = new FileWriter("testng_" + "web_parallel" + ".xml");
			writer.write(suite.toXml());
			writer.flush();
			writer.close();
		} catch (Exception e) {

		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}