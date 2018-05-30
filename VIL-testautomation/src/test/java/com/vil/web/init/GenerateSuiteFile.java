/***********************************************************************
 * @author 			:		Srinivas Hippargi
 * @description		: 		This class has code to generate testng.xml file based config.xlsx configuration setup
 * 							it will generate testng_web_sequential.xml and testng_web_parallel.xml file.
 */

package com.vil.web.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.vil.web.library.ExcelLibrary;
import com.vil.web.library.GenericLib;

public class GenerateSuiteFile {
	// TODO Auto-generated method stub
	public static void main(String[] args) {

		// Checks Application Type is not null from config sheet config.xlsx
		// file
		if (GenericLib.executionType() != null) {
			// Checks Application Type is WEB from config sheet config.xlsx file
			if (GenericLib.executionType().equalsIgnoreCase("WEB")) {
				// Checks execution type is Sequential from config sheet
				// config.xlsx file
				if (ExcelLibrary
						.getExcelData("./config/config.xlsx", "config", 1,
								GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Execution Type"))
						.trim().equalsIgnoreCase("Sequential")) {

					System.out.println("Sequential");
					// Checks if execution type is Sequential from config sheet
					// config.xlsx file  Number of browser should be 1
					if (ExcelLibrary
							.getExcelData("./config/config.xlsx", "config", 1, GenericLib
									.getHeaderColumnIndex("./config/config.xlsx", "config", "Number of Browsers"))
							.trim().equalsIgnoreCase("1")) {
						// add parameter browser from config sheet config.xlsx
						// file
						HashMap<String, String> testParameters = new HashMap<String, String>();
						testParameters.put(
								ExcelLibrary.getExcelData("./config/config.xlsx", "config", 0,
										GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config",
												"Browser Name")),
								ExcelLibrary.getExcelData("./config/config.xlsx", "config", 1, GenericLib
										.getHeaderColumnIndex("./config/config.xlsx", "config", "Browser Name")));

						ArrayList<String> moduleNames = new ArrayList<String>();
						// find total module count from ModuleExecutionControl
						// sheet config.xlsx file
						int totalModuleRowCount = ExcelLibrary.getExcelRowCount("./config/config.xlsx",
								"ModuleExecutionControl");
						for (int i = 1; i <= totalModuleRowCount; i++) {
							
							if (ExcelLibrary
									.getExcelData("./config/config.xlsx", "ModuleExecutionControl", i,
											GenericLib.getHeaderColumnIndex("./config/config.xlsx",
													"ModuleExecutionControl", "Execution_Status"))
									.trim().equals("Yes")) {
								// if Module status is Yes add in List
								moduleNames
										.add(ExcelLibrary.getExcelData("./config/config.xlsx", "ModuleExecutionControl",
												i, GenericLib.getHeaderColumnIndex("./config/config.xlsx",
														"ModuleExecutionControl", "ModuleName")).toLowerCase());
							}
						}
						if (moduleNames.size() != 0) {
							HashMap<String, String> testCases = new HashMap<String, String>();
							// add all the test cases from respective modules
							for (int i = 0; i < moduleNames.size(); i++) {
								String modulenames[] = GenericLib.testConfigutration("./config/config.xlsx",
										moduleNames.get(i));
								testCases.put(moduleNames.get(i),
										Arrays.toString(modulenames).replace("[", "").replace("]", ""));
							}
							// Generate testng_web_sequential_xml file
							GenerateXmlFile.xmlclassgeneration_sequential(moduleNames, testCases, testParameters);
						} else if (moduleNames.size() == 0) {
							System.out.println(
									"Please select modules which you wan execute in under config_execution --> Test Execution Control");
						}

					} else {
						System.out.println("Please select browser count as 1 for sequential execution");
					}
				}
				// Checks execution type is Parallel from config sheet config.xlsx file
				else if (ExcelLibrary
						.getExcelData("./config/config.xlsx", "config", 1,
								GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Execution Type"))
						.trim().equalsIgnoreCase("Parallel")) {

					System.out.println("Parallel");
					// Checks if execution type is Sequential from config sheet
					// config.xlsx file  Number of browser should be > 1
					if (Integer.parseInt(ExcelLibrary
							.getExcelData("./config/config.xlsx", "config", 1, GenericLib
									.getHeaderColumnIndex("./config/config.xlsx", "config", "Number of Browsers"))
							.trim()) > 1) {

						// Generate testng_web_parallel.xml file
						GenerateXmlFile
								.xmlclassgeneration_parallel_web(
										Integer.parseInt(ExcelLibrary.getExcelData("./config/config.xlsx",
												"config", 1, GenericLib.getHeaderColumnIndex("./config/config.xlsx",
														"config", "Number of Browsers"))
												.trim()),
										GenericLib.executionType());

					} else {
						System.out.println("Please select > 1 browser for parallel execution");
					}

				}
			} else {
				System.out.println("Please select Execution Type");
			}
		}
	}
}