/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Assets Page
* @methods 			: 		
*/

package com.vil.web.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;

public class AssetsPage {

	WebDriver driver;

	public AssetsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Assets Page
	 * 
	 */

	@FindBy(xpath = "//a[text()='360 Degree']")
	private WebElement ele360DegreeTab;

	public WebElement getEle360DegreeTab() {
		return ele360DegreeTab;
	}

	@FindBy(xpath = "//a[text()='Prepaid']")
	private WebElement elePrepaidTab;

	public WebElement getElePrepaidTab() {
		return elePrepaidTab;
	}

	@FindBy(xpath = "//a[text()='Postpaid']")
	private WebElement elePostpaidTab;

	public WebElement getElePostpaidTab() {
		return elePostpaidTab;
	}

	@FindBy(xpath = "//a[text()='Address']")
	private WebElement eleAddressTab;

	public WebElement getEleAddressTab() {
		return eleAddressTab;
	}

	@FindBy(xpath = "//a[text()='SR History']")
	private WebElement eleSRHistoryTab;

	public WebElement getEleSRHistoryTab() {
		return eleSRHistoryTab;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Page Objects for InstalledAssets
	 */
	@FindBy(xpath = "//span[@title=':Show more']")
	private WebElement eleInstalledAssetsShowMoreIcon;

	@FindBy(xpath = "//div[@class='ui-icon ui-icon-triangle-1-e tree-plus treeclick']")
	private WebElement eleInstalledAssetsProdDrpdwn;

	@FindBy(xpath = "//table[@summary='Installed Assets']/tbody/tr[*]/td[1]/span/a")
	private List<WebElement> eleInstalledAssetsProList;

	@FindBy(xpath = "//table[@summary='Installed Assets']/tbody/tr[*]/td[2]")
	private List<WebElement> eleInstalledAssetsProListSecondColumn;

	@FindBy(xpath = "//table[@summary='Installed Assets']/tbody/tr[*]/td[5]")
	private List<WebElement> eleInstalledAssetsOperatingStatusLst;

	public List<WebElement> getEleInstalledAssetsProList() throws IOException {
		return eleInstalledAssetsProList;
	}

	public List<WebElement> getEleInstalledAssetsProListSecondColumn() throws IOException {
		return eleInstalledAssetsProListSecondColumn;
	}

	public List<WebElement> getEleInstalledAssetsOperatingStatusLst() throws IOException {
		return eleInstalledAssetsOperatingStatusLst;
	}

	@FindBy(xpath = "//td[contains(@aria-labelledby,'Promotion_Payment_Type')]")
	private WebElement eleInstalledAssetsPaymentTypeValue;

	public WebElement getEleInstalledAssetsPaymentTypeValue() throws IOException {
		return eleInstalledAssetsPaymentTypeValue;
	}

	@FindBy(xpath = "//a[text()='SIM & HLR Details']")
	private WebElement eleSimAndHlrTab;

	public WebElement getEleSimAndHlrTab() {
		return eleSimAndHlrTab;
	}

	@FindBy(xpath = "//a[text()='Archived Data']")
	private WebElement eleArchivedDataTab;

	public WebElement getEleArchivedDataTab() {
		return eleArchivedDataTab;
	}

	@FindBy(xpath = "//a[text()='Activations']")
	private WebElement eleActivationsTab;

	public WebElement getEleActivationsTab() {
		return eleActivationsTab;
	}
	// a[text()='Archived Data']

	@FindBy(xpath = "//a[text()='GST Info']")
	private WebElement eleGSTInfoTab;

	public WebElement getEleGSTInfoTab() {
		return eleGSTInfoTab;
	}

	@FindBy(xpath = "//a[text()='Data & Devices']")
	private WebElement eleDataAndDevicesTab;

	public WebElement getEleDataAndDevicesTab() {
		return eleDataAndDevicesTab;
	}

	@FindBy(xpath = "//a[text()='VAS']")
	private WebElement eleVASTab;

	public WebElement getEleVASTab() {
		return eleVASTab;
	}

	@FindBy(xpath = "//a[text()='Customer Interactions']")
	private WebElement eleCustomerInteractionTab;

	public WebElement getEleCustomerInteractionTab() {
		return eleCustomerInteractionTab;
	}

	@FindBy(xpath = "//a[text()='Best Offers']")
	private WebElement eleBestOffersTab;

	public WebElement getEleBestOffersTab() {
		return eleBestOffersTab;
	}

	@FindBy(xpath = "//a[text()='Active Services']")
	private WebElement eleActiveServicesTab;

	public WebElement getEleActiveServicesTab() {
		return eleActiveServicesTab;
	}

	@FindBy(xpath = "//span[text()='Push SMS']")
	private WebElement elePushSmsBtn;

	public WebElement getElePushSmsBtn() {
		return elePushSmsBtn;
	}

	@FindBy(xpath = "//a[text()='Customer Interactions']")
	private WebElement eleCustomerInteractionsBtn;

	public WebElement getEleCustomerInteractionsBtn() {
		return eleCustomerInteractionsBtn;
	}

	@FindBy(xpath = "//a[text()='Push SMS']")
	private WebElement elePushSMSBtn;

	public WebElement getElePushSMSBtn() {
		return elePushSMSBtn;
	}

	@FindBy(xpath = "//div[text()='Details']")
	private WebElement eleSrDetailTxt;

	public WebElement getEleSrDetailTxt() {
		return eleSrDetailTxt;
	}

	@FindBy(xpath = "//div[text()='Details']/../..//input[@aria-label='Type']")
	private WebElement eleSrTypeLbl;

	public WebElement getEleSrTypeLbl() {
		return eleSrTypeLbl;
	}

	@FindBy(xpath = "//input[@aria-label='Sub Type']")
	private WebElement eleSubTypeLbl;

	public WebElement getEleSubTypeLbl() {
		return eleSubTypeLbl;
	}

	@FindBy(xpath = "//input[@aria-label='Sub Sub Type']")
	private WebElement eleSubSubTypeLbl;

	public WebElement getEleSubSubTypeLbl() {
		return eleSubSubTypeLbl;
	}

	@FindBy(xpath = "//td[text()='PUSH SMS To get rechg details_can be used by all users KEL Pre']")
	private WebElement eleTemplateNameLbl;

	public WebElement getEleTemplateNameLbl() {
		return eleTemplateNameLbl;
	}

	@FindBy(xpath = "//td[text()='SMS' and @aria-labelledby='s_4_l_SRDFF_PickSimpleValue s_4_l_altCombo']")
	private WebElement eleMessageMediaLbl;

	public WebElement getEleMessageMediaLbl() {
		return eleMessageMediaLbl;
	}

	@FindBy(xpath = "//table[@id='s_2_l']/tbody[1]/tr[2]/td[10]")
	private WebElement eleSatusCodeTxt;

	public WebElement getEleSatusCodeTxt() {
		return eleSatusCodeTxt;
	}

	@FindBy(xpath = "//table[@id='s_2_l']/tbody[1]/tr[2]/td[11]")
	private WebElement eleSubSatusTxt;

	public WebElement getEleSubSatusTxt() {
		return eleSubSatusTxt;
	}

	@FindBy(xpath = "//a[text()='CRM SMS']")
	private WebElement eleCrmSmsBtn;

	public WebElement getEleCrmSmsBtn() {
		return eleCrmSmsBtn;
	}

	@FindBy(xpath = "//table[@class='ui-jqgrid-btable']/tbody[1]/tr[2]/td[7]")
	private WebElement eleSmsTxt;

	public WebElement getEleSmsTxt() {
		return eleSmsTxt;
	}

	/*******************************************************************************
	 * @author:Rana Thakur
	 * 
	 *              Description: This method click on Push Sms and check
	 *              Customer Interactions selected and push SMS Template is
	 *              Displayed.
	 */

	public void verifyPushSms() throws IOException {
		ActionUtil.clickElement(getElePushSmsBtn(), driver, " PUSH SMS button");
		ActionUtil.isEleDisplayed(getEleCustomerInteractionTab(), driver, "Customer Interactions", 3);
		ActionUtil.isEleDisplayed(getElePushSMSBtn(), driver, "Push SMS", 3);
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method click on _360Dgree and verify sr detail and dff
	 * detail.
	 */

	public void verifySrDffDtl() throws Throwable {

		ActionUtil.clickElement(ele360DegreeTab, driver, "360 Dergee Tab");
		// ActionUtil.waitTillPageLoad(driver, 6);
		ActionUtil.clickElement(eleSRHistoryTab, driver, "SR History Tab");
		// ActionUtil.waitTillPageLoad(driver, 6);
		ActionUtil.scrollIntoView(driver, getEleSrDetailTxt());
		// ActionUtil.waitTillPageLoad(driver, 6);
		String Type = ActionUtil.getAttributeValue(eleSrTypeLbl, driver, "Auto SR");
		// System.out.println(Type);

		ActionUtil.waitTillPageLoad(driver, 8);
		String subType = ActionUtil.getAttributeValue(eleSubTypeLbl, driver, "Sub type");
		// System.out.println(subType);

		// ActionUtil.waitTillPageLoad(driver, 8);
		String subsubType = ActionUtil.getAttributeValue(eleSubSubTypeLbl, driver, "Sub Sub type");
		// System.out.println(subsubType);

		// ActionUtil.waitTillPageLoad(driver, 3);

		String TemplateName = ActionUtil.gettext(eleTemplateNameLbl, driver, "Template Name");
		// System.out.println(TemplateName);

		// ActionUtil.waitTillPageLoad(driver, 3);
		String MessageMedia = ActionUtil.gettext(eleMessageMediaLbl, driver, "Message Media");
		// System.out.println(MessageMedia);

		// ActionUtil.waitTillPageLoad(driver, 5);
		ActionUtil.verifyContainsText(Type, "Auto SR");

		ActionUtil.verifyContainsText(subsubType, "Services");

		ActionUtil.verifyContainsText(subsubType, "Push Message");
		ActionUtil.verifyContainsText(TemplateName, "PUSH SMS To get rechg details_can be used by all users KEL Pre");
		ActionUtil.verifyContainsText(MessageMedia, "SMS");

		// ActionUtil.waitTillPageLoad(driver, 5);

		ActionUtil.scrollUp(driver);
		// ActionUtil.waitTillPageLoad(driver, 5);
		String StatusCode = ActionUtil.gettext(eleSatusCodeTxt, driver, "Status code");
		// System.out.println(StatusCode);
		String SubStatus = ActionUtil.gettext(eleSubSatusTxt, driver, "Sub-Status");
		// System.out.println(SubStatus);
		ActionUtil.verifyContainsText(StatusCode, "Closed");
		ActionUtil.verifyContainsText(SubStatus, "Resolved");
	}

	public void verifyCrmSmsTxt() throws Throwable {
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleCustomerInteractionsBtn(), driver, "Customer Interactions");
		Thread.sleep(1500);
		ActionUtil.clickElement(getEleCrmSmsBtn(), driver, "CRM SMS");
		Thread.sleep(1500);
		String SmsText = ActionUtil.getAttributeTitle(getEleSmsTxt(), driver, "SMS Text");
		// System.out.println(SmsText);
		Thread.sleep(1500);
		ActionUtil.verifyContainsText(SmsText, "Push Message");

	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Page Objects for Services in InstalledAssets
	 */

	@FindBy(xpath = "//input[@aria-labelledby='Status_Label']")
	private WebElement eleInstalledAssetsDefStatusvalue;
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Method to verify the installedAssetsProductList for Services
	 * in InstalledAssets
	 */

	public void verifyInstalledAssetsProductsList(String product) throws IOException, InterruptedException {

		ActionUtil.clickElement(eleInstalledAssetsProdDrpdwn, driver, "InstalledAssetsProdDrpdwn");
		ActionUtil.clickElement(eleInstalledAssetsShowMoreIcon, driver, "InstalledAssetsShowMoreIcon");

		Thread.sleep(3000);
		for (int i = 0; i < InitializePages.o_assetsPage.getEleInstalledAssetsProList().size(); i++) {

			WebElement installedassetsproduct = InitializePages.o_assetsPage.getEleInstalledAssetsProList().get(i);
			String productlist = ActionUtil.gettext(installedassetsproduct, driver, "Product List Value");
			if (productlist.contains(product)) {
				WebElement installedassetsproductsecondcell = InitializePages.o_assetsPage
						.getEleInstalledAssetsProListSecondColumn().get(i + 1);
				ActionUtil.clickElement(installedassetsproductsecondcell, driver, "SecondColumnClick");
			}

		}
	}
	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Method to verify the installedAssetsOperatingStatusList in
	 * InstalledAssets
	 */

	public void verifyInstalledAssetsOperatingStatusList(String product, String status)
			throws IOException, InterruptedException {

		for (int i = 0; i < InitializePages.o_assetsPage.getEleInstalledAssetsProList().size(); i++) {

			WebElement installedassetsproduct = InitializePages.o_assetsPage.getEleInstalledAssetsProList().get(i);
			String productlist = ActionUtil.gettext(installedassetsproduct, driver, "Product List Value");
			if (productlist.contains(product)) {
				WebElement installedassetsstatus = InitializePages.o_assetsPage
						.getEleInstalledAssetsOperatingStatusLst().get(i + 1);
				String productstatus = ActionUtil.gettext(installedassetsstatus, driver,
						"Installed Asset Product Status");
				ActionUtil.verifyEqualsText("Verfying Installed Asset Product Status", productstatus, status);
			}

		}
	}

	public void verifyInstalledAssetsProductIsNotDisplayed(String product, String elementName)
			throws IOException, InterruptedException {

		Thread.sleep(5000);
		ActionUtil.clickElement(eleInstalledAssetsProdDrpdwn, driver, "InstalledAssetsProdDrpdwn");
		ActionUtil.clickElement(eleInstalledAssetsShowMoreIcon, driver, "InstalledAssetsShowMoreIcon");

		Thread.sleep(3000);
		for (int i = 0; i < InitializePages.o_assetsPage.getEleInstalledAssetsProList().size(); i++) {
			Thread.sleep(1000);
			WebElement installedassetsproduct = InitializePages.o_assetsPage.getEleInstalledAssetsProList().get(i);
			String productlist = ActionUtil.gettext(installedassetsproduct, driver, "Product List Value");
			ActionUtil.eleIsNotDisplayed(installedassetsproduct, driver, "Installed Asset Product", 4);
			if (productlist.contains(product)) {
				MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + elementName + "\'"
						+ " is displayed || " + "\'" + elementName + "\'" + " is not displayed ", ExtentColor.RED));
			} else {
				MyExtentListners.test.pass("Verify " + "\'" + elementName + "\'" + " is displayed || " + "\'"
						+ elementName + "\'" + " is displayed ");
			}

		}
	}

	public void verifyInsalledAssetsDefinitionValue() throws IOException {
		ActionUtil.scrollDown(driver);
		String statusvalue = ActionUtil.getAttributeValue(eleInstalledAssetsDefStatusvalue, driver, "Status Value");
		ActionUtil.verifyEqualsText("Verifying the status to be active", statusvalue, "Active");
	}

}
