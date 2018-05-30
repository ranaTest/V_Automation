/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Activations page objects and re-usable methods
* @methods 			: 		
*/


package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class ActivationsPage implements TestDataHeadingsConstants{

	WebDriver driver;

	public ActivationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Activations Page || Lead List Screen
	 */
	
	@FindBy(xpath = "//a[text()='Activations']")
	private WebElement eleActivationsTab;

	public WebElement getEleActivationsTab() {
		return eleActivationsTab;
	}
	
	@FindBy(xpath = "//button[@title='Lead List:New']")
	private WebElement eleLeadListNewIcn;

	public WebElement getEleLeadListNewIcn() {
		return eleLeadListNewIcn;
	}
	
	@FindBy(xpath = "(//a[@name='TM Lead Num'])[1]")
	private WebElement eleLeadNumberLnkTxt;

	public WebElement getEleLeadNumberLnkTxt() {
		return eleLeadNumberLnkTxt;
	}
	
	@FindBy(xpath = "//input[@name='Owner']")
	private WebElement eleLeadOwnerTxt;

	public WebElement getEleLeadOwnerTxt() {
		return eleLeadOwnerTxt;
	}
	
	@FindBy(xpath = "(//td[contains(@id,'Lead_Status')])[1]")
	private WebElement eleLeadStatusTxt;

	public WebElement getEleLeadStatusTxt() {
		return eleLeadStatusTxt;
	}
	
	@FindBy(xpath = "(//td[contains(@id,'Lead_Channel')])[1]")
	private WebElement eleLeadChannelTxt;

	public WebElement getEleLeadChannelTxt() {
		return eleLeadChannelTxt;
	}
	
	@FindBy(xpath = "(//td[contains(@id,'Created')])[1]")
	private WebElement eleLeadCreatedTxt;

	public WebElement getEleLeadCreatedTxt() {
		return eleLeadCreatedTxt;
	}
	
	@FindBy(xpath = "(//td[contains(@id,'TM_Product_Type')])[1]")
	private WebElement eleHiddenProdTypeTxtBx;

	public WebElement getEleHiddenProdTypeTxtBx() {
		return eleHiddenProdTypeTxtBx;
	}
	
	@FindBy(xpath = "//input[contains(@id,'TM_Product_Type')]/..//span")
	private WebElement eleProdTypeDrpDwnIcn;

	public WebElement getEleProdTypeDrpDwnIcn() {
		return eleProdTypeDrpDwnIcn;
	}
	
	@FindBy(xpath = "//li[text()='New Postpaid Connection']")
	private WebElement eleNewPostpaidConnectionTxt;

	public WebElement getEleNewPostpaidConnectionTxt() {
		return eleNewPostpaidConnectionTxt;
	}
	
	@FindBy(xpath = "//li[text()='MNP']")
	private WebElement eleMNPTxt;

	public WebElement getEleMNPTxt() {
		return eleMNPTxt;
	}
		
	
	@FindBy(xpath = "(//input[contains(@id,'TM_Product_Type')])[1]")
	private WebElement eleProdTypeTxtBx;

	public WebElement getEleProdTypeTxtBx() {
		return eleHiddenProdTypeTxtBx;
	}
	
	
	
	//td[contains(@id,'Product_Type')]
	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	 * @throws Exception 
	 * @description		: 		Re-usable methods verify create new lead
	* 
	*/
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Activations Page || Lead List Screen
	 */
	public void createNewPostVodafoneLead(String filepath, String sheetname, String testcaseId) throws Exception{
		
		int userName = GenericLib.getColumnIndex(filepath, sheetname, USERNAME);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleActivationsTab(), driver, " Activations Tab");
		ActionUtil.isEleDisplayed(getEleLeadListNewIcn(), driver, " Lead  List Screen", 10);
		ActionUtil.clickElement(getEleLeadListNewIcn(), driver, " Lead  List Screen");
		String leadOwner=ActionUtil.getAttributeValue(getEleLeadOwnerTxt(), driver, " Lead Owner Textbox");
		ActionUtil.verifyEqualsText(" Lead Owner ", leadOwner, sData[userName]);
		String expLeadStatus="Interested New Lead";
		String actLeadStatus=ActionUtil.gettext(getEleLeadStatusTxt(), driver, " Lead Status Textbox");
		ActionUtil.verifyEqualsText(" Lead Status ", actLeadStatus, expLeadStatus);
		String expLeadChannel="Call Centre";
		String actLeadChannel=ActionUtil.gettext(getEleLeadChannelTxt(), driver, " Lead Channel Textbox");
		ActionUtil.verifyEqualsText(" Lead Channel ", actLeadChannel, expLeadChannel);
		String created=ActionUtil.gettext(getEleLeadCreatedTxt(), driver, " Created Text");
		ActionUtil.verifyIsNull(created, " Lead Created With Date and Time Formate");
		ActionUtil.validateDateFormate(created);
		ActionUtil.clickElement(getEleHiddenProdTypeTxtBx(), driver, " Product type List");
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleProdTypeDrpDwnIcn(), driver, " Product type List");
		ActionUtil.clickElement(getEleNewPostpaidConnectionTxt(), driver, " New Postpaid Connection Text");
		ActionUtil.save(driver);
		/*if(ActionUtil.isAlertPresent(driver, 5)){
			MyExtentListners.test.fail(MarkupHelper.createLabel("Alert! Open lead is exist", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
			throw new Exception();
		}*/
	}
}
