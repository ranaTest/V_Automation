package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.library.GenericLib;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class PostpaidPage implements TestDataHeadingsConstants {

	WebDriver driver;

	public PostpaidPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid || Billing Accounts screen
	 * 
	 */

	@FindBy(xpath = "//a[text()='Postpaid']")
	private WebElement elePostPaidBtn;

	public WebElement getElePostPaidBtn() {
		return elePostPaidBtn;
	}

	@FindBy(xpath = "//a[@name='Account Number']")
	private WebElement eleAccNumberLnk;

	public WebElement getEleAccNumberLnk() {
		return eleAccNumberLnk;
	}

	@FindBy(xpath = "//a[text()='Payments']")
	private WebElement elePayemntsBtn;

	public WebElement getElePayemntsBtn() {
		return elePayemntsBtn;
	}

	@FindBy(name = "s_2_1_32_0")
	private WebElement elePayemntsInfoNewBtn;

	public WebElement getElePayemntsInfoNewBtn() {
		return elePayemntsInfoNewBtn;
	}

	@FindBy(xpath = "//input[@name='s_2_1_17_0']")
	private WebElement elePaymentModeBtn;

	public WebElement getElePaymentModeBtn() {
		return elePaymentModeBtn;
	}

	@FindBy(xpath = "//input[@name='s_2_1_19_0']")
	private WebElement elePaymentAmtBtn;

	public WebElement getElePaymentAmtBtn() {
		return elePaymentAmtBtn;
	}

	@FindBy(name = "s_2_1_24_0")
	private WebElement elePayemntsRemarksBtn;

	public WebElement getElePayemntsRemarksBtn() {
		return elePayemntsRemarksBtn;
	}

	@FindBy(id = "1_s_3_l_Cheque_Status")
	private WebElement elePostPayemntsStatusTxt;

	public WebElement getElePostPayemntsStatusTxt() {
		return elePostPayemntsStatusTxt;
	}

	@FindBy(name = "s_3_1_4_0")
	private WebElement elePaymentSubmitBtn;

	public WebElement getElePaymentSubmitBtn() {
		return elePaymentSubmitBtn;
	}

	@FindBy(xpath = "//button[@name='s_2_1_12_0']")
	private WebElement eleUploadToFilenetBtn;

	public WebElement getEleUploadToFilenetBtn() {
		return eleUploadToFilenetBtn;
	}
	
	@FindBy(xpath = "//select[contains(@aria-label,'Third')]")
	private WebElement eleViewBarDrpDn;

	public WebElement getEleViewBarDrpDn() {
		return eleViewBarDrpDn;
	}
	//option[text()='Payment Details']
	
	@FindBy(xpath = "//option[text()='Payment Details']")
	private WebElement elePaymentDetailsTxt;

	public WebElement getElePaymentDetails() {
		return elePaymentDetailsTxt;
	}
	
	//span[text()='Go']
	
	@FindBy(xpath = "//button[@aria-label='Payment Details:Go']")
	private WebElement eleGoIcn;

	public WebElement getEleGoIcn() {
		return eleGoIcn;
	}
	
	
	
	@FindBy(xpath = "//a[text()='Unbilled Amount']")
	private WebElement eleUbilledAmountBtn;

	public WebElement getEleUbilledAmountBtn() {
		return eleUbilledAmountBtn;
	}
	
	
	@FindBy(xpath = "//a[text()='Billed Usage Details']")
	private WebElement eleBilledUsageDetailsBtn;

	public WebElement getEleBilledUsageDetailsBtn() {
		return eleBilledUsageDetailsBtn;
	}
	
	
	@FindBy(xpath = "//button[@aria-label='Usage Details:Go']")
	private WebElement eleUsageDetailsGoIcn;

	public WebElement getEleUsageDetailsGoIcn() {
		return eleUsageDetailsGoIcn;
	}
	
	
	@FindBy(xpath = "//button[@aria-label='Statement of Account:Go']")
	private WebElement eleStatementofAccountGoIcn;

	public WebElement getEleStatementofAccountGoIcn() {
		return eleStatementofAccountGoIcn;
	}
	
	@FindBy(xpath = "//a[text()='Consolidated Bill']")
	private WebElement eleConsolidatedBillBtn;

	public WebElement getEleConsolidatedBillBtn() {
		return eleConsolidatedBillBtn;
	}
	
	
	@FindBy(xpath = "//button[@aria-label='Customer Details:Go']")
	private WebElement eleCustomerDetailsGoIcn;

	public WebElement getEleCustomerDetailsGoIcn() {
		return eleCustomerDetailsGoIcn;
	}
	
	//a[text()='CDR']
	
	@FindBy(xpath = "//a[text()='CDR']")
	private WebElement eleCDRBtn;

	public WebElement getEleCDRBtn() {
		return eleCDRBtn;
	}
	
	
	@FindBy(xpath = "//button[@aria-label='Unbilled Break Up:Go']")
	private WebElement eleUnbilledBreakUpGoIcn;

	public WebElement getEleUnbilledBreakUpGoIcn() {
		return eleUnbilledBreakUpGoIcn;
	}
	
	/***********************************************************************************
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Paymnet Posting via CRM
	 */

	public void paymentPosting(String filepath, String sheetname, String testcaseId) throws Exception {

		int paymentMode = GenericLib.getColumnIndex(filepath, sheetname, PAYMENT_MODE);
		int paymentAmt = GenericLib.getColumnIndex(filepath, sheetname, PAYMENT_AMT);
		int paymentRemarks = GenericLib.getColumnIndex(filepath, sheetname, PAYMENTS_REMARKS);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseId);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ActionUtil.clickElement(getElePostPaidBtn(), driver, " Post Paid Button ");
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, " Account Number ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, " Account Number ");
		ActionUtil.clickElement(getElePayemntsBtn(), driver, " Payments Button ");
		ActionUtil.clickElement(getElePayemntsInfoNewBtn(), driver, " Payments Info New  Button ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ActionUtil.type(getElePaymentModeBtn(), sData[paymentMode], " Payment Mode ", driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ActionUtil.type(getElePaymentAmtBtn(), sData[paymentAmt], " Payment Amount ", driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ActionUtil.type(getElePayemntsRemarksBtn(), sData[paymentRemarks], " Payment Remarks ", driver);
		String postPaymnet = getElePostPayemntsStatusTxt().getText();
		if (postPaymnet.equalsIgnoreCase("Pending")) {
			MyExtentListners.test.pass("Verify Before Posting Payment : Check Status " + "\"" + postPaymnet + "\""
					+ " is displayed" + " ||  Before Posting Payment : Check Status " + "\"" + postPaymnet + "\""
					+ " is displayed");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify Before Posting Payment : Check Status " + "\""
					+ postPaymnet + "\"" + " is displayed" + " ||  Before Posting Payment : Check Status " + "\""
					+ postPaymnet + "\"" + " is not displayed", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getElePostPayemntsStatusTxt()));
			Assert.fail();
		}
		ActionUtil.clickElement(getElePaymentSubmitBtn(), driver, " Payments Submit Button ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionUtil.waitForElement(getElePostPayemntsStatusTxt(), driver, " Account Number");
		String postPaymnet1 = getElePostPayemntsStatusTxt().getText();
		if (postPaymnet1.equalsIgnoreCase("Sent")) {

			MyExtentListners.test.pass("Verify After Posting Payment : Check Status " + "\"" + postPaymnet1 + "\""
					+ " is displayed" + " ||  After Posting Payment : Check Status " + "\"" + postPaymnet1 + "\""
					+ " is displayed");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify After Posting Payment : Check Status " + "\""
					+ postPaymnet1 + "\"" + " is displayed" + " ||  After Posting Payment : Check Status " + "\""
					+ postPaymnet1 + "\"" + " is not displayed", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getElePostPayemntsStatusTxt()));
			Assert.fail();
		}
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String postPaymnet2 = getElePostPayemntsStatusTxt().getText();
		if (postPaymnet2.equalsIgnoreCase("Payment Success")) {
			MyExtentListners.test.pass("Verify After Posting Payment : Check Status " + "\"" + postPaymnet2 + "\""
					+ " is displayed" + " ||  After Posting Payment : Check Status " + "\"" + postPaymnet2 + "\""
					+ " is displayed");
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify After Posting Payment : Check Status " + "\""
					+ postPaymnet2 + "\"" + " is displayed" + " ||  After Posting Payment : Check Status " + "\""
					+ postPaymnet2 + "\"" + " is not displayed", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver, getElePostPayemntsStatusTxt()));
			Assert.fail();
		}

	}
	
	
	/*****************************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: checks Fetch and Display for Payment  Details.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void drillDownPostpaidToBillingAcount(String NameOfTheButton) throws IOException, InterruptedException{
		
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePostPaidBtn(), driver, "Postpaid button click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, "Click on Account number link.");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, "Click on Account number link.");
		Thread.sleep(2500);
		ActionUtil.selectbyVisibletext(driver, InitializePages.o_viewBarPage.getEleThirdLevelViewBarDrpDwn(), NameOfTheButton);
		Thread.sleep(1500);
		
	}
	
	
	/*****************************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: checks Fetch and Display for Unbilled Amount Details..
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void unbilledAmountDetails() throws IOException, InterruptedException{
		
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePostPaidBtn(), driver, "Postpaid button click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleUbilledAmountBtn(), driver, "Ubilled Amount click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleGoIcn(), driver, "Go Icon click");
		Thread.sleep(3000);
		
	}
	
	/*****************************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description: checks Fetch and Display for Billed Usage Details.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void billedUsageDetails() throws IOException, InterruptedException{
		
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePostPaidBtn(), driver, "Postpaid button click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleBilledUsageDetailsBtn(), driver, "Ubilled Amount click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleUsageDetailsGoIcn(), driver, "Go Icon click");
		Thread.sleep(3000);
		
	}
	
	/*****************************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description:  checks Fetch and Display for Consolidated Bill Details.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void consolidatedBillDetails() throws IOException, InterruptedException{
		
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePostPaidBtn(), driver, "Postpaid button click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, "Click on Account number link.");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleAccNumberLnk(), driver, "Click on Account number link.");
		Thread.sleep(2500);
		ActionUtil.clickElement(getEleConsolidatedBillBtn(), driver, "Consolidated Bill click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleCustomerDetailsGoIcn(), driver, "Customer Details go icon click");
		Thread.sleep(3000);
		
	}
	
	
	/*****************************************************************************************
	 * @author:Rana Thakur
	 * 
	 * Description:  checks Fetch and Display for CDR Details.
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	
	public void cdrDetails() throws IOException, InterruptedException{
		
		Thread.sleep(1500);
		ActionUtil.clickElement(getElePostPaidBtn(), driver, "Postpaid button click");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleCDRBtn(), driver, "Crd click");
		Thread.sleep(3000);
		
	}

}
