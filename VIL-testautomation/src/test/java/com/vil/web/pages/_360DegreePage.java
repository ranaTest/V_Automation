/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains 360 degree page objects and re-usable methods
* @methods 			: 		
*/

package com.vil.web.pages;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.reports.MyExtentListners;
import com.vil.web.utils.ActionUtil;

public class _360DegreePage {

	WebDriver driver;

	public _360DegreePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid 360 Degree Page Heading Tabs
	 */
	
	@FindBy(xpath = "//a[text()='360 Degree']")
	private WebElement ele360DegreeBtn;

	public WebElement getEle360DegreeBtn() {
		return ele360DegreeBtn;
	}
	
	@FindBy(xpath = "//a[text()='Active Services']")
	private WebElement eleActiveServicesBtn;

	public WebElement getEleActiveServicesBtn() {
		return eleActiveServicesBtn;
	}
	
	@FindBy(xpath = "//a[text()='SR History']")
	private WebElement eleSRHistoryBtn;

	public WebElement getEleSRHistoryBtn() {
		return eleSRHistoryBtn;
	}
	
	// for row id
	
	@FindBy(xpath = "//div[@aria-label='Row #']")
	private WebElement eleRowIdTxt;

	public WebElement getEleRowIdTxt() {
		return eleRowIdTxt;
	}
	
	@FindBy(xpath = "//button[@title='About Record:OK']")
	private WebElement eleRowIdOkBtn;

	public WebElement getEleRowIdOkBtn() {
		return eleRowIdOkBtn;
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid 360 Degree Page Details Applet
	 */
	
	@FindBy(xpath = "//input[@aria-label='Asset']")
	private WebElement eleAssetTxt;

	public WebElement getEleAssetTxt() {
		return eleAssetTxt;
	}
	@FindBy(xpath = "//span[text()='Subscriber']/../../..//label[@id='s_1_1_87_0_Label']")
	private WebElement eleSubscriberTxt;

	public WebElement getEleSubscriberTxt() {
		return eleSubscriberTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Company Name']/../../..//label)[1]")
	private WebElement eleCompanyNameTxt;

	public WebElement getEleCompanyNameTxt() {
		return eleCompanyNameTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Rltshp No./ FA ID']/../../..//label)[1]")
	private WebElement eleFAIdTxt;

	public WebElement getEleFAIdTxt() {
		return eleFAIdTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Operating Status']/../../..//label)[1]")
	private WebElement eleOperatingStatusTxt;

	public WebElement getEleOperatingStatusTxt() {
		return eleOperatingStatusTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Status']/../../..//label)[1]")
	private WebElement eleStatusTxt;

	public WebElement getEleStatusTxt() {
		return eleStatusTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Billing Media']/../../..//label)[1]")
	private WebElement eleBillingMediaTxt;

	public WebElement getEleBillingMediaTxt() {
		return eleBillingMediaTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Bill Date']/../../..//label)[1]")
	private WebElement eleBillDateTxt;

	public WebElement getEleBillDateTxt() {
		return eleBillDateTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Credit Limit']/../../..//label)[1]")
	private WebElement eleCreditLimitTxt;

	public WebElement getEleCreditLimitTxt() {
		return eleCreditLimitTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Credit Status']/../../..//label)[1]")
	private WebElement eleCreditStatusTxt;

	public WebElement getEleCreditStatusTxt() {
		return eleCreditStatusTxt;
	}
	
	@FindBy(xpath = "//span[text()='GST Flag']/../../..//label")
	private WebElement eleGSTFlagTxt;

	public WebElement getEleGSTFlagTxt() {
		return eleGSTFlagTxt;
	}
	
	@FindBy(xpath = "(//span[text()='AON']/../../..//label)[1]")
	private WebElement eleAONTxt;

	public WebElement getEleAONTxt() {
		return eleAONTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Activation Date']/../../..//label)[2]")
	private WebElement eleActivationDateTxt;

	public WebElement getEleActivationDateTxt() {
		return eleActivationDateTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Tariff Plan']/../../..//label)[2]")
	private WebElement eleTariffPlanTxt;

	public WebElement getEleTariffPlanTxt() {
		return eleTariffPlanTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Category']/../../..//label)[2]")
	private WebElement eleCategoryTxt;

	public WebElement getEleCategoryTxt() {
		return eleCategoryTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Subscriber Type']/../../..//label)[2]")
	private WebElement eleSubscriberTypeTxt;

	public WebElement getEleSubscriberTypeTxt() {
		return eleSubscriberTypeTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Segment']/../../..//label)[2]")
	private WebElement eleSegmentTxt;

	public WebElement getEleSegmentTxt() {
		return eleSegmentTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Customer Class']/../../..//label)[2]")
	private WebElement eleCustomerClassTxt;

	public WebElement getEleCustomerClassTxt() {
		return eleCustomerClassTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Bundle Name']/../../..//label)[2]")
	private WebElement eleBundleNameTxt;

	public WebElement getEleBundleNameTxt() {
		return eleBundleNameTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Enterprise Code']/../../..//label)[2]")
	private WebElement eleEnterpriseCodeTxt;

	public WebElement getEleEnterpriseCodeTxt() {
		return eleEnterpriseCodeTxt;
	}
	
	@FindBy(xpath = "(//span[text()='Alt Number']/../../..//label)[2]")
	private WebElement eleAltNumberTxt;

	public WebElement getEleAltNumberTxt() {
		return eleAltNumberTxt;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid 360 Degree Page Elements List
	 */
	
	@FindBy(xpath = "(//form[@name='SWEForm1_0']//table)[1]//div[@class='mceGridField siebui-value mceField']//label")
	private List<WebElement> ele360DegreePageDataValuesLst;

	public List<WebElement> getEle360DegreePageDataValuesLst() {
		return ele360DegreePageDataValuesLst;
	}

	@FindBy(xpath = "(//form[@name='SWEForm1_0']//table)[1]//div[@class='mceGridLabel siebui-label mceLabel']")
	private List<WebElement> elele360DegreePageKeysLst;

	public List<WebElement> getElele360DegreePageKeysLst() {
		return elele360DegreePageKeysLst;
	}

	@FindBy(xpath = "//form[@name='SWEForm6_0']//table//td[@aria-labelledby='s_6_l_Indicator_Value1']")
	private List<WebElement> eleIndicatorsValueLst;

	public List<WebElement> getEleIndicatorsValueLst() {
		return eleIndicatorsValueLst;
	}

	@FindBy(xpath = "//form[@name='SWEForm6_0']//table//td[@aria-labelledby='s_6_l_Indicator_Name']")
	private List<WebElement> eleIndicatorsKeysLst;

	public List<WebElement> getEleIndicatorsKeysLst() {
		return eleIndicatorsKeysLst;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Postpaid 360 Degree Page || Installed Assets || Product Details Section
	 */
	
	@FindBy(xpath = "//a[@name='Product Name']")
	private WebElement eleProductNameTxt;

	public WebElement getEleProductNameTxt() {
		return eleProductNameTxt;
	}	
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Install_Date')]")
	private WebElement eleProdInstallDateTxt;

	public WebElement getEleProdInstallDateTxt() {
		return eleProdInstallDateTxt;
	}	
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Status')]")
	private WebElement eleProdStatusTxt;

	public WebElement getEleProdStatusTxt() {
		return eleProdStatusTxt;
	}	
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Prod_Prom_Name')]")
	private WebElement eleProdPromoNameTxt;

	public WebElement getEleProdPromoNameTxt() {
		return eleProdPromoNameTxt;
	}	
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Operating_Status')]")
	private WebElement eleProdOperatingStatusTxt;

	public WebElement getEleProdOperatingStatusTxt() {
		return eleProdOperatingStatusTxt;
	}
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Promotion_Payment_Type')]")
	private WebElement eleProdPaymentTxt;

	public WebElement getEleProdPaymentTxt() {
		return eleProdPaymentTxt;
	}
	
	@FindBy(xpath = "//a[@name='Serial Number']")
	private WebElement eleProdMSISDNTxt;

	public WebElement getEleProdMSISDNTxt() {
		return eleProdMSISDNTxt;
	}
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Billing_Profile_Name')]")
	private WebElement eleProdBillingProfileTxt;

	public WebElement getEleProdBillingProfileTxt() {
		return eleProdBillingProfileTxt;
	}
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Product_Type')]")
	private WebElement eleProductTypeTxt;

	public WebElement getEleProductTypeTxt() {
		return eleProductTypeTxt;
	}
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Owner_Account')]")
	private WebElement eleProdOwnerAccountTxt;

	public WebElement getEleProdOwnerAccountTxt() {
		return eleProdOwnerAccountTxt;
	}
	
	@FindBy(xpath = "//td[contains(@aria-labelledby,'Start_Date')]")
	private WebElement eleProdEffectiveFromTxt;

	public WebElement getEleProdEffectiveFromTxt() {
		return eleProdEffectiveFromTxt;
	}
	
	@FindBy(xpath = "//a[@name='Billing Account']")
	private WebElement eleProdBillingAccountTxt;

	public WebElement getEleProdBillingAccountTxt() {
		return eleProdBillingAccountTxt;
	}
	
	@FindBy(xpath = "//tr[@id='2']/../..//a[@name='Product Name']")
	private List<WebElement> eleProductsLst;

	public List<WebElement> getEleProductsLst() {
		return eleProductsLst;
	}
	
	
	
	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @description : Re-usable methods for Verify 360DegreePage and Verify
	 *                Indicators Values
	 * 
	 */
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method verifies all values of 360 degree pages
	 */
	public void verify360DegreePageLoaded() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyExtentListners.test
				.info(MarkupHelper.createLabel("360 DEGREE PAGE CONTAINS DETAILS AS BELOW :", ExtentColor.TEAL));
		String eleKey;
		String eleValue;
		for (int i = 0; i < getElele360DegreePageKeysLst().size(); i++) {
			eleKey = getElele360DegreePageKeysLst().get(i).getText();
			for (int j = i; j < i; j++) {
				eleValue = getEle360DegreePageDataValuesLst().get(i).getText();
				MyExtentListners.test.info(MarkupHelper.createLabel(
						" ---Key : " + "\"" + eleKey + "\"" + " --- Value : " + "\"" + eleValue + "\"",
						ExtentColor.TEAL));
			}

		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method verifies indicator values
	 */
	public void verifyIndicatorsValues() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyExtentListners.test
				.info(MarkupHelper.createLabel("INDICATORS VALUE PAGE CONTAINS DETAILS AS BELOW :", ExtentColor.TEAL));
		String eleKey;
		String eleValue;
		for (int i = 0; i < getEleIndicatorsKeysLst().size(); i++) {
			eleKey = getEleIndicatorsKeysLst().get(i).getText();
			for (int j = i; j <= i; j++) {
				eleValue = getEleIndicatorsValueLst().get(i).getText();
				MyExtentListners.test.info(MarkupHelper.createLabel(
						" ---Key : " + "\"" + eleKey + "\"" + " --- Value : " + "\"" + eleValue + "\"",
						ExtentColor.TEAL));
			}
		}
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Verify Operating status
	 */
	
	public void validateOpeartingStatus(String opratingStatus) throws Exception{
		
		String _360OperatingStatus=ActionUtil.gettext(getEleOperatingStatusTxt(), driver, " Operating status Text");
		System.out.println("-----------------" + _360OperatingStatus);
		if(_360OperatingStatus.equalsIgnoreCase(opratingStatus)){
			MyExtentListners.test.pass( " Operating Status is  : " +"\"" + opratingStatus + "\""+ " is displayed");
		}else{
			MyExtentListners.test.fail(MarkupHelper.createLabel(" Operating Status is  : " + "\"" + opratingStatus + "\"" + " is not displayed", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
			throw new Exception();
		}
	}


	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: This method verifies indicator value
	 */
	public void verifyIndicatorsValue(String key,String value) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyExtentListners.test
				.info(MarkupHelper.createLabel("INDICATORS VALUE PAGE CONTAINS DETAILS AS BELOW :", ExtentColor.TEAL));
		String eleKey;
		String eleValue;
		for (int i = 0; i < getEleIndicatorsKeysLst().size(); i++) {
			eleKey = getEleIndicatorsKeysLst().get(i).getText();
			if(eleKey.equals(key))
			{
				eleValue = getEleIndicatorsValueLst().get(i).getText();
				ActionUtil.verifyEqualsText("Verifying the Indicator Value", value, eleValue);
			}
			
				
			
		}
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Verify Operating status
	 */
	
	public void validateStatus(String opratingStatus) throws Exception{
		
		String status=ActionUtil.gettext(getEleStatusTxt(), driver, " Status Text");
		System.out.println("-----------------" + status);
		if(status.equalsIgnoreCase(opratingStatus)){
			MyExtentListners.test.pass( " Operating Status is  : " +"\"" + opratingStatus + "\""+ " is displayed");
		}else{
			MyExtentListners.test.fail(MarkupHelper.createLabel(" Status is  : " + "\"" + opratingStatus + "\"" + " is not displayed", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver));
			throw new Exception();
		}
	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Validate 360 Degree Assets With Promo 
	 */
	
	public void validate360DegreeWithPromotion(WebDriver driver) throws IOException, InterruptedException{
		Thread.sleep(10000);
		ActionUtil.waitForElement(getEle360DegreeBtn(), driver, " 360 Degree Page ",5);
		ActionUtil.clickElement(getEle360DegreeBtn(), driver, " 360 Degree Page ");
		String companyName=ActionUtil.gettext(getEleCompanyNameTxt(), driver, " Company Name ");
		System.out.println(companyName);
		String ownerAccount=ActionUtil.gettext(getEleProdOwnerAccountTxt(), driver, " Owner Account ");
		System.out.println(ownerAccount);
		ActionUtil.verifyEqualsText("Company Name",companyName, ownerAccount);
		String operatingStatus=ActionUtil.gettext(getEleOperatingStatusTxt(), driver, " Opearting Status ");
		String prodOperatingStatus=ActionUtil.gettext(getEleProdOperatingStatusTxt(), driver, " Promo Operating Status");
		ActionUtil.verifyEqualsText("Opearting Status",operatingStatus, prodOperatingStatus);
		String status=ActionUtil.gettext(getEleStatusTxt(), driver, " Status ");
		String prodStatus=ActionUtil.gettext(getEleProdStatusTxt(), driver, " Product Status ");
		ActionUtil.verifyEqualsText(" Status ",status, prodStatus);
		String bundleName=ActionUtil.gettext(getEleBundleNameTxt(), driver, " Bundle Name ");
		String productName=ActionUtil.gettext(getEleProductNameTxt(), driver, " Product Name ");
		ActionUtil.verifyEqualsText(" Bundle Name ",bundleName, productName);
		/*String activationDate=ActionUtil.gettext(getEleActivationDateTxt(), driver, " Activation Date ");
		String effectiveDate=ActionUtil.gettext(getEleProdEffectiveFromTxt(), driver, " Effective  Date ");
		ActionUtil.verifyEqualsText(" Activation Date ",activationDate, effectiveDate);*/
		String tarrifPlan=ActionUtil.gettext(getEleTariffPlanTxt(), driver, " Tarrif Plan ");
		String promotion=ActionUtil.gettext(getEleProdPromoNameTxt(), driver, " Promotion ");
		ActionUtil.verifyContainsText(promotion, tarrifPlan," Promotion ");
		String billingProfile=ActionUtil.gettext(getEleProdBillingProfileTxt(), driver, " Billing Profile ");
		ActionUtil.verifyIsNull(billingProfile, " Billing Profile Unique Id ");
		String paymentType=ActionUtil.gettext(getEleProdBillingProfileTxt(), driver, " Billing Profile ");
		//code to verify order is generated in product list
		for(int i=0;i<getEleProductsLst().size();i++){
			String prodName=ActionUtil.gettext(getEleProductsLst().get(i), driver, " Product Name ");
		}
		
	}
	
}
