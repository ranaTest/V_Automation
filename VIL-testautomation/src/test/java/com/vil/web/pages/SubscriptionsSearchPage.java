
/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for SubscriptionsSearch Page
* @methods 			: 		addMSISDN(),verify360DegreePage(),verifyIndicatorsValues()
*/

package com.vil.web.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class SubscriptionsSearchPage implements TestDataHeadingsConstants {

	WebDriver driver;

	public SubscriptionsSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Subscription page
	 */

	@FindBy(id = "srch_toolbar_option")
	private WebElement eleSubsSerachIcn;

	public WebElement getEleSubsSerachIcn() {
		return eleSubsSerachIcn;
	}

	@FindBy(id = "ui-id-178")
	private WebElement eleHomeBtn;

	public WebElement getEleHomeBtn() {
		return eleHomeBtn;
	}

	@FindBy(className = "siebui-salutation-title")
	private WebElement eleHomePageTxt;

	public WebElement getEleHomePageTxt() {
		return eleHomePageTxt;
	}

	@FindBy(xpath = "//a[contains(text(),'Subscriptions - Search')]")
	private WebElement eleSubsSerachBtn;

	public WebElement getEleSubsSerachBtn() {
		return eleSubsSerachBtn;
	}

	@FindBy(name = "s_1_2_19_0")
	private WebElement eleMSISDNTxtFld;

	public WebElement getEleMSISDNTxtFld() {
		return eleMSISDNTxtFld;
	}

	@FindBy(name = "s_1_1_1_0")
	private WebElement eleMsisdnSearchGOIcn;

	public WebElement getEleMsisdnSearchGOIcn() {
		return eleMsisdnSearchGOIcn;
	}

	@FindBy(xpath = "//input[@name='s_1_1_70_0']")
	private WebElement eleMsisdnSearchErrorMsg;

	public WebElement getEleMsisdnSearchErrorMsg() {
		return eleMsisdnSearchErrorMsg;
	}

	@FindBy(xpath = "//a[text()='360 Degree']")
	private WebElement ele360DegreeBtn;

	public WebElement getEle360DegreeBtn() {
		return ele360DegreeBtn;
	}

	/*
	 * @author:Arushi Sharma
	 * 
	 * Description: Page Objects for Subscription page for MISISDN status
	 * 
	 */
	@FindBy(xpath = "//td[@title='Active']")
	private WebElement eleMsisdnSearchActiveStatus;

	public WebElement eleMsisdnSearchActiveStatus() {
		return eleMsisdnSearchActiveStatus;
	}
	
	@FindBy(xpath = "//td[@title='Inactive']")
	private WebElement eleMsisdnSearchInactiveStatus;

	public WebElement eleMsisdnSearchInactiveStatus() {
		return eleMsisdnSearchInactiveStatus;
	}

	@FindBy(xpath ="//td[@title='Inactive']/..//a[@name='Asset Number']")
	private WebElement eleInActiveStatusAssetNumber;

	public WebElement getEleInActiveStatusAssetNumber() {
		return eleInActiveStatusAssetNumber;
	}
	

	@FindBy(xpath ="//td[@title='Active']/..//a[@name='Asset Number']")
	private WebElement eleActiveStatusAssetNumber;

	public WebElement getEleActiveStatusAssetNumber() {
		return eleActiveStatusAssetNumber;
	}

	@FindBy(xpath ="//a[text()='Subscription Search Result:9619008139']")
	private WebElement eleSubscriptionSearchResult;

	public WebElement getEleSubscriptionSearchResult() {
		return eleSubscriptionSearchResult;
	}

	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @description : Re-usable methods for searchMSISDN, verify360DegreePage
	 *              and verifyIndicatorsValues
	 * 
	 */

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method adds the msisdn and clicks on go icon
	 */

	public void searchMSISDN(String filepath, String sheetname, String testcaseID) throws Exception {

		int msisdn = GenericLib.getColumnIndex(filepath, sheetname, MSISDN);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleSubsSerachBtn(), driver, " Subscription Search Button",1);
	
		ActionUtil.clickElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
		ActionUtil.type(getEleMSISDNTxtFld(), sData[msisdn], " MSISDN Search text field ", driver);
		ActionUtil.clickElement(getEleMsisdnSearchGOIcn(), driver, " Subscription Search Go Icon ");
		ActionUtil.waitForElement(getEle360DegreeBtn(), driver, " 360 Degree Page ", 10);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method search MSISDN based on parameter value
	 */

	public void searchMSISDN(String msisdn) throws Exception {
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
		ActionUtil.clickElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
		ActionUtil.type(getEleMSISDNTxtFld(), msisdn, " MSISDN Search text field ", driver);
		ActionUtil.clickElement(getEleMsisdnSearchGOIcn(), driver, " Subscription Search Go Icon ");
		ActionUtil.waitForElement(getEle360DegreeBtn(), driver, " 360 Degree Page ", 10);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method search MSISDN based on parameter value
	 */

	public void searchMSISDN1(String filepath, String sheetname, String testcaseID) throws Exception {
		int count = 4;
		while (count > 0) {
			try {
				int msisdn = GenericLib.getColumnIndex(filepath, sheetname, MSISDN);
				String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
				ActionUtil.waitForElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
				ActionUtil.clickElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
				ActionUtil.type(getEleMSISDNTxtFld(), sData[msisdn], " MSISDN Search text field ", driver);
				ActionUtil.clickElement(getEleMsisdnSearchGOIcn(), driver, " Subscription Search Go Icon ");
				ActionUtil.waitForElement(getEle360DegreeBtn(), driver, " 360 Degree Page ", 1);
			} catch (Exception e) {
				Thread.sleep(50000);
				count = count - 1;
				int msisdn = GenericLib.getColumnIndex(filepath, sheetname, MSISDN);
				String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
				ActionUtil.waitForElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
				ActionUtil.clickElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
				ActionUtil.type(getEleMSISDNTxtFld(), sData[msisdn], " MSISDN Search text field ", driver);
				ActionUtil.clickElement(getEleMsisdnSearchGOIcn(), driver, " Subscription Search Go Icon ");
				Thread.sleep(5000);
				ActionUtil.waitForElement(getEle360DegreeBtn(), driver, " 360 Degree Page ", 1);
			}
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method to verify MSISDN is inavlid with eroor message
	 * color red
	 */
	public void validateInvalidMSISDN(String msisdn) throws Exception {

		Thread.sleep(5000);
		ActionUtil.clickElement(getEleSubsSerachBtn(), driver, " Subscription Search Button");
		ActionUtil.type(getEleMSISDNTxtFld(), msisdn, " MSISDN Search text field ", driver);
		ActionUtil.clickElement(getEleMsisdnSearchGOIcn(), driver, " Subscription Search Go Icon ");
		ActionUtil.isEleDisplayed(getEleMsisdnSearchErrorMsg(), driver, " This is not a valid Vodafone Number Txt", 10);
	}

}
