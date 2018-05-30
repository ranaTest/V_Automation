/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains 360 degree page objects and re-usable methods
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesListPage {
	
	WebDriver driver;

	public OpportunitiesListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Opportunities List Page
	 */
	
	@FindBy(xpath = "//a[text()='Opportunities List']")
	private WebElement eleOpportunitiesListBtn;

	public WebElement getEleOpportunitiesListBtn() {
		return eleOpportunitiesListBtn;
	}
	
	@FindBy(xpath = "//input[@aria-label='Opportunity Number']")
	private WebElement eleOpportunityNumberTxtBx;

	public WebElement getEleOpportunityNumberTxtBx() {
		return eleOpportunityNumberTxtBx;
	}

	@FindBy(xpath = "//input[@aria-label='Name']")
	private WebElement eleNameTxtBx;

	public WebElement getEleNameTxtBx() {
		return eleNameTxtBx;
	}
	
	
	
	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	 * @throws 					IOException 
	* @description		: 		Re-usable methods verify Lead Status
	* 
	*/

}
