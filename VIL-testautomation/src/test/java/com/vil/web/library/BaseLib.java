/***********************************************************************
* @author 			:		Rana Thakur
* @description		: 		BaseClass written web , which helps us to launch browser and application dependent re-usables
* @methods 			: 		browserLaunch()
*/



package com.vil.web.library;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseLib {
	
	
	public WebDriver driver = null;
	public static String host;
	public static String port;
	public static String sid;
	public static String username;
	public static String password;
	public static Connection connection;
	public static Statement stmt;

	public static String env;
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Pre-Condition
	 * 				Open connectin for DB
	 */
	@BeforeSuite
	public static void DBConnection() {
		try {
			Properties p = GenericLib.getPropertyFile(GenericLib.sDirPath + "/propertyfiles/dbconfig.properties");
			host = p.getProperty("HOSTNAME");
			port = p.getProperty("PORT");
			sid = p.getProperty("SID");
			username = p.getProperty("USERNAME");
			password = p.getProperty("PASSWORD");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:" + username +"/"  + password +  "@//" + host + ":" + port + "/" + sid);
			stmt = connection.createStatement();
			System.out.println("-------DB Connection Opened---------");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found from database");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("ORACLE Connection error ");
			e1.printStackTrace();
		}
	}
	
	/*
	 * @author: Rana Thakur
	 * 
	 * Description: This method set the browser type for (Chrome/Firefox/IE) and
	 * it will launch application
	 */
	@Parameters({ "Browser Name" })
	@BeforeMethod
	public void browserLaunch(String browserName, ITestResult result) {
		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", GenericLib.sDirPath + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", GenericLib.sDirPath + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.ie.driver", GenericLib.sDirPath + "\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		env=ExcelLibrary
				.getExcelData("./config/config.xlsx", "config", 1,
						GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "Env"));
		if (env.equalsIgnoreCase("FST")) {
			String buildURL = ExcelLibrary.getExcelData("./config/config.xlsx", "config", 1,
					GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "FST_URL"));
			driver.get(buildURL);
		} else if (env.equalsIgnoreCase("SIT")) {
			String buildURL = ExcelLibrary.getExcelData("./config/config.xlsx", "config", 1,
					GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "SIT_URL"));
			driver.get(buildURL);
		} else if (env.equalsIgnoreCase("UAT")) {
			String buildURL = ExcelLibrary.getExcelData("./config/config.xlsx", "config", 1,
					GenericLib.getHeaderColumnIndex("./config/config.xlsx", "config", "UAT_URL"));
			driver.get(buildURL);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		InitializePages pages = new InitializePages(driver);
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: initialize the pages
	 */
	
	//@AfterMethod
	public void _init() throws IOException, InterruptedException{
		FunctionLib.o_loginPage.logout();
	}
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is close current running browser
	 */
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is clear all chrome/firefox/ie process running in background
	 */
	@AfterSuite
	public void killBrowserProcess() throws SQLException {

		if (driver instanceof FirefoxDriver) {
			try {
				Runtime.getRuntime().exec("taskkill /IM firefox.exe /F");
				Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (driver instanceof ChromeDriver) {
			try {
				Runtime.getRuntime().exec("taskkill /IM chrome.exe /F");
				Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//connection.close();

	}
	
	

}
