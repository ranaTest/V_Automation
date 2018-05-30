package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {

	WebDriver driver;

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Accounts Page || Account Details Screen
	 */
	
	@FindBy(xpath = "//input[@aria-label='Account #']")
	private WebElement eleAccNumberTxt;

	public WebElement getEleAccNumberTxt() {
		return eleAccNumberTxt;
	}
	
}
