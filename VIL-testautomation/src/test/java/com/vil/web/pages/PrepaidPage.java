package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.utils.ActionUtil;

public class PrepaidPage {
	
	
	WebDriver driver;

	public PrepaidPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description:PageObjects For checks Fetch and Display for Prepaid Services - UPSS Details
	 */
	
	@FindBy(xpath = "//a[text()='Prepaid']")
	private WebElement elePrepaidBtn;

	public WebElement getElePrepaidBtn() {
		return elePrepaidBtn;
	}
	
	//a[text()='Services']
	
	@FindBy(xpath = "//a[text()='Services']")
	private WebElement eleServicesBtn;

	public WebElement getEleServicesBtn() {
		return eleServicesBtn;
	}
	
	
	/***********************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description:PageObjects For checks Fetch and Display for Prepaid Services - UPSS methods
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void verifyPrepaidServicesDetails() throws IOException, InterruptedException{
		
		
		ActionUtil.clickElement(getElePrepaidBtn(), driver, "prepaid Button");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleServicesBtn(), driver, "Services Button");
	}

}

