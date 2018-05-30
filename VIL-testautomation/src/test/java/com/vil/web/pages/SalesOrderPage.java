/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Sales Order Page objects and re-usable methods
* @methods 			: 		
*/

package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {

	WebDriver driver;

	public SalesOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Get Status Screen
	 */
	
	@FindBy(xpath = "//input[@aria-label='Order #']")
	private WebElement eleOrderIdTxtBx;

	public WebElement getEleOrderIdTxtBx() {
		return eleOrderIdTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Order #']/../../../..//input[@aria-labelledby='Status_Label']")
	private WebElement eleOrderStatusTxtBx;

	public WebElement getEleOrderStatusTxtBx() {
		return eleOrderStatusTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Order #']/../../../..//input[@aria-label='Type']")
	private WebElement eleOrderTypeTxtBx;

	public WebElement getEleOrderTypeTxtBx() {
		return eleOrderTypeTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Created']")
	private WebElement eleCreatedTxtBx;

	public WebElement getEleCreatedTxtBx() {
		return eleCreatedTxtBx;
	}
	@FindBy(xpath = "//input[@aria-label='Currency']")
	private WebElement eleCurrencyTxtBx;

	public WebElement getEleCurrencyTxtBx() {
		return eleCurrencyTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Line Details
	 */
	
	@FindBy(xpath = "//input[@aria-label='Line #']")
	private WebElement eleLineIdTxtBx;

	public WebElement getEleLineIdTxtBx() {
		return eleLineIdTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Line #']/../../../..//input[@aria-labelledby='Status_Label']")
	private WebElement eleLineStatusTxtBx;

	public WebElement getEleLineStatusTxtBx() {
		return eleLineStatusTxtBx;
	}
	
	@FindBy(xpath = "//input[@aria-label='Line #']/../../../..//input[@aria-label='Type']")
	private WebElement eleLineTypeTxtBx;

	public WebElement getEleLineTypeTxtBx() {
		return eleLineTypeTxtBx;
	}

	@FindBy(xpath = "//input[@aria-label='Qty']")
	private WebElement eleQtyTxtBx;

	public WebElement getEleQtyTxtBx() {
		return eleQtyTxtBx;
	}
}
