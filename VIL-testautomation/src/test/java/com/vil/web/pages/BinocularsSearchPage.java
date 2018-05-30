/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Home Page
* @methods 			: 		
*/


package com.vil.web.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vil.web.library.GenericLib;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class BinocularsSearchPage implements TestDataHeadingsConstants{
	
	WebDriver driver;

	String eleLeadId;
	public BinocularsSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search MSISDN
	 * 
	 */

	@FindBy(id = "searchtoolbaroption")
	private WebElement eleAdvancedSearchIcn;

	public WebElement getEleAdvancedSearchIcn() {
		return eleAdvancedSearchIcn;
	}

	@FindBy(id = "srch_barcode")
	private WebElement eleQuickSearchBtn;

	public WebElement getEleQuickSearchBtn() {
		return eleQuickSearchBtn;
	}

	@FindBy(id = "srch_adv_find")
	private WebElement eleAdvancedFindBtn;

	public WebElement getEleAdvancedFindBtn() {
		return eleAdvancedFindBtn;
	}
	
	@FindBy(xpath = "//select[@class='siebui-advance-find']")
	private WebElement eleAdvancedFindDrpDwn;

	public WebElement getEleAdvancedFindDrpDwn() {
		return eleAdvancedFindDrpDwn;
	}


	@FindBy(xpath = "//button[@title='Find']")
	private WebElement eleFindIcn;

	public WebElement getEleFindIcn() {
		return eleFindIcn;
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search Service Request
	 * 
	 */	
	
	@FindBy(xpath = "//input[@title='SR #']")
	private WebElement eleServiceRequestTxtBx;

	public WebElement getEleServiceRequestTxtBx() {
		return eleServiceRequestTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Type']")
	private WebElement eleServiceRequestTypeTxtBx;

	public WebElement getEleServiceRequestTypeTxtBx() {
		return eleServiceRequestTypeTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Sub-Type']")
	private WebElement eleServiceRequestSubTypeTxtBx;

	public WebElement getEleServiceRequestSubTypeTxtBx() {
		return eleServiceRequestSubTypeTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Sub - Sub Type']")
	private WebElement eleServiceRequestSubSubTypeTxtBx;

	public WebElement getEleServiceRequestSubSubTypeTxtBx() {
		return eleServiceRequestSubSubTypeTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Ticket Type']")
	private WebElement eleServiceRequestTicketTypeTxtBx;

	public WebElement getEleServiceRequestTicketTypeTxtBx() {
		return eleServiceRequestTicketTypeTxtBx;
	}
	
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search Lead
	 * 
	 */	
	
	@FindBy(xpath = "//input[@title='Lead Number']")
	private WebElement eleLeadNumberTxtBx;

	public WebElement getEleLeadNumberTxtBx() {
		return eleLeadNumberTxtBx;
	}
	
	public WebElement getEleLeadIdLink(String leadId){
		return driver.findElement(By.xpath("//a[text()='"+leadId+"']"));
	}
	
	@FindBy(xpath = "//button[@aria-label='Search Results:Close']")
	private WebElement eleSearchResultCloseBtn;

	public WebElement getEleSearchResultCloseBtn() {
		return eleSearchResultCloseBtn;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search Opportunities
	 * 
	 */	
	@FindBy(xpath = "//input[@title='Opportunity #']")
	private WebElement eleOpportunityTxtBx;

	public WebElement getEleOpportunityTxtBx() {
		return eleOpportunityTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search MSISDN
	 * 
	 */	
	
	@FindBy(xpath = "//input[@title='MSISDN']")
	private WebElement eleMSISDNTxtBx;

	public WebElement getEleMSISDNTxtBx() {
		return eleMSISDNTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='SIM#']")
	private WebElement eleSIMTxtBx;

	public WebElement getEleSIMTxtBx() {
		return eleSIMTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Asset #']")
	private WebElement eleAssetTxtBx;

	public WebElement getEleAssetTxtBx() {
		return eleAssetTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='IMSI No']")
	private WebElement eleIMSINoTxtBx;

	public WebElement getEleIMSINoTxtBx() {
		return eleIMSINoTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Registered Email Id']")
	private WebElement eleRegEmailIdTxtBx;

	public WebElement getEleRegEmailIdTxtBx() {
		return eleRegEmailIdTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='PCN Id']")
	private WebElement elePCNIdTxtBx;

	public WebElement getElePCNIdTxtBx() {
		return elePCNIdTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Advanced Search Accounts 
	 * 
	 */	
	
	@FindBy(xpath = "//input[@title='Account #']")
	private WebElement eleAccountTxtBx;

	public WebElement getEleAccountTxtBx() {
		return eleAccountTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='CA ID']")
	private WebElement eleCAIDTxtBx;

	public WebElement getEleCAIDTxtBx() {
		return eleCAIDTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Account Name']")
	private WebElement eleAccountNameTxtBx;

	public WebElement getEleAccountNameTxtBx() {
		return eleAccountNameTxtBx;
	}
	
	@FindBy(xpath = "//input[@title='Enterprise Code']")
	private WebElement eleEnterpriseCodeTxtBx;

	public WebElement getEleEnterpriseCodeTxtBx() {
		return eleEnterpriseCodeTxtBx;
	}
	
	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	* 
	* @description		: 		Re-usable methods for MSISDN serach and Service Request
	* 
	*/
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method search the msisdn from advanced options
	 * 
	 */
	
	public void binocularsMSISDNSearch(String filepath,String sheetname,String testcaseID) throws Exception{
		
		int msisdn = GenericLib.getColumnIndex(filepath, sheetname,MSISDN);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Assets");
		ActionUtil.type(getEleMSISDNTxtBx(), sData[msisdn], " MSISDN Search text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method search the msisdn from advanced options
	 * 
	 */
	
	public void binocularsMSISDNSearch(String msisdn) throws Exception{
		
		//Thread.sleep(5000);
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Assets");
		ActionUtil.isEleDisplayed(getEleMSISDNTxtBx(), driver, " MSISDN text field ", 10);
		ActionUtil.isEleDisplayed(getEleSIMTxtBx(), driver, " SIM # text field ", 10);
		ActionUtil.isEleDisplayed(getEleAssetTxtBx(), driver, " ASSET # text field ", 10);
		ActionUtil.isEleDisplayed(getEleIMSINoTxtBx(), driver, " IMSI No text field ", 10);
		ActionUtil.isEleDisplayed(getEleRegEmailIdTxtBx(), driver, " Registered Email Id text field ", 10);
		ActionUtil.isEleDisplayed(getElePCNIdTxtBx(), driver, " PCN Id text field ", 10);
		ActionUtil.type(getEleMSISDNTxtBx(), msisdn, " MSISDN Search text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method adds the msisdn and clicks on Find icon
	 * 
	 */
	
	public void binocularsSeviceRequestsSearch(String filepath,String sheetname,String testcaseID) throws Exception{
		
		int tagtype = GenericLib.getColumnIndex(filepath, sheetname,SR_TYPE);
		int tagsubtype = GenericLib.getColumnIndex(filepath, sheetname,SR_SUBTYPE);
		int tagsubsubtype = GenericLib.getColumnIndex(filepath, sheetname,SR_SUBSUBTYPE);
		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Service Requests");
		ActionUtil.type(getEleServiceRequestTypeTxtBx(), sData[tagtype], " Service Request Type text field ", driver);
		ActionUtil.type(getEleServiceRequestSubTypeTxtBx(), sData[tagsubtype], " Service Request Sub Type text field ", driver);
		ActionUtil.type(getEleServiceRequestSubSubTypeTxtBx(), sData[tagsubsubtype], " Service Request Sub Sub Type text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method verifies
	 * 
	 */
	
	public void binocularsSeviceRequestsSearch(String serviceRequest) throws Exception{

		//Thread.sleep(5000);
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Service Requests");
		ActionUtil.isEleDisplayed(getEleServiceRequestTypeTxtBx(), driver, " Service Request Type text field ", 10);
		ActionUtil.isEleDisplayed(getEleServiceRequestSubTypeTxtBx(), driver, " Service Request Sub Type text field ", 10);
		ActionUtil.isEleDisplayed(getEleServiceRequestSubSubTypeTxtBx(), driver, "  Service Request Sub Sub Type text field ", 10);
		ActionUtil.isEleDisplayed(getEleServiceRequestTicketTypeTxtBx(), driver, "  Service Request Ticket Type text field ", 10);
		ActionUtil.type(getEleServiceRequestTxtBx(), serviceRequest, " SR # text box ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method search the leadId from advanced find / binoculars options
	 * 
	 */
	public void binocularsLeadsSearch(String leadId) throws Exception{
		
	//	Thread.sleep(5000);
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		//Thread.sleep(5000);
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Leads");
		ActionUtil.type(getEleLeadNumberTxtBx(), leadId, " Lead Number text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method search the Opportunity id from advanced find / binoculars options
	 * 
	 */
	public void binocularsOpportunitySearch(String opportunityId) throws Exception{
		
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Opportunities");
		ActionUtil.type(getEleOpportunityTxtBx(), opportunityId, " Opportunity text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: Mehtod to click on binacular search id and navigate respective screen
	 * 
	 */
	
	public void clickOnSearchId(String leadId) throws IOException, InterruptedException{
		ActionUtil.waitForElement(getEleLeadIdLink(leadId), driver, " Lead Id Link");
		ActionUtil.clickElement(getEleLeadIdLink(leadId), driver, " Lead id Link ");
		ActionUtil.waitForElement(getEleSearchResultCloseBtn(), driver, " Close Icon",1);
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleSearchResultCloseBtn(), driver, "Close Button");
		
		
	}
	
	/*
	 * @author:Srinivas Hippargi  
	 * 
	 * Description: This method search the msisdn from advanced options
	 * 
	 */
	
	public void binocularsAccountSearch(String accNumber) throws Exception{
		
		ActionUtil.waitForElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedSearchIcn(), driver, " Advanced Options Icon");
		ActionUtil.clickElement(getEleAdvancedFindBtn(), driver, " Advanced Find Button");
		ActionUtil.waitForElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.clickElement(getEleAdvancedFindDrpDwn(), driver, "Advanced Find Drop Down");
		ActionUtil.selectbyValue(driver, getEleAdvancedFindDrpDwn(), "Accounts");
		ActionUtil.isEleDisplayed(getEleAccountTxtBx(), driver, " Account # text field ", 10);
		ActionUtil.isEleDisplayed(getEleCAIDTxtBx(), driver, " CA id text field ", 10);
		ActionUtil.isEleDisplayed(getEleAccountNameTxtBx(), driver, " Account Name text field ", 10);
		ActionUtil.isEleDisplayed(getEleEnterpriseCodeTxtBx(), driver, " Enterprise Code text field ", 10);
		ActionUtil.type(getEleAccountTxtBx(), accNumber, " Account # text field ", driver);
		ActionUtil.clickElement(getEleFindIcn(), driver, " Find Icon ");
	}
	
	
	
}
