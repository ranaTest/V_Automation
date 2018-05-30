/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Bulk Upload Page Objects and re-usables
* @methods 			: 		
*/

package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage {

	WebDriver driver;

	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Contact Details Page || Cantact Section
	 * 
	 */
	
	@FindBy(xpath = "//select[@aria-label='Third Level View Bar']")
	private WebElement eleThirdLevelViewBarDrpDwn;

	public WebElement getEleThirdLevelViewBarDrpDwn() {
		return eleThirdLevelViewBarDrpDwn;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_M_M']")
	private WebElement eleMMTxtBx;

	public WebElement getEleMMTxtBx() {
		return eleMMTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_First_Name']")
	private WebElement eleFirstNameTxtBx;

	public WebElement getEleFirstNameTxtBx() {
		return eleFirstNameTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Last_Name']")
	private WebElement eleLastNameTxtBx;

	public WebElement getEleLastNameTxtBx() {
		return eleLastNameTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_M_F']")
	private WebElement eleGenderTxtBx;

	public WebElement getEleGenderTxtBx() {
		return eleGenderTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Email_Address']")
	private WebElement eleEmailAddressTxtBx;

	public WebElement getEleEmailAddressTxtBx() {
		return eleEmailAddressTxtBx;
	}
	
	@FindBy(xpath = "//td[@id='1_s_1_l_Cellular_Phone__']")
	private WebElement eleCellularPhoneTxtBx;

	public WebElement getEleCellularPhoneTxtBx() {
		return eleCellularPhoneTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Contact Details Page || Contact Details Section
	 * 
	 */
	
	@FindBy(xpath = "//input[@aria-label='Salutation']")
	private WebElement eleSaluationTxtBx;

	public WebElement getEleSaluationTxtBx() {
		return eleSaluationTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='First Name']")
	private WebElement eleCDFirstNameTxtBx;

	public WebElement getEleCDFirstNameTxtBx() {
		return eleCDFirstNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Last Name']")
	private WebElement eleCDLasttNameTxtBx;

	public WebElement getEleCDLasttNameTxtBx() {
		return eleCDLasttNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Middle Name']")
	private WebElement eleCDMiddletNameTxtBx;

	public WebElement getEleCDMiddletNameTxtBx() {
		return eleCDMiddletNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Gender']")
	private WebElement eleCDGenderTxtBx;

	public WebElement getEleCDGenderTxtBx() {
		return eleCDGenderTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Date of Birth']")
	private WebElement eleCDDOBTxtBx;

	public WebElement getEleCDDOBTxtBx() {
		return eleCDDOBTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='POI Number']")
	private WebElement elePOINumberTxtBx;

	public WebElement getElePOINumberTxtBx() {
		return elePOINumberTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='POI Type']")
	private WebElement elePOITypeTxtBx;

	public WebElement getElePOITypeTxtBx() {
		return elePOITypeTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Mobile Phone #']")
	private WebElement eleMobilePhoneTxtBx;

	public WebElement getEleMobilePhoneTxtBx() {
		return eleMobilePhoneTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Alternate Contact Number']")
	private WebElement eleAlternateNumberTxtBx;

	public WebElement getEleAlternateNumberTxtBx() {
		return eleAlternateNumberTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Email Address']")
	private WebElement eleCDEmailAdressTxtBx;

	public WebElement getEleCDEmailAdressTxtBx() {
		return eleCDEmailAdressTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Preferred Communication Method']")
	private WebElement elePrefCommMethodTxtBx;

	public WebElement getElePrefCommMethodTxtBx() {
		return elePrefCommMethodTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='VAS Category']")
	private WebElement eleVASCategoryTxtBx;

	public WebElement getEleVASCategoryTxtBx() {
		return eleVASCategoryTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='VAS Sub Category']")
	private WebElement eleVASSubCategoryTxtBx;

	public WebElement getEleVASSubCategoryTxtBx() {
		return eleVASSubCategoryTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Language Spoken']")
	private WebElement eleLanguageSpokenTxtBx;

	public WebElement getEleLanguageSpokenTxtBx() {
		return eleLanguageSpokenTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Nationality']")
	private WebElement eleNationalityTxtBx;

	public WebElement getEleNationalityTxtBx() {
		return eleNationalityTxtBx;
	}

}
