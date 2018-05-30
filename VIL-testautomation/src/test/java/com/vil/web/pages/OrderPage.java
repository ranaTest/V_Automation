package com.vil.web.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.init.InitializePages;
import com.vil.web.utils.ActionUtil;

public class OrderPage {

	WebDriver driver;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description:PageObjects For SalesOrder Applet in Orders Page
	 */

	@FindBy(xpath = "//td[@aria-labelledby='s_13_l_Order_Number']")
	private WebElement eleOrderNumTxtBx;

	public WebElement geteleOrderNumTxtBx() {
		return eleOrderNumTxtBx;
	}

	@FindBy(xpath = "//div[text()='Product']/../../../../../../..//td[@aria-labelledby='s_5_l_Product']")
	private List<WebElement> eleProductValues;

	public List<WebElement> getEleProductValues() {
		return eleProductValues;
	}

	@FindBy(xpath = "//div[text()='Product']/../../../../../../..//td[@aria-labelledby='s_5_l_Action_Code']")
	private List<WebElement> eleActionCodeValues;

	public List<WebElement> getEleActionCodeValues() {
		return eleActionCodeValues;
	}

	@FindBy(xpath = "//div[text()='Status']/../../../../../../..//td[@aria-labelledby='s_5_l_Status']")
	private List<WebElement> eleStatusValues;

	public List<WebElement> geteleStatusValues() {
		return eleStatusValues;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Method for verifying Line Item Values-Product,Action Code
	 * and Status
	 */

	public void verifyLineItemsProductValues(String product, String actioncode, String status)
			throws IOException, InterruptedException {

		Thread.sleep(3000);
		// ActionUtil.clickElement(eleInstalledAssetsProdDrpdwn, driver,
		// "InstalledAssetsProdDrpdwn");
		// ActionUtil.clickElement(eleInstalledAssetsShowMoreIcon, driver,
		// "InstalledAssetsShowMoreIcon");

		// Thread.sleep(3000);
		for (int i = 0; i < InitializePages.o_orderPage.getEleProductValues().size(); i++) {

			WebElement lineitemsproducts = InitializePages.o_orderPage.getEleProductValues().get(i);
			String productvalue = ActionUtil.gettext(lineitemsproducts, driver, "Line Item Product Value");

			if (productvalue.contains(product)) {
				WebElement lineitemsactioncode = InitializePages.o_orderPage.getEleActionCodeValues().get(i);
				String lineitemsactioncodevalue = ActionUtil.gettext(lineitemsactioncode, driver,
						"Line Item Action Code Value");
				System.out.println(lineitemsactioncodevalue);
				ActionUtil.verifyEqualsText("Verifying the action code value", lineitemsactioncodevalue, actioncode);
				WebElement lineitemsstatus = InitializePages.o_orderPage.geteleStatusValues().get(i);
				String lineitemsstatusvalue = ActionUtil.gettext(lineitemsstatus, driver, "Line Item Status Value");
				System.out.println(lineitemsstatusvalue);
				ActionUtil.verifyEqualsText("Verifying the status value", lineitemsstatusvalue, status);

				// WebElement
				// installedassetsproductsecondcell=InitializePages.o_assetsPage.getEleInstalledAssetsProListSecondColumn().get(i+1);
				// ActionUtil.clickElement(installedassetsproductsecondcell,
				// driver, "SecondColumnClick");
			}

		}
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description:PageObjects For SalesOrder Applet in Orders Page
	 */

	@FindBy(xpath = "//a[text()='Orders']")
	private WebElement eleOrdersBtn;

	public WebElement getEleOrdersBtn() {
		return eleOrdersBtn;
	}

	@FindBy(xpath = "//div[@class='ui-jqgrid-bdiv']/div/table[@summary='Sales Order']/tbody/tr[2]/td[3]")
	private WebElement eleProdTxtBx;

	public WebElement getEleProdTxtBx() {
		return eleProdTxtBx;
	}

	/*
	 * @author:Shruti Agarwal
	 * 
	 * Description: Method for verifying the Sales Order Values in Orders Page.
	 */
	public void verifySalesOrderValues(String status) throws IOException, InterruptedException {
		ActionUtil.clickElement(eleOrdersBtn, driver, "Order Button");
		Thread.sleep(2000);
		ActionUtil.scrollIntoView(driver, eleProdTxtBx);
		System.out.println("shruti");
		String elevalue = ActionUtil.gettext(eleProdTxtBx, driver, "SalesOrderStatus");
		System.out.println(elevalue);
		ActionUtil.verifyEqualsText("SalesOrder Status Verfication", status, elevalue);

	}

}
