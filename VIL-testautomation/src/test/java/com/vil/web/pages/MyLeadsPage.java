/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains My Leads page objects and re-usable methods
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.UpdateXml;

public class MyLeadsPage {

	WebDriver driver;

	public MyLeadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for My Lead || Site Map
	 * 
	 */
	
	@FindBy(xpath = "//a[text()='Leads']/../..//a[text()='My Leads']")
	private WebElement eleMyLeadsLnkTxt;

	public WebElement getEleMyLeadsLnkTxt() {
		return eleMyLeadsLnkTxt;
	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for My Lead || Search Lead Number
	 * 
	 */
	
	@FindBy(xpath = "//button[@aria-label='Lead List:Query']")
	private WebElement eleLeadQueryIcn;

	public WebElement getEleLeadQueryIcn() {
		return eleLeadQueryIcn;
	}
	
	@FindBy(xpath = "//input[@name='TM_Lead_Number']")
	private WebElement eleQueryLeadNumberTxtBx;

	public WebElement getEleQueryLeadNumberTxtBx() {
		return eleQueryLeadNumberTxtBx;
	}
	
	@FindBy(xpath = "//td[contains(@id,'TM_Circle')]")
	private WebElement eleQueryLeadCircleTxtBx;

	public WebElement getEleQueryLeadCircleTxtBx() {
		return eleQueryLeadCircleTxtBx;
	}
	
	
	@FindBy(xpath = "//select[@name='s_vis_div']")
	private WebElement eleLeadDrpDwn;

	public WebElement getEleLeadDrpDwn() {
		return eleLeadDrpDwn;
	}
	
	@FindBy(xpath = "//input[@aria-label='Lead Number']")
	private WebElement eleLeadNumberTxtBx;

	public WebElement getEleLeadNumberTxtBx() {
		return eleLeadNumberTxtBx;
	}

	public WebElement getLeadNumberLnk(String leadNumber){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//a[contains(text(),'"+leadNumber+"')]"));
	}

	@FindBy(xpath = "//input[@aria-label='Lead Status']")
	private WebElement eleLeadStatusTxtBx;

	public WebElement getEleLeadStatusTxtBx() {
		return eleLeadStatusTxtBx;
	}

	@FindBy(id = "s_1_1_20_0_icon")
	private WebElement eleLeadStatusDrpDwnIcn;

	public WebElement getEleLeadStatusDrpDwnIcn() {
		return eleLeadStatusDrpDwnIcn;
	}

	@FindBy(xpath = "//input[@aria-label='Reason']")
	private WebElement eleReasonTxtBx;

	public WebElement getEleReasonTxtBx() {
		return eleReasonTxtBx;
	}

	@FindBy(xpath = "//button[@aria-label='Lead Details:Convert']")
	private WebElement eleConvertBtn;

	public WebElement getEleConvertBtn() {
		return eleConvertBtn;
	}

	@FindBy(xpath = "//button[@aria-label='Lead Details:Submit']")
	private WebElement eleSubmitBtn;

	public WebElement getEleSubmitBtn() {
		return eleSubmitBtn;
	}

	@FindBy(xpath = "//input[@aria-label='Customer Called Date n Time']/..//span[@aria-label='Date Time Field']")
	private WebElement eleCustCalledDateAndTimeIcn;

	public WebElement getEleCustCalledDateAndTimeIcn() {
		return eleCustCalledDateAndTimeIcn;
	}

	@FindBy(xpath = "//input[@aria-label='Opportunity']")
	private WebElement eleOpportunityTxtBx;

	public WebElement getEleOpportunityTxtBx() {
		return eleOpportunityTxtBx;
	}

	@FindBy(xpath = "//button[text()='Now']")
	private WebElement eleNowBtn;

	public WebElement getEleNowBtn() {
		return eleNowBtn;
	}

	@FindBy(xpath = "//button[text()='Done']")
	private WebElement eleDoneBtn;

	public WebElement getEleDoneBtn() {
		return eleDoneBtn;
	}

	@FindBy(xpath = "//input[@aria-label='Lead Channel']")
	private WebElement eleLeadChannelTxtBx;

	public WebElement getEleLeadChannelTxtBx() {
		return eleLeadChannelTxtBx;
	}

	@FindBy(xpath = "//select[@aria-label='First Level View Bar']")
	private WebElement eleFirstLevelViewBarDrpDwn;

	public WebElement getEleFirstLevelViewBarDrpDwn() {
		return eleFirstLevelViewBarDrpDwn;
	}

	@FindBy(xpath = "//a[text()='My Leads']")
	private WebElement eleMyLeadsBtn;

	public WebElement getEleMyLeadsBtn() {
		return eleMyLeadsBtn;
	}

	@FindBy(xpath = "//div[text()='Lead Details']/../..//input[@aria-label='Lead Owner']")
	private WebElement eleLeadOwnerTxt;

	public WebElement getEleLeadOwnerTxt() {
		return eleLeadOwnerTxt;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Lead Details Shadow elements
	 * 
	 */
	@FindBy(xpath = "//li[text()='In Progress']")
	private WebElement eleShadowInProgessBtn;

	public WebElement getEleShadowInProgessBtn() {
		return eleShadowInProgessBtn;
	}

	@FindBy(xpath = "//li[text()='Document Collection']")
	private WebElement eleDocAndCollectionBtn;

	public WebElement getEleDocAndCollectionBtn() {
		return eleDocAndCollectionBtn;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for My Leads Page || Activities Screen
	 * 
	 */

	@FindBy(xpath = "//a[text()='Activities']")
	private WebElement eleActivitiesTab;

	public WebElement getEleActivitiesTab() {
		return eleActivitiesTab;
	}

	@FindBy(xpath = "//button[@aria-label='Activities:New']")
	private WebElement eleActivitiesNewIcn;

	public WebElement getEleActivitiesNewIcn() {
		return eleActivitiesNewIcn;
	}

	@FindBy(xpath = "//td[contains(@id,'Type')]")
	private WebElement eleTypeTxt;

	public WebElement getEleTypeTxt() {
		return eleTypeTxt;
	}

	@FindBy(xpath = "//div[@class='siebui-list-textareactrl-nofocus']")
	private WebElement eleSMSOrEmailTxt;

	public WebElement getEleSMSOrEmailTxt() {
		return eleSMSOrEmailTxt;
	}

	public WebElement getEleFELeadSmsTxt(String leadId) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(
				By.xpath("//td[contains(text(),'FE Co-coordinator')]/..//div[contains(text(),'" + leadId + "')]"));
	}

	@FindBy(xpath = "//td[text()='Done']/..//a[text()='Email']/../..//div[contains(text(),'TM FE')]")
	private WebElement eleFELeadMailTxt;

	public WebElement getEleFELeadMailTxt() {
		return eleFELeadMailTxt;
	}

	@FindBy(xpath = "//td[contains(@id,'Status')]")
	private WebElement eleStatusTxt;

	public WebElement getEleStatusTxt() {
		return eleStatusTxt;
	}

	@FindBy(xpath = "//a[text()='Appointment']/../..//td[contains(@aria-labelledby,'Email_Body')]")
	private WebElement eleHiddenNewDescrTxtBx;

	public WebElement getEleHiddenNewDescrTxtBx() {
		return eleHiddenNewDescrTxtBx;
	}

	@FindBy(xpath = "//a[text()='Appointment']/../..//input[contains(@aria-labelledby,'Email_Body')]")
	private WebElement eleNewDescrTxtBx;

	public WebElement getEleNewDescrTxtBx() {
		return eleNewDescrTxtBx;
	}
	
	@FindBy(xpath = "//td[text()='Appointment']/..//td[contains(@id,'Owner')]")
	private WebElement eleAppointmentOwnBtn;

	public WebElement getEleAppointmentOwnBtn() {
		return eleAppointmentOwnBtn;
	}
	
	@FindBy(xpath = "//input[@name='Owner']/..//span")
	private WebElement eleOwnerPckApltBtn;

	public WebElement getEleOwnerPckApltBtn() {
		return eleOwnerPckApltBtn;
	}
	
	@FindBy(xpath = "(//span[text()='Pick Assigned To']/../..//td[contains(@id,'First_Name')])[2]")
	private WebElement elePickRandomOwnerBtn;

	public WebElement getElePickRandomOwnerBtn() {
		return elePickRandomOwnerBtn;
	}
	
	@FindBy(xpath = "//button[@aria-label='Pick Assigned To:OK']")
	private WebElement elePickAssignedOkBtn;

	public WebElement getElePickAssignedOkBtn() {
		return elePickAssignedOkBtn;
	}
	
	@FindBy(xpath = "//button[@aria-label='Activities:Confirm']")
	private WebElement eleActivitiesConfirmBtn;

	public WebElement getEleActivitiesConfirmBtn() {
		return eleActivitiesConfirmBtn;
	}
	
	@FindBy(xpath = "//td[text()='SMS']/..//div[contains(text(),'Dear FOS')]")
	private WebElement eleFOSNotificationTxt;

	public WebElement getEleFOSNotificationTxt() {
		return eleFOSNotificationTxt;
	}
	
	@FindBy(xpath = "	//td[text()='SMS']/..//div[contains(text(),'Dear Customer')]")
	private List<WebElement> eleCustSMSLst;

	public List<WebElement> getEleCustSMSLst() {
		return eleCustSMSLst;
	}
	
	@FindBy(xpath = "//td[text()='SMS']/..//div[contains(text(),'Dear FOS')]")
	private List<WebElement> eleFOSNotificationLst;

	public List<WebElement> getEleFOSNotificationLst() {
		return eleFOSNotificationLst;
	}
	
	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws IOException
	 * @throws InterruptedException
	 * @description : Re-usable methods verify Lead Status
	 * 
	 */
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for My Lead || click on Lead Number
	 * 
	 */
	
	public void clickOnLeadNumber(String leadNumber) throws Exception{
		Thread.sleep(5000);
		ActionUtil.clickElement(InitializePages.o_myLeadsPage.getEleQueryLeadCircleTxtBx(), driver, "");
		Thread.sleep(1000);
		ActionUtil.clickElement(InitializePages.o_myLeadsPage.getLeadNumberLnk(leadNumber.trim()), driver, "Lead Number");
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for My Lead || Lead Details Section
	 * 
	 */

	public void searchLeadNumber(String leadNumber) throws Exception{
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleLeadQueryIcn(), driver, " Lead List Query Icon");
		Thread.sleep(2000);
		ActionUtil.type(getEleQueryLeadNumberTxtBx(), leadNumber, " Lead Number", driver);
		ActionUtil.enter(driver);
		
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to navigaate My Leads screen
	 * 
	 */

	public void navigateToMyLeadsScreen(WebDriver driver) throws Exception {

		Thread.sleep(5000);
		ActionUtil.waitForElement(InitializePages.o_simulatorPage.getEleSiteMapIcn(), driver, " Site Map Icon ", 2);
		ActionUtil.clickElement(InitializePages.o_simulatorPage.getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(InitializePages.o_simulatorPage.getEleCAFFormSearchTxtBx(), "Leads", "Simulator Under Administration - Business Service",
				driver);
		ActionUtil.clickElement(getEleMyLeadsLnkTxt(), driver, " My Leads Link Text");	
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to navigaate My Leads screen
	 * 
	 */

	public void navigateToAllLeadOrgScreen(WebDriver driver) throws Exception {

		Thread.sleep(5000);
		ActionUtil.waitForElement(InitializePages.o_simulatorPage.getEleSiteMapIcn(), driver, " Site Map Icon ", 2);
		ActionUtil.clickElement(InitializePages.o_simulatorPage.getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(InitializePages.o_simulatorPage.getEleCAFFormSearchTxtBx(), "Leads", "Simulator Under Administration - Business Service",
				driver);
		ActionUtil.clickElement(getEleMyLeadsLnkTxt(), driver, " My Leads Link Text");
		Thread.sleep(5000);
		ActionUtil.selectbyVisibletext(driver, getEleLeadDrpDwn(), "All Leads across Organizations");	
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify Lead Status
	 * 
	 */

	public void verifyLeadStatus(String leadStatus) throws IOException, InterruptedException {
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleLeadStatusTxtBx(), driver, " Lead Status Text Box ");
		String sLeadStatus = ActionUtil.getAttributeValue(getEleLeadStatusTxtBx(), driver, "Lead Status Text Box ");
		ActionUtil.verifyEqualsText(" Lead Status ", sLeadStatus, leadStatus);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify Lead Status
	 * 
	 */

	public void changeLeadStatus(String leadStatus) throws Exception {

		Thread.sleep(5000);
		getEleLeadStatusTxtBx().clear();
		ActionUtil.type(getEleLeadStatusTxtBx(), leadStatus, " Lead Status Text Box", driver);
		ActionUtil.clickElement(getEleSubmitBtn(), driver, " Submit Buttom");

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify Customer Called Date and Time Alert pop up
	 * 
	 */

	public void verifyLeadAlertPopUp(String alertText) throws Exception {

		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains(alertText)) {
				MyExtentListners.test
						.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is displayed");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || "
								+ " On clicking Apply Button Successfully Alert Pop up is not displayed",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleShadowInProgessBtn()));
				Assert.fail();
			}
			alert.accept();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to add Customer Called Date and time
	 * 
	 */
	public void chooseCustCalledDateTime() throws IOException, InterruptedException {
		Thread.sleep(3000);
		ActionUtil.clickElement(getEleCustCalledDateAndTimeIcn(), driver, " Date Time Field Icn");
		ActionUtil.clickElement(getEleNowBtn(), driver, " Now Button");
		ActionUtil.clickElement(getEleDoneBtn(), driver, " Done Button");

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to add Lead Status and Reason
	 * 
	 */
	public void addLeadDetails(String leadStatus, String reason) throws Exception {
		Thread.sleep(3000);
		getEleLeadStatusTxtBx().clear();
		ActionUtil.type(getEleLeadStatusTxtBx(), leadStatus, " Lead Status Text Box", driver);
		getEleReasonTxtBx().clear();
		ActionUtil.type(getEleReasonTxtBx(), reason, " Reason ", driver);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to add Lead Status and Reason
	 * 
	 */
	public void changeReason(String reason) throws Exception {
		Thread.sleep(5000);
		getEleReasonTxtBx().clear();
		ActionUtil.type(getEleReasonTxtBx(), reason, " Reason ", driver);
	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify SMS notification
	 * 
	 */

	public void verifySMSNotification(String leadNumber, String type) throws IOException, InterruptedException {
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleActivitiesTab(), driver, " Activities Tab");
		Thread.sleep(5000);
		String smsTypeTxt = ActionUtil.gettext(getEleSMSOrEmailTxt(), driver, "SMS/Email Text box");
		ActionUtil.verifyContainsText(smsTypeTxt, leadNumber);
		String actType = ActionUtil.gettext(getEleTypeTxt(), driver, "Type Text box");
		ActionUtil.verifyEqualsText(" Notification Type ", actType, type);

	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify SMS notification
	 * 
	 */
	
	public void changeAppointmentOwner(WebDriver driver) throws InterruptedException, IOException{
		
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleActivitiesTab(), driver, " Activities Button");
		ActionUtil.clickElement(getEleAppointmentOwnBtn(), driver, " Owner button");
		ActionUtil.clickElement(getEleOwnerPckApltBtn(), driver, " Owner Pick Applet");
		Thread.sleep(2000);
		ActionUtil.clickElement(getElePickRandomOwnerBtn(), driver, " ");
		ActionUtil.clickElement(getElePickAssignedOkBtn(), driver, " Ok button");
	}

}