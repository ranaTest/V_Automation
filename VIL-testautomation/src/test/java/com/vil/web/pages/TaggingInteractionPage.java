/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class Contains Page objects and re-usable methods for Different call types
* @methods 			: 		raiseServiceRequest(),verifyOpenSRStatus(),verifyClosedSRStatus(),addCustomerValidation()
* 							verifyAlertPopUp().
*/
package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class TaggingInteractionPage implements TestDataHeadingsConstants {
	WebDriver driver;

	public TaggingInteractionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	String sSRNumber;

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Tagging Interacion screen
	 */

	@FindBy(xpath = "//a[contains(text(),'Tagging (Interactions)')]")
	private WebElement eleTaggingInteractionBtn;

	public WebElement getEleTaggingInteractionBtn() {
		return eleTaggingInteractionBtn;
	}

	@FindBy(xpath = "//button[@title='Details:New']")
	private WebElement eleDetailNewIcn;

	public WebElement getEleDetailNewIcn() {
		return eleDetailNewIcn;
	}

	@FindBy(name = "s_12_1_12_0")
	private WebElement eleTaggingSRNumEdtBx;

	public WebElement getEleTaggingSRNumEdtBx() {
		return eleTaggingSRNumEdtBx;
	}

	@FindBy(name = "s_12_1_14_0")
	private WebElement eleTaggingOwnerEdtBx;

	public WebElement getEleTaggingOwnerEdtBx() {
		return eleTaggingOwnerEdtBx;
	}

	@FindBy(name = "s_12_1_6_0")
	private WebElement eleTaggingTicketTypeEdtBx;

	public WebElement getEleTaggingTicketTypeEdtBx() {
		return eleTaggingTicketTypeEdtBx;
	}

	@FindBy(id = "s_12_1_17_0_icon")
	private WebElement eleTaggingTypeDrpDwn;

	public WebElement getEleTaggingTypeDrpDwn() {
		return eleTaggingTypeDrpDwn;
	}

	@FindBy(xpath = "//input[@aria-label='Type']")
	private WebElement eleTaggingTypeEdtBx;

	public WebElement getEleTaggingTypeEdtBx() {
		return eleTaggingTypeEdtBx;
	}

	@FindBy(id = "s_12_1_18_0_icon")
	private WebElement eleTaggingSubTypeDrpDwn;

	public WebElement getEleTaggingSubTypeDrpDwn() {
		return eleTaggingSubTypeDrpDwn;
	}

	@FindBy(xpath = "//input[@aria-label='Sub Type']")
	private WebElement eleTaggingSubTypeEdtBx;

	public WebElement getEleTaggingSubTypeEdtBx() {
		return eleTaggingSubTypeEdtBx;
	}

	@FindBy(name = "s_12_1_19_0_icon")
	private WebElement eleTaggingSubSubTypeDrpDwn;

	public WebElement getEleTaggingSubSubTypeDrpDwn() {
		return eleTaggingSubSubTypeDrpDwn;
	}

	@FindBy(xpath = "//input[@aria-label='Sub Sub Type']")
	private WebElement eleTaggingSubSubTypeEdtBx;

	public WebElement getEleTaggingSubSubTypeEdtBx() {
		return eleTaggingSubSubTypeEdtBx;
	}

	@FindBy(id = "1_s_7_l_Status")
	private WebElement eleSRStatusTxt;

	public WebElement getEleSRStatusTxt() {
		return eleSRStatusTxt;
	}

	@FindBy(id = "1_s_7_l_Sub-Status")
	private WebElement eleSRSubStatusTxt;

	public WebElement getEleSRSubStatusTxt() {
		return eleSRSubStatusTxt;
	}

	@FindBy(id = "1_s_7_l_TM_SR_Owner")
	private WebElement eleSROwnerTxt;

	public WebElement getEleSROwnerTxt() {
		return eleSROwnerTxt;
	}

	@FindBy(id = "1_s_7_l_TM_MSISDN_Stored_App")
	private WebElement eleSRSMSDINsTxt;

	public WebElement getEleSRSMSDINsTxt() {
		return eleSRSMSDINsTxt;
	}

	@FindBy(xpath = "//td[@id='1_s_7_l_TM_Ticket_Type']")
	private WebElement eleSRTicketTypeTxt;

	public WebElement getEleSRTicketTypeTxt() {
		return eleSRTicketTypeTxt;
	}

	@FindBy(xpath = "//form[@name='SWEForm7_0']//table//td[@id='1_s_7_l_Created_By']")
	private WebElement eleCreatedByValueTxt;

	public WebElement getEleCreatedByValueTxt() {
		return eleCreatedByValueTxt;
	}

	@FindBy(xpath = "//form[@name='SWEForm7_0']//table//td[@id='1_s_7_l_TM_Type']")
	private WebElement eleTMTypeTxt;

	public WebElement getEleTMTypeTxt() {
		return eleTMTypeTxt;
	}

	@FindBy(xpath = "//td[@id='1_s_5_l_SRDFF_PickValue']")
	private WebElement eleContactIdBtn;

	public WebElement getEleContactIdBtn() {
		return eleContactIdBtn;
	}

	@FindBy(id = "1_SRDFF_PickValue")
	private WebElement eleContactIdEdtBx;

	public WebElement getEleContactIdEdtBx() {
		return eleContactIdEdtBx;
	}

	@FindBy(xpath = "//button[@name='s_7_1_0_0']")
	private WebElement eleDFFSubmitBtn;

	public WebElement getEleDFFSubmitBtn() {
		return eleDFFSubmitBtn;
	}

	@FindBy(id = "2_s_5_l_SRDFF_TextValue")
	private WebElement eleDFFFirstNameTxt;

	public WebElement getEleDFFFirstNameTxt() {
		return eleDFFFirstNameTxt;
	}

	@FindBy(id = "3_s_5_l_SRDFF_TextValue")
	private WebElement eleMiddleNameEdtBx;

	public WebElement getEleMiddleNameEdtBx() {
		return eleMiddleNameEdtBx;
	}

	@FindBy(xpath = "//form[@name='SWEForm7_0']//table//td[@id='1_s_7_l_SR_Number']")
	private WebElement eleTMSRnumberTxt;

	public WebElement getEleTMSRnumberTxt() {
		return eleTMSRnumberTxt;
	}

	@FindBy(xpath = "//button[contains(@title,'Details:Submit')]/span[text()='Submit']")
	private WebElement eleSubmitBtn;

	public WebElement getEleSubmitBtn() {
		return eleSubmitBtn;
	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Televerification Tagging Interaction
	 */

	@FindBy(xpath = "//span[text()='Type']/../../..//input[@aria-label='Type']")
	private WebElement eleTagSRTypeTxtBx;

	public WebElement getEleTeleSRTypeTxtBx() {
		return eleTagSRTypeTxtBx;
	}

	@FindBy(xpath = "//span[text()='Sub Type']/../../..//input[@aria-label='Sub Type']")
	private WebElement eleTagSRSubTypeTxtBx;

	public WebElement getEleTeleSRSubTypeTxtBx() {
		return eleTagSRSubTypeTxtBx;
	}

	@FindBy(xpath = "//span[text()='Sub Sub Type']/../../..//input[@aria-label='Sub Sub Type']")
	private WebElement eleTagSRSubSubTypeTxtBx;

	public WebElement getEleTeleSRSubSubTypeTxtBx() {
		return eleTagSRSubSubTypeTxtBx;
	}

	// File Upload Features

	@FindBy(id = "s_2_1_3_0s_SweFileName")
	private WebElement eleNewFileBtn;

	public WebElement getEleNewFileBtn() {
		return eleNewFileBtn;
	}

	// TC_2
	@FindBy(id = "1_s_5_l_SRDFF_PickSimpleValue")
	private WebElement eleProductCategoryBtn;

	public WebElement getEleProductCategoryBtn() {
		return eleProductCategoryBtn;
	}

	@FindBy(name = "SRDFF_PickSimpleValue")
	private WebElement eleProductCategoryEdtBx;

	public WebElement getEleProductCategoryEdtBx() {
		return eleProductCategoryEdtBx;
	}

	@FindBy(xpath = "//li[text()='Validated']")
	private WebElement eleValidatedTxt;

	public WebElement getEleValidatedTxt() {
		return eleValidatedTxt;
	}

	public WebElement getEleShadowText(String ElementValue) {
		return driver.findElement(By.xpath("//li[text()='" + ElementValue + "']"));
	}

	@FindBy(xpath = "//li[text()='.2G Limited']")
	private WebElement eleProductCategoryDrdDwn;

	public WebElement getEleProductCategoryDrdDwn() {
		return eleProductCategoryDrdDwn;
	}

	@FindBy(id = "2_s_5_l_SRDFF_PickSimpleValue")
	private WebElement eleProductToAddBtn;

	public WebElement getEleProductToAddBtn() {
		return eleProductToAddBtn;
	}

	@FindBy(name = "SRDFF_PickSimpleValue")
	private WebElement eleProductToAddEdtBx;

	public WebElement getEleProductToAddEdtBx() {
		return eleProductToAddEdtBx;
	}

	@FindBy(name = "s_5_1_0_0")
	private WebElement eleDFFApplyBtn;

	public WebElement getEleDFFApplyBtn() {
		return eleDFFApplyBtn;
	}

	@FindBy(name = "s_12_1_0_0")
	private WebElement eleSRSubmitBtn;

	public WebElement getEleSRSubmitBtn() {
		return eleSRSubmitBtn;
	}

	// Interaction Action Applet
	@FindBy(xpath = "//input[@name'TM_Sub_Type'")
	private WebElement eleIntActionSubTypeTxtBx;

	public WebElement eleIntActionSubTypeTxtBx() {
		return eleIntActionSubTypeTxtBx;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_7_l_SR_Number s_7_l_altLink')]")
	private WebElement eleSrNoTxtBx;

	public WebElement getEleSrNoTxtBx() {
		return eleSrNoTxtBx;
	}

	// Customer Validation
	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_7_l_TM_Type s_7_l_altCombo')]")
	private WebElement eleIntActionTypeTxtBx;

	public WebElement getEleIntActionTypeTxtBx() {
		return eleIntActionTypeTxtBx;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_7_l_TM_SR_Owner s_7_l_altpick')]")
	private WebElement eleIntActionOwnerTxtBx;

	public WebElement getEleIntActionOwnerTxtBx() {
		return eleIntActionOwnerTxtBx;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_7_l_TM_SR_Due_Date s_7_l_altDateTimeZone')]")
	private WebElement eleIntActionDueDateTxtBx;

	public WebElement getEleIntActionDueDateTxtBx() {
		return eleIntActionDueDateTxtBx;
	}

	@FindBy(xpath = "//td[@aria-labelledby='s_8_l_TM_Outcome s_8_l_altCombo']")
	private WebElement eleIntActionOutcomeTxtBx;

	public WebElement getEleIntActionOutcomeTxtBx() {
		return eleIntActionOutcomeTxtBx;
	}

	@FindBy(xpath = "//input[@name='TM_Outcome']")
	private WebElement eleIntActionOutcomeValueTxtBx;

	public WebElement getEleIntActionOutcomeValueTxtBx() {
		return eleIntActionOutcomeValueTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleIntActionOutcomeValueDrpDwn;

	public WebElement getEleIntActionOutcomeValueDrpDwn() {
		return eleIntActionOutcomeValueDrpDwn;
	}
	@FindBy(xpath = "//li[text()='GPRS network down – Know issue']")
	private WebElement eleIntActionOutcomeValueGPRSDown;

	public WebElement getEleIntActionOutcomeValueGPRSDown() {
		return eleIntActionOutcomeValueGPRSDown;
	}

	@FindBy(xpath = "//li[text()='Customer Not Contactable']")
	private WebElement eleIntActionOutcomeValueCustNotContcbl;

	public WebElement getEleIntActionOutcomeValueCustNotContcbl() {
		return eleIntActionOutcomeValueCustNotContcbl;
	}

	@FindBy(xpath = "//td[@aria-labelledby='s_7_l_Status s_7_l_altCombo']")
	private WebElement eleIntActionStatusTxtBx;

	public WebElement getEleIntActionStatusTxtBx() {
		return eleIntActionStatusTxtBx;
	}

	@FindBy(xpath = "//td[@data-labelledby='s_7_l_Sub-Status s_7_l_altCombo']")
	private WebElement eleIntActionSubStatusTxtBx;

	public WebElement getEleIntActionSubStatusTxtBx() {
		return eleIntActionSubStatusTxtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result4_Label']/..//span")
	private WebElement eleAddressBtn;

	public WebElement getEleAddressBtn() {
		return eleAddressBtn;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result5_Label']/..//span")
	private WebElement eleAlternetConatctNumberBtn;

	public WebElement getEleAlternetConatctNumberBtn() {
		return eleAlternetConatctNumberBtn;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Page Objects for Customer Interactions under Tagging
	 * Interactions
	 */
	@FindBy(xpath = "//li[text()='No Action Required']")
	private WebElement eleIntActionOutcomeValueNoActionRequired;

	public WebElement getEleIntActionOutcomeValueNoActionRequired() {
		return eleIntActionOutcomeValueNoActionRequired;
	}
	@FindBy(xpath = "//li[text()='Incorrect/Incomplete Tagging']")
	private WebElement eleIntActionOutcomeValueIncorrectIncompleteTagging;

	public WebElement getEleIntActionOutcomeValueIncorrectIncompleteTagging() {
		return eleIntActionOutcomeValueIncorrectIncompleteTagging;
	}
	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_8_l_Sub-Status s_8_l_altCombo')]")
	private WebElement eleIntActionBOSubStatusTxtBx;

	public WebElement getEleIntActionBOSubStatusTxtBx() {
		return eleIntActionBOSubStatusTxtBx;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_8_l_Status s_8_l_altCombo')]")
	private WebElement eleIntActionBOStatusTxtBx;

	public WebElement getEleIntActionBOStatusTxtBx() {
		return eleIntActionBOStatusTxtBx;
	}

	@FindBy(xpath = "//li[text()='Forced Closure']")
	private WebElement eleIntActionOutcomeValueForcedClosure;

	public WebElement getEleIntActionOutcomeValueForcedClosure() {
		return eleIntActionOutcomeValueForcedClosure;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result1_Label']/..//span")
	private WebElement eleDOBValidationBtn;

	public WebElement getEleDOBValidationBtn() {
		return eleDOBValidationBtn;
	}

	@FindBy(xpath = "//span[text()='Date Of Birth']/../../../td[3]/div/input")
	private WebElement eleDOBValidationEdtBx;

	public WebElement getEleDOBValidationEdtBx() {
		return eleDOBValidationEdtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result2_Label']/..//span")
	private WebElement eleAltContactNumBtn;

	public WebElement getEleAltContactNumBtn() {
		return eleAltContactNumBtn;
	}

	@FindBy(xpath = "//span[text()='Alternate Contact Number']/../../../td[3]/div/input")
	private WebElement eleAltContactNumEdtBx;

	public WebElement getEleAltContactNumEdtBx() {
		return eleAltContactNumEdtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result3_Label']/..//span")
	private WebElement eleLastPayDateAndAmtBtn;

	public WebElement getLastPayDateAndAmtBtn() {
		return eleLastPayDateAndAmtBtn;
	}

	@FindBy(xpath = "//span[text()='Last Payment Date &  Amount']/../../../td[3]/div/input")
	private WebElement eleLastPayDateAndAmtEdtBx;

	public WebElement geteleLastPayDateAndAmtEdtBx() {
		return eleLastPayDateAndAmtEdtBx;
	}

	@FindBy(xpath = "//li[text()='Validated']")
	private WebElement eleValidatedTextdrpDwn;

	public WebElement getEleValidatedTextdrpDwn() {
		return eleValidatedTextdrpDwn;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result6_Label']/..//span")
	private WebElement eleTerrifPlanBtn;

	public WebElement getEleTerrifPlanBtn() {
		return eleTerrifPlanBtn;
	}

	@FindBy(name = "//span[text()='Tariff Plan']/../../../td[3]/div/input")
	private WebElement eleTerrifPlanEdtBx;

	public WebElement getEleTerrifPlanEdtBx() {
		return eleTerrifPlanEdtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result5_Label']/..//span")
	private WebElement eleBillingAddrBtn;

	public WebElement getEleBillingAddrBtn() {
		return eleBillingAddrBtn;
	}

	@FindBy(name = "//span[text()='Billing Address']/../../../td[3]/div/input")
	private WebElement eleBillingAddrEdtBx;

	public WebElement getEleBillingAddrEdtBx() {
		return eleBillingAddrEdtBx;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for SR status and sub status
	 */

	@FindBy(xpath = "//div[text()='Details']/../..//input[@aria-label='Status']")
	private WebElement eleDetailsStatusTxt;

	public WebElement getEleDetailsStatusTxt() {
		return eleDetailsStatusTxt;
	}

	@FindBy(xpath = "//div[text()='Details']/../..//input[@aria-label='Sub-Status']")
	private WebElement eleDetailsSubStatusTxt;

	public WebElement geteleDetailsSubStatusTxt() {
		return eleDetailsSubStatusTxt;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result7_Label']/..//span")
	private WebElement eleEmailIdBtn;

	public WebElement getEleEmailIdBtn() {
		return eleEmailIdBtn;
	}

	@FindBy(xpath = "//input[@aria-labelledby='Status_Label']")
	private WebElement eleStatusTxtBx;

	public WebElement getEleStatusTxtBx() {
		return eleStatusTxtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='Sub-Status_Label']")
	private WebElement eleSubStatusTxtBx;

	public WebElement getEleSubStatusTxtBx() {
		return eleStatusTxtBx;
	}

	/*
	 * @author:Arushi
	 *
	 * Description: customer validation for two details different emailidbtn
	 * address btn, alternatenumber btn
	 */
	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result4_Label']/..//span")
	private WebElement eleBalanceBillingAddrBtn;

	public WebElement getEleBalanceBillingAddrBtn() {
		return eleBalanceBillingAddrBtn;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result7_Label']/..//span")
	private WebElement eleBalanceEmailIdEdtBtn;

	public WebElement getEleBalanceEmailIdEdtBtn() {
		return eleBalanceEmailIdEdtBtn;
	}

	@FindBy(xpath = "//input[@aria-labelledby='TM_Validation_Result5_Label']/..//span")
	private WebElement eleBalanceAltContactNumBtn;

	public WebElement getEleBalanceAltContactNumBtn() {
		return eleBalanceAltContactNumBtn;
	}

	@FindBy(name = "s_14_1_10_0")
	private WebElement eleBalanceAltContactNumEdtBx;

	public WebElement getEleBalanceAltContactNumEdtBx() {
		return eleBalanceAltContactNumEdtBx;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'s_8_l_TM_SR_Owner s_8_l_altpick')]")
	private WebElement eleIntActionOwnerinBOUserTxtBx;

	public WebElement getEleIntActionOwnerinBOUserTxtBx() {
		return eleIntActionOwnerinBOUserTxtBx;
	}

	/***********************************************************************
	 *
	 * @author : Srinivas Hippargi
	 * @description : Re-usable methods for Raise Service Request, verify Open
	 *              Service Status and verify Closed Service Status Add DFF
	 *              Values And Submit / Apply
	 * 
	 */

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to raise service request
	 */

	public void raiseServiceRequest(String filepath, String sheetname, String testcaseID) throws Exception {

		int tagtype = GenericLib.getColumnIndex(filepath, sheetname, SR_TYPE);
		int tagsubtype = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBTYPE);
		int tagsubsubtype = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBSUBTYPE);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.waitForElement(getEleTaggingInteractionBtn(), driver, " Tagging (Interaction ");
		ActionUtil.clickElement(getEleTaggingInteractionBtn(), driver, " Tagging (Interaction ");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleDetailNewIcn(), driver, " Detail : New ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.clickElement(getEleTaggingTypeEdtBx(), driver, " Tag Type");
		ActionUtil.type(getEleTaggingTypeEdtBx(), sData[tagtype], " Tag Type", driver);
		Thread.sleep(1000);
		ActionUtil.clickElement(getEleTaggingSubTypeEdtBx(), driver, " Tag Sub Type ");

		ActionUtil.type(getEleTaggingSubTypeEdtBx(), sData[tagsubtype], " Tag Sub Type", driver);
		Thread.sleep(1000);
		ActionUtil.clickElement(getEleTaggingSubSubTypeEdtBx(), driver, " Tag Sub Sub Type");
		ActionUtil.type(getEleTaggingSubSubTypeEdtBx(), sData[tagsubsubtype], " Tag Sub Sub Type", driver);
		ActionUtil.clickElement(getEleTaggingTicketTypeEdtBx(), driver, "Tagging Ticket Type");
		String subsubtype = getEleTaggingSubSubTypeEdtBx().getText();
		if (subsubtype == null) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "\"" + sData[tagsubsubtype] + "\"" + " is available for sub sub type tagging || " + "\""
							+ tagsubsubtype + "\"" + " is not available for sub sub type tagging",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleTaggingSubSubTypeEdtBx()));
			throw new RuntimeException(
					"\"" + sData[tagsubsubtype] + "\"" + " is not available for sub sub type tagging");

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.save(driver);
		/*
		 * if(ActionUtil.isAlertPresent(driver,10)){ Alert
		 * alert=driver.switchTo().alert(); System.out.println(alert.getText());
		 * if(alert.getText().contains("'Sub - Sub Type")){
		 * TestngListners.testReporter.log(LogStatus.FAIL, tagsubsubtype +
		 * " is not available for sub sub type tagging" );
		 * Assert.fail(tagsubsubtype +
		 * " is not available for sub sub type tagging");
		 * 
		 * } }
		 */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Verify Service Request Open Status
	 */
	public void verifyOpenSRStatus(String filepath, String sheetname, String testcaseId, String status,
			String subStatus) throws Exception {

		int username = GenericLib.getColumnIndex(filepath, sheetname, USERNAME);
		int msisdn = GenericLib.getColumnIndex(filepath, sheetname, MSISDN);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);

		MyExtentListners.test.info(
				MarkupHelper.createLabel("-----VERIFYING SERVICE REQUEST STATUS VALUES------ :", ExtentColor.TEAL));
		Thread.sleep(10000);

		String srnumber = getEleTMSRnumberTxt().getText();

		if (srnumber != null) {
			MyExtentListners.test
					.pass("Verify " + "SR number " + "\"" + srnumber + "\"" + " is displayed in interaction actions ||"
							+ "\"" + srnumber + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR number " + "\"" + srnumber + "\"" + " is displayed in interaction actions ||" + "\""
							+ srnumber + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleTMSRnumberTxt()));
			Assert.fail();
		}

		String owner = getEleSROwnerTxt().getText();
		if (sData[username].equals(owner)) {
			MyExtentListners.test
					.pass("Verify " + "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions ||"
							+ "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test
					.fail(MarkupHelper.createLabel(
							"Verify " + "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions ||"
									+ "OWNER " + "\"" + owner + "\"" + " is not displayed in interaction actions",
							ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSROwnerTxt()));
			Assert.fail();
		}

		String createdBy = getEleCreatedByValueTxt().getText();
		if (createdBy != null) {
			MyExtentListners.test
					.pass("Verify " + "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions||"
							+ "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions||"
							+ "Created By" + "\"" + createdBy + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleCreatedByValueTxt()));
			Assert.fail();
		}

		String srstatus = getEleSRStatusTxt().getText();
		if (srstatus.equalsIgnoreCase(status)) {
			MyExtentListners.test
					.pass("Verify " + "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRStatusTxt()));
			Assert.fail();
		}

		String srsubstatus = getEleSRSubStatusTxt().getText();
		if (srsubstatus.equalsIgnoreCase(subStatus)) {
			MyExtentListners.test.pass(
					"Verify " + "SR Sub Status " + "\"" + srsubstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR Sub Status " + "\"" + srsubstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSubStatusTxt()));
			Assert.fail();
		}

		String srMSDN = getEleSRSMSDINsTxt().getText();
		if (srMSDN.equals(sData[msisdn])) {
			MyExtentListners.test
					.pass("Verify " + "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions || "
							+ "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions || "
							+ "SR MSISDN " + "\"" + srMSDN + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSMSDINsTxt()));
			Assert.fail();
		}

		String srTicketType = getEleSRTicketTypeTxt().getText();
		if (srTicketType.equalsIgnoreCase("Request")) {
			MyExtentListners.test.pass("Verify " + "Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions || " + " Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions || " + " Ticket Type  " + "\"" + srTicketType + "\""
					+ " is not displayed in interaction actions", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSMSDINsTxt()));
			Assert.fail();
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Verify Service Request Close Status
	 */
	public void verifyClosedSRStatus(String filepath, String sheetname, String testcaseId, String status,
			String subStatus) throws Exception {

		MyExtentListners.test.info(MarkupHelper.createLabel("-----VERIFYING SERVICE REQUEST CLOSED STATUS VALUES------",
				ExtentColor.TEAL));
		int username = GenericLib.getColumnIndex(filepath, sheetname, USERNAME);
		int msisdn = GenericLib.getColumnIndex(filepath, sheetname, MSISDN);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		Thread.sleep(10000);

		String srnumber = getEleTMSRnumberTxt().getText();

		if (srnumber != null) {
			MyExtentListners.test
					.pass("Verify " + "SR number " + "\"" + srnumber + "\"" + " is displayed in interaction actions ||"
							+ "\"" + srnumber + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR number " + "\"" + srnumber + "\"" + " is displayed in interaction actions ||" + "\""
							+ srnumber + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleTMSRnumberTxt()));
			Assert.fail();
		}

		String owner = getEleSROwnerTxt().getText();
		if (sData[username].equals(owner)) {
			MyExtentListners.test
					.pass("Verify " + "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions ||"
							+ "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test
					.fail(MarkupHelper.createLabel(
							"Verify " + "OWNER " + "\"" + owner + "\"" + " is displayed in interaction actions ||"
									+ "OWNER " + "\"" + owner + "\"" + " is not displayed in interaction actions",
							ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSROwnerTxt()));
			Assert.fail();
		}

		String createdBy = getEleCreatedByValueTxt().getText();
		if (createdBy != null) {
			MyExtentListners.test
					.pass("Verify " + "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions||"
							+ "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "Created By" + "\"" + createdBy + "\"" + " is displayed in interaction actions||"
							+ "Created By" + "\"" + createdBy + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleCreatedByValueTxt()));
			Assert.fail();
		}

		String srstatus = getEleSRStatusTxt().getText();
		if (srstatus.equalsIgnoreCase(status)) {
			MyExtentListners.test
					.pass("Verify " + "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRStatusTxt()));
			Assert.fail();
		}

		String srsubstatus = getEleSRSubStatusTxt().getText();
		if (srsubstatus.equalsIgnoreCase(subStatus)) {
			MyExtentListners.test.pass(
					"Verify " + "SR Sub Status " + "\"" + srsubstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR Sub Status " + "\"" + srsubstatus + "\"" + " is displayed in interaction actions ||"
							+ "SR Status " + "\"" + srstatus + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSubStatusTxt()));
			Assert.fail();
		}

		String srMSDN = getEleSRSMSDINsTxt().getText();
		if (srMSDN.equals(sData[msisdn])) {
			MyExtentListners.test
					.pass("Verify " + "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions || "
							+ "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify " + "SR MSISDN " + "\"" + srMSDN + "\"" + " is displayed in interaction actions || "
							+ "SR MSISDN " + "\"" + srMSDN + "\"" + " is not displayed in interaction actions",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSMSDINsTxt()));
			Assert.fail();
		}

		String srTicketType = getEleSRTicketTypeTxt().getText();
		if (srTicketType.equalsIgnoreCase("Request")) {
			MyExtentListners.test.pass("Verify " + "Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions || " + " Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "Ticket Type  " + "\"" + srTicketType + "\""
					+ " is displayed in interaction actions || " + " Ticket Type  " + "\"" + srTicketType + "\""
					+ " is not displayed in interaction actions", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleSRSMSDINsTxt()));
			Assert.fail();
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method to add DFF required field and apply and submit
	 */
	public void addDFFValuesAndApply(String filepath, String sheetname, String testcaseId) throws Exception {
		int dffProductCategory = GenericLib.getColumnIndex(filepath, sheetname, PRODUCT_CATEGORY);
		int dffProductToAdd = GenericLib.getColumnIndex(filepath, sheetname, PRODUCT_CATEGORY);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ActionUtil.clickElement(getEleProductCategoryBtn(), driver, " Product Catrgory ");
		ActionUtil.type(getEleProductCategoryEdtBx(), sData[dffProductCategory], " Product Category ", driver);
		ActionUtil.clickElement(getEleShadowText(sData[dffProductCategory]), driver, " Product Category ");
		ActionUtil.clickElement(getEleProductToAddBtn(), driver, " Product To Add ");
		ActionUtil.type(getEleProductToAddEdtBx(), sData[dffProductToAdd], "  Product To Add ", driver);
		ActionUtil.clickElement(getEleShadowText(sData[dffProductToAdd]), driver, " Product To Add ");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ActionUtil.clickElement(getEleDFFApplyBtn(), driver, " Apply Button ");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("Successfully")) {
				MyExtentListners.test
						.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFApplyBtn()));
				Assert.fail();
			}
			alert.accept();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDOBValidationEdtBx());
		try {
			addCustomerValidation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("Successfully")) {
				MyExtentListners.test
						.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFApplyBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Verify Submit Alert pop up
	 */
	public void verifySubmitAlertPopUp(String filepath, String sheetname, String testcaseId) throws Exception {

		MyExtentListners.test.info(MarkupHelper.createLabel("-----VERIFYING ALERT POP UP------ ", ExtentColor.TEAL));

		int username = GenericLib.getColumnIndex(filepath, sheetname, USERNAME);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains(sSRNumber)) {
				MyExtentListners.test.pass("Verify Alert popup contains service request number " + sSRNumber + " || "
						+ " Alert popup contains service request number " + sSRNumber);
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify Alert popup contains service request number " + sSRNumber + " || "
								+ " Alert popup does not contains service request number " + sSRNumber,
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFApplyBtn()));
				Assert.fail();
			}
			if (alert.getText().contains(sData[username])) {
				MyExtentListners.test.pass("Verify Alert popup contains Current Owner " + sData[username] + " || "
						+ " Alert popup contains Current Owner " + sData[username]);
			} else {
				MyExtentListners.test
						.fail(MarkupHelper.createLabel(
								"Verify Alert popup contains Current Owner " + sData[username] + " || "
										+ " Alert popup does not contains Current Owner " + sData[username],
								ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFApplyBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add customer validation to submit
	 */
	public void addCustomerValidation() throws InterruptedException, Exception {

		Actions act = new Actions(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleTerrifPlanBtn(), driver, " Terrif Plan");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleBillingAddrBtn(), driver, "  Billing Address");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.clickElement(getEleDOBValidationBtn(), driver, " DOB");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Validate Tele Verification Tagging(Interaction) Service
	 * Request Type,Subtype,Subsubtype
	 */

	public void validateTaggingSRDetails(String filepath, String sheetname, String testcaseId) throws IOException {

		int expSrType = GenericLib.getColumnIndex(filepath, sheetname, SR_TYPE);
		int expSrSubType = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBTYPE);
		int expSrSubSubType = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBSUBTYPE);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		String srType = ActionUtil.getAttributeValue(getEleTeleSRTypeTxtBx(), driver, " SR Type text box");
		String srSubType = ActionUtil.getAttributeValue(getEleTeleSRSubTypeTxtBx(), driver, " SR Type text box");
		String srSubSubType = ActionUtil.getAttributeValue(getEleTeleSRSubSubTypeTxtBx(), driver, " SR Type text box");
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", srType, sData[expSrType]);
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", srSubType, sData[expSrSubType]);
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", srSubSubType, sData[expSrSubSubType]);
	}

	/*
	 * @author:Arushi
	 * 
	 * Description: Validate SR status and sub status in Details Screen
	 */
	public void validateDetailsSRStatus(String statusTxt, String subStatusTxt) throws IOException {
		String expStatusTxt = ActionUtil.getAttributeValue(getEleDetailsStatusTxt(), driver, "Status Textbox");
		ActionUtil.verifyContainsText(expStatusTxt, statusTxt, "validating open SR status");

		String expSubStatusTxt = ActionUtil.getAttributeValue(geteleDetailsSubStatusTxt(), driver,
				" Validate Sub Status Textbox");
		ActionUtil.verifyContainsText(expSubStatusTxt, subStatusTxt, " Validating Sub Status");

	}

	public void clickTaggingInteration() throws IOException {

		ActionUtil.clickElement(eleTaggingInteractionBtn, driver, "Tagging Interation");
	}

	public void validateSRStatus(String statusTxt, String subStatusTxt) throws IOException {

		String actStatusTxt = ActionUtil.getAttributeValue(getEleStatusTxtBx(), driver, "Status Textbox");
		String actSubStatusTxt = ActionUtil.getAttributeValue(getEleSubStatusTxtBx(), driver, "Status Textbox");
		ActionUtil.verifyContainsText(actSubStatusTxt, subStatusTxt, " Validating Sub Status Resolved");
		ActionUtil.verifyContainsText(actStatusTxt, statusTxt, "validating status closed");
	}

	public String copySROwnerid() throws IOException, Throwable {
		ActionUtil.scrollIntoView(driver, getEleSROwnerTxt());
		Thread.sleep(3000);
		String ownerid = ActionUtil.getAttributeValue(getEleSROwnerTxt(), driver, "Owner qeue id");
		return ownerid;

	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add customer validation to submit
	 */

	public void addSimLostCustomerValidation() throws InterruptedException, Exception {

		Actions act = new Actions(driver);

		Thread.sleep(2000);
		ActionUtil.clickElement(getEleAddressBtn(), driver, " Address");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);

		ActionUtil.clickElement(getEleAlternetConatctNumberBtn(), driver, "  Alternate Contact NUmber");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);

		ActionUtil.clickElement(getEleEmailIdBtn(), driver, " EmailID");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi
	 *
	 * Description: Validate Tele Verification Tagging(Interaction) Service
	 * Request Type,Subtype,Subsubtype
	 */
	public void validateTeleVerificationSRDetails(String filepath, String sheetname, String testcaseId)	throws IOException, InterruptedException {
		Thread.sleep(2500);
		int expSrType = GenericLib.getColumnIndex(filepath, sheetname, SR_TYPE);
		int expSrSubType = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBTYPE);
		int expSrSubSubType = GenericLib.getColumnIndex(filepath, sheetname, SR_SUBSUBTYPE);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		String srType = ActionUtil.getAttributeValue(getEleTeleSRTypeTxtBx(), driver, " SR Type text box");
		String srSubType = ActionUtil.getAttributeValue(getEleTeleSRSubTypeTxtBx(), driver, " SR sub Type text box");
		String srSubSubType = ActionUtil.getAttributeValue(getEleTeleSRSubSubTypeTxtBx(), driver,
				" SR sub sub Type text box");
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", srType, sData[expSrType]);
		ActionUtil.verifyEqualsText(" Tele Verification SR sub Type ", srSubType, sData[expSrSubType]);
		ActionUtil.verifyEqualsText(" Tele Verification SR sub sub Type ", srSubSubType, sData[expSrSubSubType]);
	}

	/*
	 * @author:Arushi
	 *
	 * Description: customer validation for two details
	 */
	public void customerValidationForBalanceAndRechargeDetails() throws Exception {
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleBalanceBillingAddrBtn(), driver, "  Billing Address");
		Thread.sleep(3000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.clickElement(getEleBalanceAltContactNumBtn(), driver, "Alternate contact number");
		Thread.sleep(3000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.clickElement(getEleBalanceEmailIdEdtBtn(), driver, "Email id button");
		Thread.sleep(3000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
	}

	public void addOutcomeValueInInteractAction() throws Exception {
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleIntActionOutcomeTxtBx(), driver, "Outcome box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueTxtBx(), driver, "Outcome value box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueDrpDwn(), driver, "Outcome value drp dwn");
		ActionUtil.clickElement(getEleIntActionOutcomeValueCustNotContcbl(), driver,
				"Outcome value customer not contactable");
	}

	/*
	 * @author:Arushi
	 *
	 * Description: Validate SR status and sub status in Details Screen
	 */
	public void validateDetailsinInteractActionSRStatus(String statusTxt, String subStatusTxt) throws IOException {
		String expStatusTxt = ActionUtil.getAttributeValue(getEleIntActionStatusTxtBx(), driver, "Status Textbox");
		ActionUtil.verifyContainsText(expStatusTxt, statusTxt, "validating open SR status");

		String expSubStatusTxt = ActionUtil.getAttributeValue(getEleIntActionSubStatusTxtBx(), driver,
				"Validate Sub Status Textbox");
		ActionUtil.verifyContainsText(expSubStatusTxt, subStatusTxt, " Validating Sub Status");

	}

	/*
	 * @author:Shruti
	 *
	 * Description: Validate SR status and sub status in Interaction APPLET(BO
	 * TEST CASE)
	 */
	public void validateDetailsinInteractActionBOSRStatus(String statusTxt, String subStatusTxt)
			throws IOException, InterruptedException {
		Thread.sleep(5000);
		String expStatusTxt = ActionUtil.gettext(getEleIntActionBOStatusTxtBx(), driver, "Status Textbox");
		System.out.println(expStatusTxt);
		ActionUtil.verifyContainsText(expStatusTxt, statusTxt, "validating open SR status");
		Thread.sleep(5000);
		String expSubStatusTxt = ActionUtil.gettext(getEleIntActionBOSubStatusTxtBx(), driver,
				"Validate Sub Status Textbox");
		System.out.println(expSubStatusTxt);
		ActionUtil.verifyContainsText(expSubStatusTxt, subStatusTxt, " Validating Sub Status");

	}
	
	/*
	 * @author:Arushi
	 *
	 * Description: Out come GPRSDown 
	 */
	public void addOutcomeGPRSDownValueInInteractAction() throws Exception {
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleIntActionOutcomeTxtBx(), driver, "Outcome box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueTxtBx(), driver, "Outcome value box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueDrpDwn(), driver, "Outcome value drp dwn");
		ActionUtil.clickElement(getEleIntActionOutcomeValueGPRSDown(), driver,
				"Outcome value customer not contactable");
	}
	
	/*
	 * @author:Arushi
	 *
	 * Description: Out come Customer Not contactable
	 */
	public void addOutcomeCustomerNotContactableValueInInteractAction() throws Exception {
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleIntActionOutcomeTxtBx(), driver, "Outcome box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueTxtBx(), driver, "Outcome value box");
		ActionUtil.clickElement(getEleIntActionOutcomeValueDrpDwn(), driver, "Outcome value drp dwn");
		ActionUtil.clickElement(getEleIntActionOutcomeValueCustNotContcbl(), driver,
				"Outcome value customer not contactable");
	}
}
