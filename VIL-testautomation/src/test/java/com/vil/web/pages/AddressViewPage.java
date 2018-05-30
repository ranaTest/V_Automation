package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vil.web.utils.TestDataHeadingsConstants;
import com.vil.web.library.GenericLib;
import com.vil.web.utils.ActionUtil;

public class AddressViewPage implements TestDataHeadingsConstants{
	
		WebDriver driver;

		public AddressViewPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		/*
		 * @author:Rana
		 * 
		 * Description: Page Objects for Address view detail Section
		 * 
		 */
		@FindBy(xpath = "//a[text()='Address']")
		private WebElement eleAddressBtn;

		public WebElement getEleAddressBtn() {
			return eleAddressBtn;
		}
		
		@FindBy(xpath = "//input[@aria-label='Address Type']")
		private WebElement eleAddressTypeTxtBx;

		public WebElement getEleAddressTypeTxtBx() {
			return eleAddressTypeTxtBx;
		}
		
		@FindBy(xpath = "//textarea[@aria-label='Address Line 1']")
		private WebElement eleAddressLine1TxtBx;

		public WebElement getEleAddressLine1TxtBx() {
			return eleAddressLine1TxtBx;
		}
		@FindBy(xpath = "//textarea[@aria-label='Address Line 2']")
		private WebElement eleAddressLine2TxtBx;

		public WebElement getEleAddressLine2TxtBx() {
			return eleAddressLine2TxtBx;
		}
		@FindBy(xpath = "//textarea[@aria-label='Landmark']")
		private WebElement eleLandmarkTxtBx;

		public WebElement getEleLandmarkTxtBx() {
			return eleLandmarkTxtBx;
		}
		@FindBy(xpath = "//input[@aria-label='State']")
		private WebElement eleStateTxtBx;

		public WebElement getEleStateTxtBx() {
			return eleStateTxtBx;
		}
		@FindBy(xpath = "//input[@aria-label='City']")
		private WebElement eleCityTxtBx;

		public WebElement getEleCityTxtBx() {
			return eleCityTxtBx;
		}
		@FindBy(xpath = "//input[@aria-label='Zip Code']")
		private WebElement eleZipCodeTxtBx;

		public WebElement getEleZipCodeTxtBx() {
			return eleZipCodeTxtBx;
		}
		
		/*
		 * @author:Rana
		 * 
		 * Description: Page Objects for Address view in billing account detail Section
		 * 
		 */
		
		@FindBy(xpath = "//a[text()='Postpaid']")
		private WebElement elePostpaidBtn;

		public WebElement getElePostpaidBtn() {
			return elePostpaidBtn;
		}
		
		
		@FindBy(xpath = "//td[contains(@aria-labelledby,'Account_Number')]")
		private WebElement eleBillAccountNumberLnkTxt;

		public WebElement getEleBillAccountNumberLnkTxt() {
			return eleBillAccountNumberLnkTxt;
		}
		
		@FindBy(xpath = "//td[contains(@id,'Address_Type')]")
		private WebElement eleBillAddressTypeTxtBx;

		public WebElement getEleBillAddressTypeTxtBx() {
			return eleBillAddressTypeTxtBx;
		}
		
		@FindBy(xpath = "//td[@id='1_s_2_l_TM_Street_Address']")
		private WebElement eleBillAddressLine1TxtBx;

		public WebElement getEleBillAddressLine1TxtBx() {
			return eleBillAddressLine1TxtBx;
		}
		@FindBy(xpath = "//td[@id='1_s_2_l_TM_Street_Address_2']")
		private WebElement eleBillAddressLine2TxtBx;

		public WebElement getEleBillAddressLine2TxtBx() {
			return eleBillAddressLine2TxtBx;
		}
		@FindBy(xpath = "//td[contains(@id,'Landmark')]")
		private WebElement eleBillLandmarkTxtBx;

		public WebElement getEleBillLandmarkTxtBx() {
			return eleBillLandmarkTxtBx;
		}
		@FindBy(xpath = "//td[contains(@id,'State')]")
		private WebElement eleBillStateTxtBx;

		public WebElement getEleBillStateTxtBx() {
			return eleBillStateTxtBx;
		}
		@FindBy(xpath = "//td[contains(@id,'City')]")
		private WebElement eleBillCityTxtBx;

		public WebElement getEleBillCityTxtBx() {
			return eleBillCityTxtBx;
		}
		@FindBy(xpath = "//td[contains(@id,'Postal')]")
		private WebElement eleBillZipCodeTxtBx;

		public WebElement getEleBillZipCodeTxtBx() {
			return eleBillZipCodeTxtBx;
		}
		
		/*
		 * @author:Rana
		 * 
		 * Description: Page Objects for Address view in accounts search
		 * 
		 */
		@FindBy(xpath = "//input[@aria-label='Account #']")
		private WebElement eleAccountNumberTxtBx;

		public WebElement getEleAccountNumberTxtBx() {
			return eleAccountNumberTxtBx;
		}
		@FindBy(xpath = "//div[@id='s_sctrl_tabScreen']/ul[1]/li[5]")
		private WebElement eleAccountsBtn;

		public WebElement getEleAccountsBtn() {
			return eleAccountsBtn;
		}
		
		@FindBy(xpath = "//input[@aria-label='Account']")
		private WebElement eleAccountTxtBx;

		public WebElement getEleAccountTxtBx() {
			return eleAccountTxtBx;
		}
		@FindBy(xpath = "//span[text()='Add & Go']")
		private WebElement eleAddGoBtn;

		public WebElement getEleAddGoBtn() {
			return eleAddGoBtn;
		}
		
		@FindBy(xpath = "//a[text()='Addresses']")
		private WebElement eleAddressViewBtn;

		public WebElement getEleAddressViewBtn() {
			return eleAddressViewBtn;
		}
		
		
		
		
		/*******************************************************************************
		 * @author:Rana Thakur
		 * 
		 * Description: This method click on Address button and check newly updated address.
		 * @throws InterruptedException 
		 */

		public void verifyAddressChange(String filepath, String sheetname, String testcaseID) throws IOException, InterruptedException{
			
			ActionUtil.clickElement(getEleAddressBtn(), driver, "Address Btn click");
			ActionUtil.scrollIntoView(driver, getEleZipCodeTxtBx());
			
			Thread.sleep(5000);
			
			String Address=ActionUtil.getAttributeValue(getEleAddressTypeTxtBx(), driver, "Address type");
			String Line1=ActionUtil.getAttributeValue(getEleAddressLine1TxtBx(), driver, "Address Line1");
			String Line2=ActionUtil.getAttributeValue(getEleAddressLine2TxtBx(), driver, "Address Line2");
			String Landmark=ActionUtil.getAttributeValue(getEleLandmarkTxtBx(), driver, "Landmark");
			String State=ActionUtil.getAttributeValue(getEleStateTxtBx(), driver, "State");
			String City=ActionUtil.getAttributeValue(getEleCityTxtBx(), driver, "City");
			String Pincode=ActionUtil.getAttributeValue(getEleZipCodeTxtBx(), driver, "Zipcode");
			
			int dff1=GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
			int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
			int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
			int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
			int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
			int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
			int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
			
			String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
			
			ActionUtil.verifyEqualsText("Address Type", Address, sData[dff1]);
			ActionUtil.verifyEqualsText("Line1", Line1, sData[dff2]);
			ActionUtil.verifyEqualsText("Line2", Line2, sData[dff3]);
			ActionUtil.verifyEqualsText("Landmark", Landmark, sData[dff4]);
			ActionUtil.verifyEqualsText("State", State, sData[dff5]);
			ActionUtil.verifyEqualsText("City", City, sData[dff6]);
			ActionUtil.verifyEqualsText("Pincode", Pincode, sData[dff7]);
		}
		
		/*******************************************************************************
		 * @author:Rana Thakur
		 * 
		 * Description: This method click on postpaid number click on account number and check newly updated address.
		 * @throws InterruptedException 
		 */
		
		public void verifyBillingAddressChange(String filepath, String sheetname, String testcaseID) throws IOException, InterruptedException{
			
			ActionUtil.clickElement(elePostpaidBtn, driver, "Postpaid bottn");
			ActionUtil.clickElement(eleBillAccountNumberLnkTxt, driver, "Account NUmber");
			Thread.sleep(5000);
			ActionUtil.clickElement(eleBillAccountNumberLnkTxt, driver, "Account NUmber");
			Thread.sleep(5000);
			String Address=ActionUtil.getAttributeValue(getEleBillAddressTypeTxtBx(), driver, "Address type");
			String Line1=ActionUtil.getAttributeValue(getEleBillAddressLine1TxtBx(), driver, "Address Line1");
			String Line2=ActionUtil.getAttributeValue(getEleBillAddressLine2TxtBx(), driver, "Address Line2");
			String Landmark=ActionUtil.getAttributeValue(getEleBillLandmarkTxtBx(), driver, "Landmark");
			String State=ActionUtil.getAttributeValue(getEleBillStateTxtBx(), driver, "State");
			String City=ActionUtil.getAttributeValue(getEleBillCityTxtBx(), driver, "City");
			String Pincode=ActionUtil.getAttributeValue(getEleBillZipCodeTxtBx(), driver, "Zipcode");
			
			int dff1=GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
			int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
			int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
			int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
			int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
			int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
			int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
			
			String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
			
			ActionUtil.verifyEqualsText("Address Type", Address, sData[dff1]);
			ActionUtil.verifyEqualsText("Line1", Line1, sData[dff2]);
			ActionUtil.verifyEqualsText("Line2", Line2, sData[dff3]);
			ActionUtil.verifyEqualsText("Landmark", Landmark, sData[dff4]);
			ActionUtil.verifyEqualsText("State", State, sData[dff5]);
			ActionUtil.verifyEqualsText("City", City, sData[dff6]);
			ActionUtil.verifyEqualsText("Pincode", Pincode, sData[dff7]);
		}
		
		/*******************************************************************************
		 * @author:Rana Thakur
		 * 
		 * Description: This method get account# from account details and click on accounts icon search for account number and check newly updated address in address view.
		 * @throws Exception 
		 */
		
		public void verifyAddressUsingAccountNo(String filepath, String sheetname, String testcaseID) throws Exception{
			
			ActionUtil.clickElement(getEleAccountNumberTxtBx(), driver,"Account#");
			String AccountNumber=ActionUtil.getAttributeValue(getEleAccountNumberTxtBx(), driver, "Account#");
			ActionUtil.clickElement(getEleAccountsBtn(), driver, "Account Tab");
			ActionUtil.type(getEleAccountTxtBx(), AccountNumber, "Enter same account number", driver);
			ActionUtil.clickElement(getEleAddGoBtn(), driver, "Click on Account & Go");
			ActionUtil.clickElement(getEleAddressViewBtn(), driver, "Click on address view tab");
			
			int dff1=GenericLib.getColumnIndex(filepath, sheetname, DFF_1);
			int dff2 = GenericLib.getColumnIndex(filepath, sheetname, DFF_2);
			int dff3 = GenericLib.getColumnIndex(filepath, sheetname, DFF_3);
			int dff4 = GenericLib.getColumnIndex(filepath, sheetname, DFF_4);
			int dff5 = GenericLib.getColumnIndex(filepath, sheetname, DFF_5);
			int dff6 = GenericLib.getColumnIndex(filepath, sheetname, DFF_6);
			int dff7 = GenericLib.getColumnIndex(filepath, sheetname, DFF_7);
			
			String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
			
			String Address;
			String Line1;
			String Line2;
			String Landmark;
			String State;
			String City;
			String Pincode;
			
//			ActionUtil.verifyEqualsText("Address Type", Address, sData[dff1]);
//			ActionUtil.verifyEqualsText("Line1", Line1, sData[dff2]);
//			ActionUtil.verifyEqualsText("Line2", Line2, sData[dff3]);
//			ActionUtil.verifyEqualsText("Landmark", Landmark, sData[dff4]);
//			ActionUtil.verifyEqualsText("State", State, sData[dff5]);
//			ActionUtil.verifyEqualsText("City", City, sData[dff6]);
//			ActionUtil.verifyEqualsText("Pincode", Pincode, sData[dff7]);
			
			
		}
}
