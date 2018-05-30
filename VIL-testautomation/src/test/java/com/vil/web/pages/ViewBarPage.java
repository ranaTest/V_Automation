/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains View Bar Drop Downs objects
* @methods 			: 		
*/


package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBarPage {

	WebDriver driver;

	public ViewBarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Assets Page
	 * 
	 */

	@FindBy(xpath = "//select[@aria-label='Third Level View Bar']")
	private WebElement eleThirdLevelViewBarDrpDwn;

	public WebElement getEleThirdLevelViewBarDrpDwn() {
		return eleThirdLevelViewBarDrpDwn;
	}
}
