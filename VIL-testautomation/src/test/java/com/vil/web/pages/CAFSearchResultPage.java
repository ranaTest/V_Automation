/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for CAF Search Results 
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.By;
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

public class CAFSearchResultPage implements TestDataHeadingsConstants {

	WebDriver driver;

	public CAFSearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Search For Simulator
	 */

	@FindBy(xpath = "//li[@name='SiteMap']")
	private WebElement eleSiteMapIcn;

	public WebElement getEleSiteMapIcn() {
		return eleSiteMapIcn;
	}

	@FindBy(id = "sitemapFilterInput")
	private WebElement eleCAFFormSearchTxtBx;

	public WebElement getEleCAFFormSearchTxtBx() {
		return eleCAFFormSearchTxtBx;
	}

	@FindBy(xpath = "//a[text()='CAF Master']/../..//a[text()='CAF']")
	private WebElement eleCAFLnkTxt;

	public WebElement getEleCAFLnkTxt() {
		return eleCAFLnkTxt;
	}

	@FindBy(xpath = "//button[@title='CAF Master:Query']")
	private WebElement eleCAFSearchIcn;

	public WebElement getEleCAFSearchIcn() {
		return eleCAFSearchIcn;
	}

	@FindBy(xpath = "//td[contains(@aria-describedby,'CAF_Id')]")
	private WebElement eleHiddenCAFIdTxtBx;

	public WebElement getEleHiddenCAFIdTxtBx() {
		return eleHiddenCAFIdTxtBx;
	}
	@FindBy(name = "CAF_Id")
	private WebElement eleCAFIdTxtBx;

	public WebElement getEleCAFIdTxtBx() {
		return eleCAFIdTxtBx;
	}

	@FindBy(xpath = "//button[@name='s_1_1_7_0']")
	private WebElement eleCAFMatserGoBtn;

	public WebElement getEleCAFMatserGoBtn() {
		return eleCAFMatserGoBtn;
	}

	@FindBy(xpath = "//button[@title='CAF Master:Query Assistant']/..//span[text()='No Records']")
	private WebElement eleNoRecordsTxtBx;

	public WebElement getEleNoRecordsTxtBx() {
		return eleNoRecordsTxtBx;
	}

	@FindBy(xpath = "//input[@name='CAF_Id']/../../../..//td[@id='1_s_1_l_CPOS_Request_Id']")
	private WebElement eleHiddenCposRequestIdBtn;

	public WebElement getEleHiddenCposRequestIdBtn() {
		return eleHiddenCposRequestIdBtn;
	}

	@FindBy(name = "CPOS_Request_Id")
	private WebElement eleCPosRequestIdTxtBx;

	public WebElement getEleCPosRequestIdTxtBx() {
		return eleCPosRequestIdTxtBx;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Search For CAF Master
	 */

	@FindBy(xpath = "//span[@class='screenName2']/..//a[text()='CAF Master']")
	private WebElement eleCAFMasterLnkTxt;

	public WebElement getEleCAFMasterLnkTxt() {
		return eleCAFMasterLnkTxt;
	}

	@FindBy(xpath = "//td[contains(@id,'1_l_Status')]")
	private WebElement eleCAFIdStatusTxt;

	public WebElement getEleCAFIdStatusTxt() {
		return eleCAFIdStatusTxt;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Run Process Code
	 */
	
	@FindBy(xpath = "//button[@aria-label='CAF Master:Process']")
	private WebElement eleCAFMasterProcessBtn;

	public WebElement getEleCAFMasterProcessBtn() {
		return eleCAFMasterProcessBtn;
	}
	
	public WebElement getEleCAFIdRow(String cafid){
		return driver.findElement(By.xpath("//td[text()='"+cafid+"']"));
	}
	
	public WebElement getEleCAFIdStatus(String cafid){
		return driver.findElement(By.xpath("//td[text()='"+cafid+"']/..//td[contains(@id,'Status')"));
	}
	
	
	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws Exception
	 * @description : Re-usable methods to validate CAF id , CPOS Id
	 * 
	 */

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to validate CAF id is unique or not
	 */

	public void validateCAFId(String cafId) throws Exception {
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.clickElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(getEleCAFFormSearchTxtBx(), "CAF", "CAF Form Search Text Box", driver);
		ActionUtil.clickElement(getEleCAFLnkTxt(), driver, " 'CAF Link Text' Under CAF Master Section");
		ActionUtil.scrollUp(driver);
		ActionUtil.clickElement(getEleCAFSearchIcn(), driver, " CAF Master : Query Search Icon");
		ActionUtil.clickElement(getEleHiddenCAFIdTxtBx(), driver, " CAF id textbox");
		ActionUtil.type(getEleCAFIdTxtBx(), cafId, "CAF Id Text Box", driver);
		ActionUtil.clickElement(getEleCAFMatserGoBtn(), driver, "CAF Master : Go Icon");
		ActionUtil.isEleDisplayed(getEleNoRecordsTxtBx(), driver, " No Records : CAF id is unique",10);
	
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to validate CPOS id is unique or not
	 */

	public void validateCPOSId(String cposId) throws Exception {

		Thread.sleep(5000);
		ActionUtil.clickElement(getEleCAFSearchIcn(), driver, " CAF Master : Query Search Icon");
		//ActionUtil.clickElement(getEleHiddenCposRequestIdBtn(), driver, " CPOS request Id");
		Thread.sleep(2000);
		ActionUtil.type(getEleCPosRequestIdTxtBx(), cposId, "CPOS request Id Text Box", driver);
		ActionUtil.clickElement(getEleCAFMatserGoBtn(), driver, "CAF Master : Go Icon");
		ActionUtil.isEleDisplayed(getEleNoRecordsTxtBx(), driver, " No Records : CPOS id ",10);
	}

	/*
	 * @author: Srinivas Hippargi
	 * 
	 * Description: Method to validate CAF id is Status is success or not
	 */

	public void validateCAFIdStatus(String cafId) throws Exception {
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.clickElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(getEleCAFFormSearchTxtBx(), "CAF Master", "CAF Form Search Text Box", driver);
		ActionUtil.waitForElement(getEleCAFMasterLnkTxt(), driver, " CAF Master Link Text' Under CAF Master Section ");
		ActionUtil.clickElement(getEleCAFMasterLnkTxt(), driver, " 'CAF Master Link Text' Under CAF Master Section");
		Thread.sleep(10000);
		ActionUtil.scrollUp(driver);
		ActionUtil.clickElement(getEleCAFSearchIcn(), driver, " CAF Master : Query Search Icon");
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleHiddenCAFIdTxtBx(), driver, " CAF Id Text Box ");
		ActionUtil.type(getEleCAFIdTxtBx(), cafId, "CAF Id Text Box", driver);
		ActionUtil.clickElement(getEleCAFMatserGoBtn(), driver, "CAF Master : Go Icon");
		Thread.sleep(15000);
		ActionUtil.scrollIntoView(driver, getEleCAFIdStatusTxt());
		String cafIdStatus=ActionUtil.gettext(getEleCAFIdStatusTxt(), driver, " CAF Id status");
		System.out.println("-----------------" + cafIdStatus);
		if (cafIdStatus.equalsIgnoreCase("Success")) {
			MyExtentListners.test.info(MarkupHelper
					.createLabel("CAF id Status is Sucess : MSISDN has been created", ExtentColor.TEAL));
		} else {
			
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"CAF id Status is " + cafIdStatus + " : MSISDN has not been created", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleCAFIdStatusTxt()));
			//throw new Exception();
		}
		
		/*int count=4;
		while (count > 0) {
			try {
				if (cafIdStatus.equalsIgnoreCase("Success")) {
					MyExtentListners.test.info(MarkupHelper
							.createLabel("CAF id Status is Sucess : MSISDN has been created", ExtentColor.TEAL));
					Thread.sleep(50000);
					break;
				} else {
					MyExtentListners.test.fail(MarkupHelper.createLabel(
							"CAF id Status is " + cafIdStatus + " : MSISDN has not been created", ExtentColor.RED));

					MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleCAFIdStatusTxt()));
					throw new Exception();
				}
			} catch (Exception e) {
				count=count-1;
				Thread.sleep(50000);
				ActionUtil.clickElement(getEleCAFSearchIcn(), driver, " CAF Master : Query Search Icon");
				ActionUtil.type(getEleCAFIdTxtBx(), sData[cafid], "CAF Id Text Box", driver);
				ActionUtil.clickElement(getEleCAFMatserGoBtn(), driver, "CAF Master : Go Icon");
				cafIdStatus = ActionUtil.gettext(getEleCAFIdStatusTxt(), driver, " CAF Id status");
			}
		}*/
		
		
		
	}
	

	/*
	 * @author: Srinivas Hippargi
	 * 
	 * Description: Method to validate || On clicking Process button CAF id is Status is success or not
	 */

	public void verifyProcessCafIdStatus(String cafId) throws Exception{
		ActionUtil.waitForElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.clickElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.waitForElement(getEleCAFIdRow(cafId), driver, " CAF id " + cafId);
		ActionUtil.clickElement(getEleCAFIdRow(cafId), driver, " CAF id " + cafId);
		ActionUtil.clickElement(getEleCAFMasterProcessBtn(), driver, " Process button");
		if(ActionUtil.isAlertPresent(driver, 300000)){
			driver.switchTo().alert().accept();
		}else{
			throw new Exception();
		}
		/*String status=ActionUtil.gettext(getEleCAFIdStatus(cafId), driver, " Status");
		if(status.equalsIgnoreCase("Success")){
			MyExtentListners.test.info(MarkupHelper.createLabel("CAF id Status is 'Sucess' : MSISDN has been created" , ExtentColor.TEAL));
		}else{
			MyExtentListners.test.fail(MarkupHelper.createLabel("CAF id Status is " + status + " : MSISDN has not been created", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleCAFIdStatusTxt()));
			throw new Exception();
		}*/
	}

}
