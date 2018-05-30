package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceRequestPage {

	WebDriver driver;

	public ServiceRequestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Service Request || Service Request Home || SR Information Screen
	 */
	
	@FindBy(xpath = "//input[@aria-label='SR #']")
	private WebElement eleSRxtBx;

	public WebElement getEleSRxtBx() {
		return eleSRxtBx;
	}
	
}
