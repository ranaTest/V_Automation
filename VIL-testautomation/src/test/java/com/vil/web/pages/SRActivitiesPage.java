package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.utils.ActionUtil;

public class SRActivitiesPage {
	
	WebDriver driver;

	public SRActivitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Rana
	 * 
	 * Description: Page Objects for Sr Details Page
	 */
	
	@FindBy(xpath="//a[text()='SR Activities']")
	private WebElement eleSrActivitiesBtn;	
	
	public WebElement getEleSrActivitiesBtn() {
		return eleSrActivitiesBtn;
	}
	
	@FindBy(xpath="//div[text()='SR Activities']")
	private WebElement eleSrActivitiesTxt;	
	
	public WebElement getEleSrActivitiesTxt() {
		return eleSrActivitiesTxt;
	}
	
	@FindBy(xpath="//td[text()='Message Sent']")
	private WebElement eleMessageSentTxt;	
	
	public WebElement getEleMessageSentTxt() {
		return eleMessageSentTxt;
	}
	@FindBy(xpath="//td[@class='edit-cell ui-state-disabled-cell']/..//input[@aria-labelledby='1_s_3_l_Type s_3_l_Email_Body']")
	private WebElement eleMessageTxt;	
	
	public WebElement getEleMessageTxt() {
		return eleMessageTxt;
	}
	/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: This method click will click on sr detail varification.
	 * @throws IOException 
	 */
	
	public void verifyCustomerOnOtaDetails() throws IOException{
		
		ActionUtil.clickElement(eleSrActivitiesBtn, driver, "SR Activities");
		ActionUtil.scrollIntoView(driver, eleSrActivitiesTxt);
		String SubStatus=ActionUtil.gettext(eleMessageSentTxt, driver, "Sub Status");
		String Message=ActionUtil.getAttributeValue(eleMessageTxt, driver, "Message");
		
		ActionUtil.verifyContainsText(SubStatus, "Message Sent");
		ActionUtil.verifyContainsText(Message, "Sim Lost");
		
	}

/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: This method click will click on sr detail varification.
	 * @throws IOException 
 * @throws InterruptedException 
	 */
	
	public void verifySrActivityCustomerDetails(String Sms) throws IOException, InterruptedException{
		
		ActionUtil.clickElement(getEleSrActivitiesBtn(), driver, "SR Activities");
		Thread.sleep(5000);
		ActionUtil.scrollIntoView(driver, getEleSrActivitiesTxt());
		String SubStatus=ActionUtil.gettext(getEleMessageSentTxt(), driver, "Sub Status");
		ActionUtil.verifyContainsText(SubStatus, Sms);
		String Message=ActionUtil.getAttributeValue(getEleMessageTxt(), driver, "Message");
		System.out.println(Message);
		ActionUtil.verifyContainsText(Message, Sms);
		
	}

}
