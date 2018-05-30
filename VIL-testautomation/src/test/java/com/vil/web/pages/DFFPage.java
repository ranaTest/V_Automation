/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains DFF screen page objects and re-usable methods
* @methods 			: 		
*/
package com.vil.web.pages;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class DFFPage implements TestDataHeadingsConstants {

	WebDriver driver;

	public DFFPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff Name and Dff Value for STD Categories Objects
	 */
	@FindBy(xpath = "//td[@title='Product to Delete']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleProductToDeletetxtbox;

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleProductToDeleteDrpDwn;

	@FindBy(xpath = "//li[@data-lovtype='TM SR DFF List Applet:SRDFF_PickSimpleValue']")
	private List<WebElement> eleProductToDeleteDrpDwnValues;

	public List<WebElement> geteleProductToDeleteDrpDwnValues() {
		return eleProductToDeleteDrpDwnValues;
	}

	@FindBy(xpath = "//td[@title='Effective From']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleEffectiveFromTxtBox;

	@FindBy(xpath = "//td[contains(@id,'8_s_5_l_SRDFF_PickSimpleValue')]")
	private WebElement eleDepositToBeWaivedDroDwnTxtBox;

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleDepositToBeWaivedDroDwn;

	@FindBy(xpath = "//li[@data-lovtype='TM SR DFF List Applet:SRDFF_PickSimpleValue']")
	private List<WebElement> eleDepositToBeWaivedDroDwnvalues;

	public List<WebElement> geteleDepositToBeWaivedDroDwnvalues() {
		return eleDepositToBeWaivedDroDwnvalues;
	}

	@FindBy(xpath = "//button[@aria-label='Apply']")
	private WebElement eleDffApplyBtn;

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff objects for NMNPLeadCreation
	 */
	@FindBy(xpath = "//td[text()='Target Circle']/../td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleTargetCircle;
	@FindBy(xpath = "//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleTargetCircleTxtBx;

	@FindBy(xpath = "//td[text()='Alternate Number']/../td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleAlternateNumber;

	@FindBy(xpath = "//input[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_TextValue')]")
	private WebElement eleAlternateNumberTxtBx;

	public WebElement getEleTargetCircle() {
		return eleTargetCircle;
	}

	public WebElement getEleTargetCircleTxtBx() {
		return eleTargetCircleTxtBx;
	}

	public WebElement getEleAlternateNumber() {
		return eleAlternateNumber;
	}

	public WebElement getEleAlternateNumberTxtBx() {
		return eleAlternateNumberTxtBx;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff Name and Dff Value for Safe Custody Categories Objects
	 */
	@FindBy(xpath = "//td[text()='Safe Custody Product']/..//td[contains(@aria-labelledby,'altpick')]")
	private WebElement eleSafeCustodyTxtBx;

	public WebElement getEleSafeCustodyTxtBx() {
		return eleSafeCustodyTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-pick']")
	private WebElement eleSafeCustodyListApplet;

	public WebElement getEleSafeCustodyListApplet() {
		return eleSafeCustodyListApplet;
	}

	@FindBy(xpath = "//td[contains(text(),'3 month')]")
	private WebElement eleSafeCustodyListAppletTxtBxValue;

	public WebElement getEleSafeCustodyListAppletTxtBxValue() {
		return eleSafeCustodyListAppletTxtBxValue;
	}

	@FindBy(xpath = "//button[@title='Select:OK']")
	private WebElement eleSafeCustodyListAppletTxtBxOk;

	public WebElement getEleSafeCustodyListAppletTxtBxVaueOk() {
		return eleSafeCustodyListAppletTxtBxOk;
	}

	@FindBy(xpath = "//td[text()='Safe Custody Duration']/..//td[contains(@aria-labelledby,'altCalc')]")
	private WebElement eleSafeCustodyDurationTxtBx;

	public WebElement getEleSafeCustodyDurationTxtBx() {
		return eleSafeCustodyDurationTxtBx;
	}

	@FindBy(xpath = "//td[text()='Alternate Contact No']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleAltContactTxtBx;

	public WebElement getEleAltContactTxtBx() {
		return eleAltContactTxtBx;
	}

	@FindBy(xpath = "//td[text()='Alternate Contact No']/..//td[contains(@data-labelledby,'7_s_5_l_Seq ')]/input")
	private WebElement eleAltContactTxtBxValue;

	public WebElement getEleAltContactTxtBxValue() {
		return eleAltContactTxtBxValue;
	}

	@FindBy(xpath = "//td[text()='Alternate Email Id']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleAltEmailIdTxtBx;

	public WebElement getEleAltEmailIdTxtBx() {
		return eleAltEmailIdTxtBx;
	}

	@FindBy(xpath = "//td[text()='Alternate Email Id']/..//td[@data-labelledby='8_s_5_l_Seq ']/input")
	private WebElement eleAltEmailIdTxtBxValue;

	public WebElement getEleAltEmailIdTxtBxValue() {
		return eleAltEmailIdTxtBxValue;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF Values for M2M complaints
	 */

	@FindBy(xpath = "//td[text()='Destination IP']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleHiddenDestIpTxtBx;

	public WebElement getEleHiddenDestIpTxtBx() {
		return eleHiddenDestIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='Destination IP']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleDestIpTxtBx;

	public WebElement getEleDestIpTxtBx() {
		return eleDestIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='Solution type']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenSolutionTypeTxtBx;

	public WebElement getEleHiddenSolutionTypeTxtBx() {
		return eleHiddenSolutionTypeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Solution type']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleSolutionTypeLst;

	public WebElement getEleSolutionTypeLst() {
		return eleSolutionTypeLst;
	}

	@FindBy(xpath = "//td[text()='APN name']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenAPNNameTxtBx;

	public WebElement getEleHiddenAPNNameTxtBx() {
		return eleHiddenAPNNameTxtBx;
	}

	@FindBy(xpath = "//td[text()='APN name']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleAPNNameLst;

	public WebElement getEleAPNNameLst() {
		return eleAPNNameLst;
	}

	@FindBy(xpath = "//li[text()='Open Internet']")
	private WebElement eleOpenInternetOpt;

	public WebElement getEleOpenInternetOpt() {
		return eleOpenInternetOpt;
	}

	@FindBy(xpath = "//td[text()='Requestor Name']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleHiddenReqNameTxtBx;

	public WebElement getEleHiddenReqNameTxtBx() {
		return eleHiddenReqNameTxtBx;
	}

	@FindBy(xpath = "//td[text()='Requestor Name']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleRequestNameTxtBx;

	public WebElement getEleRequestNameTxtBx() {
		return eleRequestNameTxtBx;
	}

	@FindBy(xpath = "//td[text()='WAN IP']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleHiddenWANIpTxtBx;

	public WebElement getEleHiddenWANIpTxtBx() {
		return eleHiddenWANIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='WAN IP']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleWANIpTxtBx;

	public WebElement getEleWANIpTxtBx() {
		return eleWANIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='MSISDN']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleHiddenMsisdnTxtBx;

	public WebElement getEleHiddenMsisdnTxtBx() {
		return eleHiddenMsisdnTxtBx;
	}

	@FindBy(xpath = "//td[text()='MSISDN']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleMsisdnTxtBx;

	public WebElement getEleMsisdnTxtBx() {
		return eleMsisdnTxtBx;
	}

	@FindBy(xpath = "//td[text()='Static IP']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleHiddenStaticIpTxtBx;

	public WebElement getEleHiddenStaticIpTxtBx() {
		return eleHiddenStaticIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='Static IP']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleStaticIpTxtBx;

	public WebElement getEleStaticIpTxtBx() {
		return eleStaticIpTxtBx;
	}

	@FindBy(xpath = "//td[text()='Circuit ID']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleHiddenCircuitIdTxtBx;

	public WebElement getEleHiddenCircuitIdTxtBx() {
		return eleHiddenCircuitIdTxtBx;
	}

	@FindBy(xpath = "//td[text()='Circuit ID']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleCircuitIdTxtBx;

	public WebElement getEleCircuitIdTxtBx() {
		return eleCircuitIdTxtBx;
	}

	@FindBy(xpath = "//td[text()='FT Number']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleHiddenFTNumberTxtBx;

	public WebElement getEleHiddenFTNumberTxtBx() {
		return eleHiddenFTNumberTxtBx;
	}

	@FindBy(xpath = "//td[text()='FT Number']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleFTNumberTxtBx;

	public WebElement getEleFTNumberTxtBx() {
		return eleFTNumberTxtBx;
	}

	@FindBy(xpath = "//td[text()='Corporate name']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleHiddenCorpNameTxtBx;

	public WebElement getEleHiddenCorpNameTxtBx() {
		return eleHiddenCorpNameTxtBx;
	}

	@FindBy(xpath = "//td[text()='Corporate name']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleCorpNameTxtBx;

	public WebElement getEleCorpNameTxtBx() {
		return eleCorpNameTxtBx;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF Values Tariff or Offers Postpaid Complaints
	 */

	@FindBy(xpath = "//td[text()='From date']/..//td[contains(@aria-labelledby,'SRDFF_DateValue')]")
	private WebElement eleHiddenFromDateTxtBx;

	public WebElement getEleHiddenFromDateTxtBx() {
		return eleHiddenFromDateTxtBx;
	}

	@FindBy(xpath = "//td[text()='From date']/..//span[@class='siebui-icon-datetime']")
	private WebElement eleFromDateDtePck;

	public WebElement getEleFromDateDtePck() {
		return eleFromDateDtePck;
	}

	@FindBy(xpath = "//td[text()='To date']/..//td[contains(@id,'SRDFF_DateValue')]")
	private WebElement eleHiddenToDateTxtBx;

	public WebElement getEleHiddenToDateTxtBx() {
		return eleHiddenToDateTxtBx;
	}

	@FindBy(xpath = "//td[text()='To date']/..//span[@class='siebui-icon-datetime']")
	private WebElement eleToDateDtePck;

	public WebElement getEleToDateDtePck() {
		return eleToDateDtePck;
	}

	@FindBy(xpath = "//td[text()='Type Of Issue']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenTypeOfIssueTxtBx;

	public WebElement getEleHiddenTypeOfIssueTxtBx() {
		return eleHiddenTypeOfIssueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type Of Issue']/..//input[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeOfIssueTxtBx;

	public WebElement getEleTypeOfIssueTxtBx() {
		return eleTypeOfIssueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Scheme details']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleHiddenSchemeDetailsTxtBx;

	public WebElement getEleHiddenSchemeDetailsTxtBx() {
		return eleHiddenSchemeDetailsTxtBx;
	}

	@FindBy(xpath = "//td[text()='Scheme details']/..//input[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleSchemeDetailsTxtBx;

	public WebElement getEleSchemeDetailsTxtBx() {
		return eleSchemeDetailsTxtBx;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF Values Billing and Payment complaints for paostapid
	 */

	@FindBy(xpath = "//td[text()='Invoice Date']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenInvoiceDateTxtBx;

	public WebElement getEleHiddenInvoiceDateTxtBx() {
		return eleHiddenInvoiceDateTxtBx;
	}

	@FindBy(xpath = "//td[text()='Invoice Date']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleInvoiceDateDrpDwnIcn;

	public WebElement getEleInvoiceDateDrpDwnIcn() {
		return eleInvoiceDateDrpDwnIcn;
	}

	@FindBy(xpath = "//td[text()='Reason for COMPLAINT']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenReasonForComplaintTxtBx;

	public WebElement getEleHiddenReasonForComplaintTxtBx() {
		return eleHiddenReasonForComplaintTxtBx;
	}

	@FindBy(xpath = "//td[text()='Reason for COMPLAINT']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleReasonForComplaintDrpDwnIcn;

	public WebElement getEleReasonForComplaintDrpDwnIcn() {
		return eleReasonForComplaintDrpDwnIcn;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF Values for Trade CRM complaints
	 */

	@FindBy(xpath = "//td[text()='Complaint Type']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenComplaintTypeTxtBx;

	public WebElement getEleHiddenComplaintTypeTxtBx() {
		return eleHiddenComplaintTypeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Complaint Type']/../..//span[@class='siebui-icon-dropdown']")
	private WebElement eleComplaintTypeDrpDwnIcn;

	public WebElement getEleComplaintTypeDrpDwnIcn() {
		return eleComplaintTypeDrpDwnIcn;
	}

	@FindBy(xpath = "//td[text()='Complaint Details']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenComplaintDetailsTxtBx;

	public WebElement getEleHiddenComplaintDetailsTxtBx() {
		return eleHiddenComplaintDetailsTxtBx;
	}

	@FindBy(xpath = "//td[text()='Complaint Details']/../..//span[@class='siebui-icon-dropdown']")
	private WebElement eleComplaintDetailsDrpDwnIcn;

	public WebElement getEleComplaintDetailsDrpDwnIcn() {
		return eleComplaintDetailsDrpDwnIcn;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF Values Billing And Payment Postpaid Complaints
	 */

	@FindBy(xpath = "//td[text()='Waiver Type']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenWaiverTypeTxtBx;

	public WebElement getEleHiddenWaiverTypeTxtBx() {
		return eleHiddenWaiverTypeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Waiver Type']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleWaiverTypeDrpDwnIcn;

	public WebElement getEleWaiverTypeDrpDwnIcn() {
		return eleWaiverTypeDrpDwnIcn;
	}

	@FindBy(xpath = "//td[text()='Usage Details']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenUserDetailsTxtBx;

	public WebElement getEleHiddenUserDetailsTxtBx() {
		return eleHiddenUserDetailsTxtBx;
	}

	@FindBy(xpath = "//td[text()='Usage Details']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleUserDetailsDrpDwnIcn;

	public WebElement getEleUserDetailsDrpDwnIcn() {
		return eleUserDetailsDrpDwnIcn;
	}

	@FindBy(xpath = "//td[text()='Credit Reason']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleHiddenCreditReasonTxtBx;

	public WebElement getEleHiddenCreditReasonTxtBx() {
		return eleHiddenCreditReasonTxtBx;
	}

	@FindBy(xpath = "//td[text()='Credit Reason']/..//span[@class='siebui-icon-dropdown']")
	private WebElement eleCreditReasonDrpDwnIcn;

	public WebElement getEleCreditReasonDrpDwnIcn() {
		return eleCreditReasonDrpDwnIcn;
	}

	@FindBy(xpath = "//td[text()='Billing Month 1']/..//td[contains(@id,'SRDFF_PickValue')]")
	private WebElement eleHiddenBillingMonth1TxtBx;

	public WebElement getEleHiddenBillingMonth1TxtBx() {
		return eleHiddenBillingMonth1TxtBx;
	}

	@FindBy(xpath = "//td[text()='Billing Month 1']/..//span[@class='siebui-icon-pick']")
	private WebElement eleBillingMonth1DtePckr;

	public WebElement getEleBillingMonth1DtePckr() {
		return eleBillingMonth1DtePckr;
	}

	@FindBy(xpath = "//button[@aria-label='Select:OK']")
	private WebElement eleBillingMonth1OKBtn;

	public WebElement getEleBillingMonth1OKBtn() {
		return eleBillingMonth1OKBtn;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: DFF values for Call type TV Positive Data Consent
	 * Yes/No/Failed
	 */

	@FindBy(xpath = "//td[@title='Product Type']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleProductTypeDFFValueTxtBx;

	public WebElement getEleProductTypeDFFValueTxtBx() {
		return eleProductTypeDFFValueTxtBx;
	}

	@FindBy(xpath = "//td[@title='TV Status']/..//td[contains(@aria-labelledby,'SRDFF_PickValue')]")
	private WebElement eleTVStatusDFFValueTxtBx;

	public WebElement getEleTVStatusDFFValueTxtBx() {
		return eleTVStatusDFFValueTxtBx;
	}

	@FindBy(xpath = "//td[@title='Data Consent']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleDataConsentDFFValueTxtBx;

	public WebElement getEleDataConsentDFFValueTxtBx() {
		return eleDataConsentDFFValueTxtBx;
	}

	@FindBy(xpath = "//button[@title='Interaction Actions:Submit']")
	private WebElement eleDFFSubmitBtn;

	public WebElement getEleDFFSubmitBtn() {
		return eleDFFSubmitBtn;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Simex Scenarios
	 */

	@FindBy(xpath = "//td[text()='New SIM Number']/../..//td[@id='1_s_4_l_SRDFF_TextValue']")
	private WebElement eleNewSimNorDFFValueTxtBx;

	public WebElement getEleNewSimNorDFFValueTxtBx() {
		return eleNewSimNorDFFValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Reason for SIM Replacement']/../..//td[@id='2_s_4_l_SRDFF_PickSimpleValue']")
	private WebElement eleReasonDFFValueTxtBx;

	public WebElement getEleReasonDFFValueTxtBx() {
		return eleReasonDFFValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Requester Type']/../..//td[@id='3_s_4_l_SRDFF_PickSimpleValue']")
	private WebElement eleRequesterTypeDFFValueTxtBx;

	public WebElement getEleRequesterTypeDFFValueTxtBx() {
		return eleRequesterTypeDFFValueTxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff contactid Scenario
	 */

	@FindBy(xpath = "(//td[contains(@id,'SRDFF_PickValue')])[1]")
	private WebElement eleHiddenContactIdDFFValueTxtBx;

	public WebElement getEleHiddenContactIdDFFValueTxtBx() {
		return eleHiddenContactIdDFFValueTxtBx;
	}

	@FindBy(xpath = "//input[@name='SRDFF_PickValue']")
	private WebElement eleContactIdDFFValueTxtBx;

	public WebElement getEleContactIdDFFValueTxtBx() {
		return eleContactIdDFFValueTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-pick']")
	private WebElement eleContactIdDFFPickup;

	public WebElement eleContactIdDFFPickup() {
		return eleContactIdDFFPickup;
	}

	@FindBy(xpath = "(//td[@aria-labelledby='s_14_l_Value'])[2]")
	private WebElement eleContacidInPickup;

	public WebElement getEleContacidInPickup() {
		return eleContacidInPickup;
	}

	@FindBy(xpath = "(//span[text()='OK'])[2]")
	private WebElement eleOkInPickup;

	public WebElement getEleOkInPickup() {
		return eleOkInPickup;
	}

	@FindBy(xpath = "//td[text()='Alternate Contact Number']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleAlternateNumberinDff;

	public WebElement eleAlternateNumberinDff() {
		return eleAlternateNumberinDff;
	}

	@FindBy(xpath = "//td[text()='Alternate Contact Number']/..//input[@name='SRDFF_TextValue']")
	private WebElement eleAlternateNumberinDffTxtBx;

	public WebElement eleAlternateNumberinDffTxtBx() {
		return eleAlternateNumberinDffTxtBx;
	}

	@FindBy(xpath = "//td[text()='SIM card to be couriered']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleSimCardCourieredTxt;

	public WebElement getEleSimCardCourieredTxt() {
		return eleSimCardCourieredTxt;
	}

	@FindBy(xpath = "//button[@title='Details:Submit']")
	private WebElement eleSrSubmitBtn;

	public WebElement eleSrSubmitBtn() {
		return eleSrSubmitBtn;
	}

	@FindBy(xpath = "//td[text()='Courier Address']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleCouruerAddressTxt;

	public WebElement getEleCouruerAddressTxt() {
		return eleCouruerAddressTxt;
	}

	@FindBy(xpath = "//td[text()='Alternate contact number']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleAlternateContactNumberTxt;

	public WebElement getEleAlternateContactNumberTxt() {
		return eleAlternateContactNumberTxt;
	}

	@FindBy(xpath = "//td[text()='Reason for Suspension']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleReasonSuspensionTxt;

	public WebElement getEleReasonSuspensionTxt() {
		return eleReasonSuspensionTxt;
	}

	@FindBy(xpath = "//td[text()='NTMS Device']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleNtmsDeviceTxt;

	public WebElement getEleNtmsDeviceTxt() {
		return eleNtmsDeviceTxt;
	}

	@FindBy(xpath = "//td[text()='OTA Enabled']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleOtaEnabledTxt;

	public WebElement getEleOtaEnabledTxt() {
		return eleOtaEnabledTxt;
	}

	@FindBy(xpath = "//td[text()='Sent Mode']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleSentModeTxt;

	public WebElement getEleSentModeTxt() {
		return eleSentModeTxt;
	}

	@FindBy(xpath = "//td[text()='Media']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleMediaTxt;

	public WebElement getEleMediaTxt() {
		return eleMediaTxt;
	}

	/*
	 * @author:Rana
	 * 
	 * Description: Address Scenarios
	 */

	@FindBy(xpath = "//td[text()='Address Type']/..//td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleAddressTypeTxtBx;

	public WebElement getEleAddressTypeTxtBx() {
		return eleAddressTypeTxtBx;
	}
	// input[@name='SRDFF_PickSimpleValue']

	@FindBy(xpath = "//td[text()='Address Type']/..//input[@name='SRDFF_PickSimpleValue']")
	private WebElement eleAddressTypeEdtBx;

	public WebElement getEleAddressTypeEdtBx() {
		return eleAddressTypeEdtBx;
	}

	@FindBy(xpath = "//td[text()='Address Type']/..//span[@id='s_5_2_32_0_icon']")
	private WebElement eleAddressTypeDrpDn;

	public WebElement getEleAddressTypeDrpDn() {
		return eleAddressTypeDrpDn;
	}

	@FindBy(xpath = "//td[text()='Line 1']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleLine1TxtBx;

	public WebElement getEleLine1TxtBx() {
		return eleLine1TxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address Line 1']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleNewAddressLine1TxtBx;

	public WebElement getEleNewAddressLine1TxtBx() {
		return eleNewAddressLine1TxtBx;
	}

	@FindBy(xpath = "//input[@name='SRDFF_TextValue']")
	private WebElement eleLine1EdtBx;

	public WebElement getEleLine1EdtBx() {
		return eleLine1EdtBx;
	}

	@FindBy(xpath = "//td[text()='Line 2']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleLine2TxtBx;

	public WebElement getEleLine2TxtBx() {
		return eleLine2TxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address Line 2']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleNewAddressLine2TxtBx;

	public WebElement getEleNewAddressLine2TxtBx() {
		return eleNewAddressLine2TxtBx;
	}

	@FindBy(xpath = "//input[@id='3_SRDFF_TextValue']")
	private WebElement eleLine2EdtBx;

	public WebElement getEleLine2EdtBx() {
		return eleLine2EdtBx;
	}

	@FindBy(xpath = "//td[text()='Landmark']/..//td[@aria-labelledby='s_5_l_SRDFF_TextValue']")
	private WebElement eleLandmarkTxtBx;

	public WebElement getEleLandmarkTxtBx() {
		return eleLandmarkTxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address Landmark']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleNewAddressLandmarkTxtBx;

	public WebElement getEleNewAddressLandmarkTxtBx() {
		return eleNewAddressLandmarkTxtBx;
	}

	@FindBy(xpath = "//input[@id='4_SRDFF_TextValue']")
	private WebElement eleLandmarkEdtBx;

	public WebElement getEleLandmarkEdtBx() {
		return eleLandmarkEdtBx;
	}

	@FindBy(xpath = "//td[text()='State']/..//td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleStateTxtBx;

	public WebElement getEleStateTxtBx() {
		return eleStateTxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address State']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleNewAddressStateTxtBx;

	public WebElement getEleNewAddressStateTxtBx() {
		return eleNewAddressStateTxtBx;
	}

	@FindBy(xpath = "//input[@id='5_SRDFF_PickSimpleValue']")
	private WebElement eleStateEdtBx;

	public WebElement getEleStateEdtBx() {
		return eleStateEdtBx;
	}

	@FindBy(xpath = "//td[text()='State']/..//span[@id='s_5_2_32_0_icon']")
	private WebElement eleStateDrpDn;

	public WebElement getEleStateDrpDn() {
		return eleStateDrpDn;
	}

	@FindBy(xpath = "//li[text()='Maharashtra']")
	private WebElement eleMaharashtraTxt;

	public WebElement getEleMaharashtraTxt() {
		return eleMaharashtraTxt;
	}

	@FindBy(xpath = "//td[text()='City']/..//td[@aria-labelledby='s_5_l_SRDFF_PickValue s_5_l_altpick']")
	private WebElement eleCityTxtBx;

	public WebElement getEleCityTxtBx() {
		return eleCityTxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address City']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleNewAddressCityTxtBx;

	public WebElement getEleNewAddressCityTxtBx() {
		return eleNewAddressCityTxtBx;
	}

	@FindBy(xpath = "//input[@id='6_SRDFF_PickValue']")
	private WebElement eleCityEdtBx;

	public WebElement getEleCityEdtBx() {
		return eleCityEdtBx;
	}

	@FindBy(xpath = "//input[@id='6_SRDFF_PickSimpleValue']")
	private WebElement eleNewAddressCityEdtBx;

	public WebElement getEleNewAddressCityEdtBx() {
		return eleNewAddressCityEdtBx;
	}

	@FindBy(xpath = "//td[text()='City']/..//span[@id='s_5_2_33_0_icon']")
	private WebElement eleCityDrpDn;

	public WebElement getEleCityDrpDn() {
		return eleCityDrpDn;
	}

	@FindBy(xpath = "//td[text()='Navi Mumbai']")
	private WebElement eleNaviMumbaiTxt;

	public WebElement getEleNaviMumbaiTxt() {
		return eleNaviMumbaiTxt;
	}

	@FindBy(xpath = "//td[text()='Pincode']/..//td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement elePincodeTxtBx;

	public WebElement getElePincodeTxtBx() {
		return elePincodeTxtBx;
	}

	@FindBy(xpath = "//td[text()='New Address Pin code']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleNewAddressPincodeTxtBx;

	public WebElement getEleNewAddressPincodeTxtBx() {
		return eleNewAddressPincodeTxtBx;
	}

	@FindBy(xpath = "//input[@id='7_SRDFF_PickSimpleValue']")
	private WebElement elePincodeEdtBx;

	public WebElement getElePincodeEdtBx() {
		return elePincodeEdtBx;
	}

	@FindBy(xpath = "//td[text()='Pincode']/..//span[@id='s_5_2_32_0_icon']")
	private WebElement elePincodeDrpDn;

	public WebElement getElePincodeDrpDn() {
		return elePincodeDrpDn;
	}
	
	

	@FindBy(xpath = "//td[text()='New Address Type for Billing']/..//td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleNewAddressTypeforBillingTxtBx;

	public WebElement getEleNewAddressTypeforBillingTxtBx() {
		return eleNewAddressTypeforBillingTxtBx;
	}

	@FindBy(xpath = "//input[@id='8_SRDFF_PickSimpleValue']")
	private WebElement eleNewAddressTypeforBillingEdtBx;

	public WebElement getEleNewAddressTypeforBillingEdtBx() {
		return eleNewAddressTypeforBillingEdtBx;
	}

	@FindBy(xpath = "//td[text()='New POA Required']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleNewPOaRequiredTxtBx;

	public WebElement getEleNewPOaRequiredTxtBx() {
		return eleNewPOaRequiredTxtBx;
	}

	@FindBy(xpath = "//button[@aria-label='Select:OK']")
	private WebElement eleOkBtn;

	public WebElement getEleOkBtn() {
		return eleOkBtn;
	}

	/***********************************************************************
	 *
	 * @author : Srinivas Hippargi
	 * @description : Re-usable methods to add DFF Values And Submit / Apply
	 * 
	 */

	@FindBy(xpath = "//td[text()='Template Name']/..//td[contains(@title,'PUSH SMS')]")
	private WebElement eleTemplateNameTxtBx;

	public WebElement getEleTemplateNameTxtBx() {
		return eleTemplateNameTxtBx;
	}

	@FindBy(xpath = "//td[text()='Message Media']/..//td[contains(@id,'PickSimpleValue')]")
	private WebElement eleMessageMediaTxtBx;

	public WebElement getEleMessageMediaTxtBx() {
		return eleTemplateNameTxtBx;
	}
	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff BILLING COMPLAINT
	 */

	@FindBy(xpath = "//td[text()='Amount Transferred']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_NumValue s_5_l_altCalc')]")
	private WebElement eleAmountTransferredTxtBx;

	public WebElement getEleAmountTransferredTxtBx() {
		return eleAmountTransferredTxtBx;
	}

	@FindBy(xpath = "//td[text()='Amount Transferred']/..//input[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_NumValue s_5_l_altCalc')]")
	private WebElement eleAmountTransferredValueTxtBx;

	public WebElement getEleAmountTransferredValueTxtBx() {
		return eleAmountTransferredValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Recipient number']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleRecipientnumberTxtBx;

	public WebElement getEleRecipientnumberTxtBx() {
		return eleRecipientnumberTxtBx;
	}

	@FindBy(xpath = "//td[text()='Recipient number']/..//input[contains(@aria-labelledby,'3_s_5_l_Seq s_5_l_SRDFF_TextValue')]")
	private WebElement eleRecipientnumberValueTxtBx;

	public WebElement getEleRecipientnumberValueTxtBx() {
		return eleRecipientnumberValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Mode of transfer']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleModeOfTransferTxtBx;

	public WebElement getEleModeOfTransferTxtBx() {
		return eleModeOfTransferTxtBx;
	}

	@FindBy(xpath = "//td[text()='Mode of transfer']/..//input[contains(@aria-labelledby,'4_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleModeOfTransferTxtBxValueTxtBx;

	public WebElement getEleModeOfTransferTxtBxValueTxtBx() {
		return eleModeOfTransferTxtBxValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Date of transfer']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleDateOfTransferTxtBx;

	public WebElement getEleDateOfTransferTxtBx() {
		return eleDateOfTransferTxtBx;
	}

	@FindBy(xpath = "//td[text()='Date of transfer']/..//input[contains(@aria-labelledby,'5_s_5_l_Seq s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleDateOfTransferTxtBxValueTxtBx;

	public WebElement getEleDateOfTransferTxtBxValueTxtBx() {
		return eleDateOfTransferTxtBxValueTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-datetime']")
	private WebElement eleDateOfTransferDrpDwn;

	public WebElement getEleDateOfTransferDrpDwn() {
		return eleDateOfTransferDrpDwn;
	}

	@FindBy(xpath = "//a[text()='2']")
	private WebElement eleDateOfTransferDrpDwnDate2;

	public WebElement getEleDateOfTransferDrpDwnDate2() {
		return eleDateOfTransferDrpDwnDate2;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff BILLING COMPLAINT GST related
	 */

	@FindBy(xpath = "//td[text()='Type of Dispute']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeOfDisputeTxtBx;

	public WebElement getEleTypeOfDisputeTxtBx() {
		return eleTypeOfDisputeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type of Dispute']/..//input[contains(@aria-labelledby,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeOfDisputeValueTxtBx;

	public WebElement getEleTypeOfDisputeValueTxtBx() {
		return eleTypeOfDisputeValueTxtBx;
	}

	@FindBy(xpath = "//td[@title='Reason for Dispute']/..//td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleReasonOfDisputeTxtBx;

	public WebElement getEleReasonOfDisputeTxtBx() {
		return eleReasonOfDisputeTxtBx;
	}

	@FindBy(xpath = "//td[@title='Reason for Dispute']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleReasonOfDisputeValueTxtBx;

	public WebElement getEleReasonOfDisputeValueTxtBx() {
		return eleReasonOfDisputeValueTxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff NetworkDataConfiguration objects
	 *
	 */

	@FindBy(xpath = "//td[text()='Type of Complaint']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTypeOfCptBx;

	public WebElement getTypeOfCptBx() {
		return eleTypeOfCptBx;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfCptTxtBx;

	public WebElement getTypeOfCptTxtBx() {
		return eleTypeOfCptTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfCptDrpDwn;

	public WebElement getTypeOfCptDrpDwn() {
		return eleTypeOfCptDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Unable to use Wifi']")
	private WebElement eleTypeOfCptBxDrpDwnValue;

	public WebElement getTypeOfCptBxDrpDwnValue() {
		return eleTypeOfCptBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Device Type']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleDeviceTypeBx;

	public WebElement getDeviceTypeBx() {
		return eleDeviceTypeBx;
	}

	@FindBy(xpath = "//td[text()='Device Type']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleDeviceTypeTxtBx;

	public WebElement getDeviceTypeTxtBx() {
		return eleDeviceTypeTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleDeviceTypeDrpDwn;

	public WebElement getDeviceTypeDrpDwn() {
		return eleDeviceTypeDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Mobile']")
	private WebElement eleDeviceTypeBxDrpDwnValue;

	public WebElement getDeviceTypeBxDrpDwnValue() {
		return eleDeviceTypeBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Issue or Error']/../td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleIssueErrorBx;

	public WebElement getIssueErrorBx() {
		return eleIssueErrorBx;
	}

	@FindBy(xpath = "//td[text()='Issue or Error']/..//input[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleIssueErrorTxtBx;

	public WebElement getIssueErrorTxtBx() {
		return eleIssueErrorTxtBx;
	}

	@FindBy(xpath = "//td[text()='Issue or Error']/../td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleAltNoBx;

	public WebElement getAltNoBx() {
		return eleAltNoBx;
	}

	@FindBy(xpath = "//td[text()='Issue or Error']/..//input[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleAltNoTxtBx;

	public WebElement getAltNoTxtBx() {
		return eleAltNoTxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff Billing complaint deposit transfer issue
	 */

	@FindBy(xpath = "//td[text()='Request No']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleRequestNoTxtBx;

	public WebElement getEleRequestNoTxtBx() {
		return eleRequestNoTxtBx;
	}

	@FindBy(xpath = "//td[text()='Request No']/..//input[contains(@aria-labelledby,'1_s_5_l_Seq s_5_l_SRDFF_TextValue')]")
	private WebElement eleRequestNoValueTxtBx;

	public WebElement getEleRequestNoValueTxtBx() {
		return eleRequestNoValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Location']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement elePaymentLocTxtBx;

	public WebElement getElePaymentLocTxtBx() {
		return elePaymentLocTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Location']/..//input[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement elePaymentLocValueTxtBx;

	public WebElement getElePaymentLocTxtValueBx() {
		return elePaymentLocValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Amount']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_NumValue s_5_l_altCalc')]")
	private WebElement elePaymentAmtTxtBx;

	public WebElement getElePaymentAmtTxtBx() {
		return elePaymentAmtTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Amount']/..//input[contains(@aria-labelledby,'3_s_5_l_Seq s_5_l_SRDFF_NumValue s_5_l_altCalc')]")
	private WebElement elePaymentAmtValueTxtBx;

	public WebElement getElePaymentAmtValueTxtBx() {
		return elePaymentAmtValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Date']/..//input[contains(@aria-labelledby,'4_s_5_l_Seq s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement elePaymentDateValueTxtBx;

	public WebElement getElePaymentDateValueTxtBx() {
		return elePaymentDateValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Mode of Payment']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleModeOfPaymentValueTxtBx;

	public WebElement getEleModeOfPaymentValueTxtBx() {
		return eleModeOfPaymentValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Transaction ID']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleTransactionIdTxtBx;

	public WebElement getEleTransactionIdTxtBx() {
		return eleTransactionIdTxtBx;
	}

	@FindBy(xpath = "//td[text()='Transaction ID']/..//input[contains(@aria-labelledby,'6_s_5_l_Seq s_5_l_SRDFF_TextValue')]")
	private WebElement eleTransactionIdValueTxtBx;

	public WebElement getEleTransactionIdValueTxtBx() {
		return eleTransactionIdValueTxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff Billing complaint and payment due to donor
	 */
	@FindBy(xpath = "//td[text()='Reason for COMPLAINT']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForComplaintTxtBx;

	public WebElement getEleReasonForComplaintTxtBx() {
		return eleReasonForComplaintTxtBx;
	}

	@FindBy(xpath = "//td[text()='Reason for COMPLAINT']/..//input[contains(@aria-labelledby,'1_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForComplaintValueTxtBx;

	public WebElement getEleReasonForComplaintValueTxtBx() {
		return eleReasonForComplaintValueTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleReasonForComplaintValueDrpdwn;

	public WebElement getEleReasonForComplaintValueDrpdwn() {
		return eleReasonForComplaintValueDrpdwn;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff Billing complaint and payment for SI not registered
	 */
	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForDisputeSITxtBx;

	public WebElement getEleReasonForDisputeSITxtBx() {
		return eleReasonForDisputeSITxtBx;
	}

	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//input[contains(@aria-labelledby,'1_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForDisputeSIValueTxtBx;

	public WebElement getEleReasonForDisputeSIValueTxtBx() {
		return eleReasonForDisputeSIValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Registration Date']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleReisterationDateSITxtBx;

	public WebElement getEleReisterationDateSITxtBx() {
		return eleReisterationDateSITxtBx;
	}

	@FindBy(xpath = "//td[text()='Registration Date']/..//input[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleReisterationDateValueSITxtBx;

	public WebElement getEleReisterationDateValueSITxtBx() {
		return eleReisterationDateValueSITxtBx;
	}

	@FindBy(xpath = "//td[text()='Registration Media']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReisterationMediaSITxtBx;

	public WebElement getEleReisterationMediaSITxtBx() {
		return eleReisterationMediaSITxtBx;
	}

	@FindBy(xpath = "//td[text()='Registration Media']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReisterationMediaValueSITxtBx;

	public WebElement getEleReisterationMediaValueSITxtBx() {
		return eleReisterationMediaValueSITxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff Billing complaint and payment for SI registered
	 */

	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForDisputeSIorECSTxtBx;

	public WebElement getEleReasonForDisputeSIorECSTxtBx() {
		return eleReasonForDisputeSIorECSTxtBx;
	}

	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//input[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonForDisputeSIorECSValueTxtBx;

	public WebElement getEleReasonForDisputeSIorECSValueTxtBx() {
		return eleReasonForDisputeSIorECSValueTxtBx;
	}
	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff service complaint Complaints-Service Disconnection
	 * -Voluntary-Churn Related_Postpaid
	 */

	@FindBy(xpath = "//td[text()='Request for Retention - Date']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleRetentionForDateTxtBx;

	public WebElement getEleRetentionForDateTxtBx() {
		return eleRetentionForDateTxtBx;
	}

	@FindBy(xpath = "//td[text()='Request for Retention - Date']/..//input[contains(@aria-labelledby,'5_s_5_l_Seq s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleRetentionForDateValueTxtBx;

	public WebElement getEleRetentionForDateValueTxtBx() {
		return eleRetentionForDateValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Retained']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleRetainedTxtBx;

	public WebElement getEleRetainedTxtBx() {
		return eleRetainedTxtBx;
	}

	@FindBy(xpath = "//td[text()='Retained']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleRetainedValueTxtBx;

	public WebElement getEleRetainedValueTxtBx() {
		return eleRetainedValueTxtBx;
	}

	/*
	 * @FindBy(xpath =
	 * "//td[text()='Alternate Contact Number']/..//td[contains(@id,'SRDFF_TextValue')]"
	 * ) private WebElement eleAlternateContactNumberTxtBx;
	 * 
	 * public WebElement getEleAlternateContactNumberTxtBx() { return
	 * eleAlternateContactNumberTxtBx; }
	 */

	/*
	 * @FindBy(xpath =
	 * "//td[text()='Alternate Contact Number']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]"
	 * ) private WebElement eleAlternateContactNumberValueTxtBx;
	 * 
	 * public WebElement getEleAlternateContactNumberValueTxtBx() { return
	 * eleAlternateContactNumberValueTxtBx; }
	 */
	/*
	 * **************
	 * 
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff service complaint Complaints Services -DoNotDisturb
	 * DND-DND Not Activated_Post
	 * 
	 */
	@FindBy(xpath = "//td[text()='DND Request SR No']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickValue s_5_l_altpick')]")
	private WebElement eleDNDRequestSRNoTxtBx;

	public WebElement getEleDNDRequestSRNoTxtBx() {
		return eleDNDRequestSRNoTxtBx;
	}

	@FindBy(xpath = "//td[text()='Application Type']/..//input[contains(@aria-labelledby,'1_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleAlternateContactNumberValueTxtBx;

	public WebElement getEleAlternateContactNumberValueTxtBx() {
		return eleAlternateContactNumberValueTxtBx;
	}

	/*
	 * **************
	 * 
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff service complaint
	 * FailedInteractionsSelfHelpErrorOrAccessPostP
	 * 
	 */
	@FindBy(xpath = "//td[text()='Application Type']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleApplicationTypeTxtBx;

	public WebElement getEleApplicationTypeTxtBx() {
		return eleApplicationTypeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Application Type']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleApplicationTypeValueTxtBx;

	public WebElement getEleApplicationTypeValueTxtBx() {
		return eleApplicationTypeValueTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement dffValueDrpdwn;

	public WebElement getEleDffValueDrpdwn() {
		return dffValueDrpdwn;
	}

	@FindBy(xpath = "//td[text()='Feedback related to']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleFeedbackRelatedToTxtBx;

	public WebElement getEleFeedbackRelatedToTxtBx() {
		return eleFeedbackRelatedToTxtBx;
	}

	@FindBy(xpath = "//td[text()='Feedback related to']/..//INPUT[contains(@aria-labelledby,'2_s_5_l_Seq s_5_l_SRDFF_TextValue')]")
	private WebElement eleFeedbackRelatedValueToTxtBx;

	public WebElement getEleFeedbackRelatedValueToTxtBx() {
		return eleFeedbackRelatedValueToTxtBx;
	}

	/*
	 * **************
	 * 
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff service complaint Failed interactions-System Error or
	 * Downtime_Postpaid
	 * 
	 */
	@FindBy(xpath = "//td[text()='Impacted System']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleImpactedSystemTxtBx;

	public WebElement getEleImpactedSystemTxtBx() {
		return eleImpactedSystemTxtBx;
	}

	@FindBy(xpath = "//td[text()='System outage']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleSystemOutageTxtBx;

	public WebElement getEleSystemOutageTxtBx() {
		return eleSystemOutageTxtBx;
	}

	@FindBy(xpath = "//td[text()='Query on']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleQueryOnTxtBx;

	public WebElement getEleQueryOnTxtBx() {
		return eleQueryOnTxtBx;
	}

	@FindBy(xpath = "//td[text()='Query on']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleMismatchQueryOnTxtBx;

	public WebElement getEleMismatchQueryOnTxtBx() {
		return eleMismatchQueryOnTxtBx;
	}

	@FindBy(xpath = "//td[text()='Query on']/..//input[contains(@aria-labelledby,'s_5_l_SRDFF_TextValue')]")
	private WebElement eleMismatchQueryOnValueTxtBx;

	public WebElement getEleMismatchQueryOnValueTxtBx() {
		return eleMismatchQueryOnValueTxtBx;
	}

	@FindBy(xpath = "//td[text()='Action Taken']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleActionValueTxtBx;

	public WebElement getEleActionOnValueTxtBx() {
		return eleActionValueTxtBx;
	}

	/***********************************************************************
	 *
	 * @author : Srinivas Hippargi
	 * @description : Re-usable methods to add DFF Values And Submit / Apply
	 * 
	 */

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Postpaid call type enquiry and billing dff value
	 * 
	 */
	@FindBy(xpath = "//td[text()='Reason for Call']")
	private WebElement eleCallForReasonTxtBx;

	public WebElement getEleCallForReasonTxtBx() {
		return eleCallForReasonTxtBx;
	}

	@FindBy(xpath = "//td[text()='Month']/..//td[@aria-labelledby='s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleMonthTxtBx;

	public WebElement getEleMonthTxtBx() {
		return eleMonthTxtBx;
	}

	@FindBy(xpath = "//input[contains(@aria-labelledby,' s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleMonthValueTxtBx;

	public WebElement getEleMonthValueTxtBx() {
		return eleMonthValueTxtBx;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry details
	 */

	@FindBy(xpath = "//td[text()='Type of Enquiry']/..//td[contains(@id,'1_s_5_l_SRDFF_PickSimpleValue')]")
	private WebElement eleTypeOfEnquiryBx;

	public WebElement getEleTypeOfEnquiryBx() {
		return eleTypeOfEnquiryBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfEnquiryDrpDwn;

	public WebElement getEleTypeOfEnquiryDrpDwn() {
		return eleTypeOfEnquiryDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Televerification']")
	private WebElement eleTeleverificationinDrpDwn;

	public WebElement getEleTeleverificationinDrpDwn() {
		return eleTeleverificationinDrpDwn;
	}

	@FindBy(xpath = "//td[@title='Reason for call']/..//td[contains(@id,'2_s_5_l_SRDFF_PickSimpleValue')]")
	private WebElement eleReasonForCallBx;

	public WebElement getEleReasonForCallBx() {
		return eleReasonForCallBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleReasonForCallDrpDwn;

	public WebElement getEleReasonForCallDrpDwn() {
		return eleReasonForCallDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Address different']")
	private WebElement eleAddressDifferentinDrpDwn;

	public WebElement getEleAddressDifferentinDrpDwn() {
		return eleAddressDifferentinDrpDwn;
	}

	@FindBy(xpath = "//td[@title='Donor Oparator']/..//td[contains(@id,'3_s_5_l_SRDFF_PickSimpleValue')]")
	private WebElement eleDonorOparatorBx;

	public WebElement getEleDonorOparatorBx() {
		return eleDonorOparatorBx;
	}

	@FindBy(xpath = "//span[@id='s_5_2_32_0_icon']")
	private WebElement eleDonorOparatorDrpDwn;

	public WebElement getEleDonorOparatorDrpDwn() {
		return eleDonorOparatorDrpDwn;
	}

	@FindBy(xpath = "//li[text()='110 - Aircel (GSM)']")
	private WebElement ele110GsminDrpDwn;

	public WebElement getEle110GsminDrpDwn() {
		return ele110GsminDrpDwn;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff recharge and balance enquiry details
	 */
	@FindBy(xpath = "//td[text()='Deduction Amount']/../td[contains(@aria-labelledby,'s_5_l_SRDFF_NumValue s_5_l_altCalc')]")
	private WebElement eleDeductionAmtBx;

	public WebElement getEleDeductionAmtBx() {
		return eleDeductionAmtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-calc']")
	private WebElement eleDeductionAmtCallDrpDwn;

	public WebElement getEleDeductionAmtDrpDwn() {
		return eleDeductionAmtCallDrpDwn;
	}

	@FindBy(xpath = "//button[text()='7']")
	private WebElement eleDeductionAmtValueBtn7;

	public WebElement getEleDeductionAmtValueBtn7() {
		return eleDeductionAmtValueBtn7;
	}

	@FindBy(xpath = "//button[text()='0']")
	private WebElement eleDeductionAmtValueBtn0;

	public WebElement getEleDeductionAmtValueBtn0() {
		return eleDeductionAmtValueBtn0;
	}

	@FindBy(xpath = "//button[text()='Use']")
	private WebElement eleDeductionAmtValueBtnUse;

	public WebElement getEleDeductionAmtValueBtnUse() {
		return eleDeductionAmtValueBtnUse;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: objects in network related complaint DFF
	 */

	@FindBy(xpath = "//td[@title='Type of Complaint']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleTypeOfComplaintBx;

	public WebElement getEleTypeOfComplaintBx() {
		return eleTypeOfComplaintBx;
	}

	@FindBy(xpath = "//td[@title='Type of Complaint']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeOfComplaintValueBx;

	public WebElement getEleTypeOfComplaintValueBx() {
		return eleTypeOfComplaintValueBx;
	}

	@FindBy(xpath = "//td[@title='Area Name']")
	private WebElement eleAreaNameTextBx;

	public WebElement getEleAreaNameTextBx() {
		return eleAreaNameTextBx;
	}

	@FindBy(xpath = "//td[@title='Area Name']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickValue s_5_l_altpick')]")
	private WebElement eleAreaNameBx;

	public WebElement getEleAreaNameBx() {
		return eleAreaNameBx;
	}

	@FindBy(xpath = "//td[@title='Area Name']/..//input[contains(@name,'SRDFF_PickValue')]")
	private WebElement eleAreaNameValueBx;

	public WebElement getEleAreaNameValueBx() {
		return eleAreaNameValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-pick']")
	private WebElement eleAreaNameValueDrpDwn;

	public WebElement getEleAreaNameValueDrpDwn() {
		return eleAreaNameValueDrpDwn;
	}

	@FindBy(xpath = "(//div[text()='Site Name']/../../../../../../..//td[contains(@aria-labelledby,'Value')])[3]")
	private WebElement eleAreaName;

	public WebElement getEleAreaName() {
		return eleAreaName;
	}

	@FindBy(xpath = "//button[@title='Select:OK']")
	private WebElement eleAreaNameOkBtn;

	public WebElement getEleAreaNameOkBtn() {
		return eleAreaNameOkBtn;
	}

	@FindBy(xpath = "//td[@title='Last Occurred Dt']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_DateValue s_5_l_altDateTime')]")
	private WebElement eleLastDateOccuredBx;

	public WebElement getEleLastDateOccuredBx() {
		return eleLastDateOccuredBx;
	}

	@FindBy(xpath = "//td[@title='Last Occurred Dt']/..//input[contains(@name,'SRDFF_DateValue')]")
	private WebElement eleLastDateOccuredValueBx;

	public WebElement getEleLastDateOccuredValueBx() {
		return eleLastDateOccuredValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-datetime']")
	private WebElement eleLastDateOccuredValueDrpDwn;

	public WebElement getEleLastDateOccuredValueDrpDwn() {
		return eleLastDateOccuredValueDrpDwn;
	}

	@FindBy(xpath = "//a[text()='2']")
	private WebElement eleLastDateOccuredValue2;

	public WebElement getEleLastDateOccuredValue2() {
		return eleLastDateOccuredValue2;
	}

	@FindBy(xpath = "//button[text()='Done']")
	private WebElement eleLastDateOccuredDonebtn;

	public WebElement getEleLastDateOccuredDonebtn() {
		return eleLastDateOccuredDonebtn;
	}

	@FindBy(xpath = "//td[@title='Last Occurred time']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleLastOccuredTimeBx;

	public WebElement getEleLastOccuredTimeBx() {
		return eleLastOccuredTimeBx;
	}

	@FindBy(xpath = "//td[@title='Last Occurred time']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleLastOccuredTimeValueBx;

	public WebElement getEleLastOccuredTimeValueBx() {
		return eleLastOccuredTimeValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleLastOccuredTimeDrpDwn;

	public WebElement getEleLastOccuredTimeDrpDwn() {
		return eleLastOccuredTimeDrpDwn;

	}

	@FindBy(xpath = "//li[text()='12 am - 4 am']")
	private WebElement eleLastOccuredTimeValue;

	public WebElement getEleLastOccuredTimeValue() {
		return eleLastOccuredTimeValue;

	}

	@FindBy(xpath = "//td[@title='Unable to use']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleUnableToUseBx;

	public WebElement getEleUnableToUseBx() {
		return eleUnableToUseBx;
	}

	@FindBy(xpath = "//td[@title='Unable to use']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleUnableToUseValueBx;

	public WebElement getEleUnableToUseValueBx() {
		return eleUnableToUseValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleUnableToUseValueDrpDwn;

	public WebElement getEleUnableToUseValueDrpDwn() {
		return eleUnableToUseValueDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Particular Place']")
	private WebElement eleUnableToUseValue;

	public WebElement getEleUnableToUseValue() {
		return eleUnableToUseValue;
	}

	@FindBy(xpath = "//td[@title='Number of Signal bars']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleNumberOfSignalBarsBx;

	public WebElement getEleNumberOfSignalBarsBx() {
		return eleNumberOfSignalBarsBx;
	}

	@FindBy(xpath = "//td[@title='Number of Signal bars']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleNumberOfSignalBarsValueBx;

	public WebElement getEleNumberOfSignalBarsValueBx() {
		return eleNumberOfSignalBarsValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleNumberOfSignalBarsDrpDwn;

	public WebElement getEleNumberOfSignalBarsDrpDwn() {
		return eleNumberOfSignalBarsDrpDwn;
	}

	@FindBy(xpath = "//li[text()='One']")
	private WebElement eleNumberOfSignalBarsValue;

	public WebElement getEleNumberOfSignalBarsValue() {
		return eleNumberOfSignalBarsValue;
	}

	@FindBy(xpath = "//td[@title='Network Symbol']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleNetworkSymbolBx;

	public WebElement getEleNetworkSymbolBx() {
		return eleNetworkSymbolBx;
	}

	@FindBy(xpath = "//td[@title='Network Symbol']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleNetworkSymbolValueBx;

	public WebElement getEleNetworkSymbolValueBx() {
		return eleNetworkSymbolValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleNetworkSymbolDrpDwn;

	public WebElement getEleNetworkSymbolDrpDwn() {
		return eleNetworkSymbolDrpDwn;
	}

	@FindBy(xpath = "//li[text()='3G']")
	private WebElement eleNetworkSymbolValue;

	public WebElement getEleNetworkSymbolValue() {
		return eleNetworkSymbolValue;
	}

	@FindBy(xpath = "//td[@title='Service in HLR']/..//td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleServiceInHLRBx;

	public WebElement getEleServiceInHLRBx() {
		return eleServiceInHLRBx;
	}

	@FindBy(xpath = "//td[@title='Service in HLR']/..//input[contains(@name,'SRDFF_PickSimpleValue')]")
	private WebElement eleServiceInHLRValueBx;

	public WebElement getEleServiceInHLRValueBx() {
		return eleServiceInHLRValueBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleServiceInHLRDrpDwn;

	public WebElement getEleServiceInHLRDrpDwn() {
		return eleServiceInHLRDrpDwn;
	}

	@FindBy(xpath = "//li[text()='3G']")
	private WebElement eleServiceInHLRValue;

	public WebElement getEleServiceInHLRValue() {
		return eleServiceInHLRValue;
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Provisioning PCIssueN or Alert complaint object
	 * 
	 */

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeofComplaintTxt;

	public WebElement getEleTypeofComplaintTxt() {
		return eleTypeofComplaintTxt;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeofComplaintTxtbx;

	public WebElement getEleTypeofComplaintTxtBx() {
		return eleTypeofComplaintTxtbx;
	}

	@FindBy(xpath = "//td[text()='Resolution Given']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleResolutionGivenTxt;

	public WebElement getEleResolutionGivenTxt() {
		return eleResolutionGivenTxt;
	}

	@FindBy(xpath = "//td[text()='Resolution Given']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleResolutionGivenTxtBx;

	public WebElement getEleResolutionGivenTxtBx() {
		return eleResolutionGivenTxtBx;
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Service issue Complaints Legal dff object for postpaid
	 * 
	 */

	@FindBy(xpath = "//td[text()='Type of Case filed']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeCasefiledTxt;

	public WebElement getEleTypeCasefiledTxt() {
		return eleTypeCasefiledTxt;
	}

	@FindBy(xpath = "//td[text()='Type of Case filed']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleTypeCasefileTxtbx;

	public WebElement getEleTypeCasefiledTxtBx() {
		return eleTypeCasefileTxtbx;
	}

	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleDisputeTxt;

	public WebElement getEleDisputeTxt() {
		return eleDisputeTxt;
	}

	@FindBy(xpath = "//td[text()='Reason for Dispute']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleDisputeTxtBx;

	public WebElement getEleDisputeTxtBx() {
		return eleDisputeTxtBx;
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Service issue customer feedback dff object for postpaid
	 * 
	 */

	@FindBy(xpath = "//td[text()='Feedback related to']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleFeedbackRelatedTxt;

	public WebElement getEleFeedbackRelatedTxt() {
		return eleFeedbackRelatedTxt;
	}

	@FindBy(xpath = "//td[text()='Feedback related to']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleFeedbackRelatedTxtbx;

	public WebElement getEleFeedbackRelatedTxtBx() {
		return eleFeedbackRelatedTxtbx;
	}

	@FindBy(xpath = "//td[text()='Feedback']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleFeedbackTxt;

	public WebElement getEleFeedbackTxt() {
		return eleFeedbackTxt;
	}

	@FindBy(xpath = "//td[text()='Feedback']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleFeedbackTxtBx;

	public WebElement getEleFeedbackTxtBx() {
		return eleFeedbackTxtBx;
	}

	/***********************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff device Related Complaints objects
	 *              postpaid
	 * 
	 */

	@FindBy(xpath = "//td[text()='Type of Device']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleDeviceTypeTxt;

	public WebElement getEleDeviceTypeTxt() {
		return eleDeviceTypeTxt;
	}

	@FindBy(xpath = "//td[text()='Type of Device']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleDeviceTypeTxtbx;

	public WebElement getEleDeviceTypeTxtBx() {
		return eleDeviceTypeTxtbx;
	}

	@FindBy(xpath = "//td[text()='Device serial number']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleSerialNoTxt;

	public WebElement getEleSerialNoTxt() {
		return eleSerialNoTxt;
	}

	@FindBy(xpath = "//td[text()='Device serial number']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleSerialNoTxtBx;

	public WebElement getEleSerialNoTxtBx() {
		return eleSerialNoTxtBx;
	}

	// USE MOVE
	@FindBy(xpath = "//td[text()='Device under warranty']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleWarrantyTxt;

	public WebElement getEleWarrantyTxt() {
		return eleWarrantyTxt;
	}

	@FindBy(xpath = "//td[text()='Device under warranty']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleWarrantyTxtbx;

	public WebElement getEleWarrantyTxtBx() {
		return eleWarrantyTxtbx;
	}

	@FindBy(xpath = "//td[text()='IMEI number']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleImeiNoTxt;

	public WebElement getEleImeiNoTxt() {
		return eleImeiNoTxt;
	}

	@FindBy(xpath = "//td[text()='IMEI number']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleImeiNoTxtBx;

	public WebElement getEleImeiNoTxtBx() {
		return eleImeiNoTxtBx;
	}

	@FindBy(xpath = "//td[text()='Diagnosis by Frontline']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleDiagnosisTxt;

	public WebElement getEleDiagnosisTxt() {
		return eleDiagnosisTxt;
	}

	@FindBy(xpath = "//td[text()='Diagnosis by Frontline']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleDiagnosisTxtBx;

	public WebElement getEleDiagnosisTxtBx() {
		return eleDiagnosisTxtBx;
	}

	/***************************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff Sim Reactivation Complaints objects
	 *              postpaid
	 * 
	 */

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleComplaintTxt;

	public WebElement getEleComplaintTypeTxt() {
		return eleComplaintTxt;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleComplaintTypeTxtbx;

	public WebElement getEleComplaintTypeTxtBx() {
		return eleComplaintTypeTxtbx;
	}

	@FindBy(xpath = "//td[text()='Request Date']/..//td[contains(@id,'SRDFF_DateValue')]")
	private WebElement eleDateTxt;

	public WebElement getEleDateTxt() {
		return eleDateTxt;
	}

	@FindBy(xpath = "//td[text()='Request Date']/..//input[contains(@id,'SRDFF_DateValue')]")
	private WebElement eleDateTxtBx;

	public WebElement getEleDateTxtBx() {
		return eleDateTxtBx;
	}

	@FindBy(xpath = "//td[text()='Alternate Number']/..//td[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleAlternateNoTxt;

	public WebElement getEleAlternateNoTxt() {
		return eleAlternateNoTxt;
	}

	@FindBy(xpath = "//td[text()='Alternate Number']/..//input[contains(@id,'SRDFF_TextValue')]")
	private WebElement eleAlternateNoTxtbx;

	public WebElement getEleAlternateNoTxtBx() {
		return eleAlternateNoTxtbx;
	}

	@FindBy(xpath = "//td[text()='Reason for Reactivation']/..//td[contains(@aria-labelledby,'SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReactivationTxt;

	public WebElement getEleReactivationTxt() {
		return eleReactivationTxt;
	}

	@FindBy(xpath = "//td[text()='Reason for Reactivation']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleReactivationTxtBx;

	public WebElement getEleReactivationTxtBx() {
		return eleReactivationTxtBx;
	}

	/***************************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff balance Recharge Complaints objects
	 *              postpaid
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "//td[text()='Denomination (Amount)']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleDenominationTxt;

	public WebElement getEleDenominationTxt() {
		return eleDenominationTxt;
	}

	@FindBy(xpath = "//td[text()='Denomination (Amount)']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleDenominationTxtBx;

	public WebElement getEleDenominationTxtBx() {
		return eleDenominationTxtBx;
	}

	@FindBy(xpath = "//td[text()='Mode of Recharge']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleModeTxt;

	public WebElement getEleModeTxt() {
		return eleModeTxt;
	}

	@FindBy(xpath = "//td[text()='Mode of Recharge']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleModeTxtbx;

	public WebElement getEleModeTxtBx() {
		return eleModeTxtbx;
	}

	@FindBy(xpath = "//td[text()='Known Issue']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleKnownTxt;

	public WebElement getEleKnownTxt() {
		return eleKnownTxt;
	}

	@FindBy(xpath = "//td[text()='Known Issue']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleKnownTxtBx;

	public WebElement getEleKnownTxtBx() {
		return eleKnownTxtBx;
	}

	@FindBy(xpath = "//td[text()='Refund Amt']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleRefundTxt;

	public WebElement getEleRefundTxt() {
		return eleRefundTxt;
	}

	@FindBy(xpath = "//td[text()='Refund Amt']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleRefundTxtBx;

	public WebElement getEleRefundTxtBx() {
		return eleRefundTxtBx;
	}

	/***********************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff Billing Payment Complaints Postpaid
	 *              objects
	 * 
	 */

	@FindBy(xpath = "//td[text()='Invoice']/..//td[contains(@id,'SRDFF_PickValue')]")
	private WebElement eleInvoiceTxt;

	public WebElement getEleInvoiceTxt() {
		return eleInvoiceTxt;
	}

	@FindBy(xpath = "//td[text()='Invoice']/..//input[contains(@id,'SRDFF_PickValue')]")
	private WebElement eleInvoiceTxtbx;

	public WebElement getEleInvoiceTxtBx() {
		return eleInvoiceTxtbx;
	}

	@FindBy(xpath = "//td[text()='Total Waiver Amount']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleWaiverAmountTxt;

	public WebElement getEleWaiverAmountTxt() {
		return eleWaiverAmountTxt;
	}

	@FindBy(xpath = "//td[text()='Total Waiver Amount']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleWaiverAmountTxtBx;

	public WebElement getEleWaiverAmountTxtBx() {
		return eleWaiverAmountTxtBx;
	}

	@FindBy(xpath = "//td[text()='Credit Reason']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleCreditReasonTxt;

	public WebElement getEleCreditReasonTxt() {
		return eleCreditReasonTxt;
	}

	@FindBy(xpath = "//td[text()='Credit Reason']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleCreditReasonTxtbx;

	public WebElement getEleCreditReasonTxtBx() {
		return eleCreditReasonTxtbx;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff Balance and Recharge objects for postpaid
	 */

	@FindBy(xpath = "//td[text()='Type of Service']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTypeOfServiceTxtBx;

	public WebElement getEleTypeOfServiceTxtBx() {
		return eleTypeOfServiceTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type of Service']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfServiceInputTxtBx;

	public WebElement getEleTypeOfInputServiceTxtBx() {
		return eleTypeOfServiceInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfServiceDrpDown;

	public WebElement getEleTypeOfServiceDrpDown() {
		return eleTypeOfServiceDrpDown;
	}

	@FindBy(xpath = "//li[contains(text(),'4G')]")
	private WebElement eleTypeOfServiceDrpDownValue;

	public WebElement getEleTypeOfServiceDrpDownValue() {
		return eleTypeOfServiceDrpDownValue;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/../td[contains(@id,'SimpleValue')]")
	private WebElement eleTypeOfComplaintTxtBx;

	public WebElement getEleTypeOfComplaintTxtBx() {
		return eleTypeOfComplaintTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfComplaintInputTxtBx;

	public WebElement getEleTypeOfComplaintInputTxtBx() {
		return eleTypeOfComplaintInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfComplaintDrpDown;

	public WebElement getEleTypeOfComplaintDrpDown() {
		return eleTypeOfComplaintDrpDown;
	}

	@FindBy(xpath = "//li[contains(@data-lovtype,'SimpleValue') and text()='Balance']")
	private WebElement eleTypeOfComplaintDrpDownValue;

	public WebElement getEleTypeOfComplaintDrpDownValue() {
		return eleTypeOfComplaintDrpDownValue;
	}

	@FindBy(xpath = "//td[text()='Balance Before']/../td[contains(@id,'NumValue')]")
	private WebElement eleBalanceBeforeTxtBx;

	public WebElement getEleBalanceBeforeTxtBx() {
		return eleBalanceBeforeTxtBx;
	}

	@FindBy(xpath = "//td[text()='Balance Before']/..//input[contains(@aria-labelledby,'NumValue')]")
	private WebElement eleBalanceBeforeInputTxtBx;

	public WebElement getEleBalanceBeforeInputTxtBx() {
		return eleBalanceBeforeInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-calc']")
	private WebElement eleBalanceBeforeDrpDown;

	public WebElement getEleBalanceBeforeDrpDown() {
		return eleBalanceBeforeDrpDown;
	}

	@FindBy(xpath = "//button[text()='6']")
	private WebElement eleCaluculatorValuesix;

	public WebElement getEleCaluculatorValueSix() {
		return eleCaluculatorValuesix;
	}

	@FindBy(xpath = "//button[text()='7']")
	private WebElement eleCaluculatorValueseven;

	public WebElement getEleCaluculatorValueSeven() {
		return eleCaluculatorValueseven;
	}

	@FindBy(xpath = "//button[text()='Use']")
	private WebElement eleCaluculatorValueUse;

	public WebElement getEleCaluculatorValueUse() {
		return eleCaluculatorValueUse;
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: CreditAndCollectionVerificationIssueComplaint Dff objects
	 */

	@FindBy(xpath = "//td[text()='Reason of complaint']/../td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleReasonOfComplaintTxtBx;

	public WebElement getEleReasonOfComplaintTxtBx() {
		return eleReasonOfComplaintTxtBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='1_s_5_l_Seq s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo']")
	private WebElement eleReasonOfComplaintInputTxtBx;

	public WebElement getReasonOfComplaintInputTxtBx() {
		return eleReasonOfComplaintInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleReasonOfComplaintTxtBxDrpDwn;

	public WebElement getEleReasonOfComplaintDrpDown() {
		return eleReasonOfComplaintTxtBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Incomplete Verification']")
	private WebElement eleReasonOfComplaintTxtBxDrpDwnValue;

	public WebElement getEleReasonOfComplaintDrpDownValue() {
		return eleReasonOfComplaintTxtBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Alternate contact number']/../td[contains(@id,'TextValue')]")
	private WebElement eleAlternateContactNumberTxtBx;

	public WebElement getEleAlternateContactNumberTxtBx() {
		return eleAlternateContactNumberTxtBx;
	}

	@FindBy(xpath = "//input[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleAlternateContactNumberTxtBxValue;

	public WebElement getEleAlternateContactNumberTxtBxValue() {
		return eleAlternateContactNumberTxtBxValue;
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: CreditAndCollectionCLChangeCompaint Dff objects
	 */

	@FindBy(xpath = "//td[text()='Type of complaint']/../td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleTypeofComplaintTxtBx;

	public WebElement getTypeofComplaintTxtBx() {
		return eleTypeofComplaintTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type of complaint']/..//input[contains(@aria-labelledby,'PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleTypeofComplaintInputTxtBx;

	public WebElement getTypeofComplaintInpTxtBx() {
		return eleTypeofComplaintInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeofComplaintTxtBxDrpDwn;

	public WebElement getTypeofComplaintTxtBxDrpDwn() {
		return eleTypeofComplaintTxtBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Dispute on Credit Limit Increase']")
	private WebElement eleTypeofComplaintTxtBxDrpDwnValue;

	public WebElement getTypeofComplaintTxtBxDrpDwnValue() {
		return eleTypeofComplaintTxtBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Credit limit request for']/../td[contains(@aria-labelledby,'altCalc')]")
	private WebElement eleCreditLimitTxtBx;

	public WebElement getCreditLimitTxtBx() {
		return eleCreditLimitTxtBx;
	}

	@FindBy(xpath = "//td[text()='Credit limit request for']/..//input[contains(@aria-labelledby,'NumValue s_5_l_altCalc')]")
	private WebElement eleCreditLimitInputTxtBx;

	public WebElement getCreditLimitInputTxtBx() {
		return eleCreditLimitInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-calc']")
	private WebElement eleCreditLimitTxtBxCalicon;

	public WebElement getCreditLimitTxtBxCalicon() {
		return eleCreditLimitTxtBxCalicon;
	}

	@FindBy(xpath = "//button[text()='2']")
	private WebElement eleCreditLimitTxtBxCalvalue2;

	public WebElement getCreditLimitTxtBxCalvalue2() {
		return eleCreditLimitTxtBxCalvalue2;
	}

	@FindBy(xpath = "//button[text()='7']")
	private WebElement eleCreditLimitTxtBxCalvalue7;

	public WebElement getCreditLimitTxtBxCalvalue7() {
		return eleCreditLimitTxtBxCalvalue7;
	}

	@FindBy(xpath = "//button[text()='Use']")
	private WebElement eleCreditLimitTxtBxCalvalueUse;

	public WebElement getCreditLimitTxtBxCalvalueUse() {
		return eleCreditLimitTxtBxCalvalueUse;
	}

	@FindBy(xpath = "//td[text()='Mode of request']/../td[contains(@aria-labelledby,'s_5_l_SRDFF_PickSimpleValue s_5_l_altCombo')]")
	private WebElement eleModeOfRequestTxtBx;

	public WebElement geteleModeOfRequestTxtBx() {
		return eleModeOfRequestTxtBx;
	}

	@FindBy(xpath = "//td[text()='Mode of request']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleModeOfRequestInputTxtBx;

	public WebElement geteleModeOfRequestInputTxtBx() {
		return eleModeOfRequestInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleModeOfRequestTxtBxDrpDwn;

	public WebElement getModeOfRequestTxtBxDrpDwn() {
		return eleModeOfRequestTxtBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Email']")
	private WebElement eleModeOfRequestTxtBxDrpDwnValue;

	public WebElement getModeOfRequestTxtBxDrpDwnValue() {
		return eleModeOfRequestTxtBxDrpDwnValue;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: SeperationMergerIssueComplaint Dff objects
	 */

	@FindBy(xpath = "//td[text()='Type of Complaint']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleMergerTypeofComplaintTxtBx;

	public WebElement geteleMergerTypeofComplaintTxtBx() {
		return eleMergerTypeofComplaintTxtBx;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleMergerTypeofComplaintInputTxtBx;

	public WebElement geteleMergerTypeofComplaintInputTxtBx() {
		return eleMergerTypeofComplaintInputTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeofComplaintDrpDwn;

	public WebElement getTypeofComplaintDrpDwn() {
		return eleTypeofComplaintDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Account Merger']")
	private WebElement eleTypeofComplaintTxtBxValue;

	public WebElement getTypeofComplaintTxtBxValue() {
		return eleTypeofComplaintTxtBxValue;
	}

	@FindBy(xpath = "//td[text()='Request SR number']/../td[contains(@id,'TextValue')]")
	private WebElement eleRequestSRNumTxtBx;

	public WebElement geteleRequestSRNumTxtBx() {
		return eleRequestSRNumTxtBx;
	}

	@FindBy(xpath = "//input[contains(@aria-labelledby,'TextValue')]")
	private WebElement eleRequestSRNumTxtBxValue;

	public WebElement geteleRequestSRNumTxtBxValue() {
		return eleRequestSRNumTxtBxValue;
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff objects NumberOrAccountActivationComplaints
	 */

	@FindBy(xpath = "//td[text()='Type of failure']/../td[@id='1_s_5_l_SRDFF_PickSimpleValue']")
	private WebElement eleTypeOfFailureBx;

	public WebElement getEleTypeOfFailureBx() {
		return eleTypeOfFailureBx;
	}

	@FindBy(xpath = "//td[text()='Type of failure']/..//input[contains(@aria-labelledby,'Combo')]")
	private WebElement eleTypeOfFailureTxtBx;

	public WebElement getEleTypeOfFailureTxtBx() {
		return eleTypeOfFailureTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfFailureDrpDwn;

	public WebElement getEleTypeOfFailureDrpDwn() {
		return eleTypeOfFailureDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Name Different']")
	private WebElement eleTypeOfFailureTxtBxValue;

	public WebElement getEleTypeOfFailureTxtBxValue() {
		return eleTypeOfFailureTxtBxValue;
	}

	@FindBy(xpath = "//td[text()='Alternate Number']/../td[contains(@id,'TextValue')]")
	private WebElement eleAltContNumberBx;

	public WebElement getEleAltContNumberBx() {
		return eleAltContNumberBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='2_s_5_l_Seq s_5_l_SRDFF_TextValue']")
	private WebElement eleAltContNumberTxtBx;

	public WebElement getEleAltContNumberTxtBx() {
		return eleAltContNumberTxtBx;
	}

	// Dff objects NetworkVoiceCoverageComplaints

	@FindBy(xpath = "//td[text()='Last Occurred Dt']/../td[contains(@id,'DateValue')]")
	private WebElement eleLastOccuredDateBx;

	public WebElement getLastOccuredDateBx() {
		return eleLastOccuredDateBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-datetime']")
	private WebElement eleLastOccuredDateIcon;

	public WebElement getLastOccuredDateIcon() {
		return eleLastOccuredDateIcon;
	}

	@FindBy(xpath = "//a[text()='5']")
	private WebElement eleLastOccuredDateValue;

	public WebElement getLastOccuredDateValue() {
		return eleLastOccuredDateValue;
	}

	@FindBy(xpath = "//button[text()='Done']")
	private WebElement eleLastOccuredDateDone;

	public WebElement getLastOccuredDateDone() {
		return eleLastOccuredDateDone;
	}

	@FindBy(xpath = "//td[text()='Last Occurred time']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleLastOccuredTimeBox;

	public WebElement getLastOccuredTimeBx() {
		return eleLastOccuredTimeBox;
	}

	@FindBy(xpath = "//td[text()='Last Occurred time']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleLastOccuredTimeInputBox;

	public WebElement getLastOccuredTimeInputBx() {
		return eleLastOccuredTimeInputBox;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleLastOccuredTimeBxDrpDwn;

	public WebElement getLastOccuredTimeBxDrpDwn() {
		return eleLastOccuredTimeBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='4 am - 8 am']")
	private WebElement eleLastOcrdTimeValue;

	public WebElement getLastOccuredTimeValue() {
		return eleLastOcrdTimeValue;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTypeOfComplaintBox;

	public WebElement getTypeOfComplaintBx() {
		return eleTypeOfComplaintBox;
	}

	@FindBy(xpath = "//td[text()='Type of Complaint']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfComplaintInputBox;

	public WebElement getTypeOfComplaintInputBox() {
		return eleTypeOfComplaintInputBox;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfComplaintBoxDrpDwn;

	public WebElement getTypeOfComplaintBxDrpDwn() {
		return eleTypeOfComplaintBoxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='No access to network']")
	private WebElement eleTypeOfComplaintValue;

	public WebElement getTypeofComplaintValue() {
		return eleTypeOfComplaintValue;
	}

	@FindBy(xpath = "//td[text()='Area Name']/../td[contains(@id,'PickValue')]")
	private WebElement eleAreaNameBox;

	public WebElement getAreaNameBx() {
		return eleAreaNameBox;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-pick']")
	private WebElement eleAreaNameBxDrpDwn;

	public WebElement getAreaNameBxDrpDwn() {
		return eleAreaNameBxDrpDwn;
	}

	@FindBy(xpath = "(//div[text()='Site Name']/../../../../../../..//td[contains(@aria-labelledby,'Value')])[3]")
	private WebElement eleAreaNameValue;

	public WebElement getAreaNameValue() {
		return eleAreaNameValue;
	}

	@FindBy(xpath = "//button[@title='Select:OK']")
	private WebElement eleAreaNameOK;

	public WebElement getAreNameOK() {
		return eleAreaNameOK;
	}

	@FindBy(xpath = "//td[text()='Service in HLR']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleSrvInHLRBx;

	public WebElement getServiceInHLRBx() {
		return eleSrvInHLRBx;
	}

	@FindBy(xpath = "//td[text()='Service in HLR']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleSrvInHLRInputBx;

	public WebElement getServiceInHLRInputBx() {
		return eleSrvInHLRInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleServiceInHLRBxDrpDwn;

	public WebElement getServiceInHLRBxDrpDwn() {
		return eleServiceInHLRBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='4G']']")
	private WebElement eleServiceInHLRBxValue;

	public WebElement getServiceInHLRBxValue() {
		return eleServiceInHLRBxValue;
	}

	@FindBy(xpath = "//td[text()='Network Symbol in Handset']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleNetworkSysmbolBx;

	public WebElement getNetworkSysmbolBx() {
		return eleNetworkSysmbolBx;
	}

	@FindBy(xpath = "//td[text()='Network Symbol in Handset']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleNetworkSysmbolInputBx;

	public WebElement getNetworkSysmbolInputBx() {
		return eleNetworkSysmbolInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleNetworkSysmbolBxDrpDwn;

	public WebElement getNetworkSysmbolBxDrpDwn() {
		return eleNetworkSysmbolBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='E']")
	private WebElement eleNetworkSysmbolBxValue;

	public WebElement getNetworkSysmbolBxValue() {
		return eleNetworkSysmbolBxValue;
	}

	@FindBy(xpath = "//td[text()='Complete Address']/../td[contains(@id,'TextValue')]")
	private WebElement eleCompleteAddressBx;

	public WebElement getCompleteAddressBx() {
		return eleCompleteAddressBx;
	}

	@FindBy(xpath = "//input[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement eleCompleteAddressTxBx;

	public WebElement getCompleteAddressTxBx() {
		return eleCompleteAddressTxBx;
	}

	@FindBy(xpath = "//td[text()='Alternate Contact Number']/../td[contains(@id,'TextValue')]")
	private WebElement eleAltNumBx;

	public WebElement getAltNumBx() {
		return eleAltNumBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='5_s_5_l_Seq s_5_l_SRDFF_TextValue']")
	private WebElement eleAltNumTxBx;

	public WebElement getAltNumTxBx() {
		return eleAltNumTxBx;
	}

	@FindBy(xpath = "//td[text()='Number of Signal bars']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleNumberOfSignalBarsBox;

	public WebElement getNumberOfSignalBarsBx() {
		return eleNumberOfSignalBarsBox;
	}

	@FindBy(xpath = "//td[text()='Number of Signal bars']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleNumberOfSignalBarsInputBox;

	public WebElement getNumberOfSignalBarsInputBx() {
		return eleNumberOfSignalBarsInputBox;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleNumberOfSignalBarsBxDrpDwn;

	public WebElement getNumberOfSignalBarsBxDrpDwn() {
		return eleNumberOfSignalBarsBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Less than 3 bars']")
	private WebElement eleNumberOfSignalBarsBxDrpDwnValue;

	public WebElement getNumberOfSignalBarsBxDrpDwnValue() {
		return eleNumberOfSignalBarsBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Indoor or Outdoor or Both']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleIndoorOrOutdoorBx;

	public WebElement getIndoorOrOutdoorBx() {
		return eleIndoorOrOutdoorBx;
	}

	@FindBy(xpath = "//td[text()='Indoor or Outdoor or Both']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleIndoorOrOutdoorInputBx;

	public WebElement getIndoorOrOutdoorInputBx() {
		return eleIndoorOrOutdoorInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleIndoorOrOutdoorBxDrpDwn;

	public WebElement getIndoorOrOutdoorBxDrpDwn() {
		return eleIndoorOrOutdoorBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Both']")
	private WebElement eleIndoorOrOutdoorBxDrpDwnValue;

	public WebElement getIndoorOrOutdoorBxDrpDwnValue() {
		return eleIndoorOrOutdoorBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Type of Problem']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTypeOfProbBx;

	public WebElement getTypeOfProbBx() {
		return eleTypeOfProbBx;
	}

	@FindBy(xpath = "//td[text()='Type of Problem']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfProbInputBx;

	public WebElement getTypeOfProbInputBx() {
		return eleTypeOfProbInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfProbBxDrpDwn;

	public WebElement getTypeOfProbBxDrpDwn() {
		return eleTypeOfProbBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Voice cracking']")
	private WebElement eleTypeOfProbBxDrpDwnValue;

	public WebElement getTypeOfProbBxDrpDwnValue() {
		return eleTypeOfProbBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Problem Floor']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleProbFloorBx;

	public WebElement getProbFloorBx() {
		return eleProbFloorBx;
	}

	@FindBy(xpath = "//td[text()='Problem Floor']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleProbFloorInputBx;

	public WebElement getProbFloorInputBx() {
		return eleProbFloorInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleProbFloorBxDrpDwn;

	public WebElement getProbFloorBxDrpDwn() {
		return eleProbFloorBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='4-7']")
	private WebElement eleProbFloorBxDrpDwnValue;

	public WebElement getProbFloorBxDrpDwnValue() {
		return eleProbFloorBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Total floors of building']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTotalFloorsBx;

	public WebElement getTotalFloorsBx() {
		return eleTotalFloorsBx;
	}

	@FindBy(xpath = "//td[text()='Total floors of building']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTotalFloorsInputBx;

	public WebElement getTotalFloorsInputBx() {
		return eleTotalFloorsInputBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTotalFloorsBxDrpDwn;

	public WebElement getTotalFloorsBxDrpDwn() {
		return eleTotalFloorsBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='8-15']")
	private WebElement eleTotalFloorsBxDrpDwnValue;

	public WebElement getTotalFloorsBxDrpDwnValue() {
		return eleTotalFloorsBxDrpDwnValue;
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: NumberOrAccountActivationPostpaid objects
	 */

	@FindBy(xpath = "//td[text()='Dispute on']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleDisputOnBx;

	public WebElement getDisputOnBx() {
		return eleDisputOnBx;
	}

	@FindBy(xpath = "//td[text()='Dispute on']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleDisputOnTxtBx;

	public WebElement getDisputOnTxtBx() {
		return eleDisputOnTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleDisputOnBxDrpDwn;

	public WebElement getDisputOnBxDrpDwn() {
		return eleDisputOnBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Documentation']")
	private WebElement eleDisputOnBxDrpDwnValue;

	public WebElement getDisputOnBxDrpDwnValue() {
		return eleDisputOnBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Type of complaint']/../td[contains(@id,'PickSimpleValue')]")
	private WebElement eleTypeOfCmptBx;

	public WebElement getTypeOfCmptBx() {
		return eleTypeOfCmptBx;
	}

	@FindBy(xpath = "//td[text()='Type of complaint']/..//input[contains(@aria-labelledby,'altCombo')]")
	private WebElement eleTypeOfCmptTxtBx;

	public WebElement getTypeOfCmptTxtBx() {
		return eleTypeOfCmptTxtBx;
	}

	@FindBy(xpath = "//span[@class='siebui-icon-dropdown']")
	private WebElement eleTypeOfCmptBxDrpDwn;

	public WebElement getTypeOfCmptBxDrpDwn() {
		return eleTypeOfCmptBxDrpDwn;
	}

	@FindBy(xpath = "//li[text()='Never Applied']")
	private WebElement eleTypeOfCmptBxDrpDwnValue;

	public WebElement getTypeOfCmptBxDrpDwnValue() {
		return eleTypeOfCmptBxDrpDwnValue;
	}

	@FindBy(xpath = "//td[text()='Call Back Number']/../td[contains(@aria-labelledby,'SRDFF_TextValue')]")
	private WebElement elecallBackNoBx;

	public WebElement getcallBackNoBx() {
		return elecallBackNoBx;
	}

	@FindBy(xpath = "//input[@aria-labelledby='5_s_5_l_Seq s_5_l_SRDFF_TextValue']")
	private WebElement elecallBackNoTxtBx;

	public WebElement getcallBackNoTxtBx() {
		return elecallBackNoTxtBx;
	}

	/***********************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff Billing Payment Update Complaints
	 *              Postpaid objects
	 * 
	 */

	@FindBy(xpath = "//td[text()='Mode of Payment']/..//td[contains(@id,'PickSimpleValue')]")
	private WebElement eleModeOfPaymentTxt;

	public WebElement getEleModeOfPaymentTxt() {
		return eleModeOfPaymentTxt;
	}

	@FindBy(xpath = "//td[text()='Mode of Payment']/..//input[contains(@id,'PickSimpleValue')]")
	private WebElement eleModeOfPaymentTxtbx;

	public WebElement getEleModeOfPaymentTxtBx() {
		return eleModeOfPaymentTxtbx;
	}

	@FindBy(xpath = "//td[text()='Payment Amount']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement elePaymentTxt;

	public WebElement getElePaymentTxt() {
		return elePaymentTxt;
	}

	@FindBy(xpath = "//td[text()='Payment Amount']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement elePaymentTxtBx;

	public WebElement getElePaymentTxtBx() {
		return elePaymentTxtBx;
	}

	@FindBy(xpath = "//td[text()='Payment Date']/..//td[contains(@id,'SRDFF_DateValue')]")
	private WebElement elePaymentDateTxt;

	public WebElement getElePaymentDateTxt() {
		return elePaymentDateTxt;
	}

	@FindBy(xpath = "//td[text()='Payment Date']/..//input[contains(@id,'SRDFF_DateValue')]")
	private WebElement elePaymentDateTxtbx;

	public WebElement getElePaymentDateTxtBx() {
		return elePaymentDateTxtbx;
	}

	@FindBy(xpath = "//td[text()='Payment Circle']/..//td[contains(@id,'SRDFF_PickValue')]")
	private WebElement elePaymentCircleTxt;

	public WebElement getElePaymentCircleTxt() {
		return elePaymentCircleTxt;
	}

	@FindBy(xpath = "//td[text()='Payment Circle']/..//input[contains(@id,'SRDFF_PickValue')]")
	private WebElement elePaymentCircleTxtbx;

	public WebElement getElePaymentCircleTxtBx() {
		return elePaymentCircleTxtbx;
	}
	
	
	/***********************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff billing payment Waivers Adjustments Discounts  Postpaid objects
	 * 
	 */
	@FindBy(xpath = "//td[text()='Previous SR']/..//td[contains(@id,'SRDFF_PickValue')]")
	private WebElement elePreviousSRTxt;

	public WebElement getElePreviousSRTxt() {
		return elePreviousSRTxt;
	}

	@FindBy(xpath = "//td[text()='Previous SR']/..//input[contains(@id,'SRDFF_PickValue')]")
	private WebElement elePreviousSRTxtBx;

	public WebElement getElePreviousSRTxtBx() {
		return elePreviousSRTxtBx;
		
		
		
	}@FindBy(xpath = "//td[text()='Disputed Amount']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleDisputedAmountTxt;

	public WebElement getEleDisputedAmountTxt() {
		return eleDisputedAmountTxt;
		
	}

	@FindBy(xpath = "//td[text()='Disputed Amount']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleDisputedAmountTxtBx;

	public WebElement getEleDisputedAmountTxtBx() {
		return eleDisputedAmountTxtBx;
	}
	
	/***********************************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: for Dff billing payment Waivers Adjustments Refund  Postpaid objects
	 * 
	 */
	
	@FindBy(xpath = "//td[text()='Type of Adjustment']/..//td[contains(@id,'PickSimpleValue')]")
	private WebElement eleAdjustmentTxt;

	public WebElement getEleAdjustmentTxt() {
		return eleAdjustmentTxt;
	}

	@FindBy(xpath = "//td[text()='Type of Adjustment']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleAdjustmentTxtbx;

	public WebElement getEleAdjustmentTxtBx() {
		return eleAdjustmentTxtbx;
	}
	
	
	
	@FindBy(xpath = "//td[text()='Reason']/..//td[contains(@id,'PickSimpleValue')]")
	private WebElement eleReasonTxt;

	public WebElement getEleReasonTxt() {
		return eleReasonTxt;
		
	}

	@FindBy(xpath = "//td[text()='Reason']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleReasonTxtBx;

	public WebElement getEleReasonTxtBx() {
		return eleReasonTxtBx;
	}
	
	@FindBy(xpath = "//td[text()='Adjustment Amount']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleAdjustmentAmountTxt;

	public WebElement getAdjustmentAmountTxt() {
		return eleAdjustmentAmountTxt;
		
	}

	@FindBy(xpath = " //td[text()='Adjustment Amount']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleAdjustmentAmountTxtBx;

	public WebElement getEleAdjustmentAmountTxtBx() {
		return eleAdjustmentAmountTxtBx;
	}
	 //td[text()='Calculated Amount']/..//td[contains(@id,'SRDFF_NumValue')]
	 //td[text()='Calculated Amount']/..//input[contains(@id,'SRDFF_NumValue')]
	
	@FindBy(xpath = "//td[text()='Calculated Amount']/..//td[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleCalculatedAmountTxt;

	public WebElement getEleCalculatedAmountTxt() {
		return eleCalculatedAmountTxt;
		
	}
	 
	@FindBy(xpath = " //td[text()='Calculated Amount']/..//input[contains(@id,'SRDFF_NumValue')]")
	private WebElement eleCalculatedAmountTxtBx;

	public WebElement getEleCalculatedAmountTxtBx() {
		return eleCalculatedAmountTxtBx;
	}
	
	
	//td[text()='Adjustment will be passed as']/..//td[contains(@id,'SRDFF_PickSimpleValue')]
		 //td[text()='Adjustment will be passed as']/..//input[contains(@id,'SRDFF_PickSimpleValue')]
	@FindBy(xpath = "//td[text()='Adjustment will be passed as']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleAdjusPassedTxt;

	public WebElement getEleAdjusPassedTxt() {
		return eleAdjusPassedTxt;
		
	}
	
	@FindBy(xpath = " //td[text()='Adjustment will be passed as']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleAdjusPassedTxtBx;

	public WebElement getEleAdjusPassedTxtBx() {
		return eleAdjusPassedTxtBx;
	}
	 //td[text()='Incorrect Adjustment']/..//td[contains(@id,'SRDFF_PickSimpleValue')]
	 //td[text()='Incorrect Adjustment']/..//input[contains(@id,'SRDFF_PickSimpleValue')]
	
	
	@FindBy(xpath = "//td[text()='Incorrect Adjustment']/..//td[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleIncorrectAdjustmentTxt;

	public WebElement getEleIncorrectAdjustmentTxt() {
		return eleIncorrectAdjustmentTxt;
		
	}
	
	@FindBy(xpath = " //td[text()='Adjustment will be passed as']/..//input[contains(@id,'SRDFF_PickSimpleValue')]")
	private WebElement eleIncorrectAdjustmentTxtBx;

	public WebElement getEleIncorrectAdjustmentTxtBx() {
		return eleIncorrectAdjustmentTxtBx;
	}
	/************************************************************************************************
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values
	 */
	public void enquiryActivationDffValue() throws Exception {
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		ActionUtil.clickElement(getEleTypeOfEnquiryBx(), driver, "Type Of Enquiry Bx");
		ActionUtil.clickElement(getEleTypeOfEnquiryDrpDwn(), driver, "Type Of Enquiry Drp dwn");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.enter(driver);
		// ActionUtil.clickElement(getEleTeleverificationinDrpDwn(), driver,
		// "Televerification in drp dwn");
		ActionUtil.clickElement(getEleReasonForCallBx(), driver, "Reason for call box");
		ActionUtil.clickElement(getEleReasonForCallDrpDwn(), driver, "Reason for call drp dwn");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.enter(driver);
		// ActionUtil.clickElement(getEleAddressDifferentinDrpDwn(), driver,
		// "Address different");
		ActionUtil.clickElement(getEleDonorOparatorBx(), driver, "Donor operator bx");
		ActionUtil.clickElement(getEleDonorOparatorDrpDwn(), driver, "Donor operator drp dwn");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.enter(driver);
		// ActionUtil.clickElement(getEle110GsminDrpDwn(), driver, "110 GSM
		// Donor operator");
		ActionUtil.save(driver);
		Thread.sleep(3000);
	}
	/*
	 * Thread.sleep(1500);
	 * 
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to add Data Consent Yes/No/Failed
	 * 
	 */

	public void addDataConsentDFFValuesAndSubmit(String filepath, String sheetname, String testcaseID)
			throws Exception {

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.waitForElement(getEleTVStatusDFFValueTxtBx(), driver, "TV Status DFF Value", 2);
		ActionUtil.type(getEleTVStatusDFFValueTxtBx(), sData[2], " TV Status DFF Value ", driver);
		ActionUtil.type(getEleDataConsentDFFValueTxtBx(), sData[3], " Data Consent DFF Value", driver);
		ActionUtil.save(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method add Simex
	 * 
	 */
	public void addSimexDFFValuesAndSubmit(String simNumber, String reason, String requesterType) throws Exception {

		ActionUtil.waitForElement(getEleNewSimNorDFFValueTxtBx(), driver, " New Sim Number DFF Name ", 2);
		ActionUtil.type(getEleNewSimNorDFFValueTxtBx(), simNumber, " New Sim Number DFF Name Text Box ", driver);
		ActionUtil.type(getEleReasonDFFValueTxtBx(), reason, " Reason For Sim Replacement Box ", driver);
		ActionUtil.type(getEleRequesterTypeDFFValueTxtBx(), requesterType, " Requetser Type Text Box ", driver);
		ActionUtil.save(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}

	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Method add Sim Lost Dff
	 * 
	 */
	public void validateSimLostDffDetails() throws IOException {

		String ReasonSuspension = ActionUtil.gettext(eleReasonSuspensionTxt, driver, "Resion of suspension");
		String SimCardCouriered = ActionUtil.gettext(getEleSimCardCourieredTxt(), driver, "Sim Card Couriered");
		String AlternateContactNumber = ActionUtil.gettext(eleAlternateContactNumberTxt, driver,
				"Alternate Contact Number");
		String CouruerAddress = ActionUtil.gettext(eleCouruerAddressTxt, driver, "Couruer Address");

		ActionUtil.verifyContainsText(ReasonSuspension, "HS_LOST");
		ActionUtil.verifyContainsText(SimCardCouriered, "No");
		ActionUtil.verifyContainsText(AlternateContactNumber, "1233312312");
		ActionUtil.verifyContainsText(CouruerAddress, "Billing");

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Validate DFF Value for Tele Verification
	 * 
	 */

	public void validateTeleVerificationDFFValues(String filepath, String sheetname, String testcaseId)
			throws Exception {

		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		String tvStatus = ActionUtil.gettext(getEleTVStatusDFFValueTxtBx(), driver, " TV Status text box");
		String dataConsent = ActionUtil.gettext(getEleDataConsentDFFValueTxtBx(), driver, " Data Consent text box");
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", tvStatus, sData[dff1]);
		ActionUtil.verifyEqualsText(" Tele Verification SR Type ", dataConsent, sData[dff2]);
		ActionUtil.save(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " DFF Submit Button");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			String alertStatus = alert.getText();
			if (alertStatus.contains("Submitted Successfully")) {
				MyExtentListners.test.pass(" On clicking DFF Submit button || Sucessfull Alert Pop Pop is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"On clicking DFF Submit button || Sucessfull Alert Pop Pop is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				throw new Exception();
			}
			alert.accept();
		}

	}

	public void addressChangeDFFValuesAndSubmit(String filepath, String sheetname, String testcaseID) throws Exception {

		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
		int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
		int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.clickElement(getEleAddressTypeTxtBx(), driver, "Address type");
		Thread.sleep(1500);
		ActionUtil.type(getEleAddressTypeEdtBx(), sData[dff1], " Address type ", driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleLine1TxtBx(), driver, "Address Line 1");
		Thread.sleep(1500);
		ActionUtil.type(getEleLine1EdtBx(), sData[dff2], " Line 1 ", driver);
		// Thread.sleep(1500);
		//
		// ActionUtil.clickElement(getEleLine2TxtBx(), driver, "Address Line
		// 2");
		// Thread.sleep(1500);
		// ActionUtil.type(getEleLine2EdtBx(),sData[dff3], " Line 2 ",driver );
		// Thread.sleep(1500);
		//
		// ActionUtil.clickElement(getEleLandmarkTxtBx(), driver, "Landmark");
		// Thread.sleep(1500);
		// ActionUtil.type(getEleLandmarkEdtBx(),sData[dff4], " Landmark
		// ",driver );
		// Thread.sleep(1500);
		//
		// ActionUtil.clickElement(getEleStateTxtBx(), driver, "State");
		// Thread.sleep(1500);
		// ActionUtil.type(getEleStateEdtBx(),sData[dff5], " State ",driver );
		// ActionUtil.enter(driver);
		// Thread.sleep(1500);
		//
		// ActionUtil.clickElement(getEleCityTxtBx(), driver, "City");
		// Thread.sleep(1500);
		// ActionUtil.type(getEleCityEdtBx(),sData[dff6], " City ",driver );
		// Thread.sleep(1500);
		// ActionUtil.clickElement(getEleOkBtn(), driver, "Click on ok");
		//
		// ActionUtil.clickElement(getElePincodeTxtBx(), driver, "Pincode");
		// Thread.sleep(1500);
		// ActionUtil.type(getElePincodeEdtBx(),sData[dff7], " Pincode ",driver
		// );
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// if(ActionUtil.isAlertPresent(driver,30)){
		// Alert alert=driver.switchTo().alert();
		// System.out.println(alert.getText());
		// alert.accept();
		// }
		//

	}

	public void validatePushSmsDffDetails() throws IOException, InterruptedException {
		Thread.sleep(2500);
		String Templatename = ActionUtil.gettext(getEleTemplateNameTxtBx(), driver, "Template name");
		Thread.sleep(1500);
		String MessageMedia = ActionUtil.gettext(getEleMessageMediaTxtBx(), driver, "Message Media");
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(MessageMedia, "PUSH SMS To get rechg details_can be used by all users KEL Pre");
		
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(Templatename, "PUSH SMS To get rechg details_can be used by all users KEL Pre");

	}

	public void submitDffDetails() throws IOException {

		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			String popupmsg = alert.getText();
			ActionUtil.verifyContainsText(popupmsg, "submitted");
			alert.accept();
		}

	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: reusable fornetwork related complaint DFF
	 */
	public void addNetworkComplaintDffValue() throws Exception {
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleTypeOfComplaintBx(), driver, "Type of complaint box");
		ActionUtil.clickElement(getEleTypeOfComplaintValueBx(), driver, " Type of complaint box");
		ActionUtil.type(getEleTypeOfComplaintValueBx(), "Error while opening the page", "Type of complaint value",
				driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleAreaNameTextBx(), driver, "Area name text box");
		ActionUtil.clickElement(getEleAreaNameBx(), driver, "Area name box");
		ActionUtil.clickElement(eleAreaNameValueBx, driver, "Area name value box");
		ActionUtil.clickElement(getEleAreaNameValueDrpDwn(), driver, "Area name Drp Dwn");
		ActionUtil.clickElement(getEleAreaName(), driver, "Name of the area");
		ActionUtil.clickElement(getEleAreaNameOkBtn(), driver, "Area name ok btn");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleLastDateOccuredBx(), driver, "last date occured box");
		ActionUtil.clickElement(getEleLastDateOccuredValueBx(), driver, "last date occured value box");
		ActionUtil.clickElement(getEleLastDateOccuredValueDrpDwn(), driver, "last date occured drp dwn");
		ActionUtil.clickElement(getEleLastDateOccuredValue2(), driver, "last date on 2");
		ActionUtil.clickElement(getEleLastDateOccuredDonebtn(), driver, "last date done btn");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleLastOccuredTimeBx(), driver, "last occured time box");
		ActionUtil.clickElement(getEleLastOccuredTimeValueBx(), driver, "last occured time value box");
		ActionUtil.clickElement(getEleLastOccuredTimeDrpDwn(), driver, "last occured time  drp dwn");
		ActionUtil.clickElement(getEleLastOccuredTimeValue(), driver, "Time schedule");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleUnableToUseBx(), driver, "Unable to use box");
		ActionUtil.clickElement(getEleUnableToUseValueBx(), driver, "Unable to use value box");
		ActionUtil.clickElement(getEleUnableToUseValueDrpDwn(), driver, "Unable to use value DrpDwn");
		ActionUtil.clickElement(getEleUnableToUseValue(), driver, "particular place value");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleNumberOfSignalBarsBx(), driver, "Number of signal bars box");
		ActionUtil.clickElement(getEleNumberOfSignalBarsValueBx(), driver, "Number of signal bars value box");
		ActionUtil.clickElement(getEleNumberOfSignalBarsDrpDwn(), driver, "Number of signal bars drp dwn");
		ActionUtil.clickElement(getEleNumberOfSignalBarsValue(), driver, "Number of signal bars value");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleNetworkSymbolBx(), driver, "Network symbol box");
		ActionUtil.clickElement(getEleNetworkSymbolValueBx(), driver, "Network symbol value box");
		ActionUtil.clickElement(getEleNetworkSymbolDrpDwn(), driver, "Network symbol drp down");
		ActionUtil.clickElement(getEleNetworkSymbolValue(), driver, "Network symbol value");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleServiceInHLRBx(), driver, "Service in HLR box");
		ActionUtil.clickElement(getEleServiceInHLRValueBx(), driver, "Service in HLR value box");
		ActionUtil.clickElement(getEleServiceInHLRDrpDwn(), driver, "Service in HLR Drp dwn");
		ActionUtil.clickElement(getEleServiceInHLRValue(), driver, "Service in HLR value");
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: reusable for Dff recharge and balance details
	 */
	public void addBalanceAndRechargeEnquiry() throws Exception {
		ActionUtil.clickElement(getEleDeductionAmtBx(), driver, "Deduction amount box in dff");
		ActionUtil.clickElement(getEleDeductionAmtDrpDwn(), driver, "Deduction amount drop down");
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleDeductionAmtValueBtn7(), driver, "Deduction value 7");
		ActionUtil.clickElement(getEleDeductionAmtValueBtn0(), driver, "Deduction value 0");
		ActionUtil.clickElement(getEleDeductionAmtValueBtn0(), driver, "Deduction value 0");
		ActionUtil.clickElement(getEleDeductionAmtValueBtnUse(), driver, "Deduction value Use");
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff contactid Scenario
	 */

	public void validateAddDFFAltNumber() throws Exception {
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleHiddenContactIdDFFValueTxtBx(), driver, "contact id text box");
		ActionUtil.clickElement(getEleContactIdDFFValueTxtBx(), driver, "contact id text box");
		ActionUtil.clickElement(eleContactIdDFFPickup(), driver, "pickup option in contact id");
		ActionUtil.clickElement(getEleContacidInPickup(), driver, "Contact id in pickup applet");
		ActionUtil.clickElement(getEleOkInPickup(), driver, "Ok in pickup view");
		Thread.sleep(3000);
		ActionUtil.save(driver);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String alternaten = n + "" + 2;
		Thread.sleep(3000);
		// ActionUtil.clickElement(eleAlternateNumberinDff(), driver, "Alternate
		// number in dff");
		ActionUtil.clickElement(eleAlternateNumberinDff(), driver, "Alternate number in dff");
		Thread.sleep(2000);
		System.out.println("ALTERNATENO.");
		ActionUtil.type(eleAlternateNumberinDffTxtBx(), alternaten, "Alternate number in dff", driver);
		Thread.sleep(5000);
		ActionUtil.clickElement(eleSrSubmitBtn(), driver, "Submit button");
		Thread.sleep(5000);
		if (ActionUtil.isAlertPresent(driver, 30)) {

			Alert alert = driver.switchTo().alert();
			if (alert.getText().contains("submitted")) {
				// write pass code
				alert.accept();
			} else {
				// write fail code
			}
		}
		InitializePages.o_taggingInteractionPage.validateDetailsSRStatus("Closed", "Resolved");
		InitializePages.o_subscriptionPage.searchMSISDN(GenericLib.sTestDataFilePath, "FST", "TC_047");
		String expctaltn = ActionUtil.gettext(InitializePages.o_360DegreePage.getEleAltNumberTxt(), driver,
				"Alternate value from 360 degree page");
		ActionUtil.verifyEqualsText("alternate number verified", expctaltn, alternaten);
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff Name and Dff Value for DND Categories Objects
	 */
	public void addDffDNDValues() throws Exception {
		ActionUtil.clickElement(eleProductToDeletetxtbox, driver, "ProductToDeletetxtbox");
		Thread.sleep(3000);
		ActionUtil.clickElement(eleProductToDeleteDrpDwn, driver, "ProductToDeleteDrpDwn");
		Thread.sleep(4000);

		for (int i = 0; i < geteleProductToDeleteDrpDwnValues().size(); i++) {
			String elevalue = geteleProductToDeleteDrpDwnValues().get(i).getText();
			Thread.sleep(2000);
			System.out.println(elevalue);
			if (elevalue.contains("STD")) {
				System.out.println(elevalue);
				Thread.sleep(2000);
				ActionUtil.clickElement(geteleProductToDeleteDrpDwnValues().get(i), driver, "ProductToDelete");
				ActionUtil.type(eleEffectiveFromTxtBox, "Immediate", "DffEffectiveFromTextBox", driver);
				ActionUtil.clickElement(eleDepositToBeWaivedDroDwnTxtBox, driver, "DepositToBeWaivedDroDwnTxtBox");
				ActionUtil.clickElement(eleDepositToBeWaivedDroDwn, driver, "DepositToBeWaivedDroDwn");
				for (int j = 0; j < geteleDepositToBeWaivedDroDwnvalues().size(); j++) {
					String value = geteleProductToDeleteDrpDwnValues().get(i).getText();
					if (value.equals("No")) {
						ActionUtil.verifyEqualsText("Verifying the value", value, "No");
						ActionUtil.clickElement(geteleProductToDeleteDrpDwnValues().get(i), driver,
								"ProductToDeleteDrpDwnValue");
						ActionUtil.clickElement(eleDffApplyBtn, driver, "ApplyButton");
						ActionUtil.waitTillPageLoad(driver, 5);
						if (ActionUtil.isAlertPresent(driver, 20)) {
							Alert alert = driver.switchTo().alert();
							alert.accept();
						}
					}
				}

			}
		}

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Method to add Dff Value for given dff names
	 * 
	 */
	public void addDffSTDValues() throws Exception {
		ActionUtil.clickElement(eleProductToDeletetxtbox, driver, "ProductToDeletetxtbox");
		Thread.sleep(3000);
		ActionUtil.clickElement(eleProductToDeleteDrpDwn, driver, "ProductToDeleteDrpDwn");
		Thread.sleep(4000);

		for (int i = 0; i < geteleProductToDeleteDrpDwnValues().size(); i++) {
			String elevalue = geteleProductToDeleteDrpDwnValues().get(i).getText();
			Thread.sleep(2000);
			if (elevalue.contains("STD")) {
				Thread.sleep(2000);
				ActionUtil.clickElement(geteleProductToDeleteDrpDwnValues().get(i), driver, "ProductToDelete");
				ActionUtil.type(eleEffectiveFromTxtBox, "Immediate", "DffEffectiveFromTextBox", driver);
				ActionUtil.clickElement(eleDffApplyBtn, driver, "ApplyButton");
				ActionUtil.waitTillPageLoad(driver, 7);
				if (ActionUtil.isAlertPresent(driver, 50)) {
					Alert alert = driver.switchTo().alert();
					if (alert.getText().contains("Processed Successfully")) {
						// implement pass code
					} else {
						// implement fail code
					}
					alert.accept();
				}
			}
		}
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Dff Name and Dff Value for Raise SR For SafeCustody
	 * Categories Objects
	 */
	public void addDffSafeCustodyValues() throws Exception {
		ActionUtil.clickElement(getEleSafeCustodyTxtBx(), driver, "Safe Custody Text Box");
		ActionUtil.clickElement(getEleSafeCustodyListApplet(), driver, "SafeCustodyListApplet");
		ActionUtil.clickElement(getEleSafeCustodyListAppletTxtBxValue(), driver, "SafeCustodyListAppletTxtBxValue");
		ActionUtil.clickElement(getEleSafeCustodyListAppletTxtBxVaueOk(), driver, "SafeCustodyListAppletTxtBxValue");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleSafeCustodyDurationTxtBx(), driver, "SafeCustodyDuration");
		ActionUtil.clickElement(getEleAltContactTxtBx(), driver, "AltContactBtnTxtBx");
		Thread.sleep(2000);
		int altContactNumber = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST",
				"Alternate Contact Number");
		System.out.println(altContactNumber);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", "TC_033");
		System.out.println(sData[altContactNumber]);
		Thread.sleep(3000);
		ActionUtil.type(getEleAltContactTxtBxValue(), sData[altContactNumber], "Alternate Contact Number", driver);
		ActionUtil.clickElement(getEleAltEmailIdTxtBx(), driver, "EmailIdTxtBX");
		int EmailId = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", "EmaiId");
		System.out.println(EmailId);
		// String[]
		// sData=GenericLib.toReadExcelData(GenericLib.sTestDataFilePath,"FST","TC_068");
		ActionUtil.type(getEleAltEmailIdTxtBxValue(), sData[EmailId], "EmailId", driver);
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.clickElement(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 50)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add lead dff values
	 */
	public void addDffLeadValues() throws Exception {
		ActionUtil.clickElement(eleTargetCircle, driver, "Target Circle");
		Thread.sleep(2000);
		ActionUtil.type(eleTargetCircleTxtBx, "Orissa", "Target Circle Text Box", driver);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String altcontactno = n + "" + 2;
		System.out.println(altcontactno);
		ActionUtil.clickElement(eleAlternateNumber, driver, "Alternate Number Text Box");
		Thread.sleep(2000);
		ActionUtil.type(eleAlternateNumberTxtBx, altcontactno, "Alternate Contact Number", driver);
		ActionUtil.save(driver);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value for Particular IP not accessible || All SIM
	 * not working complaint for postpaid customer
	 * 
	 */

	public void addM2MComlpaintDFFValues(String sFilepath, String sSheet, String sTestCaseID) throws Exception {

		int dff1 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_1);
		String[] sData = GenericLib.toReadExcelData(sFilepath, sSheet, sTestCaseID);
		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenDestIpTxtBx(), driver, " Destination Ip");
		Thread.sleep(2000);
		ActionUtil.type(getEleDestIpTxtBx(), sData[dff1], "Destination Ip Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenSolutionTypeTxtBx(), driver, " Solution Type");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleSolutionTypeLst(), driver, " Solution Type DrpDwn");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleOpenInternetOpt(), driver, "Open Internet");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenAPNNameTxtBx(), driver, " APN Name ");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleAPNNameLst(), driver, " APN Name Drop Down ");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value for Static IP not reachable complaint for
	 * postpaid customer
	 * 
	 */

	public void addStaticIPNotReachableDFFValues(String sFilepath, String sSheet, String sTestCaseID) throws Exception {

		int dff1 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_1);
		int dff2 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_2);
		String[] sData = GenericLib.toReadExcelData(sFilepath, sSheet, sTestCaseID);
		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenReqNameTxtBx(), driver, " Request Name Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleRequestNameTxtBx(), sData[dff1], "Request Name Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenWANIpTxtBx(), driver, " WAN Ip Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleWANIpTxtBx(), sData[dff2], " WAN Ip Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenAPNNameTxtBx(), driver, " APN Name ");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleAPNNameLst(), driver, " APN Name Drop Down ");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value for Link Down complaint for postpaid customer
	 * 
	 */

	public void addLinkDownDFFValues(String sFilepath, String sSheet, String sTestCaseID) throws Exception {

		int dff1 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_1);
		int dff2 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_2);
		int dff3 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_3);
		int dff4 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_4);
		String[] sData = GenericLib.toReadExcelData(sFilepath, sSheet, sTestCaseID);
		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenMsisdnTxtBx(), driver, " MSISDN Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleMsisdnTxtBx(), sData[dff1], "MSISDN Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenStaticIpTxtBx(), driver, " Static IP Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleStaticIpTxtBx(), sData[dff2], " Static IP Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenCircuitIdTxtBx(), driver, " Circuit ID Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleCircuitIdTxtBx(), sData[dff3], " Circuit ID Text Box ", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenFTNumberTxtBx(), driver, " FT Number Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleFTNumberTxtBx(), sData[dff4], " FT Number Text Box ", driver);
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value for GDSP Portal issue complaints for postpaid
	 * customer complaint for postpaid customer
	 * 
	 */

	public void addGDSPPortalIssueDFFValues(String sFilepath, String sSheet, String sTestCaseID) throws Exception {

		int dff1 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_1);
		int dff2 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_2);
		String[] sData = GenericLib.toReadExcelData(sFilepath, sSheet, sTestCaseID);
		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenCorpNameTxtBx(), driver, " Corporate Name Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleCorpNameTxtBx(), sData[dff1], "Corporate Name Text Box", driver);
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenAPNNameTxtBx(), driver, " APN Name ");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleAPNNameLst(), driver, " APN Name Drop Down ");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF values for Never Requested complaints for postpaid
	 * customer
	 * 
	 */

	public void addNeverRequestedDFFValues() throws Exception {

		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenFromDateTxtBx(), driver, " From Date Text Box");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleFromDateDtePck(), driver, " From Date Picker");
		Thread.sleep(2000);
		ActionUtil.actionClick(InitializePages.o_myLeadsPage.getEleNowBtn(), driver, " Now Button");
		Thread.sleep(2000);
		ActionUtil.actionClick(InitializePages.o_myLeadsPage.getEleDoneBtn(), driver, " Done Button");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenToDateTxtBx(), driver, " To Date Text Box");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleToDateDtePck(), driver, " To Date Picker");
		Thread.sleep(2000);
		ActionUtil.actionClick(InitializePages.o_myLeadsPage.getEleNowBtn(), driver, " Now Button");
		Thread.sleep(2000);
		ActionUtil.actionClick(InitializePages.o_myLeadsPage.getEleDoneBtn(), driver, " Done Button");
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value Benefit not Received complaints for prepaid
	 * customer
	 * 
	 */

	public void addBenifitNotReceivedDFFValues(String sFilepath, String sSheet, String sTestCaseID) throws Exception {

		Actions act = new Actions(driver);

		int dff1 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_1);
		int dff2 = GenericLib.getColumnIndex(sFilepath, sSheet, DFF_2);
		String[] sData = GenericLib.toReadExcelData(sFilepath, sSheet, sTestCaseID);
		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenTypeOfIssueTxtBx(), driver, "Type Of Issue Text Box");
		Thread.sleep(2000);
		ActionUtil.type(getEleTypeOfIssueTxtBx(), sData[dff1], "Type Of Issue Text Box", driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenSchemeDetailsTxtBx(), driver, " Scheme Details Text Box ");
		Thread.sleep(2000);
		ActionUtil.type(getEleSchemeDetailsTxtBx(), sData[dff2], "Type Of Issue Text Box", driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value Stock Availibility
	 * 
	 */

	public void addBillNotReceivedDFFValues() throws Exception {

		Actions act = new Actions(driver);

		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenInvoiceDateTxtBx(), driver, "Invoice Date Text Box");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleInvoiceDateDrpDwnIcn(), driver, "Invoice Date Drop Down");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenReasonForComplaintTxtBx(), driver, " Reason For Complaint Text Box ");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleReasonForComplaintDrpDwnIcn(), driver, "Reason For Complaint Drop Down");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add DFF value r
	 * 
	 */

	public void addStockAvailabilityDFFValues() throws Exception {

		Actions act = new Actions(driver);

		Thread.sleep(5000);
		ActionUtil.actionClick(getEleHiddenComplaintTypeTxtBx(), driver, " Complaint Type Text Box");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleComplaintTypeDrpDwnIcn(), driver, " Complaint Type Drop Down");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleHiddenComplaintDetailsTxtBx(), driver, " Complaint Details Text Box ");
		Thread.sleep(2000);
		ActionUtil.actionClick(getEleComplaintDetailsDrpDwnIcn(), driver, "Complaint Details Drop Down");
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_UP, Keys.ARROW_UP), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.scrollIntoView(driver, getEleDFFSubmitBtn());
		ActionUtil.actionClick(getEleDFFSubmitBtn(), driver, " Submit Button");
		if (ActionUtil.isAlertPresent(driver, 100)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("submitted")) {
				MyExtentListners.test
						.pass("Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Submit Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Submit Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleDFFSubmitBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	public void addDffCalltypeAndBillingPostpaid() throws Exception {
		ActionUtil.clickElement(getEleCallForReasonTxtBx(), driver, "Call for reason txt box");
		ActionUtil.clickElement(getEleMonthTxtBx(), driver, "Month text box");
		ActionUtil.clickElement(getEleMonthValueTxtBx(), driver, "Month text value box");
		int Month = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", "TC_401");
		Thread.sleep(3000);
		ActionUtil.type(getEleMonthValueTxtBx(), sData[Month], "Month Value", driver);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values BillingAndPaymentComplPostpaid
	 */
	public void addDffBillingAndPaymentComplPostpaid(String testcaseId) throws Exception {
		int TypeofComp = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		int amtTrans = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		int reciepntnum = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_3);
		int modeOfTransfer = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_4);
		int dateOfTransfer = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_5);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.clickElement(getEleTypeOfComplaintBx(), driver, "Type of complaint");
		ActionUtil.clickElement(getEleTypeOfComplaintValueBx(), driver, "Type of complaint value");
		ActionUtil.type(getEleTypeOfComplaintValueBx(), sData[TypeofComp], "type of comp dff", driver);
		Thread.sleep(2000);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleAmountTransferredTxtBx(), driver, "Amopunt transferred");
		ActionUtil.clickElement(getEleAmountTransferredValueTxtBx(), driver, "Amopunt transferred");
		ActionUtil.type(getEleAmountTransferredValueTxtBx(), sData[amtTrans], "Amopunt transferred", driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleRecipientnumberTxtBx(), driver, "recipient number");
		ActionUtil.clickElement(getEleRecipientnumberValueTxtBx(), driver, "recipient number");
		ActionUtil.type(getEleRecipientnumberValueTxtBx(), sData[reciepntnum], "recipient number", driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleModeOfTransferTxtBx(), driver, "mode of transfer");
		ActionUtil.clickElement(getEleModeOfTransferTxtBxValueTxtBx(), driver, "mode of transfer");
		ActionUtil.type(getEleModeOfTransferTxtBxValueTxtBx(), sData[modeOfTransfer], "mode of transfer", driver);
		Thread.sleep(2000);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleDateOfTransferTxtBx(), driver, "date of transfer");
		ActionUtil.clickElement(getEleDateOfTransferTxtBxValueTxtBx(), driver, "date of transfer");
		ActionUtil.clickElement(getEleDateOfTransferDrpDwn(), driver, "date of transfer drp dwn");
		ActionUtil.clickElement(getEleDateOfTransferDrpDwnDate2(), driver, "date of transfer drp dwn 2 value");
		ActionUtil.clickElement(getEleLastDateOccuredDonebtn(), driver, "dome button");

		ActionUtil.save(driver);

	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values BillingAndPaymentComplPostpaid GST
	 */
	public void addDffBillingAndPaymentComplGSTPostpaid(String testcaseId) throws Exception

	{
		int TypeofDispute = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		int reasonforDispute = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.clickElement(getEleTypeOfDisputeTxtBx(), driver, "type of dispute");
		ActionUtil.clickElement(getEleTypeOfDisputeValueTxtBx(), driver, "type of dispute value txt bx");
		Thread.sleep(2000);
		ActionUtil.type(getEleTypeOfDisputeValueTxtBx(), sData[TypeofDispute], "type of dispute value", driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleReasonOfDisputeTxtBx(), driver, "Reason for dispute");
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleReasonOfDisputeValueTxtBx(), driver, "Reason for dispute");
		ActionUtil.type(getEleReasonOfDisputeValueTxtBx(), sData[reasonforDispute], "Reason for dispute", driver);
		Thread.sleep(2000);
		ActionUtil.save(driver);
	}

	public void addDffBillingAndPaymentForDepositTrnsfrIssue(String testcaseId) throws Exception {

		int PaymentLoc = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		int paymentAmt = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_3);
		int paymentDate = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_4);
		int modeOfPayment = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_5);
		int transid = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_6);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.clickElement(getEleRequestNoTxtBx(), driver, "Request no");
		ActionUtil.clickElement(getEleRequestNoValueTxtBx(), driver, "Request no value");
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(90000);
		String requestno = n + "1";
		System.out.println(requestno);
		ActionUtil.type(getEleRequestNoValueTxtBx(), requestno, "random req no.", driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getElePaymentLocTxtBx(), driver, "Payment amt value");
		ActionUtil.clickElement(getElePaymentLocTxtValueBx(), driver, "Payment amt value");
		Thread.sleep(2000);
		ActionUtil.type(getElePaymentLocTxtValueBx(), sData[PaymentLoc], "Payment amt value", driver);
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getElePaymentAmtTxtBx(), driver, "Payment Amt");
		ActionUtil.clickElement(getElePaymentAmtValueTxtBx(), driver, "Payment Amt");
		Thread.sleep(2000);
		ActionUtil.type(getElePaymentAmtValueTxtBx(), sData[paymentAmt], "Payment Amt", driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getElePaymentDateTxtBx(), driver, "payment date and time");
		ActionUtil.clickElement(getElePaymentDateValueTxtBx(), driver, "payment date and time");
		Thread.sleep(2000);
		ActionUtil.type(getElePaymentDateValueTxtBx(), sData[paymentDate], "payment date and time", driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleModeOfPaymentTxtBx(), driver, "Mode of payment");
		ActionUtil.clickElement(getEleModeOfPaymentValueTxtBx(), driver, "Mode of payment");
		ActionUtil.type(getEleModeOfPaymentValueTxtBx(), sData[modeOfPayment], "Mode of payment", driver);
		Thread.sleep(2000);
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleTransactionIdTxtBx(), driver, "Transaction id");
		ActionUtil.clickElement(getEleTransactionIdValueTxtBx(), driver, "Transaction id value");
		Thread.sleep(2000);
		ActionUtil.type(getEleTransactionIdValueTxtBx(), sData[transid], "Transaction id value", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleModeOfPaymentTxtBx(), driver, "Mode of payment");
		ActionUtil.clickElement(getEleModeOfPaymentValueTxtBx(), driver, "Mode of payment");
		Thread.sleep(3000);
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values BillingAndPaymentComplPostpaid due to
	 * donor operator
	 */
	public void addDffBillingandPaymentDueToDonor(String testcasId) throws Exception {
		int ReasonOfComp = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcasId);
		ActionUtil.clickElement(getEleReasonForComplaintTxtBx(), driver, "reason for complaint");
		ActionUtil.clickElement(getEleReasonForComplaintValueTxtBx(), driver, "reason for complaint");
		ActionUtil.type(getEleReasonForComplaintValueTxtBx(), sData[ReasonOfComp], "reason for complaint", driver);
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values BillingAndPaymentComplPostpaid SI not
	 * registered
	 */
	public void addDffBillingandPaymenSInotRegistered() throws Exception {
		int reasonforDispute = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		int registrationDate = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		int registrationMedia = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_3);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", "TC_285");
		ActionUtil.clickElement(getEleReasonForDisputeSITxtBx(), driver, "Reason for dispute");
		ActionUtil.clickElement(getEleReasonForDisputeSIValueTxtBx(), driver, "Reason for dispute value");
		ActionUtil.type(getEleReasonForDisputeSIValueTxtBx(), sData[reasonforDispute], "Reason for dispute", driver);
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleReisterationDateSITxtBx(), driver, "Registration date");
		ActionUtil.clickElement(getEleReisterationDateValueSITxtBx(), driver, "Registration date value");
		ActionUtil.type(getEleReisterationDateValueSITxtBx(), sData[registrationDate], "Registration date value",
				driver);
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleReisterationMediaSITxtBx(), driver, "Registration media");
		ActionUtil.clickElement(getEleReisterationMediaValueSITxtBx(), driver, "Registration media value");
		ActionUtil.type(getEleReisterationMediaValueSITxtBx(), sData[registrationMedia], "Registration media value",
				driver);
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff enquiry values BillingAndPaymentComplPostpaid SI
	 * registered
	 */
	public void addDffBillingandPaymenSIRegistered() throws Exception {
		int reasonforDispute = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", "TC_286");
		ActionUtil.clickElement(getEleReasonForDisputeSIorECSTxtBx(), driver, "Reason for dispute");
		ActionUtil.clickElement(getEleReasonForDisputeSIorECSValueTxtBx(), driver, "Reason for dispute value");
		ActionUtil.type(getEleReasonForDisputeSIorECSValueTxtBx(), sData[reasonforDispute], "Reason for dispute",
				driver);
		ActionUtil.enter(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Dff Billing complaint Complaints-Service Disconnection
	 * -Voluntary-Churn Related_Postpaid
	 */
	public void addDffBillingVoluntaryChurnRelatedPostp(String testcaseId) throws Exception {
		Actions act = new Actions(driver);
		int reasonforComplaint = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		int retentionDate = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		int retained = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_3);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.clickElement(getEleReasonForComplaintTxtBx(), driver, "reason for complaint");
		ActionUtil.clickElement(getEleReasonForComplaintValueTxtBx(), driver, "reason for complaint");
		ActionUtil.clickElement(getEleReasonForComplaintValueDrpdwn(), driver, "reason for complaint");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.clickElement(getEleRetentionForDateTxtBx(), driver, "retention date");
		ActionUtil.clickElement(getEleRetentionForDateValueTxtBx(), driver, "retention date");
		ActionUtil.type(getEleRetentionForDateValueTxtBx(), sData[retentionDate], "retention date", driver);
		ActionUtil.clickElement(getEleRetainedTxtBx(), driver, "retained");
		ActionUtil.clickElement(getEleRetainedValueTxtBx(), driver, "retained");
		ActionUtil.clickElement(getEleReasonForComplaintValueDrpdwn(), driver, "reason for complaint");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.enter(driver);
		// ActionUtil.clickElement(getEleAlternateContactNumberValueTxtBx(),
		// driver, "Alt num");
		// String
		// altNum=ActionUtil.getAttributeValue(getEleAlternateContactNumberTxtBx(),
		// driver, "Alt num");
		// ActionUtil.clickElement(getEleAlternateContactNumberTxtBx(), driver,
		// "Alt num");
		String altNum1 = ActionUtil.getAttributeTitle(getEleAlternateContactNumberTxtBx(), driver, "Alt num");
		System.out.println(altNum1);
		Thread.sleep(3000);
		if (altNum1.equals(null)) {

			Random rnd = new Random();
			int n = 900000000 + rnd.nextInt(100000000);
			String msisdn = n + "1";
			System.out.println(msisdn);
			Thread.sleep(3000);
			ActionUtil.clickElement(getEleAlternateContactNumberTxtBx(), driver, "Alt num");
			ActionUtil.type(getEleAlternateContactNumberValueTxtBx(), msisdn, "Alt num", driver);
			Thread.sleep(3000);
		} else {
			ActionUtil.save(driver);
		}
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
	}

	public void addDffFailedInteractionsSelfHelpErrorOrAccessPostP(String testcaseId) throws Exception {
		Actions act = new Actions(driver);
		ActionUtil.clickElement(getEleApplicationTypeTxtBx(), driver, "Application type");
		ActionUtil.clickElement(getEleApplicationTypeValueTxtBx(), driver, "Application type");
		ActionUtil.clickElement(getEleDffValueDrpdwn(), driver, "drop dwown");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		ActionUtil.enter(driver);
		Thread.sleep(3000);
		int feedbackRelated = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_2);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.clickElement(getEleFeedbackRelatedToTxtBx(), driver, "Feedback related to");
		ActionUtil.clickElement(getEleFeedbackRelatedValueToTxtBx(), driver, "Feedback related to");
		ActionUtil.type(getEleFeedbackRelatedValueToTxtBx(), sData[feedbackRelated], "Feedback related to", driver);
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	public void addDffFailedInteractionsSystemErrororDowntime_Postp() throws IOException, InterruptedException {
		Actions act = new Actions(driver);
		ActionUtil.clickElement(getEleImpactedSystemTxtBx(), driver, "Impacted System");
		ActionUtil.clickElement(getEleDffValueDrpdwn(), driver, "drop dwown");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(3000);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleSystemOutageTxtBx(), driver, "System outage");
		ActionUtil.clickElement(getEleDffValueDrpdwn(), driver, "drop dwown");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(3000);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleQueryOnTxtBx(), driver, "Query on");
		ActionUtil.clickElement(getEleDffValueDrpdwn(), driver, "drop dwown");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(3000);
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
	}

	public void addDffFailedInteractionsSystemMismatchPostp(String testcaseId) throws Exception {
		Actions act = new Actions(driver);
		ActionUtil.clickElement(getEleImpactedSystemTxtBx(), driver, "Impacted System");
		ActionUtil.clickElement(getEleDffValueDrpdwn(), driver, "drop dwown");
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(3000);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleMismatchQueryOnTxtBx(), driver, "Query on");
		ActionUtil.clickElement(getEleMismatchQueryOnValueTxtBx(), driver, "Query on");
		int queryon = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.type(getEleMismatchQueryOnValueTxtBx(), sData[queryon], "Query on", driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleActionOnValueTxtBx(), driver, "aCTION ON");

		ActionUtil.save(driver);
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: reusable for Dff recharge and balance enquiry details
	 */
	public void addBalanceAndRechargeEnquiryPrepaid() throws Exception {
		ActionUtil.clickElement(getEleDeductionAmtBx(), driver, "Deduction amount box in dff");
		ActionUtil.clickElement(getEleDeductionAmtDrpDwn(), driver, "Deduction amount drop down");
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleDeductionAmtValueBtn7(), driver, "Deduction value 7");
		ActionUtil.clickElement(getEleDeductionAmtValueBtn0(), driver, "Deduction value 0");
		ActionUtil.clickElement(getEleDeductionAmtValueBtn0(), driver, "Deduction value 0");
		ActionUtil.clickElement(getEleDeductionAmtValueBtnUse(), driver, "Deduction value Use");
		Thread.sleep(3000);
		ActionUtil.save(driver);
	}

	public void prepaidaddressChangeDFFValuesAndSubmit() throws IOException, InterruptedException {

		ActionUtil.clickElement(getEleAddressTypeTxtBx(), driver, "Address type");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAddressTypeDrpDn(), driver, "Adsress Type drop down");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleStateTxtBx(), driver, "State");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleStateDrpDn(), driver, "State Type drop down");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleMaharashtraTxt(), driver, "Select Maharashtra");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleCityTxtBx(), driver, "City");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleCityDrpDn(), driver, "City drop down");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleNaviMumbaiTxt(), driver, "Select Navi Mumbai");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleOkBtn(), driver, "ok");
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePincodeTxtBx(), driver, "Pincode");
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePincodeDrpDn(), driver, "Pincode drop down");
		Thread.sleep(1500);
		act.sendKeys(Keys.chord(Keys.ARROW_DOWN), Keys.ENTER).build().perform();
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

	}

	public void billingAddressChangeDFFValues(String filepath, String sheetname, String testcaseID) throws Exception {
		Thread.sleep(1500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		Thread.sleep(1500);
		int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
		Thread.sleep(1500);
		int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
		Thread.sleep(1500);
		int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
		Thread.sleep(1500);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAddressTypeTxtBx(), driver, "Address type");
		Thread.sleep(1500);
		System.out.println(sData[dff1]);
		Thread.sleep(1500);
		// ActionUtil.clickElement(getEleAddressTypeEdtBx(), driver, "Address
		// type");
		// Thread.sleep(1500);
		ActionUtil.type(getEleAddressTypeEdtBx(), sData[dff1], " Address type ", driver);
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleNewAddressLine1TxtBx(), driver, "New Address Line 1");
		Thread.sleep(1500);
		ActionUtil.type(getEleLine1EdtBx(), sData[dff2], " Line 1 ", driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleNewAddressLine2TxtBx(), driver, "Address Line 2");
		Thread.sleep(1500);
		ActionUtil.type(getEleLine2EdtBx(), sData[dff3], " Line 2 ", driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleNewAddressLandmarkTxtBx(), driver, "Landmark");
		Thread.sleep(1500);
		ActionUtil.type(getEleLandmarkEdtBx(), sData[dff4], " Landmark ", driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleNewAddressStateTxtBx(), driver, "State");
		Thread.sleep(1500);
		ActionUtil.type(getEleStateEdtBx(), sData[dff5], " State ", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleNewAddressCityTxtBx(), driver, "City");
		Thread.sleep(1500);
		ActionUtil.type(getEleNewAddressCityEdtBx(), sData[dff6], " City ", driver);
		Thread.sleep(1500);
		// ActionUtil.clickElement(getEleOkBtn(), driver, "Click on ok");
		ActionUtil.enter(driver);

		ActionUtil.clickElement(getEleNewAddressPincodeTxtBx(), driver, "Pincode");
		Thread.sleep(1500);
		ActionUtil.type(getElePincodeEdtBx(), sData[dff7], " Pincode ", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		ActionUtil.clickElement(getEleNewAddressTypeforBillingTxtBx(), driver, "Address type");
		Thread.sleep(1500);
		System.out.println(sData[dff1]);
		Thread.sleep(1500);
		// ActionUtil.clickElement(getEleAddressTypeEdtBx(), driver, "Address
		// type");
		// Thread.sleep(1500);
		ActionUtil.type(getEleNewAddressTypeforBillingEdtBx(), sData[dff1], " Address type ", driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

		String poavalue = ActionUtil.gettext(getEleNewPOaRequiredTxtBx(), driver, "New POA Required");
		System.out.println(poavalue);
		ActionUtil.verifyContainsText(poavalue, "N", "New POA Required conatins N");

		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// if(ActionUtil.isAlertPresent(driver,30)){
		// Alert alert=driver.switchTo().alert();
		// System.out.println(alert.getText());
		// alert.accept();
		// }
		//

	}

	/*
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff Provisioning PCN or Alert Issue
	 */
	public void ProvisioningPcnAlertIssueDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.actionClick(getEleTypeofComplaintTxt(), driver, "Type of Complaint click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleTypeofComplaintTxtBx(), sData[dff1], "Choose Any valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleResolutionGivenTxt(), driver, "Resolution Given Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleResolutionGivenTxtBx(), sData[dff2], "Choose Any valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);
	}

	/*
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff Serviceissue Complaint Legal objectss
	 */
	public void ServiceissueComplaintsLegalDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.actionClick(getEleTypeCasefiledTxt(), driver, "Type case filed click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleTypeCasefiledTxtBx(), sData[dff1], "Type case filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleDisputeTxt(), driver, "Resaon for Dispute Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleDisputeTxtBx(), sData[dff2], "Choose Any valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);
	}

	/*
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff Serviceissue Complaint Legal objectss
	 */

	public void ServiceissueCustomerFeedbackDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.actionClick(getEleFeedbackRelatedTxt(), driver, "Feedback Related  click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleFeedbackRelatedTxtBx(), sData[dff1], "Type Feedback Related filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleFeedbackTxt(), driver, "Feedback Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleFeedbackTxtBx(), sData[dff2], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);
	}

	/*
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff device Related Complaints objects
	 */

	public void deviceRelatedComplaintsDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleDeviceTypeTxt(), driver, "Device filed click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleDeviceTypeTxtBx(), sData[dff1], "Device Type filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleSerialNoTxt(), driver, "Serial Number Click");
		Thread.sleep(1500);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		Thread.sleep(2500);
		String SerialNumber = "000" + n + "1";
		Thread.sleep(2500);
		System.out.println(SerialNumber);
		Thread.sleep(3000);
		ActionUtil.type(getEleSerialNoTxtBx(), SerialNumber, "Serial Number", driver);
		Thread.sleep(2500);
		ActionUtil.enter(driver);

		ActionUtil.actionClick(getEleWarrantyTxt(), driver, "Warranty filed click");
		Thread.sleep(2500);
		ActionUtil.type(getEleWarrantyTxtBx(), sData[dff2], "Warranty valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleImeiNoTxt(), driver, "Serial Number Click");
		Thread.sleep(1500);
		int m = 900000000 + rnd.nextInt(100000000);
		Thread.sleep(2500);
		String IMEInumber = "00000" + n + "1";
		Thread.sleep(2500);
		System.out.println(IMEInumber);
		Thread.sleep(3000);
		ActionUtil.type(getEleImeiNoTxtBx(), IMEInumber, "Serial Number", driver);
		Thread.sleep(2500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleDiagnosisTxt(), driver, "Diagnosis filed click");
		Thread.sleep(2500);
		ActionUtil.type(getEleDiagnosisTxtBx(), sData[dff3], "Diagnosis valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);

	}

	/********************************************************************************************************
	 * @author: Rana Thakur
	 * 
	 *          Description: for Dff SimReactivation Complaints
	 */

	public void SimReactivationComplaintsDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleComplaintTypeTxt(), driver, "Complaint type filed click");
		// ActionUtil.clickElement(getEleComplaintTxtBx(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleComplaintTypeTxtBx(), sData[dff1], "Complaint type filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getEleDateTxt(), driver, "Date  Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleDateTxtBx(), sData[dff2], "Date Type", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		// String Alternetno = ActionUtil.gettext(getEleAlternateNoTxt(),
		// driver, "Alternet number");

		// for (int i = 0; i < Alternetno.length() - 1; i++) {
		//
		// Character anumber = Alternetno.charAt(i);
		// Thread.sleep(2500);
		// if (anumber.isDigit(anumber)) {
		//
		// System.out.println("Number is " + Alternetno + " visibale");
		// // ActionUtil.save(driver);
		// } else {
		//
		// System.out.println("Number is not " + Alternetno + " visibale");
		Thread.sleep(2000);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		Thread.sleep(2000);
		String msisdn = n + "1";
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleAlternateNoTxt(), driver, "Alterner Number Click");
		Thread.sleep(2000);
		ActionUtil.clearAndType(getEleAlternateNoTxtBx(), msisdn, "Alt num", driver);
		Thread.sleep(2000);
		// }
		// }

		Thread.sleep(2500);
		// ActionUtil.clickElement(getReactivationTxt(), driver, "Reactivation
		// click");
		ActionUtil.actionClick(getEleReactivationTxt(), driver, "Reactivation fild click");
		Thread.sleep(1500);
		ActionUtil.type(getEleReactivationTxtBx(), sData[dff3], "Reactivation valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);

	}

	/********************************************************************************************************
	 * @author: Rana Thakur
	 * 
	 *          Description: for Dff balance Recharge Complaints
	 * 
	 * 
	 */

	public void balanceRechargeDFFValues(String filepath, String sheetname, String testcaseID) throws Exception {

		Thread.sleep(1500);

		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		Thread.sleep(1500);
		int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.actionClick(getEleComplaintTypeTxt(), driver, "Feedback Related  click");
		// ActionUtil.clickElement(getEleComplaintTypeTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleComplaintTypeTxtBx(), sData[dff1], "Type Feedback Related filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		Thread.sleep(1500);
		ActionUtil.clickElement(getEleDenominationTxt(), driver, "Feedback Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleDenominationTxtBx(), sData[dff2], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleModeTxt(), driver, "Feedback Related  click");
		// ActionUtil.clickElement(getEleComplaintTypeTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleModeTxtBx(), sData[dff3], "Type Feedback Related filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleKnownTxt(), driver, "Feedback Related  click");
		// ActionUtil.clickElement(getEleComplaintTypeTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleKnownTxtBx(), sData[dff4], "Type Feedback Related filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);

		Thread.sleep(1500);
		ActionUtil.clickElement(getEleRefundTxt(), driver, "Feedback Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleRefundTxtBx(), sData[dff5], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);

		ActionUtil.save(driver);
		Thread.sleep(2500);
	}

	/********************************************************************************************
	 * @author: Rana Thakur
	 * 
	 *          Description: for Dff Billing Payment Complaints Postpaid
	 */

	public void billingPaymentComplaintsDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleInvoiceTxt(), driver, "Device filed click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getEleInvoiceTxtBx(), sData[dff1], "Device Type filed", driver);// Incomplete
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);

		ActionUtil.clickElement(getEleWaiverAmountTxt(), driver, "Serial Number Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleWaiverAmountTxtBx(), sData[dff2], "Serial Number", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleCreditReasonTxt(), driver, "Warranty filed click");
		Thread.sleep(1500);
		ActionUtil.type(getEleCreditReasonTxtBx(), sData[dff3], "Warranty valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);

	}

	/********************************************************************************************
	 * @author: Rana Thakur
	 * 
	 *          Description: for Dff Billing Payment Update Complaints Postpaid
	 */

	public void billingPaymentUpdateComplaintsDFFValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);

		ActionUtil.actionClick(getEleModeOfPaymentTxt(), driver, "Device filed click");
		// ActionUtil.clickElement(getEleModeOfPaymentTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);

		ActionUtil.clearAndType(getEleModeOfPaymentTxtBx(), sData[dff1], "Device Type filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getElePaymentTxt(), driver, "Serial Number Click");
		Thread.sleep(1500);
		ActionUtil.type(getElePaymentTxtBx(), sData[dff2], "Serial Number", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getElePaymentDateTxt(), driver, "Serial Number Click");
		Thread.sleep(1500);
		ActionUtil.type(getElePaymentDateTxtBx(), sData[dff3], "Serial Number", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

		ActionUtil.clickElement(getElePaymentCircleTxt(), driver, "Payment Circle Click");
		Thread.sleep(1500);
		ActionUtil.clearAndType(getElePaymentCircleTxtBx(), sData[dff4], "Payment Circle", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(1500);

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: reusable for Dff Balance and Recharge details postpaid
	 */
	public void addDFFPostpaidBalanceAndRechargeComplaint(String filepath, String sheetname, String testcaseID)
			throws Exception {

		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(3500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleTypeOfServiceTxtBx(), driver, "Type of Service Text Box");
		Thread.sleep(3500);
		ActionUtil.type(getEleTypeOfInputServiceTxtBx(), sData[dff1], "Type Of Service TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleTypeOfComplaintTxtBx(), driver, "Type Of Complaint TxtBx");
		Thread.sleep(3500);
		ActionUtil.type(getEleTypeOfComplaintInputTxtBx(), sData[dff2], "Type Of Complaint TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleBalanceBeforeTxtBx(), driver, "Balance Before TxtBx");
		Thread.sleep(4000);
		ActionUtil.type(getEleBalanceBeforeInputTxtBx(), sData[dff3], "Balance Before Input TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.save(driver);
		Thread.sleep(10000);
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add lead dff values
	 */

	public void addDffLeadValues(String filepath, String sheetname, String testcaseID) throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleTargetCircle(), driver, "Target Circle");
		ActionUtil.type(getEleTargetCircleTxtBx(), sData[dff1], "Target Circle TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		// String altNum1=ActionUtil.getAttributeTitle(getEleAlternateNumber(),
		// driver, "Alt num");
		// System.out.println(altNum1);
		// Thread.sleep(3000);

		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn = n + "1";
		System.out.println(msisdn);
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleAlternateNumber(), driver, "AlternateNumber");
		ActionUtil.clearAndType(getEleAlternateNumberTxtBx(), msisdn, "Alternate Number TxtBx", driver);
		Thread.sleep(3000);

		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add CreditAndCollectionVerificationIssueComplaintValues dff
	 * values
	 */

	public void addDffCreditAndCollectionVerificationIssueComplaintValues(String filepath, String sheetname,
			String testcaseID) throws Exception {

		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		System.out.println("gooood");
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleReasonOfComplaintTxtBx(), driver, "Reason Of Complaint Txt Bx");
		ActionUtil.type(getReasonOfComplaintInputTxtBx(), sData[dff1], "Reason Of Complaint Input Txt Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(3000);

		// String
		// altNum1=ActionUtil.getAttributeTitle(getEleAlternateContactNumberTxtBx(),
		// driver, "Alternate Contact Number TxtBx");
		// System.out.println(altNum1);
		// Thread.sleep(3000);

		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn = n + "1";
		System.out.println(msisdn);
		Thread.sleep(4000);
		ActionUtil.clickElement(getEleAlternateContactNumberTxtBx(), driver, "Alternate Contact Number TxtBx");
		Thread.sleep(1500);
		ActionUtil.clearAndType(getEleAlternateContactNumberTxtBxValue(), msisdn, "Alternate Contact Number TxtBxValue",
				driver);
		Thread.sleep(3000);

		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);

	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add CreditAndCollectionVerificationIssueComplaintValues dff
	 * values
	 */

	public void addDffCreditAndCollectionCLChangeCompaint(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(2500);
		System.out.println("good");
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(3500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(3500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getTypeofComplaintTxtBx(), driver, "Type of Complaint TxtBx");
		Thread.sleep(2000);
		ActionUtil.type(getTypeofComplaintInpTxtBx(), sData[dff1], "Type of Complaint TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getCreditLimitTxtBx(), driver, "Credit Limit TxtBx");
		ActionUtil.type(getCreditLimitInputTxtBx(), sData[dff2], "Credit Limit Input TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(geteleModeOfRequestTxtBx(), driver, "Mode Of Request TxtBx");
		ActionUtil.type(geteleModeOfRequestInputTxtBx(), sData[dff3], "Mode Of Request InputTxtBx", driver);
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add SeperationMergerIssueComplaint dff values
	 */

	public void addDffSeperationMergerIssueComplaint(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(2500);
		System.out.println("good");
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(geteleMergerTypeofComplaintTxtBx(), driver, "Merger Type of Complaint TxtBx");
		Thread.sleep(2000);
		ActionUtil.type(geteleMergerTypeofComplaintInputTxtBx(), sData[dff1], "Type of Complaint Input TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(geteleRequestSRNumTxtBx(), driver, "Request SR Num TxtBx");
		ActionUtil.clickElement(geteleRequestSRNumTxtBxValue(), driver, "Request SR Num TxtBx Value");
		Random rnd = new Random();
		int n = 100000000 + rnd.nextInt(100000000);
		String number = n + "1";
		String srNumber = "1-" + number;
		System.out.println(srNumber);
		Thread.sleep(3000);
		ActionUtil.type(geteleRequestSRNumTxtBxValue(), srNumber, "Request SRNumber", driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add DFFNumberOrAccountActivationComplaints dff values
	 */

	public void addDFFNumberOrAccountActivationComplaintsValues(String filepath, String sheetname, String testcaseID)
			throws Exception {

		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleTypeOfFailureBx(), driver, "Type Of Failure Bx ");
		ActionUtil.type(getEleTypeOfFailureTxtBx(), sData[dff1], "Dispute on text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		String altNum1 = ActionUtil.getAttributeTitle(getEleAltContNumberBx(), driver, "Alt num");
		System.out.println(altNum1);
		Thread.sleep(3000);
		if (altNum1 == null) {

			Random rnd = new Random();
			int n = 900000000 + rnd.nextInt(100000000);
			String msisdn = n + "1";
			System.out.println(msisdn);
			Thread.sleep(3000);
			ActionUtil.clickElement(getEleAltContNumberBx(), driver, "Alt num");
			ActionUtil.type(getEleAltContNumberTxtBx(), msisdn, "Alt num Text Box", driver);
			Thread.sleep(3000);
		} else {
			ActionUtil.save(driver);
		}
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add DFFNetworkVoiceCoverageComplaints dff values
	 */

	public void addDFFNetworkVoiceCoverageComplaintsValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
		int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
		int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
		int dff8 = GenericLib.getColumnIndex(filepath, sheetname, DFF_8);
		int dff9 = GenericLib.getColumnIndex(filepath, sheetname, DFF_9);
		int dff10 = GenericLib.getColumnIndex(filepath, sheetname, DFF_10);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getTypeOfComplaintBx(), driver, "Type Of Complaint Bx ");
		ActionUtil.type(getTypeOfComplaintInputBox(), sData[dff1], "Type Of Complaint text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getLastOccuredTimeBx(), driver, "Last Occured Time Bx ");
		ActionUtil.type(getLastOccuredTimeInputBx(), sData[dff2], "Last Occured Time text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getServiceInHLRBx(), driver, "Service In HLRBx");
		ActionUtil.type(getServiceInHLRInputBx(), sData[dff3], "Service In HLRBx text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getNetworkSysmbolBx(), driver, "Network Sysmbol Bx");
		ActionUtil.type(getNetworkSysmbolInputBx(), sData[dff4], "Network Sysmbol text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getIndoorOrOutdoorBx(), driver, "Indoor Or Outdoor Bx");
		ActionUtil.type(getIndoorOrOutdoorInputBx(), sData[dff5], "Indoor Or Outdoor", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getTypeOfProbBx(), driver, "Type Of Prob Bx");
		ActionUtil.type(getTypeOfProbInputBx(), sData[dff6], "Type Of Prob Input Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getProbFloorBx(), driver, "Prob Floor Bx");
		ActionUtil.type(getProbFloorInputBx(), sData[dff7], "Prob Floor Input Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getTotalFloorsBx(), driver, "Total Floors Bx");
		ActionUtil.type(getTotalFloorsInputBx(), sData[dff8], "Total Floors Input Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getNumberOfSignalBarsBx(), driver, "Number Of Signal Bars Bx");
		ActionUtil.type(getNumberOfSignalBarsInputBx(), sData[dff9], "Number Of Signal Bars Input Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getCompleteAddressBx(), driver, "Complete Address Bx");
		ActionUtil.type(getCompleteAddressTxBx(), sData[dff10], "Complete Address Input Bx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getLastOccuredDateBx(), driver, "Last Occured Date Bx ");
		ActionUtil.clickElement(getLastOccuredDateIcon(), driver, "Last Occured Date Icon");
		ActionUtil.clickElement(getLastOccuredDateValue(), driver, "Last Occured Date Value");
		ActionUtil.clickElement(getLastOccuredDateDone(), driver, "Last Occured Date Done");
		Thread.sleep(1500);
		ActionUtil.clickElement(getAreaNameBx(), driver, "Area Name Bx ");
		ActionUtil.clickElement(getAreaNameBxDrpDwn(), driver, "Area Name Bx DrpDwn");
		Thread.sleep(3000);
		ActionUtil.scrollDown(driver);
		ActionUtil.clickElement(getAreaNameValue(), driver, "Area Name Value");
		ActionUtil.clickElement(getAreNameOK(), driver, "Area Name OK() ");

		Thread.sleep(2000);
		// String altNum1=ActionUtil.getAttributeTitle(getAltNumBx(), driver,
		// "Alt Num Bx");
		// System.out.println(altNum1);
		// Thread.sleep(3000);

		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn = n + "1";
		System.out.println(msisdn);
		Thread.sleep(3000);
		ActionUtil.clickElement(getAltNumBx(), driver, "Alt num");
		ActionUtil.clearAndType(getAltNumTxBx(), msisdn, "Alt num Text Box", driver);

		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add NumberOrAccountActivationPostpaid dff values
	 */

	public void addDFFNumberOrAccountActivationPostpaidValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getDisputOnBx(), driver, "Disput On Bx");
		ActionUtil.type(getDisputOnTxtBx(), sData[dff1], "Dispute on text box", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getTypeOfCmptBx(), driver, "Type Of Cmpt Bx");
		ActionUtil.type(getTypeOfCmptTxtBx(), sData[dff2], "Type of Complaint text box", driver);
		ActionUtil.enter(driver);
		// String altNum1=ActionUtil.getAttributeTitle(getcallBackNoBx(),
		// driver, "Alt num");
		// System.out.println(altNum1);
		// Thread.sleep(3000);

		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String msisdn = n + "1";
		System.out.println(msisdn);
		Thread.sleep(3000);
		ActionUtil.clickElement(getcallBackNoBx(), driver, "Alt num");
		ActionUtil.clearAndType(getcallBackNoTxtBx(), msisdn, "Alt num", driver);
		Thread.sleep(3000);

		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);

	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Add NetworkDataConfiguration dff values
	 */

	public void addDFFNetworkDataConfigurationValues(String filepath, String sheetname, String testcaseID)
			throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(3500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getTypeOfCptBx(), driver, "Type Of Complaint Bx");
		ActionUtil.type(getTypeOfCptTxtBx(), sData[dff1], "Type Of Cpt TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getDeviceTypeBx(), driver, "Device Type Bx");
		ActionUtil.type(getDeviceTypeTxtBx(), sData[dff2], "Device Type TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getIssueErrorBx(), driver, "Issue Error Bx");
		ActionUtil.type(getIssueErrorTxtBx(), sData[dff3], "Issue Error TxtBx", driver);
		ActionUtil.enter(driver);
		Thread.sleep(2000);
		String altNum1 = ActionUtil.getAttributeTitle(getAltNoBx(), driver, "Alt num");
		System.out.println(altNum1);
		Thread.sleep(3000);
		if (altNum1 == null) {

			Random rnd = new Random();
			int n = 900000000 + rnd.nextInt(100000000);
			String msisdn = n + "1";
			System.out.println(msisdn);
			Thread.sleep(3000);
			ActionUtil.clickElement(getAltNoBx(), driver, "Alt num");
			ActionUtil.type(getAltNoTxtBx(), msisdn, "Alt num", driver);
			Thread.sleep(3000);
		} else {
			ActionUtil.save(driver);
		}
		ActionUtil.enter(driver);
		ActionUtil.save(driver);
		Thread.sleep(10000);
	}
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Method add Push OTA Dff
	 * 
	 */

	public void validatePushOtaDffDetails(String filepath, String sheetname, String testcaseID) throws IOException, InterruptedException {
		
		Thread.sleep(1500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		Thread.sleep(1500);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		Thread.sleep(1500);
		String NtmsDeviceName = ActionUtil.gettext(eleNtmsDeviceTxt, driver, "NTMS Device");
		Thread.sleep(1500);
		String OtaEnabled = ActionUtil.gettext(eleOtaEnabledTxt, driver, "OTA Enabled");
		Thread.sleep(1500);
		String SentMode = ActionUtil.gettext(eleSentModeTxt, driver, "Sent Mode");
		Thread.sleep(1500);
		String Media = ActionUtil.gettext(eleMediaTxt, driver, "Media");
		Thread.sleep(1500);

		ActionUtil.verifyContainsText(NtmsDeviceName, sData[dff1]);
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(OtaEnabled, sData[dff2]);
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(SentMode, sData[dff3]);
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(Media, sData[dff4]);
		Thread.sleep(1500);

	}
	
	/*
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff billing payment Waivers Adjustments Discounts
	 */

	public void paymentWaiversAdjustmentsDiscountsDFFValues(String filepath, String sheetname, String testcaseID)	throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePreviousSRTxt(), driver, "Previous SR  click");
		// ActionUtil.clickElement(getEleTypeofComplaintTxt(), driver, "Type of
		// Complaint click");
		Thread.sleep(1500);
		ActionUtil.type(getElePreviousSRTxtBx(), sData[dff1], "Type Previous SR filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleDisputedAmountTxt(), driver, "Disputed Amount Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleDisputedAmountTxtBx(), sData[dff2], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2500);
	}
	
	/***********************************************************************************
	 * @author: Rana Thakur
	 * 
	 * Description: for Dff billing payment Waivers Adjustments Refund
	 */
	
	public void paymentWaiversAdjustmentsRefundDFFValues(String filepath, String sheetname, String testcaseID)	throws Exception {
		Thread.sleep(3500);
		int dff1 = GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
		Thread.sleep(1500);
		int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
		Thread.sleep(1500);
		int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
		Thread.sleep(1500);
		int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
		Thread.sleep(1500);
		int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
		Thread.sleep(1500);
		int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
		Thread.sleep(1500);
		int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
		Thread.sleep(1500);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(1500);
		
		
		ActionUtil.actionClick(getEleAdjustmentTxt(), driver, "Device filed click");
		Thread.sleep(1500);
		ActionUtil.type(getEleAdjustmentTxtBx(), sData[dff1], "Type Previous SR filed", driver);
		
		
		ActionUtil.clickElement(getElePreviousSRTxt(), driver, "Previous SR  click");
		Thread.sleep(1500);
		ActionUtil.type(getElePreviousSRTxtBx(), sData[dff2], "Type Previous SR filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		
		ActionUtil.actionClick(getEleReasonTxt(), driver, "Disputed Amount Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleReasonTxtBx(), sData[dff3], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		
		
		ActionUtil.clickElement(getAdjustmentAmountTxt(), driver, "Previous SR  click");
		Thread.sleep(1500);
		ActionUtil.type(getEleAdjustmentAmountTxtBx(), sData[dff4], "Type Previous SR filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		
		ActionUtil.clickElement(getEleCalculatedAmountTxt(), driver, "Previous SR  click");
		Thread.sleep(1500);
		ActionUtil.type(getEleCalculatedAmountTxtBx(), sData[dff5], "Type Previous SR filed", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		
		ActionUtil.actionClick(getEleAdjusPassedTxt(), driver, "Disputed Amount Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleAdjusPassedTxtBx(), sData[dff6], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		
		
		ActionUtil.actionClick(getEleIncorrectAdjustmentTxt(), driver, "Disputed Amount Click");
		Thread.sleep(1500);
		ActionUtil.type(getEleIncorrectAdjustmentTxtBx(), sData[dff7], "Type Feedback valid value", driver);
		Thread.sleep(1500);
		ActionUtil.enter(driver);
		Thread.sleep(1500);
		ActionUtil.save(driver);
		Thread.sleep(2000);
	}

}
