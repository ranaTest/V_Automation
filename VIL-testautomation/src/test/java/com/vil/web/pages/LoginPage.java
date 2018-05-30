/***********************************************************************
* @author 			:		Srinivas Hippargi
* @description		: 		This class Contains Page objects and re-usable methods for Login Page
* @methods 			: 		login(),barosaChallenge().
*/

package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.library.GenericLib;
import com.vil.web.utils.ActionUtil;
import com.vil.web.utils.TestDataHeadingsConstants;

public class LoginPage implements TestDataHeadingsConstants{
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Page Objects for Login Page
	 * 
	 */

	@FindBy(id = "username")
	private WebElement eleUserNameTxtFld;

	public WebElement getEleUserNameTxtFld() {
		return eleUserNameTxtFld;
	}
	
	

	@FindBy(id = "password")
	private WebElement elePasswordTxtFld;

	public WebElement getElePasswordTxtFld() {
		return elePasswordTxtFld;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement eleLoginSubmitBtn;

	public WebElement getEleLoginSubmitBtn() {
		return eleLoginSubmitBtn;
	}

	@FindBy(id = "Bharosa_Challenge_PadDataField")
	private WebElement eleBharosaChallengeTxtFld;

	public WebElement getEleBharosaChallengeTxtFld() {
		return eleBharosaChallengeTxtFld;
	}

	@FindBy(className = "question")
	private WebElement eleQuestionTxt;

	public WebElement getEleQuestionTxt() {
		return eleQuestionTxt;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement eleAnswerContinueBtn;

	public WebElement getEleAnswerContinueBtn() {
		return eleAnswerContinueBtn;
	}

	@FindBy(xpath = "//li[@name='Root']")
	private WebElement eleLogoutIcn;

	public WebElement getEleLogoutIcn() {
		return eleLogoutIcn;
	}

	@FindBy(xpath = "//button[@title='Logout']")
	private WebElement eleLogoutBtn;

	public WebElement getEleLogoutBtn() {
		return eleLogoutBtn;
	}
	
	
	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	* @description		: 		FST Page Objects
	* 
	*/
	
	@FindBy(name = "SWEUserName")
	private WebElement eleFSTUserNameTxtFld;

	public WebElement getEleFSTUserNameTxtFld() {
		return eleFSTUserNameTxtFld;
	}
	
	

	@FindBy(name = "SWEPassword")
	private WebElement eleFSTPasswordTxtFld;

	public WebElement getEleFSTPasswordTxtFld() {
		return eleFSTPasswordTxtFld;
	}

	@FindBy(id = "s_swepi_22")
	private WebElement eleFSTLoginSubmitBtn;

	public WebElement getEleFSTLoginSubmitBtn() {
		return eleFSTLoginSubmitBtn;
	}
	

	/***********************************************************************
	* @author 			:		Srinivas Hippargi
	* @description		: 		Re-usable methods for login, barosa challenge and logout
	* 
	*/
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to login for application with usr/passwd from
	 * 
	 */

	public void uatLogin(String filepath,String sheetname,String testcaseID) throws Exception {
	
		int username = GenericLib.getColumnIndex(filepath, sheetname,USERNAME);
		int password = GenericLib.getColumnIndex(filepath, sheetname,PASSWORD);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.type(getEleUserNameTxtFld(), sData[username], " USERNAME text field ", driver);
		ActionUtil.type(getElePasswordTxtFld(), sData[password], " PASSWORD text field ", driver);
		ActionUtil.clickElement(getEleLoginSubmitBtn(), driver, " Login Button");
	}

	 /* @author:Srinivas Hippargi
	 * 
	 * Description: This method is to login for application with usr/passwd from
	 * 
	 * property file Config.properties
	 */

	public void fstLogin(String filepath,String sheetname,String testcaseID) throws Exception {
		int username = GenericLib.getColumnIndex(filepath, sheetname,USERNAME);
		int password = GenericLib.getColumnIndex(filepath, sheetname,PASSWORD);

		String[] sData = GenericLib.toReadExcelData(filepath, sheetname, testcaseID);
		ActionUtil.waitForElement(getEleFSTUserNameTxtFld(), driver, " USERNAME text field ");
		ActionUtil.type(getEleFSTUserNameTxtFld(), sData[username], " USERNAME text field ", driver);
		ActionUtil.type(getEleFSTPasswordTxtFld(), sData[password], " PASSWORD text field ", driver);
		ActionUtil.waitForElement(getEleFSTLoginSubmitBtn(), driver, " USERNAME text field ");
		ActionUtil.clickElement(getEleFSTLoginSubmitBtn(), driver, " Login Button");
	}
	
	 /* @author:Srinivas Hippargi
		 * 
		 * Description: This method is to login for application with usr/passwd from
		 * 
		 * property file Config.properties
		 */

		public void fstLogin(String username,String password) throws Exception {
	
			ActionUtil.waitForElement(getEleFSTUserNameTxtFld(), driver, " USERNAME text field ");
			ActionUtil.type(getEleFSTUserNameTxtFld(), username, " USERNAME text field ", driver);
			ActionUtil.type(getEleFSTPasswordTxtFld(), password, " PASSWORD text field ", driver);
			ActionUtil.clickElement(getEleFSTLoginSubmitBtn(), driver, " Login Button");
		}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to answer for question to check bharosa
	 * challenge 
	 * it will split the question takes last word as a answer
	 * 
	 * 
	 */
	public void barosaChallenge() throws Exception {
		System.out.println(" Answering the question");
		String question = getEleQuestionTxt().getText();
		String split[]=question.split(" ");
		String challenge=split[split.length-1];
		String challengeValue=challenge.substring(0, challenge.length()-1);
		ActionUtil.type(getEleBharosaChallengeTxtFld(), challengeValue, "Bharosa Challenge Text Field" , driver);
		ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");
		
		
		/*
		
		if (question.contains("job")) {
			ActionUtil.type(getEleBharosaChallengeTxtFld(), "job", " Enter child cickname ", driver);

			ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");

		} else if (question.contains("child")) {
			ActionUtil.type(getEleBharosaChallengeTxtFld(), "child", " Enter city name ", driver);

			ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");

		} else if (question.contains("city")) {
			ActionUtil.type(getEleBharosaChallengeTxtFld(), "city", " Enter subject ", driver);

			ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");
		} else if (question.contains("father")) {
			ActionUtil.type(getEleBharosaChallengeTxtFld(), "name", " Enter subject ", driver);

			ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");
		} else if (question.contains("birthday")) {
			ActionUtil.type(getEleBharosaChallengeTxtFld(), "birthday", " Enter subject ", driver);

			ActionUtil.clickElement(getEleAnswerContinueBtn(), driver, " Continue Button");
		}*/

		System.out.println(" Bharosa Challenge is success");
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to logout from application
	 * 
	 */
	
	public void logout() throws IOException, InterruptedException {
		System.out.println("in logout");
		Thread.sleep(2000);
		ActionUtil.waitForElement(getEleLogoutIcn(), driver, "Logout");
		ActionUtil.clickElement(getEleLogoutIcn(), driver, " Logout Root");
		Thread.sleep(2000);
		ActionUtil.clickElement(getEleLogoutBtn(), driver, " Logout Button");
	}

}
