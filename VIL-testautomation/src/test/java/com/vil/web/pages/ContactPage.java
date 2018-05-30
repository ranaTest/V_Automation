/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains page objects and re-usable methods for contact page 
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class ContactPage implements TestDataHeadingsConstants{

	WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects Contact Screen
	 */
	
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement eleConatctTab;

	public WebElement getEleConatctTab() {
		return eleConatctTab;
	}
	
	@FindBy(xpath = "//a[text()='All Contacts']")
	private WebElement eleAllConatctLnkTxt;

	public WebElement getEleAllConatctLnkTxt() {
		return eleAllConatctLnkTxt;
	}
	
	@FindBy(xpath = "//button[@aria-label='Contacts:Go']")
	private WebElement eleContactsGoIcn;

	public WebElement getEleContactsGoIcn() {
		return eleContactsGoIcn;
	}
	
	@FindBy(xpath = "//button[@aria-label='Contacts:Query']")
	private WebElement eleCotactsSearchIcn;

	public WebElement getEleCotactsSearchIcn() {
		return eleCotactsSearchIcn;
	}
	
	@FindBy(xpath = "//button[@aria-label='Contacts:New']")
	private WebElement eleNewConatctIcn;

	public WebElement getEleNewConatctIcn() {
		return eleNewConatctIcn;
	}
	
	@FindBy(xpath = "//input[@aria-label='Last Name']")
	private WebElement eleLastNameTxtBx;

	public WebElement getEleLastNameTxtBx() {
		return eleLastNameTxtBx;
	}
	
	public WebElement selectLastNameLnkTxt(String lastName){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//div[text()='Last Name']/../../../../../../..//a[text()='"+lastName+"']"));
	}
	
	@FindBy(xpath = "//input[@aria-label='First Name']")
	private WebElement eleFirstNameTxtBx;

	public WebElement getEleFirstNameTxtBx() {
		return eleFirstNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Address']")
	private WebElement eleAddressTxtBx;

	public WebElement getEleAddressTxtBx() {
		return eleAddressTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Email']")
	private WebElement eleEmailTxtBx;

	public WebElement getEleEmailTxtBx() {
		return eleEmailTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Mobile Phone #']")
	private WebElement eleMobilePhoneTxtBx;

	public WebElement getEleMobilePhoneTxtBx() {
		return eleMobilePhoneTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Alternate Contact Number']")
	private WebElement eleAltNumberTxtBx;

	public WebElement getEleAltNumberTxtBx() {
		return eleAltNumberTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects Contact Page || More Info Screen
	 */
	
	@FindBy(xpath = "//a[text()='More Info']")
	private WebElement eleMoreInfoTab;

	public WebElement getEleMoreInfoTab() {
		return eleMoreInfoTab;
	}
	
	@FindBy(xpath = "//input[@aria-label='Contact Status']")
	private WebElement eleConatctStatusTxtBx;

	public WebElement getEleConatctStatusTxtBx() {
		return eleConatctStatusTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects create conatct for non vodafone
	 */
	
	public void createContact(WebDriver driver) throws Exception{
		
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleConatctTab(), driver, " Contact Tab");
		ActionUtil.clickElement(getEleAllConatctLnkTxt(), driver, " All Contacts Link");
		ActionUtil.clickElement(getEleContactsGoIcn(), driver, "  Conatct Go icon");
		ActionUtil.clickElement(getEleNewConatctIcn(), driver, " Conatact Search Icon");
		Thread.sleep(5000);
		Random rnd1 = new Random();
		int n1 = 100 + rnd1.nextInt(900);
		ActionUtil.type(getEleLastNameTxtBx(), "Hippargi" +n1, " Last Name Textbox", driver);
		ActionUtil.type(getEleFirstNameTxtBx(), "Srinivas" + n1, " First Name Textbox", driver);
		Random rnd = new Random();
		int n = 900000000 + rnd.nextInt(100000000);
		String mobileNumber= n + "1";
		ActionUtil.type(getEleMobilePhoneTxtBx(), mobileNumber, " Last Name Textbox", driver);
		ActionUtil.type(getEleAltNumberTxtBx(),(n-1) + "", " Last Name Textbox", driver);
		ActionUtil.type(getEleAddressTxtBx(), "Bangalore" + n1, " Last Name Textbox", driver);
		ActionUtil.save(driver);
		Thread.sleep(5000);
		ActionUtil.clickElement(selectLastNameLnkTxt( "Hippargi" +n1), driver, " Last Name Link");
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Conatct Page || Lead List Screen
	 */
	public void craeteNonVodPostLead(String filepath, String sheetname, String testcaseId) throws Exception{
		
		Thread.sleep(5000);
		int userName = GenericLib.getColumnIndex(filepath, sheetname, USERNAME);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		ActionUtil.isEleDisplayed(InitializePages.o_activationsPage.getEleLeadListNewIcn(), driver, " Lead  List Screen", 10);
		ActionUtil.clickElement(InitializePages.o_activationsPage.getEleLeadListNewIcn(), driver, " Lead  List Screen");
		ActionUtil.clickElement(InitializePages.o_activationsPage.getEleHiddenProdTypeTxtBx(), driver, " Product type List");
		Thread.sleep(5000);
		ActionUtil.clickElement(InitializePages.o_activationsPage.getEleProdTypeDrpDwnIcn(), driver, " Product type List");
		ActionUtil.clickElement(InitializePages.o_activationsPage.getEleMNPTxt(), driver, " MNPText");
		ActionUtil.save(driver);
		/*if(ActionUtil.isAlertPresent(driver, 5)){
			MyExtentListners.test.fail(MarkupHelper.createLabel("Alert Text! Open lead is alreday is exist", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
		}*/
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to verify Contact Status
	 */
	
	public void verifyContactStatus(String status) throws InterruptedException, IOException{
		
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleMoreInfoTab(), driver, " More Info Tab");
		String actStatus=ActionUtil.getAttributeValue(getEleConatctStatusTxtBx(), driver, " Contact Status");
		ActionUtil.verifyEqualsText(" Contact Status ", actStatus, status);
	}
}
