/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Billing Accounts Page
* @methods 			: 		
*/

package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAccountPage {

	WebDriver driver;

	public BillingAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Billing Account Page
	 * 
	 */
	@FindBy(xpath = "//a[text()='Billing Account']")
	private WebElement eleBillingAccountTab;

	public WebElement getEleBillingAccountTab() {
		return eleBillingAccountTab;
	}

	@FindBy(xpath = "//a[@name='Account Number']")
	private WebElement eleAccountNumberLnk;

	public WebElement getEleAccountNumberLnk() {
		return eleAccountNumberLnk;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Name']")
	private WebElement eleAccountNameTxtBx;

	public WebElement getEleAccountNameTxtBx() {
		return eleAccountNameTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Account_Type_Code']")
	private WebElement eleAccountTypeCodeTxtBx;

	public WebElement getEleAccountTypeCodeTxtBx() {
		return eleAccountTypeCodeTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Customer_Type']")
	private WebElement eleCustomerTypeTxtBx;

	public WebElement getEleCustomerTypeTxtBx() {
		return eleCustomerTypeTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Market_Class']")
	private WebElement eleCustomerSubTypeTxtBx;

	public WebElement getEleCustomerSubTypeTxtBx() {
		return eleCustomerSubTypeTxtBx;
	}
	@FindBy(xpath = "//td[@id='1_s_1_l_Market_Type']")
	private WebElement eleCustomerSegmentTxtBx;

	public WebElement getEleCustomerSegmentTxtBx() {
		return eleCustomerSegmentTxtBx;
	}
	
	@FindBy(xpath = "//a[@name='Parent Account Name']")
	private WebElement eleParentAccNameTxtBx;

	public WebElement getEleParentAccNameTxtBx() {
		return eleParentAccNameTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_TM_Credit_Limit']")
	private WebElement eleCreditLimitTxtBx;

	public WebElement getEleCreditLimitTxtBx() {
		return eleCreditLimitTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Account_Status']")
	private WebElement eleAccountStatusTxtBx;

	public WebElement getEleAccountStatusTxtBx() {
		return eleAccountStatusTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Sales_Rep']")
	private WebElement eleAMRMNameTxtBx;

	public WebElement getEleAMRMNameTxtBx() {
		return eleAMRMNameTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_TM_Credit_Status']")
	private WebElement eleCreditStatusTxtBx;

	public WebElement getEleCreditStatusTxtBx() {
		return eleCreditStatusTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_TM_FA_Id']")
	private WebElement eleFAIdTxtBx;

	public WebElement getEleFAIdTxtBx() {
		return eleFAIdTxtBx;
	}
	
}