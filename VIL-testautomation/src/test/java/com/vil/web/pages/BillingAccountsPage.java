package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAccountsPage {

	WebDriver driver;

	public BillingAccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Billing Accounts || Billing List screen
	 * 
	 */

	@FindBy(xpath = "//input[@aria-labelledby='Account_Number_Label']")
	private WebElement eleAccountNumberTxt;

	public WebElement getEleAccountNumberTxt() {
		return eleAccountNumberTxt;
	}
	
	@FindBy(xpath = "//input[@aria-labelledby='Name_Label']")
	private WebElement eleNameTxt;

	public WebElement getEleNameTxt() {
		return eleNameTxt;
	}
	@FindBy(xpath = "//input[@aria-labelledby='AccountTypeCode_Label']")
	private WebElement eleAccountTypeTxt;

	public WebElement getEleAccountTypeTxt() {
		return eleAccountTypeTxt;
	}
	
	
}
