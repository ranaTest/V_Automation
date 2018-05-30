/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Billing Account || Addresses page
* @methods 			: 		
*/

package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAccountAddressesPage {

	WebDriver driver;

	public BillingAccountAddressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Billing Account || Addresses page
	 * 
	 */
	
	@FindBy(xpath = "//table[@summary='Addresses']//tr[@id='1']//td")
	private WebElement eleAddressDetailsLst;

	public WebElement getEleAddressDetailsLst() {
		return eleAddressDetailsLst;
	}
	
	@FindBy(xpath = "//input[@aria-label='Account Name']")
	private WebElement eleAccountNameTextBx;

	public WebElement getEleAccountNameTextBx() {
		return eleAccountNameTextBx;
	}

	@FindBy(xpath = "//input[@aria-label='Account Type']")
	private WebElement eleAccountTypeTextBx;

	public WebElement getEleAccountTypeTextBx() {
		return eleAccountTypeTextBx;
	}
	
	
}



