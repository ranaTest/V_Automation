/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Queue Page
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.TestMethodWithDataProviderMethodWorker;

import com.vil.web.library.GenericLib;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class QueuePage implements TestDataHeadingsConstants{

	WebDriver driver;

	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Queue Page || Queue Employee Screen
	 * 
	 */

	@FindBy(xpath = "//a[text()='Queue']")
	private WebElement eleQueueTab;

	public WebElement getEleQueueTab() {
		return eleQueueTab;
	}

	@FindBy(xpath = "//button[@aria-label='Queue Employee:Menu']")
	private WebElement eleQueueEmpMenuIcn;

	public WebElement getEleQueueEmpMenuIcn() {
		return eleQueueEmpMenuIcn;
	}

	@FindBy(xpath = "//button[@aria-label='Queue Employee:Menu']/..//a[contains(text(),'New Query')]")
	private WebElement eleQueueNewQueryLnk;

	public WebElement getEleQueueNewQueryLnk() {
		return eleQueueNewQueryLnk;
	}

	@FindBy(xpath = "//td[contains(@aria-describedby,'Login_Name')]")
	private WebElement eleHiddenQueueNameTxtBx;

	public WebElement getEleHiddenQueueNameTxtBx() {
		return eleHiddenQueueNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@name='Login_Name']")
	private WebElement eleQueueNameTxtBx;

	public WebElement getEleQueueNameTxtBx() {
		return eleQueueNameTxtBx;
	}
	
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement eleLeadsTab;

	public WebElement getEleLeadsTab() {
		return eleLeadsTab;
	}
	
	@FindBy(xpath = "//span[text()='Get Selected']")
	private WebElement eleGetSelectedTab;

	public WebElement getEleGetSelectedTab() {
		return eleGetSelectedTab;
	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//div[text()='Service Requests']/../..//input[@aria-label='Starting with']")
	private WebElement eleServiceRequestSearchTxtBx;

	public WebElement getEleServiceRequestSearchTxtBx() {
		return eleServiceRequestSearchTxtBx;
	}

	@FindBy(xpath = "//button[@aria-label='Service Requests:Get Selected']")
	private WebElement eleGetSelectedBtn;

	public WebElement getEleGetSelectedBtn() {
		return eleGetSelectedBtn;
	}

	@FindBy(xpath = "//a[text()='Activities']")
	private WebElement eleActivitiesBtn;

	public WebElement getEleActivitiesBtn() {
		return eleActivitiesBtn;
	}

	@FindBy(xpath = "//div[text()='Service Requests']/../..//input[@aria-label='Find']")
	private WebElement eleSeriveRequestQueryCmbBx;

	public WebElement getEleSeriveRequestQueryCmbBx() {
		return eleSeriveRequestQueryCmbBx;
	}

	public WebElement selectSRListApplet(String srType) {
		return driver.findElement(By.xpath("//li[text()='" + srType + "']"));
	}

	@FindBy(xpath = "//button[@name='s_2_1_8_0']")
	private WebElement eleServiceRequestGoIcon;

	public WebElement getEleServiceRequestGoIcon() {
		return eleServiceRequestGoIcon;
	}

	@FindBy(xpath = "//button[@name='s_2_1_17_0']")
	private WebElement eleServiceRequestNewBtn;

	public WebElement getEleServiceRequestNewBtn() {
		return eleServiceRequestNewBtn;
	}

	@FindBy(xpath = "//input[@name='s_2_1_15_0']")
	private WebElement eleActivitiesQueryCmbx;

	public WebElement getEleActivitiesQueryCmbx() {
		return eleActivitiesQueryCmbx;
	}

	public WebElement selectActivitiesListApplet(String activityType) {
		return driver.findElement(By.xpath("//li[text()='" + activityType + "']"));
	}

	public WebElement selectSRFromQueue(String srumber) {
		return driver.findElement(By.xpath("//a[text()='" + srumber + "']"));
	}

	@FindBy(xpath = "//a[text()='My Service Requests']")
	private WebElement eleMyServiceRequestsTab;

	public WebElement getEleMyServiceRequestsTab() {
		return eleMyServiceRequestsTab;
	}

	@FindBy(xpath = "//a[text()='My Activities']")
	private WebElement eleMyActivitiesTab;

	public WebElement getEleMyActivitiesTab() {
		return eleMyActivitiesTab;
	}

	 @FindBy(xpath = "//div[text()='Service Requests']/../..//input[@aria-label='Find']")
	 private WebElement eleServiceRequestSearchTypeTxtBx;
	  
	 public WebElement getEleServiceRequestSearchTypeTxtBx() {
	 return eleServiceRequestSearchTypeTxtBx;
	 }
	
	 
	
	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	 * @throws Exception 
	 * @description		: 		Re-usable methods verify create new lead
	* 
	*/
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Queue Page || Queue Employee Screen
	 * 
	 */
	
	public void serachQueueName(String queueName) throws Exception{
		
		Thread.sleep(5000);
		
		ActionUtil.clickElement(getEleQueueTab(), driver, " Queue Name");
		ActionUtil.clickElement(getEleQueueEmpMenuIcn(), driver, " Queue Settigns Icon");
		ActionUtil.clickElement(getEleQueueNewQueryLnk(), driver, " New Query");
		ActionUtil.clickElement(getEleHiddenQueueNameTxtBx(), driver, " Queue Name");
		ActionUtil.type(getEleQueueNameTxtBx(), queueName, " Queue Name Text Box", driver);
		ActionUtil.enter(driver);	
	}
	
	
	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Method to search queue name by SR number
	 * 
	 */
	public void serachQueueNameBySrNo(String queueName,String testcaseId) throws Exception {

		Thread.sleep(5000);

		ActionUtil.clickElement(getEleQueueTab(), driver, " Queue Name");
		ActionUtil.clickElement(getEleQueueEmpMenuIcn(), driver, " Queue Settigns Icon");
		ActionUtil.clickElement(getEleQueueNewQueryLnk(), driver, " New Query");
		ActionUtil.clickElement(getEleHiddenQueueNameTxtBx(), driver, " Queue Name");
		Thread.sleep(6000);

		ActionUtil.type(getEleQueueNameTxtBx(), queueName, " Queue Name Text Box", driver);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleServiceRequestSearchTypeTxtBx(), driver, "Service Request Search Type TxtBx");
		Thread.sleep(2000);
		ActionUtil.type(getEleServiceRequestSearchTypeTxtBx(), "SR #", "Service Request Search Type TxtBx", driver);
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleServiceRequestSearchTxtBx(), driver, "Service Request Search TxtBx");
		int srNO = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", DFF_1);
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath, "FST", testcaseId);
		ActionUtil.type(getEleServiceRequestSearchTxtBx(), sData[srNO], "Service Request Search TxtBx", driver);
		ActionUtil.clickElement(getEleServiceRequestGoIcon(), driver, "Service Request Go Icon");
	}
		
	/*
	 * @author:SHRUTI aGARWAL
	 * 
	 * Description: Page Objects Queue Page when multiple get selected values are present.
	 * 
	 */
	
	public void serachQueueNameByMSISDN(String queueName) throws Exception{
		
		Thread.sleep(5000);
		
		ActionUtil.clickElement(getEleQueueTab(), driver, " Queue Name");
		ActionUtil.clickElement(getEleQueueEmpMenuIcn(), driver, " Queue Settigns Icon");
		ActionUtil.clickElement(getEleQueueNewQueryLnk(), driver, " New Query");
		ActionUtil.clickElement(getEleHiddenQueueNameTxtBx(), driver, " Queue Name");
		Thread.sleep(6000);
		
		ActionUtil.type(getEleQueueNameTxtBx(), queueName, " Queue Name Text Box", driver);
		ActionUtil.enter(driver);
		ActionUtil.clickElement(getEleServiceRequestSearchTypeTxtBx(), driver, "Service Request Search Type TxtBx");
		ActionUtil.type(getEleServiceRequestSearchTypeTxtBx(), "MSISDN", "Service Request Search Type TxtBx", driver);
		ActionUtil.clickElement(getEleServiceRequestSearchTxtBx() , driver, "Service Request Search TxtBx");
		int msisdn = GenericLib.getColumnIndex(GenericLib.sTestDataFilePath, "FST", "MSISDN");
		String[] sData = GenericLib.toReadExcelData(GenericLib.sTestDataFilePath,"FST", "TC_070");
		ActionUtil.type(getEleServiceRequestSearchTxtBx(), sData[msisdn], "Service Request Search TxtBx", driver);
		ActionUtil.clickElement(getEleServiceRequestGoIcon() , driver, "Service Request Go Icon");
	}
	

}
