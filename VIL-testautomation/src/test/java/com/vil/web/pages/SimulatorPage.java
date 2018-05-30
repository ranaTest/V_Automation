
/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class contains Page objects and re-usable methods for Simualtor Page
* @methods 			: 		for uploading xml file to server
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

public class SimulatorPage implements TestDataHeadingsConstants {

	WebDriver driver;

	public SimulatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @description : Page Objects for Simualtor Page
	 * 
	 */

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

	@FindBy(xpath = "//ul[@class='sitemapCat']//a[text()='Simulator']")
	private WebElement eleSimulatorLnkTxt;

	public WebElement getEleSimulatorLnkTxt() {
		return eleSimulatorLnkTxt;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Service Name Section
	 */

	@FindBy(xpath = "//button[@name='s_5_1_19_0']")
	private WebElement eleServiceNameNewIcn;

	public WebElement getEleServiceNameNewIcn() {
		return eleServiceNameNewIcn;
	}

	@FindBy(xpath = "//input[@name='Service_Name']")
	private WebElement eleServiceNameTxtBx;

	public WebElement getEleServiceNameTxtBx() {
		return eleServiceNameTxtBx;
	}

	@FindBy(xpath = "//td[@id='1_s_5_l_Method_Name']")
	private WebElement eleHiddenMethodNameBtn;

	public WebElement getEleHiddenMethodNameBtn() {
		return eleHiddenMethodNameBtn;
	}

	@FindBy(xpath = "//input[@name='Method_Name']")
	private WebElement eleServiceMethodTxtBx;

	public WebElement getEleServiceMethodTxtBx() {
		return eleServiceMethodTxtBx;
	}
	@FindBy(xpath = "//button[@title='Service Methods:Load From File...']")
	private WebElement eleServiceLoadFromFileBtn;

	public WebElement getEleServiceLoadFromFileBtn() {
		return eleServiceLoadFromFileBtn;
	}
	@FindBy(xpath = "//input[@id='s_12_1_30_0']")
	private WebElement eleServiceChooseFileBtn;

	public WebElement getEleServiceChooseFileBtn() {
		return eleServiceChooseFileBtn;
	}
	
	@FindBy(xpath = "//button[@title='Service Methods:Run on One Input']")
	private WebElement eleRunOneOnIntputBtn;

	public WebElement getEleRunOneOnIntputBtn() {
		return eleRunOneOnIntputBtn;
	}
	@FindBy(xpath = "//button[@title='Service Methods:Run']")
	private WebElement eleRunBtn;

	public WebElement getEleRunBtn() {
		return eleRunBtn;
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Input Arguments
	 */

	@FindBy(xpath = "//button[@title='Input Arguments:New']")
	private WebElement eleInputArgumentsNewIcn;

	public WebElement getEleInputArgumentsNewIcn() {
		return eleInputArgumentsNewIcn;
	}

	@FindBy(xpath = "//td[@aria-labelledby='s_2_l_PropertyKey s_2_l_altmvg']")
	private WebElement eleHiddenPropertyNameBtn;

	public WebElement getEleHiddenPropertyNameBtn() {
		return eleHiddenPropertyNameBtn;
	}

	@FindBy(id = "s_2_2_30_0_icon")
	private WebElement elePropertyNameIcn;

	public WebElement getElePropertyNameIcn() {
		return elePropertyNameIcn;
	}

	@FindBy(xpath = "//button[@title='Property Set Properties:New']")
	private WebElement elePropertySetNewIcn;

	public WebElement getElePropertySetNewIcn() {
		return elePropertySetNewIcn;
	}

	@FindBy(xpath = "//input[@aria-label='Property Name']")
	private WebElement elePropertySetNameTxtBx;

	public WebElement getElePropertySetNameTxtBx() {
		return elePropertySetNameTxtBx;
	}

	@FindBy(xpath = "//input[@aria-label='Value']")
	private WebElement elePropertySetValueTxtBx;

	public WebElement getElePropertySetValueTxtBx() {
		return elePropertySetValueTxtBx;
	}

	@FindBy(xpath = "//button[@title='Property Set Properties:Save']")
	private WebElement elePropertySetSaveIcn;

	public WebElement getElePropertySetSaveIcn() {
		return elePropertySetSaveIcn;
	}

	@FindBy(xpath = "//button[@title='Property Set Properties:OK']")
	private WebElement elePropertySetOKBtn;

	public WebElement getElePropertySetOKBtn() {
		return elePropertySetOKBtn;
	}

	
	@FindBy(xpath = "//td[@id='2_s_2_l_PropertyKey']")
	private WebElement eleEndOfDataPropertyNameBtn;

	public WebElement getEleEndOfDataPropertyNameBtn() {
		return eleEndOfDataPropertyNameBtn;
	}
	
	@FindBy(xpath = "//span[@id='s_2_2_30_0_icon']")
	private WebElement eleEndOfDataPropertyNameIcn;

	public WebElement getEleEndOfDataPropertyNameIcn() {
		return eleEndOfDataPropertyNameIcn;
	}

	@FindBy(xpath = "//button[@title='Input Arguments:Load From File...']")
	private WebElement eleInputArgLoadFromFileBtn;

	public WebElement getEleInputArgLoadFromFileBtn() {
		return eleInputArgLoadFromFileBtn;
	}
	
	@FindBy(className = "siebui-ctrl-file")
	private WebElement eleChooseFileBtn;

	public WebElement getEleChooseFileBtn() {
		return eleChooseFileBtn;
	}
	
	@FindBy(xpath = "//button[@title='Load XML File:Load']")
	private WebElement eleLoadBtn;

	public WebElement getEleLoadBtn() {
		return eleLoadBtn;
	}
	
	@FindBy(xpath = "//td[@id='1_s_2_l_Value']")
	private WebElement eleHiddenInputArgumentsValueTxt;

	public WebElement getEleHiddenInputArgumentsValueTxt() {
		return eleHiddenInputArgumentsValueTxt;
	}
	
	@FindBy(xpath = "//input[@name='Value']")
	private WebElement eleInputArgumentsValueTxtBx;

	public WebElement getEleInputArgumentsValueTxtBx() {
		return eleInputArgumentsValueTxtBx;
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Output Arguments
	 */
	
	@FindBy(xpath = "//td[@id='1_s_4_l_PropertyKey']")
	private WebElement elePropertyKeyTxt;

	public WebElement getElePropertyKeyTxt() {
		return elePropertyKeyTxt;
	}
	
	@FindBy(xpath = "//button[@title='Output Arguments:Move To Input']")
	private WebElement eleMoveToInputBtn;

	public WebElement getEleMoveToInputBtn() {
		return eleMoveToInputBtn;
	}

	@FindBy(xpath = "//td[@id='1_s_4_l_Value']")
	private WebElement eleOutputArgumentsValueTxt;

	public WebElement getEleOutputArgumentsValueTxt() {
		return eleOutputArgumentsValueTxt;
	}
	
	
	
	/***********************************************************************
	 * @author : Srinivas Hippargi
	 * @throws Exception
	 * @description : Re-usable methods to simulator stub integration
	 *              implementation
	 * 
	 */

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to navigate simulator
	 * 
	 * @parameters :
	 */

	public void navigateToSimualtorScreen(WebDriver driver) throws Exception {
		
		ActionUtil.waitForElement(getEleSiteMapIcn(), driver, " Site Map Icon ",2);
		ActionUtil.clickElement(getEleSiteMapIcn(), driver, " Site Map Icon ");
		ActionUtil.type(getEleCAFFormSearchTxtBx(), "Simulator", "Simulator Under Administration - Business Service", driver);
		ActionUtil.clickElement(getEleSimulatorLnkTxt(), driver, " Simulator Link Text");
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add service name 
	 * 
	 * @parameters : ServiceName, MethodName
	 * 
	 * @Value : EAI File Transport,Receive
	 * @Value : Workflow Process Manager, RunProcess
	 */
	
	public void addEAIServiceRequest(String eaiServiceName,String eaiMethodName) throws Exception {
		
		ActionUtil.waitForElement(getEleServiceNameNewIcn(), driver, " Service Methods : New");
		ActionUtil.clickElement(getEleServiceNameNewIcn(), driver, " Service Methods : New");
		ActionUtil.type(getEleServiceNameTxtBx(), eaiServiceName, "Service Name Text box", driver);
		ActionUtil.clickElement(getEleHiddenMethodNameBtn(), driver, " Method Name  ");
		ActionUtil.type(getEleServiceMethodTxtBx(), eaiMethodName, "Service Name Text box", driver);
		
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add service name 
	 * 
	 * @parameters : ServiceName, MethodName
	 * 
	 * @Value : EAI File Transport,Receive
	 * @Value : Workflow Process Manager, RunProcess
	 */
	
	public void addWFServiceRequest(String wfServiceName,String wfMethodName) throws Exception {

		ActionUtil.waitForElement(getEleServiceNameNewIcn(), driver, " Service Methods : New");
		ActionUtil.clickElement(getEleServiceNameNewIcn(), driver, " Service Methods : New");
		ActionUtil.type(getEleServiceNameTxtBx(), wfServiceName, "Service Name Text box", driver);
		ActionUtil.clickElement(getEleHiddenMethodNameBtn(), driver, " Method Name  ");
		ActionUtil.type(getEleServiceMethodTxtBx(), wfMethodName, "Service Method Text box", driver);
		
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add input arguments
	 * 
	 * @parameters : PropertyName, PropertyValue
	 * 
	 * @Value : FileName,/siebelfs/int_log/CAF.xml
	 * 
	 */
	
	public void addInputArguments(String PropertyName,String PropertyValue) throws Exception {

		ActionUtil.waitForElement(getEleInputArgumentsNewIcn(), driver, " Input Arguments : New");
		ActionUtil.clickElement(getEleInputArgumentsNewIcn(), driver, " Input Arguments : New");
		ActionUtil.clickElement(getEleHiddenPropertyNameBtn(), driver, " Property Name ");
		ActionUtil.clickElement(getElePropertyNameIcn(), driver, " Property Name Icon ");
		ActionUtil.clickElement(getElePropertySetNewIcn(), driver, " Property Set Properties : New ");
		ActionUtil.type(getElePropertySetNameTxtBx(),PropertyName , " Property Name Text Box", driver);
		ActionUtil.type(getElePropertySetValueTxtBx(), PropertyValue, " Property Value Text Box", driver);
		ActionUtil.clickElement(getElePropertySetSaveIcn(), driver, " Property Save Icon ");
		ActionUtil.clickElement(getElePropertySetOKBtn(), driver, " Property Set Ok button");
		
		
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: validate property key is EndOfData or not
	 */
	
	public void validatePropertyKey(WebDriver driver) throws Exception{
		
		String endOfData=ActionUtil.gettext(getElePropertyKeyTxt(), driver, " Property Key ");
		if(endOfData.equalsIgnoreCase("EndOfData")){
			ActionUtil.clickElement(getEleMoveToInputBtn(), driver, " Move To Input Button ");
		}else{
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to click on " + "\'" + "EndOfData"
					+ "\'" + " || User is not able to click on " + "\'" + "EndOfData" + "\'", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(ActionUtil.capture(driver,getElePropertyKeyTxt()));
			throw new Exception();
		}
		
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: add input arguments
	 * 
	 * @parameters : PropertyName, PropertyValue
	 * 
	 * @Value : ProcessName,TM CAF Account Order
	 * 
	 */
	
	public void changeInputArguments(String PropertyName, String PropertyValue) throws Exception {
		
		ActionUtil.clickElement(getEleEndOfDataPropertyNameBtn(), driver, " End Of Data Property Name");
		ActionUtil.clickElement(getEleEndOfDataPropertyNameIcn(), driver, " End Of Data Icon");
		ActionUtil.waitForElement(getEleInputArgumentsNewIcn(), driver, " Input Arguments : New");
		ActionUtil.clickElement(getElePropertySetNewIcn(), driver, " Property Set Properties : New ");
		ActionUtil.type(getElePropertySetNameTxtBx(), PropertyName, " Property Name Text Box", driver);
		ActionUtil.type(getElePropertySetValueTxtBx(), PropertyValue, " Property Value Text Box", driver);
		ActionUtil.clickElement(getElePropertySetSaveIcn(), driver, " Property Save Icon ");
		ActionUtil.clickElement(getElePropertySetOKBtn(), driver, " Property Set Ok button");

	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: simulate response in input argumnets with PropertyName , PropertyValue and Value as xml response in one line
	 * 
	 */
	
	public void simulateXmlResponseAsValue(String PropertyName, String PropertyValue,String xmlMessage) throws Exception {
		
		ActionUtil.waitForElement(getEleInputArgumentsNewIcn(), driver, " Input Arguments : New");
		ActionUtil.clickElement(getEleInputArgumentsNewIcn(), driver, " Input Arguments : New");
		ActionUtil.clickElement(getEleHiddenPropertyNameBtn(), driver, " Property Name ");
		ActionUtil.clickElement(getElePropertyNameIcn(), driver, " Property Name Icon ");
		ActionUtil.clickElement(getElePropertySetNewIcn(), driver, " Property Set Properties : New ");
		ActionUtil.type(getElePropertySetNameTxtBx(),PropertyName , " Property Name Text Box", driver);
		ActionUtil.type(getElePropertySetValueTxtBx(), PropertyValue, " Property Value Text Box", driver);
		ActionUtil.clickElement(getElePropertySetSaveIcn(), driver, " Property Save Icon ");
		ActionUtil.clickElement(getElePropertySetOKBtn(), driver, " Property Set Ok button");
		ActionUtil.waitForElement(getEleHiddenInputArgumentsValueTxt(), driver, "Input Arguments Value");
		ActionUtil.clickElement(getEleHiddenInputArgumentsValueTxt(),driver," Input Arguments Value " );
		ActionUtil.type(getEleInputArgumentsValueTxtBx(), xmlMessage, " Input Arguments Value Text Box ", driver);
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Load Top Applet
	 * 
	 * @parameters :
	 */
	
	public void simulateTopApplet(String filePath) throws Exception{
		
		ActionUtil.waitForElement(getEleServiceLoadFromFileBtn(), driver, " Load From File..",1);
		ActionUtil.clickElement(getEleServiceLoadFromFileBtn(), driver, " Load From File..");
		ActionUtil.clickElement(getEleChooseFileBtn(), driver, " Choose File Button ");
		ActionUtil.uploadFile(filePath, getEleServiceLoadFromFileBtn(),driver);
		ActionUtil.waitForElement(getEleLoadBtn(), driver, " Load Button");
		ActionUtil.clickElement(getEleLoadBtn(), driver, " Load Button");	
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Convert XML file into String Split Lead and get only Lead Id
	 * 
	 */
	
	public String getLeadId(String dom){
		dom=dom.replaceAll("<", "").replaceAll(">", "").replaceAll("/", "");
		String[] splitDom=dom.split("leadId");
		String[] splitLeadId=splitDom[1].split("leadId");
		String leadId=splitLeadId[0];
		return leadId;
	}
}
