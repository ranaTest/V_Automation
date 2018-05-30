package com.vil.web.tests.binocularsearch;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vil.web.library.BaseLib;
import com.vil.web.library.FunctionLib;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;

public class Test_Automation_246 extends BaseLib {
	
	
	
	@Parameters({ "Browser Name" })
	@Test(priority = 134, description = "Binocular Search with all options available on Siebel")
	public void verifyBinacularSearchFileds(String browserName) throws Exception {
		MyExtentListners.test.assignCategory("BinacularSearch-" + browserName);
		FunctionLib funLib = new FunctionLib(driver);
		if (env.equalsIgnoreCase("FST")) {
			funLib.o_loginPage.fstLogin(GenericLib.sTestDataFilePath, "FST", "TC_246");
		}
		String SR="1-1438868171";
		funLib.o_binacularsSearchPage.binocularsSeviceRequestsSearch(SR);
		funLib.o_binacularsSearchPage.clickOnSearchId(SR);
		String actSR=ActionUtil.getAttributeValue(funLib.o_serviceRequestPage.getEleSRxtBx(), driver, " SR Information SR # text box");
		ActionUtil.verifyEqualsText(" SR Number ", actSR, SR);
		
		Thread.sleep(5000);
		String leadId="1-1298149114";
		ActionUtil.clickElement(funLib.o_binacularsSearchPage.getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		funLib.o_binacularsSearchPage.binocularsLeadsSearch(leadId);
		funLib.o_binacularsSearchPage.clickOnSearchId(leadId);
		String actLeadId=ActionUtil.getAttributeValue(funLib.o_myLeadsPage.getEleLeadNumberTxtBx(), driver, " Lead Id text box");
		ActionUtil.verifyEqualsText("Lead Id ", actLeadId, leadId);
		Thread.sleep(5000);
		
		String msisdn="9619012769";
		ActionUtil.clickElement(funLib.o_binacularsSearchPage.getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		funLib.o_binacularsSearchPage.binocularsMSISDNSearch(msisdn);
		funLib.o_binacularsSearchPage.clickOnSearchId(msisdn);
		String actMsisdn=ActionUtil.getAttributeValue(funLib.o_360DegreePage.getEleAssetTxt(), driver, " PostPaid Number text box");
		System.out.println(actMsisdn);
		ActionUtil.verifyContainsText(actMsisdn, msisdn);
		Thread.sleep(5000);
		
		String accNumber="1-LXKND6";
		ActionUtil.clickElement(funLib.o_binacularsSearchPage.getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		funLib.o_binacularsSearchPage.binocularsAccountSearch(accNumber);
		funLib.o_binacularsSearchPage.clickOnSearchId(accNumber);
		String actAccNumber=ActionUtil.getAttributeValue(funLib.o_accountPage.getEleAccNumberTxt(), driver, " PostPaid Number text box");
		System.out.println(actMsisdn);
		ActionUtil.verifyContainsText(actAccNumber, accNumber);
		
		
		
		
		
	}

}
