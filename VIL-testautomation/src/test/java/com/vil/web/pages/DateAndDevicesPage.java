package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.utils.ActionUtil;

public class DateAndDevicesPage {

	WebDriver driver;

	public DateAndDevicesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Date and device objects
	 */

	@FindBy(xpath = "//a[text()='Data & Devices']")
	private WebElement eleDataDevicesBtn;

	public WebElement getEleDataDevicesBtn() {
		return eleDataDevicesBtn;
	}

	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws IOException 
	 * @throws Exception
	 * @description : checks Fetch and Display for NTMS Device Details
	 * 
	 */
	
	public void ntmsDevicesDetails() throws IOException{
		
		ActionUtil.clickElement(getEleDataDevicesBtn(), driver, "Date and Device Button click");
		
		
		
		
		
		
	}
	
	
	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws IOException 
	 * @throws Exception
	 * @description : checks Fetch and Display for Data Packs RECC Details
	 * 
	 */
	
	public void dataPacksRECCDetails() throws IOException{
		
		ActionUtil.clickElement(getEleDataDevicesBtn(), driver, "Date and Device Button click");
		
		
		
		
		
		
	}

}
