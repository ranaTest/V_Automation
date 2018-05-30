package com.vil.web.library;



import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.ServerXmlUpdation;
import com.vil.web.utils.UpdateXml;

public class FunctionLib {
	
	
	public FunctionLib(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void postpaidMSISDN(String filepath, String sheetname, String testcaseID) throws Exception{
		
		o_loginPage.fstLogin(filepath,sheetname,testcaseID);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn= n + "1";
		Random rand = new Random();
		int num=rand.nextInt(50 - 1 + 1) + 1;
		//int  n1 = rand.nextInt(50) + 1;
		GenericLib.setPropertyValue(GenericLib.sDirPath + "/propertyfiles/PostpaidMsisdn.properties", "MSISDN" +num , msisdn);
		String cafId=msisdn;
		cafId=cafId.substring(1, 9);
		String cposId=cafId.substring(2,8);
		GenericLib.setCellData(filepath, sheetname, testcaseID,  "MSISDN", msisdn);
		System.out.println(" Updated MSISDN " + msisdn);
		o_subscriptionPage.validateInvalidMSISDN(msisdn);
		o_cafSearchPage.validateCAFId(cafId);
		o_cafSearchPage.validateCPOSId(cposId);
		
		Map<String, String> tagsMap = new LinkedHashMap<String, String>();
		tagsMap.put("CAFId", cafId);
		System.out.println(cafId);
		tagsMap.put("CPOSMasterRequestId", cposId);
		tagsMap.put("MSISDN", msisdn);
		UpdateXml.modifyAllNodeValue("./simulatorfiles/CAF.xml", "./simulatorfiles/CAF.xml", "SiebelMessage", tagsMap);
		o_simulatorPage.navigateToSimualtorScreen(driver);
		String eaiServiceName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "EAI_SERVICE_NAME");
		String eaiMethodName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "EAI_METHOD_NAME_1");
		o_simulatorPage.addEAIServiceRequest(eaiServiceName,eaiMethodName);
		
		String replacement=cafId.substring(5,8);
		
		//String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, sheetname, testcaseID);
		
		UpdateXml.replaceCAFValue("./simulatorfiles/CAF.xml", "./simulatorfiles/CAF.xml",replacement,"Postpaid");
		ServerXmlUpdation.uploadXmlToServer("./simulatorfiles/CAF.xml");
		cafId=UpdateXml.readCAFValue("./simulatorfiles/CAF.xml");
		Thread.sleep(10000);
		String cafPropertyName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_PROPERTY_NAME");
		String cafPropertyValue=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_PROPRTY_VALUE");
		o_simulatorPage.addInputArguments(cafPropertyName,cafPropertyValue);
		ActionUtil.clickElement(o_simulatorPage.getEleRunOneOnIntputBtn(), driver, "Run On One Input");
		o_simulatorPage.validatePropertyKey(driver);
		ActionUtil.scrollUp(driver);
		String wfServiceName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_SERVICE_NAME");
		String wfMethodName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_METHOD_NAME_1");
		o_simulatorPage.addWFServiceRequest(wfServiceName,wfMethodName);
		String cafAccountOrderName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_ACCOUNT_ORDER_PROPERTY_NAME");
		String cafAccountOrderValue=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_ACCOUNT_ORDER_PROPERTY_VALUE");
		o_simulatorPage.changeInputArguments(cafAccountOrderName,cafAccountOrderValue);
		ActionUtil.clickElement(o_simulatorPage.getEleRunOneOnIntputBtn(), driver, "Run On One Input");
		Thread.sleep(2000);
		System.out.println(" Validating the CAF Status");
		Thread.sleep(5000);
		ActionUtil.scrollUp(driver);
		o_cafSearchPage.validateCAFIdStatus(cafId);
		
	}
	public void prepaidMSISDN(String filepath, String sheetname, String testcaseID) throws Exception{
		
		o_loginPage.fstLogin(filepath,sheetname,testcaseID);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn= n + "1";
		int num=rnd.nextInt(50 - 1 + 1) + 1;
		//int  n1 = rand.nextInt(50) + 1;
		GenericLib.setPropertyValue(GenericLib.sDirPath + "/propertyfiles/PrepaidMsisdn.properties", "MSISDN" +num , msisdn);
		String cafId=msisdn;
		cafId=cafId.substring(1, 9);
		String cposId=cafId.substring(2,8);
		GenericLib.setCellData(filepath, sheetname, testcaseID,  "MSISDN", msisdn);
		System.out.println(" Updated MSISDN " + msisdn);
		o_subscriptionPage.validateInvalidMSISDN(msisdn);
		o_cafSearchPage.validateCAFId(cafId);
		o_cafSearchPage.validateCPOSId(cposId);
		
		
		Map<String, String> tagsMap = new LinkedHashMap<String, String>();
		tagsMap.put("CAFId", cafId);
		tagsMap.put("CPOSMasterRequestId", cposId);
		tagsMap.put("MSISDN", msisdn);
		UpdateXml.modifyAllNodeValue("./simulatorfiles/Prepaid_CAF.xml", "./simulatorfiles/Prepaid_CAF.xml", "SiebelMessage", tagsMap);
		o_simulatorPage.navigateToSimualtorScreen(driver);
		String eaiServiceName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "EAI_SERVICE_NAME");
		String eaiMethodName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "EAI_METHOD_NAME_1");
		o_simulatorPage.addEAIServiceRequest(eaiServiceName,eaiMethodName);
		
		String replacement=cafId.substring(5,8);
		
		UpdateXml.replaceCAFValue("./simulatorfiles/Prepaid_CAF.xml", "./simulatorfiles/Prepaid_CAF.xml",replacement,"Prepaid");
		ServerXmlUpdation.uploadXmlToServer("./simulatorfiles/Prepaid_CAF.xml");
		cafId=UpdateXml.readCAFValue("./simulatorfiles/Prepaid_CAF.xml");
		Thread.sleep(10000);
		String cafPropertyName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_PROPERTY_NAME");
		String cafPropertyValue=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_PROPRTY_VALUE");
		o_simulatorPage.addInputArguments(cafPropertyName,cafPropertyValue);
		ActionUtil.clickElement(o_simulatorPage.getEleRunOneOnIntputBtn(), driver, "Run On One Input");
		o_simulatorPage.validatePropertyKey(driver);
		ActionUtil.scrollUp(driver);
		String wfServiceName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_SERVICE_NAME");
		String wfMethodName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_METHOD_NAME_1");
		o_simulatorPage.addWFServiceRequest(wfServiceName,wfMethodName);
		String cafAccountOrderName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_ACCOUNT_ORDER_PROPERTY_NAME");
		String cafAccountOrderValue=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "CAF_ACCOUNT_ORDER_PROPERTY_VALUE");
		o_simulatorPage.changeInputArguments(cafAccountOrderName,cafAccountOrderValue);
		ActionUtil.clickElement(o_simulatorPage.getEleRunOneOnIntputBtn(), driver, "Run On One Input");
		Thread.sleep(2000);
		System.out.println(" Validating the CAF Status");
		ActionUtil.scrollUp(driver);
		o_cafSearchPage.validateCAFIdStatus(cafId);
	}
	
	public void createLead(String filepath, String sheetname, String testcaseID ) throws Exception{
		Thread.sleep(5000);
		Random rand = new Random();
		int pickedNumber = rand.nextInt(919221 - 1215478 - 9665) + 5;
		int msisdn = GenericLib.getColumnIndex(filepath, sheetname, "MSISDN");

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Map<String, String> tagsMap = new LinkedHashMap<String, String>();
		
		tagsMap.put("mSISDN",sData[msisdn] );
		tagsMap.put("numberReservationPIN", pickedNumber + "");
		tagsMap.put("externalLeadReferenceNumber", pickedNumber+"");
		o_simulatorPage.navigateToSimualtorScreen(driver);
		String wfServiceName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_SERVICE_NAME");
		String wfMethodName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "WF_METHOD_NAME_1");
		o_simulatorPage.addWFServiceRequest(wfServiceName, wfMethodName);
		String xmlMessage=UpdateXml.getResponseXMLOneLinerMap("./simulatorfiles/LeadRequest.xml", "CreateLeadRequest", tagsMap);
		xmlMessage=xmlMessage.trim();
		String[] abc=xmlMessage.split("no");
		xmlMessage=abc[1].substring(3);
		System.out.println(xmlMessage);
		String leadCreateWFName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "LEAD_CREATE_WF_NAME");
		String leadCreatePCName=GenericLib.getProprtyValue(GenericLib.sSimulatorConfigPath, "LEAD_CREATE_PC_NAME");
		o_simulatorPage.simulateXmlResponseAsValue(leadCreatePCName, leadCreateWFName, xmlMessage);
		o_simulatorPage.getEleRunOneOnIntputBtn().click();
		String outputValue=ActionUtil.gettext(o_simulatorPage.getEleOutputArgumentsValueTxt(), driver, " Outpot Arguments Value");
		if(outputValue.contains("SUCCESS")){
			MyExtentListners.test.pass("On clicking on Run on one Input, Simulator Respose has 'SUCCESS' and Lead id is generated ");
			String leadId=o_simulatorPage.getLeadId(outputValue);
			GenericLib.setPropertyValue("./propertyfiles/InputParameters.properties", "LEAD_ID", leadId);
		}else{
			MyExtentListners.test.fail(MarkupHelper.createLabel("On clicking on Run on one Input, Simulator Respose has not 'SUCCESS' Status and Lead id is not generated", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, o_simulatorPage.getEleOutputArgumentsValueTxt()));
			throw new Exception();
		}
	}
	
	public void leadToOpportunity(String leadId) throws Exception{
		
		Thread.sleep(5000);
		o_binacularsSearchPage.binocularsLeadsSearch(leadId);
		o_binacularsSearchPage.clickOnSearchId(leadId);
		ActionUtil.scrollUp(driver);
		o_myLeadsPage.getEleLeadStatusTxtBx().clear();
		ActionUtil.type(o_myLeadsPage.getEleLeadStatusTxtBx(), " In Progress ", "", driver);
		ActionUtil.clickElement(o_myLeadsPage.getEleReasonTxtBx(), driver, "");
		o_myLeadsPage.verifyLeadAlertPopUp("Customer Called Date n Time");
		o_myLeadsPage.chooseCustCalledDateTime();
		o_myLeadsPage.addLeadDetails(" In Progress ", " Call Back");
		o_myLeadsPage.verifyLeadAlertPopUp("Document Collection");
		o_myLeadsPage.addLeadDetails("Document Collection", " All Document");
		String opportunityNumber=ActionUtil.getAttributeValue(o_opportunitiesListPage.getEleOpportunityNumberTxtBx(), driver, "");
		ActionUtil.clickElement(o_myLeadsPage.getEleFirstLevelViewBarDrpDwn(), driver, " First Level View Bar");
		ActionUtil.selectbyVisibletext(driver, o_myLeadsPage.getEleFirstLevelViewBarDrpDwn(), "Leads");
		ActionUtil.clickElement(o_myLeadsPage.getEleMyLeadsBtn(), driver, "");
		String leadOpportunityNumber=ActionUtil.getAttributeValue(o_myLeadsPage.getEleOpportunityTxtBx(), driver, "");
		if(opportunityNumber.equalsIgnoreCase(leadOpportunityNumber)){
			MyExtentListners.test.pass("Opportunity Number " + opportunityNumber + " from Opportunity List Screen is eqauls to Leads Screen Opportunity Number " + leadOpportunityNumber);
		}else{
			
			MyExtentListners.test.fail(MarkupHelper.createLabel("Opportunity Number " + opportunityNumber + " from Opportunity List Screen is not eqauls to Leads Screen Opportunity Number " + leadOpportunityNumber, ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, o_simulatorPage.getEleOutputArgumentsValueTxt()));
			throw new Exception();
		}
		Thread.sleep(5000);
		
	}
	
	public void bulkUpload(String exeFilePath,WebDriver driver) throws Exception{
		o_bulkUploadPage.navigateToBulkUploadScreen(driver);
		o_bulkUploadPage.performBulkUpload(exeFilePath);
	}

}
