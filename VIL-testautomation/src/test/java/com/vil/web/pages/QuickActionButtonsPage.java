/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Quick Action Buttons Section Elements
* @methods 			: 		
*/


package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickActionButtonsPage {

	WebDriver driver;

	public QuickActionButtonsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
