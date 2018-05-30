/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Sub Component Screen Page Objects
* @methods 			: 		
*/


package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubComponentPage {


	WebDriver driver;

	public SubComponentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid 360 Degree Page Heading Tabs
	 */
	
	@FindBy(xpath = "//a[@name='Product Name']")
	private WebElement eleProdctNameLst;

	public WebElement getEleProdctNameLst() {
		return eleProdctNameLst;
	}
	
	
	
	
}
