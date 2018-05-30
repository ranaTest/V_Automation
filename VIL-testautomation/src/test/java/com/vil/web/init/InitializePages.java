package com.vil.web.init;


import com.vil.web.pages.BulkUploadPage;
import com.vil.web.pages.CAFSearchResultPage;
import com.vil.web.pages.ContactPage;
import com.vil.web.pages.DFFPage;
import com.vil.web.pages.DateAndDevicesPage;

import org.openqa.selenium.WebDriver;

import com.vil.web.pages.AccountsPage;
import com.vil.web.pages.ActivationsPage;
import com.vil.web.pages.AddressViewPage;
import com.vil.web.pages.AssetsPage;
import com.vil.web.pages.BillingAccountsPage;
import com.vil.web.pages.BinocularsSearchPage;
import com.vil.web.pages.LoginPage;
import com.vil.web.pages.MyLeadsPage;
import com.vil.web.pages.OpportunitiesListPage;
import com.vil.web.pages.OrderPage;
import com.vil.web.pages.PostpaidPage;
import com.vil.web.pages.PrepaidPage;
import com.vil.web.pages.PushSMSPage;
import com.vil.web.pages.QueuePage;
import com.vil.web.pages.QuickActionButtonsPage;
import com.vil.web.pages.QuickActionPage;
import com.vil.web.pages.SRActivitiesPage;
import com.vil.web.pages.SalesOrderPage;
import com.vil.web.pages.ServiceRequestPage;
import com.vil.web.pages.SimulatorPage;
import com.vil.web.pages.SubscriptionsSearchPage;
import com.vil.web.pages.TaggingInteractionPage;
import com.vil.web.pages.VASPage;
import com.vil.web.pages.ViewBarPage;
import com.vil.web.pages._360DegreePage;


public class InitializePages {
	
protected WebDriver driver;
	
	public static LoginPage o_loginPage;
	public static CAFSearchResultPage o_cafSearchPage;
	public static SimulatorPage o_simulatorPage;
	public static SubscriptionsSearchPage o_subscriptionPage;
	public static _360DegreePage o_360DegreePage;
	public static TaggingInteractionPage o_taggingInteractionPage;
	public static BinocularsSearchPage o_binacularsSearchPage;
	public static MyLeadsPage o_myLeadsPage;
	public static OpportunitiesListPage o_opportunitiesListPage;
	public static BulkUploadPage o_bulkUploadPage;
	public static DFFPage o_dffPage;
	public static ViewBarPage o_viewBarPage;
	public static PostpaidPage o_postPaidPage;
	public static BillingAccountsPage o_billingAccountsPage;
	public static ServiceRequestPage o_serviceRequestPage;
	public static AccountsPage o_accountPage;
	public static SalesOrderPage o_salesOrderPage;
	public static AssetsPage o_assetsPage;
	public static OrderPage o_orderPage;
	public static PushSMSPage o_pushSmsPage;
	public static QuickActionPage o_quickActionPage;
	public static SRActivitiesPage o_srActivitiesPage;
	public static ActivationsPage o_activationsPage;
	public static QueuePage o_queuePage;
	public static ContactPage o_conatctPage;
	public static AddressViewPage o_addressviewpage;
	public static VASPage o_vaspage;
	public static PrepaidPage o_prepaidpage;
	public static DateAndDevicesPage o_dateanddevicespage;
	
	public InitializePages(WebDriver driver) {
		this.driver = driver;
		o_loginPage = new LoginPage(driver);
		o_cafSearchPage = new CAFSearchResultPage(driver);
		o_simulatorPage = new SimulatorPage(driver);
		o_subscriptionPage = new SubscriptionsSearchPage(driver);
		o_360DegreePage = new _360DegreePage(driver);
		o_taggingInteractionPage = new TaggingInteractionPage(driver);
		o_binacularsSearchPage=new BinocularsSearchPage(driver);
		o_myLeadsPage=new MyLeadsPage(driver);
		o_opportunitiesListPage=new OpportunitiesListPage(driver);
		o_bulkUploadPage=new BulkUploadPage(driver);
		o_dffPage=new DFFPage(driver);
		o_viewBarPage=new ViewBarPage(driver);
		o_postPaidPage=new PostpaidPage(driver);
		o_billingAccountsPage=new BillingAccountsPage(driver);
		o_serviceRequestPage=new ServiceRequestPage(driver);
		o_accountPage=new AccountsPage(driver);
		o_salesOrderPage=new SalesOrderPage(driver);
		o_assetsPage=new AssetsPage(driver);
		o_orderPage=new OrderPage(driver);
		o_pushSmsPage=new PushSMSPage(driver);
		o_quickActionPage=new QuickActionPage(driver);
		o_srActivitiesPage=new SRActivitiesPage(driver);
		o_activationsPage=new ActivationsPage(driver);
		o_queuePage=new QueuePage(driver);
		o_conatctPage=new ContactPage(driver);
		o_addressviewpage=new AddressViewPage(driver);
		o_vaspage=new VASPage(driver);
		o_prepaidpage= new PrepaidPage(driver);
		o_dateanddevicespage=new DateAndDevicesPage(driver);
	}

}
