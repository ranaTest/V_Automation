/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Bulk Upload Page Objects and re-usables
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;
import java.util.List;

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

public class BulkUploadPage {

	WebDriver driver;

	public BulkUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Bulk Upload Pages
	 * 
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

	@FindBy(xpath = "//span[@class='screenName2']//a[text()='Administration - Integration']")
	private WebElement eleAdministrationIntegrationLnkTxt;

	public WebElement getEleAdministrationIntegrationLnkTxt() {
		return eleAdministrationIntegrationLnkTxt;
	}

	@FindBy(xpath = "//a[text()='Bulk Jobs']")
	private WebElement eleBulkJobsBtn;

	public WebElement getEleBulkJobsBtn() {
		return eleBulkJobsBtn;
	}

	@FindBy(xpath = "//a[text()='File']")
	private WebElement eleFileBtn;

	public WebElement getEleFileBtn() {
		return eleFileBtn;
	}

	@FindBy(xpath = "//button[@title='Bulk Processing Menu']")
	private WebElement eleBulkProcessingMenuIcn;

	public WebElement getEleBulkProcessingMenuIcn() {
		return eleBulkProcessingMenuIcn;
	}

	@FindBy(xpath = "//button[@title='Bulk Processing Menu']/..//a[contains(text(),'New Record')]")
	private WebElement eleBulkProcessNewRecordBtn;

	public WebElement getEleBulkProcessNewRecordBtn() {
		return eleBulkProcessNewRecordBtn;
	}

	@FindBy(xpath = "//span[text()='Upload File']")
	private WebElement eleUploadFileBtn;

	public WebElement getEleUploadFileBtn() {
		return eleUploadFileBtn;
	}

	@FindBy(xpath = "//a[@name='AccntFileName']")
	private WebElement eleAccountFileNameBtn;

	public WebElement getEleAccountFileNameBtn() {
		return eleAccountFileNameBtn;
	}

	@FindBy(xpath = "//button[@title='Bulk Processing:Read File']")
	private WebElement eleReadFileBtn;

	public WebElement getEleReadFileBtn() {
		return eleReadFileBtn;
	}

	/*
	 * * @author:Srinivas Hippargi
	 * 
	 * Description: Bulk Upload || Bulk Batches screen Page objects
	 * 
	 */

	@FindBy(xpath = "//a[text()='Bulk Batches']")
	private WebElement eleBulkBatchesBtn;

	public WebElement getEleBulkBatchesBtn() {
		return eleBulkBatchesBtn;
	}

	@FindBy(xpath = "//button[@aria-label='Bulk Processing:Process All']/../../..//td[contains(@id,'Status')]")
	private List<WebElement> eleBulkProcessStatusLst;

	public List<WebElement> getEleBulkProcessStatusLst() {
		return eleBulkProcessStatusLst;
	}

	@FindBy(xpath = "//button[@aria-label='Bulk Processing:Process All']/../../..//td[contains(@id,'Attrib01')]")

	private List<WebElement> eleBulkProcessAttrb01Lst;

	public List<WebElement> getEleBulkProcessAttrb01Lst() {
		return eleBulkProcessAttrb01Lst;
	}

	@FindBy(xpath = "//button[@title='Bulk Processing:Process']")
	private WebElement eleProcessBtn;

	public WebElement getEleProcessBtn() {
		return eleProcessBtn;
	}

	@FindBy(xpath = "//button[@title='Bulk Processing:Process All']")
	private WebElement eleProcessAllBtn;

	public WebElement getEleProcessAllBtn() {
		return eleProcessAllBtn;
	}

	/*
	 * * @author:Srinivas Hippargi
	 * 
	 * Description: Bulk Upload || Bulk Batches || Details screen Page objects
	 * 
	 */

	@FindBy(xpath = "//div[text()='Details']/../..//input[@aria-labelledby='Name_Label']")
	private WebElement eleDetailsNameTxt;

	public WebElement getEleDetailsNameTxt() {
		return eleDetailsNameTxt;
	}

	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws Exception
	 * @description : Re-usable methods to Bulk upload
	 * 
	 * 
	 */

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to navigate simulator
	 * 
	 * @parameters :
	 */

	public void navigateToBulkUploadScreen(WebDriver driver) throws Exception {

		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleSiteMapIcn(), driver, " Site Map Icon ", 2);
		ActionUtil.clickElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(getEleCAFFormSearchTxtBx(), "Administration - Integration", " EAI Value Map Administartion ",
				driver);
		ActionUtil.clickElement(getEleAdministrationIntegrationLnkTxt(), driver, " Administration - Integration Text");
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to navigate simulator
	 * 
	 * @parameters :
	 */

	public void performBulkUpload(String exeFile) throws Exception {

		Thread.sleep(4000);
		ActionUtil.waitForElement(getEleBulkJobsBtn(), driver, " Bulk Jobs Button ", 2);
		ActionUtil.clickElement(getEleBulkJobsBtn(), driver, " Bulk Jobs Button");
		ActionUtil.waitForElement(getEleFileBtn(), driver, " File Button ", 2);
		ActionUtil.clickElement(getEleFileBtn(), driver, " File Button ");
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleBulkProcessingMenuIcn(), driver, " Bulk Processing Menu Icon ", 2);
		ActionUtil.clickElement(getEleBulkProcessingMenuIcn(), driver, " Bulk Processing Menu Icon ");
		Thread.sleep(5000);
		ActionUtil.waitForElement(getEleBulkProcessNewRecordBtn(), driver, " New Record (CTRL_N) Button ", 2);
		ActionUtil.clickElement(getEleBulkProcessNewRecordBtn(), driver, " New Record (CTRL_N) Button ");
		ActionUtil.scrollIntoView(driver, getEleUploadFileBtn());
		ActionUtil.clickElement(getEleUploadFileBtn(), driver, " Upload File Button ");
		// ActionUtil.uploadFile(exeFile, getEleUploadFileBtn(), driver);
		ActionUtil.uploadFile(exeFile);
		Thread.sleep(5000);
		ActionUtil.clickElement(getEleReadFileBtn(), driver, " Read File Button ");
		if (ActionUtil.isAlertPresent(driver, 30)) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			if (alert.getText().contains("OK")) {
				MyExtentListners.test.info(
						MarkupHelper.createLabel("After bulk upload Ok alert pop up is displayed", ExtentColor.TEAL));
			} else {
				MyExtentListners.test.fail(MarkupHelper
						.createLabel("After bulk upload Ok alert pop up is not displayed", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getEleReadFileBtn()));
				throw new Exception();
			}
			alert.accept();
		}
		ActionUtil.clickElement(getEleBulkBatchesBtn(), driver, " Bulk Batches Button");

		Thread.sleep(5000);

		for (int i = 0; i < getEleBulkProcessStatusLst().size() - 1; i++) {

			if (getEleBulkProcessStatusLst().get(i).getText().equalsIgnoreCase("Initial")) {

				if (getEleBulkProcessStatusLst().get(i).getText().equalsIgnoreCase("Processed")) {
					MyExtentListners.test.pass(" After Processing Bulk Upload || status changed to initial ");
				} else {
					MyExtentListners.test.fail(MarkupHelper.createLabel(
							"After Processing Bulk Upload || status didnot changed to initial ", ExtentColor.RED));

					MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
					throw new Exception();
				}
			}
		}

		ActionUtil.clickElement(getEleProcessAllBtn(), driver, " Process Button");
		Thread.sleep(5000);
		for (int i = 0; i < getEleBulkProcessStatusLst().size() - 1; i++) {

			if (getEleBulkProcessStatusLst().get(i).getText().equalsIgnoreCase("Processed")) {
				MyExtentListners.test
						.pass(" After Processing Bulk Upload || status changed from initial to processed ");
			} else {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"After Processing Bulk Upload || status didnot changed from initial to processed ",
						ExtentColor.RED));

				MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
				throw new Exception();
			}
		}

	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description : Method to validate Failed status after Bulk upload process
	 * 
	 * @parameters :
	 */
	public void validateFailedStatus(WebDriver driver) throws Exception{
		boolean flag=false;
		for (int i = 0; i < getEleBulkProcessStatusLst().size(); i++) {
			
			if (getEleBulkProcessStatusLst().get(i).getText().equalsIgnoreCase("processed")) {
				flag=false;
			} else{
				flag=true;
				break;
			}
		}
		if(flag==false){
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"After Processing Bulk Upload || status changed to processed || No failed status available ",
					ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
			throw new Exception();
		}else{
			MyExtentListners.test
			.pass(" After Processing Bulk Upload || status changed from failed ");
		}
	}

}
