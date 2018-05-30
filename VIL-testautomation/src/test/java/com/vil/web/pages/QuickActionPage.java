package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;

public class QuickActionPage {
	
	
	WebDriver driver;

	public QuickActionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Rana
	 * 
	 * Description: Page Objects for Quick Action Page
	 */
	@FindBy(xpath="//a[text()='Push SMS']")
	private WebElement elePushSMSBtn;	
	
	public WebElement getElePushSMSBtn() {
		return elePushSMSBtn;
	}
	
	@FindBy(xpath = "//span[text()='Act DND Full']")
	private WebElement eleActDndFullBtn;

	public WebElement getEleActDndFullBtn() {
		return eleActDndFullBtn;
	}
	
	@FindBy(xpath = "//span[text()='SIM Lost Susp']")
	private WebElement eleSimLostSuspeBtn;

	public WebElement getEleSimLostSuspeBtn() {
		return eleSimLostSuspeBtn;
	}
	
	@FindBy(xpath = "//span[text()=' Push OTA']")
	private WebElement elePushOtaBtn;

	public WebElement getElePushOtaBtn() {
		return elePushOtaBtn;
	}
	
	@FindBy(xpath = "//span[text()='Flash Deact']")
	private WebElement eleFlashDeactBtn;

	public WebElement getEleFlashDeactBtn() {
		return eleFlashDeactBtn;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Quick Action Button
	 */
	
	@FindBy(xpath = "//button[@aria-label='Quick Action Buttons:Tele Verification']")
	private WebElement eleTeleVerificationBtn;

	public WebElement getEleTeleVerificationBtn() {
		return eleTeleVerificationBtn;
	}
	
	@FindBy(xpath = "//button[@aria-label='Quick Action Buttons: Push OTA']")
	private WebElement elePushOTABtn;

	public WebElement getElePushOTABtn() {
		return elePushOTABtn;
	}
	
	
	/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: This method click will click on sim lost sups.
	 * @throws IOException 
	 */
	
	public void VarifySimLostClick() throws IOException{
		
		ActionUtil.clickElement(eleSimLostSuspeBtn, driver, "SIM LOST SUSP");
		
		if(ActionUtil.isAlertPresent(driver,30)){
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			if(alert.getText().contains("Customer Validation Failed, atleast 3 detail need to be verified (SBL-EXL-00151)")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
				
			}else if(alert.getText().contains("Open SR")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
			
			}else{
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				Assert.fail();
			}
			alert.accept();
		}
	}
	/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: This method click will click on Push OTA.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	public void varifyPushOta() throws IOException, InterruptedException{
		Thread.sleep(2500);
		ActionUtil.clickElement(elePushOtaBtn, driver, "Push OTA");
		
		Thread.sleep(5000);
		
		if(ActionUtil.isAlertPresent(driver,350)){
			Thread.sleep(1500);
			Alert alert=driver.switchTo().alert();
			Thread.sleep(2500);
			System.out.println(alert.getText());
			Thread.sleep(2500);
			if(alert.getText().contains("OTA Sent from Siebel(SBL-EXL-00151)")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
					
			}else{
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				Assert.fail();
			}
			alert.accept();
			Thread.sleep(2500);
		}
		
		
	}
	
	/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: This method click will click on Act DND.
	 * @throws IOException 
	 */
	public void varifyActFullDnd() throws IOException{
		
		ActionUtil.clickElement(eleActDndFullBtn, driver, "Act Full DND");
		
		//ActionUtil.waitTillPageLoad(driver, 300);
		
		if(ActionUtil.isAlertPresent(driver,350)){
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			if(alert.getText().contains("DND not activated")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
			}else if(alert.getText().contains("Full DND is already Active(SBL-EXL-00151)")){
					MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");	
			}else{
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				Assert.fail();
			}
			alert.accept();
		}		
	}
	
	public void varify() throws IOException{
		
		ActionUtil.clickElement(eleFlashDeactBtn, driver, "Act Full DND");
		
		if(ActionUtil.isAlertPresent(driver,350)){
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			if(alert.getText().contains("is Submitted(SBL-EXL-00151)")){
				MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");
			
			}else if(alert.getText().contains("Full DND is already Active(SBL-EXL-00151)")){
					MyExtentListners.test.pass("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is displayed");	
			}else{
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify On clicking Apply Button Successfully Alert Pop up is displayed or not || " + " On clicking Apply Button Successfully Alert Pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				Assert.fail();
			}
			alert.accept();
		}		
		
	}
	
}
