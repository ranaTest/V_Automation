package com.vil.web.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;

public class PushSMSPage {
	WebDriver driver;

	public PushSMSPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Push SMS Page
	 */
	@FindBy(xpath="//span[@aria-label='Selection Field' and @id='s_1_1_6_0_icon' ]")
	private WebElement EleTamplateNameDrpDn;

	public WebElement getEleTamplateNameDrpDn() {
		return EleTamplateNameDrpDn;
	}
	
	@FindBy(xpath="//div[text()='Push SMS Content']/../../../../../../..//td[4]")
	private List<WebElement> ElePushSMSContentLst;

	public List<WebElement> getElePushSMSContentLst() {
		return ElePushSMSContentLst;
	}
	
	@FindBy(xpath="//button[@title='Push SMS:Push SMS']//span[text()='Push SMS']")
	private WebElement ElePushSMSBtn;

	public WebElement getElePushSMSBtn() {
		return ElePushSMSBtn;
	}
	
	@FindBy(xpath="//button[@title='Pick Template:OK']")
	private WebElement EleOkBtn;

	public WebElement gEletOkBtn() {
		return EleOkBtn;
	}
	
	@FindBy(xpath="//td[text()='PUSH SMS To get rechg details_can be used by all users KEL Pre']")
	private WebElement elePushSMSTemplateNameLst;

	public WebElement getElePushSMSTemplateNameLst() {
		return elePushSMSTemplateNameLst;
	}

	
	
	/*******************************************************************************************************
	 * @author:Rana
	 * 
	 * Description: This method will enter the templet name and verify with Alert
	 */
	
	
	public void verifyPushSmsAlert() throws Throwable{
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleTamplateNameDrpDn(), driver, "Tamplate Name");
		//ActionUtil.waitTillPageLoad(driver, 3);
		Thread.sleep(3000);
		//ActionUtil.clickElement(getElePushSMSContentLst().get(5), driver,"Push Sms Content");
		ActionUtil.clickElement(EleOkBtn, driver, "OK");
		Thread.sleep(3000);
		//ActionUtil.waitTillPageLoad(driver, 3);
		ActionUtil.clickElement(getElePushSMSBtn(), driver, "Push SMS");
		Thread.sleep(3000);
		if(ActionUtil.isAlertPresent(driver,50)){
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			if(alert.getText().contains("Push SMS is sent from siebel")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
			}else{
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				Assert.fail();
			}
			alert.accept();
		}
}
	public String varifyPushSMSTemplateNameLst() throws Throwable{
		
		String PushSmsTemplateName=ActionUtil.gettext(EleTamplateNameDrpDn, driver, "Template NAme");
		System.out.println(PushSmsTemplateName);
		return PushSmsTemplateName;
	}
}
