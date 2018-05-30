/***********************************************************************
 * @author 			:		Srinivas Hippargi
 * @description		: 		This class contains action methods which is used for performing 
 * 							action while executing script such as Click, SendKeys 
 */

package com.vil.web.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vil.web.init.InitializePages;
import com.vil.web.reports.MyExtentListners;

public class ActionUtil {

	public final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/*
	 * @author : Srinivas Hippargi
	 * 
	 * Description : This method has fluent wait implementation for element to
	 * load which is polling every 250 miliseconds
	 */
	public static void waitForElement(WebElement element, WebDriver driver, String eleName) throws IOException {
		try {
			logger.info("---------Waiting for visibility of element---------" + element);

			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 60000);
			 * Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(
			 * element)) != null); System.out.println("");
			 */

			/*
			 * Wait<WebDriver> wait = new
			 * FluentWait<WebDriver>(driver).withTimeout(2, TimeUnit.MINUTES)
			 * .pollingEvery(250,
			 * TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			 * Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(
			 * element)) != null);
			 */
			System.out.println(element.toString());
			waitTillPageLoad(driver, 30);
			long timeout = 30000;
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);
			/*
			 * if (element.toString().contains("id")) { String split[] =
			 * element.toString().split("id:"); String value =
			 * split[1].replaceAll("]", "");
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.id(value.trim()))) != null); }else
			 * if(element.toString().contains("name")){ String split[] =
			 * element.toString().split("name:"); String value =
			 * split[1].replaceAll("]", "");
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.name(value.trim()))) != null); }else
			 * if(element.toString().contains("xpath")){ String split[] =
			 * element.toString().split("xpath:"); String value =
			 * split[1].substring(0, split[1].length()-1);
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.xpath(value.trim()))) != null);
			 * 
			 * }
			 */

			logger.info("---------Element is visible---------" + element);
		} catch (Exception e) {

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			logger.info("---------Element is not visible---------" + element);
			throw e;
		} catch (AssertionError e) {

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			logger.info("---------Element is not visible---------" + element);
			throw e;
		}
	}

	/*
	 * @author : Srinivas Hippargi
	 * 
	 * Description : This method has fluent wait implementation for element to
	 * load which is polling every 250 miliseconds
	 */
	public static void waitForElement(WebElement element, WebDriver driver, String eleName, int minutes)
			throws IOException {
		try {
			logger.info("---------Waiting for visibility of element---------" + element);
			/*
			 * Wait<WebDriver> wait = new
			 * FluentWait<WebDriver>(driver).withTimeout(minutes,
			 * TimeUnit.MINUTES) .pollingEvery(250,
			 * TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			 * Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(
			 * element)) != null);
			 */
			waitTillPageLoad(driver, 30);
			long timeout = minutes;
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);
			/*
			 * if (element.toString().contains("id")) { String split[] =
			 * element.toString().split("id:"); String value =
			 * split[1].replaceAll("]", "");
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.id(value.trim()))) != null); }else
			 * if(element.toString().contains("name")){ String split[] =
			 * element.toString().split("name:"); String value =
			 * split[1].replaceAll("]", "");
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.name(value.trim()))) != null); }else
			 * if(element.toString().contains("xpath")){ String split[] =
			 * element.toString().split("xpath:"); String value =
			 * split[1].substring(0, split[1].length()-1);
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * presenceOfElementLocated(By.xpath(value.trim()))) != null);
			 * 
			 * }
			 */

			logger.info("---------Element is visible---------" + element);
		} catch (Exception e) {

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			logger.info("---------Element is not visible---------" + element);
			throw e;
		} catch (AssertionError e) {

			/*
			 * Wait<WebDriver> wait = new
			 * FluentWait<WebDriver>(driver).withTimeout(minutes,
			 * TimeUnit.MINUTES) .pollingEvery(250,
			 * TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			 */
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			logger.info("---------Element is not visible---------" + element);
			throw e;
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to verify whether given webelemnt is
	 * present page or not.
	 */
	public static void isEleDisplayed(WebElement element, WebDriver driver, String elementName, int seconds)
			throws IOException {
		try {
			logger.info("---------Verifying element is displayed or not ---------");
			waitTillPageLoad(driver, 30);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS)
					.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);
			System.out.println(elementName + "------ is displayed");
			MyExtentListners.test.pass("Verify " + "\'" + elementName + "\'" + " is displayed || " + "\'" + elementName
					+ "\'" + " is displayed ");
		} catch (RuntimeException e) {

			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + elementName + "\'"
					+ " is displayed || " + "\'" + elementName + "\'" + " is not displayed ", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(elementName + "------ is not displayed");
			throw e;
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to verify whether given webelemnt is
	 * present page or not.
	 */
	public static void eleIsNotDisplayed(WebElement element, WebDriver driver, String elementName, int seconds)
			throws IOException {
		try {
			logger.info("---------Verifying element is displayed or not ---------");
			waitTillPageLoad(driver, 30);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS)
					.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) == null);
			System.out.println(elementName + "------ is displayed");
			MyExtentListners.test.pass("Verify " + "\'" + elementName + "\'" + " is displayed || " + "\'" + elementName
					+ "\'" + " is displayed ");
		} catch (RuntimeException e) {

			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + elementName + "\'"
					+ " is displayed || " + "\'" + elementName + "\'" + " is not displayed ", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(elementName + "------ is not displayed");
			throw e;
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to verify whether given webelemnt is
	 * displayed or not
	 */
	public static void verifyElementIsDisplayed(WebElement element, WebDriver driver, String elementName)
			throws IOException {
		try {
			logger.info("---------Verifying element is displayed or not ---------");
			waitTillPageLoad(driver, 30);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(1, TimeUnit.MINUTES)
					.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
			Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);
			MyExtentListners.test.pass("Verify " + "\'" + elementName + "\'" + " is displayed  || " + "\'" + elementName
					+ "\'" + " is displayed ");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + elementName + "\'"
					+ " is displayed  || " + "\'" + elementName + "\'" + " is not displayed ", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(elementName + "------ is not displayed");
			throw e;
		} catch (AssertionError e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + elementName + "\'"
					+ " is displayed  || " + "\'" + elementName + "\'" + " is not displayed ", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(elementName + "------ is not displayed");
			throw e;
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: this method will click on element which is provided.
	 */

	public static void clickElement(WebElement element, WebDriver driver, String elementName) throws IOException {

		try {
			logger.info("---------Verifying element is displayed or not ---------");
			waitTillPageLoad(driver, 30);
			isEleClickable(element, driver, elementName);
			element.click();
			ActionUtil.waitTillPageLoad(driver, 30);
			MyExtentListners.test.pass("Verify user is able to click on " + "\'" + elementName + "\'"
					+ " ||  User is able to click on " + "\'" + elementName + "\'");
		} catch (AssertionError error) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to click on " + "\'" + elementName
					+ "\'" + "  || User is not able to click on " + "\'" + elementName + "\'", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("unable to Click on " + "\'" + elementName + "\'");

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			throw error;
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to click on " + "\'" + elementName
					+ "\'" + " || User is not able to click on " + "\'" + elementName + "\'", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			throw e;
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: this method clear texts from text box/edit box and type the
	 * value which is provided
	 * 
	 */

	public static void clearAndType(WebElement element, String value, String elementName, WebDriver driver)
			throws Exception {
		try {
			logger.info("---------Method clear and type  ---------");
			waitTillPageLoad(driver, 30);
			element.clear();
			logger.info(elementName + " is cleared");
			element.sendKeys(value);
			logger.info(value + " is entered in " + elementName);
			logger.info(" hide keyboard");
			MyExtentListners.test.pass("Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName
					+ "\'" + " || User is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'");
		} catch (AssertionError error) {

			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'"
							+ " || User is not able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'",
					ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to type on " + "\'" + elementName + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'"
							+ " || User is not able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'",
					ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to type in " + "\'" + elementName + "\'");
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to type value in element
	 * 
	 */

	public static void type(WebElement element, String value, String elementName, WebDriver driver) throws Exception {
		try {
			logger.info("---------Method type  ---------");
			waitTillPageLoad(driver, 30);
			waitForElement(element, driver, elementName);
			element.sendKeys(value);
			logger.info("---------hide keyboard  ---------");
			MyExtentListners.test.pass("Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName
					+ "\'" + " || User is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'");
		} catch (AssertionError error) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'"
							+ " || User is not able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'",
					ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to type on " + elementName);
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'"
							+ " || User is not able to type " + "\'" + value + "\'" + "in " + "\'" + elementName + "\'",
					ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to type in " + elementName);
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Code to wait till page is load , Page status should be ready
	 */
	public static void waitTillPageLoad(WebDriver driver, int seconds) {

		/*
		 * Predicate<WebDriver> pageLoaded = wd -> ((JavascriptExecutor)
		 * wd).executeScript("return document.readyState").equals("complete");
		 * new FluentWait<WebDriver>(driver).until(pageLoaded);
		 */

		/*
		 * new WebDriverWait(driver, seconds).until((ExpectedCondition<Boolean>)
		 * wd -> ((JavascriptExecutor) wd)
		 * .executeScript("return document.readyState").equals("complete"));
		 * WebDriverWait wait = new WebDriverWait(driver, 60);
		 * wait.until(pageLoadCondition);
		 */
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeAsyncScript(document.onload = function(){
		 * window.location='page.html'; };);
		 */

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		// Wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = wd -> ((JavascriptExecutor) driver)
				.executeScript("return document.readyState").toString().equals("complete");

		// Get JS is Ready
		boolean jsReady = (Boolean) jsExec.executeScript("return document.readyState").toString().equals("complete");

		// Wait Javascript until it is Ready!
		if (!jsReady) {
			System.out.println("JS in NOT Ready!");

			// Wait for Javascript to load
			wait.until(jsLoad);

		} else {
			System.out.println("JS is Ready!");

		}
		System.out.println(" page is in ready state ");
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description:Explicit wait to check element is clickable
	 */
	public static void isEleClickable(WebElement element, WebDriver driver, String eleName) throws IOException {
		try {
			logger.info("---------Method is Element clickable  ---------");
			waitTillPageLoad(driver, 30);
			System.out.println(element);
			long timeout = 30000;
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
			if (!(wait.until(ExpectedConditions.elementToBeClickable(element)) == null)) {
				Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);
				System.out.println("Eleement is Clickable");
			} else {
				System.out.println("Eleement is not Clickable");
			}

			// Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(element))
			// != null) ;

			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 30000);
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * elementToBeClickable(element)) != null);
			 */

			/*
			 * Wait<WebDriver> wait = new
			 * FluentWait<WebDriver>(driver).withTimeout(1, TimeUnit.MINUTES)
			 * .pollingEvery(250,
			 * TimeUnit.MICROSECONDS).ignoring(NoSuchElementException.class);
			 * Assert.assertTrue(wait.until(ExpectedConditions.
			 * elementToBeClickable(element)) != null);
			 */

			System.out.println(" element is clickable ");
		} catch (AssertionError e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + eleName + "\'" + " is clickable || "
					+ "\'" + eleName + "\'" + " is not clickable", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(" element is not clickable ");
			throw e;
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + "\'" + eleName + "\'" + " is clickable || "
					+ "\'" + eleName + "\'" + " is not clickable", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			System.out.println(" element is not clickable ");
			throw e;
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Fetch text from element and return as string
	 */

	public static String gettext(WebElement element, WebDriver driver, String elementName) throws IOException {
		logger.info("--------- get text from element  ---------");
		String eleText = null;
		try {
			waitTillPageLoad(driver, 30);
			isEleDisplayed(element, driver, elementName, 25);
			eleText = element.getText();
			if(eleText.equals(null)){
				MyExtentListners.test.fail(MarkupHelper
						.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
				Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");
			}
		} catch (Exception e) {

			MyExtentListners.test.fail(MarkupHelper
					.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
			Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");

		}
		return eleText;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Fetch text from element and return as string
	 */

	public static String getAttributeValue(WebElement element, WebDriver driver, String elementName)
			throws IOException {
		logger.info("--------- get text from element  ---------");
		String eleText = null;
		try {
			waitTillPageLoad(driver, 30);
			isEleDisplayed(element, driver, elementName, 25);
			eleText = element.getAttribute("value");
			if(eleText.equals(null)){
				MyExtentListners.test.fail(MarkupHelper
						.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
				Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");
			}
		} catch (Exception e) {

			MyExtentListners.test.fail(MarkupHelper
					.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
			Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");

		}
		return eleText;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Fetch text from element and return as string
	 */

	public static String getAttributeTitle(WebElement element, WebDriver driver, String elementName)
			throws IOException {
		logger.info("--------- get text from element  ---------");
		String eleText = null;
		try {
			waitTillPageLoad(driver, 30);
			isEleDisplayed(element, driver, elementName, 25);
			eleText = element.getAttribute("title");
			if(eleText.equals(null)){
				MyExtentListners.test.fail(MarkupHelper
						.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
				Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");
			}
		} catch (Exception e) {

			MyExtentListners.test.fail(MarkupHelper
					.createLabel("Unable to fetch text from " + "\'" + elementName + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element)); // exception
			Assert.fail("Unable to fetch text from " + "\'" + elementName + "\'");

		}
		return eleText;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method verify expected result contains in actual result
	 */

	public static void verifyContainsText(String actResult, String expResult, String desc) {
		if (actResult.contains(expResult)) {
			MyExtentListners.test.pass("Verify  Expected : " + "\'" + expResult + "\''" + " contains  Actual :  "
					+ actResult + "  || Expected : " + "\'" + expResult + "\''" + "contains  Actual :  " + actResult);

		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify  Expected : " + "\'" + expResult + "\''"
					+ " contains  Actual :  " + actResult + " ||  Expected : " + "\'" + expResult + "\''"
					+ " does not contains  Actual :  " + actResult, ExtentColor.RED));

		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to verify text contains validation
	 */
	public static void verifyContainsText(String actResult, String expResult) {
		if (actResult.contains(expResult)) {
			MyExtentListners.test.pass("Verify  Expected : " + "\'" + expResult + "\''" + " contains  Actual :  "
					+ actResult + "  || Expected : " + "\'" + expResult + "\''" + "contains  Actual :  " + actResult);
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify  Expected : " + "\'" + expResult + "\''"
					+ " contains  Actual :  " + actResult + " ||  Expected : " + "\'" + expResult + "\''"
					+ " does not contains  Actual :  " + actResult, ExtentColor.RED));
		}
	}
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method verify expected result equals in actual result
	 */

	public static void verifyEqualsText(String desc, String actResult, String expResult) {
		if (expResult.equalsIgnoreCase(actResult)) {
			MyExtentListners.test.pass("Verify " + desc + " ||  Expected : " + "\'" + expResult + "\''"
					+ " eqauls  to Actual :  " + actResult);
		} else {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify " + desc + "  || Expected : " + "\'" + expResult
					+ "\''" + " not eqauls to  Actual :  " + "\'" + actResult + "\'", ExtentColor.RED));
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method verify expected result actual result is not
	 * equals
	 */
	public static void verifyNotEqualsText(String desc, String actResult, String expResult) {
		if (!(expResult.equalsIgnoreCase(actResult))) {
			MyExtentListners.test.pass("Verify " + desc + " is printed on receipt or not" + " ||  Expected : " + "\'"
					+ expResult + "\''" + " not  to Actual :  " + actResult);
		} else {
			MyExtentListners.test
					.fail(MarkupHelper
							.createLabel(
									"Verify " + desc + " is printed on receipt or not" + "  || Expected : " + "\'"
											+ expResult + "\''" + "  eqauls to  Actual :  " + "\'" + actResult + "\'",
									ExtentColor.RED));
		}
	}

	public static void verifyIsNull(String actResult, String desc) {
		if (actResult == null) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify" + desc + " not null" + " || " + desc + " : " + actResult + " is displayed",
					ExtentColor.RED));
			throw new RuntimeException();
		} else {
			MyExtentListners.test
					.pass("Verify" + desc + " not null" + " || " + desc + " : " + actResult + " is displayed");
		}
	}

	/**
	 * Mouse Hover on Element
	 *
	 */
	public static void mouseOverOnElement(WebDriver driver, WebElement element, String elementName) throws IOException {
		try {
			waitTillPageLoad(driver, 30);
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			MyExtentListners.test.pass("Verify user is able to mouse hover on " + "\'" + elementName + "\'"
					+ " ||  User is able to mouse hover on " + "\'" + elementName + "\'");
		} catch (Exception e) {
			MyExtentListners.test
					.fail(MarkupHelper.createLabel(
							"Verify user is able to mouse hover on " + "\'" + elementName + "\'"
									+ " ||  User is not able to mouse hover on " + "\'" + elementName + "\'",
							ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to to mouse hover on " + elementName);
		}
	}

	/**
	 * Double click on element.
	 * 
	 * @throws IOException
	 */
	public static void doubleClickOnElement(WebDriver driver, WebElement element, String elementName)
			throws IOException {

		try {
			waitTillPageLoad(driver, 30);
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
			MyExtentListners.test.pass("Verify user is able to double click on " + "\'" + elementName + "\'"
					+ " ||  User is  able to double click on " + "\'" + elementName + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to double click on " + "\'" + elementName + "\'"
							+ " ||  User is not able to double click on " + "\'" + elementName + "\'",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to to mouse hover on " + elementName);
		}

	}

	/**
	 * Right click on element.
	 * 
	 * @throws IOException
	 */
	public static void rightClickOnElement(WebDriver driver, WebElement element, String elementName)
			throws IOException {
		try {
			waitTillPageLoad(driver, 30);
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
			MyExtentListners.test.pass("Verify user is able to perform right/context click on " + "\'" + elementName
					+ "\'" + " ||  User is  able to perform right/context click on " + "\'" + elementName + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel(
					"Verify user is able to perform right/context click on " + "\'" + elementName + "\'"
							+ " || User is not able to perform right/context click onn " + "\'" + elementName + "\'",
					ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("Unable to to mouse hover on " + elementName);
		}
	}

	/**
	 * Drag and drop.
	 * 
	 * @throws IOException
	 *
	 * 
	 */
	public static void dragAndDrop(WebDriver driver, WebElement source, WebElement destination, String scrEleName,
			String destEleName) throws IOException {
		try {
			waitTillPageLoad(driver, 30);
			Actions act = new Actions(driver);
			act.dragAndDrop(source, destination).perform();
			MyExtentListners.test.pass("Verify user is able to perfrom drag and drop from " + "\'" + scrEleName + "\'"
					+ "to " + "\'" + destEleName + "\'" + " || User is able to perfrom drag and drop from " + "\'"
					+ scrEleName + "\'" + "to " + "\'" + destEleName + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper
					.createLabel("Verify user is able to perfrom drag and drop from " + "\'" + scrEleName + "\'" + "to "
							+ "\'" + destEleName + "\'" + " || User is not able to perfrom drag and drop from " + "\'"
							+ scrEleName + "\'" + "to " + "\'" + destEleName + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, destination));
			Assert.fail("User is not able to perfrom drag and drop from " + "\'" + scrEleName + "\'" + "to " + "\'"
					+ destEleName + "\'");
		}
	}

	/**
	 * Selectby visibletext.
	 * 
	 * @throws IOException
	 *
	 */
	public static void selectbyVisibletext(WebDriver driver, WebElement element, String text) throws IOException {

		try {
			waitTillPageLoad(driver, 30);
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
			MyExtentListners.test.pass("Verify user is able to select " + "\'" + text + "\'"
					+ " ||  User is able to select " + "\'" + text + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to select " + "\'" + text + "\'"
					+ " ||  User is not able to select " + "\'" + text + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("User is not able to select " + "\'" + text + "\'");
		}

	}

	/**
	 * Selectby value.
	 * 
	 * @throws IOException
	 *
	 */
	public static void selectbyValue(WebDriver driver, WebElement element, String value) throws IOException {
		try {
			waitTillPageLoad(driver, 30);
			Select sel = new Select(element);
			sel.selectByValue(value);
			MyExtentListners.test.pass("Verify user is able to select by value  " + "\'" + value + "\'"
					+ " ||  User is able to select by value " + "\'" + value + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to select by value " + "\'" + value
					+ "\'" + " ||  User is not able to select by value " + "\'" + value + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("User is not able to select " + "\'" + value + "\'");
		}
	}

	/**
	 * Selectby index.
	 * 
	 * @throws IOException
	 *
	 */
	public static void selectbyIndex(WebDriver driver, WebElement element, int index) throws IOException {
		try {
			waitTillPageLoad(driver, 30);
			Select sel = new Select(element);
			sel.selectByIndex(index);
			MyExtentListners.test.pass("Verify user is able to select by index  " + "\'" + index + "\'"
					+ " ||  User is able to select by index " + "\'" + index + "\'");
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to select by index " + "\'" + index
					+ "\'" + " ||  User is not able to select by index " + "\'" + index + "\'", ExtentColor.RED));
			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("User is not able to select  by index  " + "\'" + index + "\'");
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method checks for visibility of alert and waits till
	 * sec provided by and returns true if visible else false
	 */
	public static boolean isAlertPresent(WebDriver driver, int sec) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(sec, TimeUnit.SECONDS)
				.pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(UnreachableBrowserException.class);
		boolean alerPresent = wait.until(ExpectedConditions.alertIsPresent()) != null;
		if (alerPresent) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * @author:Rana Thakur
	 * 
	 * Description: Method to refresh applet
	 */
	public static void refresh(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.ALT, Keys.ENTER)).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method scrolls to particular element using javascript
	 * executor
	 */
	public static void scrollIntoView(WebDriver driver, WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to perform save with keyboard controls
	 */
	public static void save(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL, "s")).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to perform save with keyboard controls
	 */
	public static void enter(WebDriver driver) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method helps to perform save with keyboard controls
	 */
	public static String getAppletRowId(WebDriver driver, WebElement ele, String appletName) throws IOException {
		ActionUtil.clickElement(ele, driver, appletName);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL, Keys.ALT, "k")).build().perform();
		String appletRowId = gettext(InitializePages.o_360DegreePage.getEleRowIdTxt(), driver, appletName);
		ActionUtil.clickElement(InitializePages.o_360DegreePage.getEleRowIdOkBtn(), driver, " Ok Button");
		return appletRowId;
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method to scroll page downward 25% of window size
	 */
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method to scroll page upward 25% of window size
	 */
	public static void scrollUp(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method to get the vale from disabled text filed
	 * 
	 * Note : Need to check this method
	 */
	public static String getValueFromDisabledElement(WebDriver driver, WebElement ele) {

		JavascriptExecutor je = (JavascriptExecutor) driver;
		String value = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;", ele);
		// String value = je.executeScript("return
		// angular.element(arguments[0]).scope().{{modalValue:put modal value
		// from HTML}};", "{{webElement}};").toString();
		return value;

		// return (String) ((JavascriptExecutor)
		// this.webDriver).executeScript("angular.element($('#cssSelector')).text()");
		//
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to upload CSV File
	 * 
	 */

	public static void uploadFile(String filepath, WebElement element, WebDriver driver) throws Exception {

		if (driver instanceof FirefoxDriver) {
			try {
				Runtime.getRuntime().exec("./UploadFiles/firefoxtestcsvfile.exe");
			} catch (IOException e) {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify user is able to upload csv file in firefox browser || User is not able to upload csv file in firefox browser",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			}
		} else if (driver instanceof ChromeDriver) {
			try {
				Runtime.getRuntime().exec(filepath);
			} catch (IOException e) {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify user is able to upload csv file in chrome browser || User is not able to upload csv file in chrome browser",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			}
		} else {
			try {
				// Implement autoit code to upload file for ie browser
				Runtime.getRuntime().exec("");
			} catch (IOException e) {
				MyExtentListners.test.fail(MarkupHelper.createLabel(
						"Verify user is able to upload csv file in IE browser || User is not able to upload csv file in IE browser",
						ExtentColor.RED));
				MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			}
		}

	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method will set any parameter string to the system's
	 * clipboard.
	 * 
	 */
	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste
		// operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to upload file thorugh robot class
	 * 
	 */
	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();
			robot.delay(250);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: Method to validate String to Date Formate
	 * 
	 */
	public static void validateDateFormate(String stringDate) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(stringDate.trim());
		} catch (ParseException pe) {
			MyExtentListners.test
					.fail(MarkupHelper.createLabel("Date Format Exception for " + stringDate, ExtentColor.RED));
			throw pe;
		}

		/*
		 * LocalDate date = LocalDate.now(); DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern(""); LocalDate parsedDate =
		 * LocalDate.parse(stringDate, formatter);
		 */
	}

	public static String capture(WebDriver driver, WebElement ele) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String sDate = sdf.format(date);
		String destPath = MyExtentListners.screenShotPath + "/ " + sDate + ".png";
		try {
			File f = new File(destPath);
			if (!(f.exists())) {
				f.createNewFile();
			}
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destPath;
	}

	public static String capture(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String sDate = sdf.format(date);
		String destPath = MyExtentListners.screenShotPath + "/ " + sDate + ".png";
		try {
			File f = new File(destPath);
			if (!(f.exists())) {
				f.createNewFile();
			}
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destPath;
	}

	/*
	 * public static String capture(WebDriver driver, String screenShotName)
	 * throws IOException { File source = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); String dest =
	 * GenericLib.sDirPath + "\\screenshots\\" + screenShotName + ".png"; File
	 * destination = new File(dest); FileUtils.copyFile(source, destination);
	 * return dest; }
	 */
	/*
	 * @author:Shruti Agarwal Description: This method helps to perform page
	 * refresh
	 */
	public static void pageRefresh(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.ALT, Keys.ENTER)).build().perform();
	}

	/*
	 * @author:Srinivas Hippargi 
	 * 
	 * Description: This method is to add minutes to current date
	 * refresh
	 */
	public static String addMinutesToDateTime(int minutes) throws InterruptedException {
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
		TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		calendar.add(Calendar.MINUTE, minutes);
		Date finalNewDate = calendar.getTime();
		dateTimeInGMT.setTimeZone(istTimeZone);
		String finalNewDateString = dateTimeInGMT.format(finalNewDate);
		System.out.println(finalNewDateString);
		return finalNewDateString;
	}
	
	/*
	 * @author:Srinivas Hippargi 
	 * 
	 * Description: This method is to add hours to current date
	 * 
	 */
	public static String addWorkHourToDateTime(int hour) throws InterruptedException {

		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
		TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		
		int tempHour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(tempHour);
        if(tempHour >= 9 || tempHour <=18){
        	
        	if((calendar.get(Calendar.DAY_OF_WEEK))==1)
    	    {
        		
    	        calendar.add(Calendar.DAY_OF_MONTH, 1);
    	      
    	    }
        	if(tempHour<=14){
    	        	
    	        	calendar.add(Calendar.HOUR,4 );
    	        	System.out.println(tempHour);
    	    }
    	  
        }
	    
		Date finalNewDate = calendar.getTime();
		dateTimeInGMT.setTimeZone(istTimeZone);
		String finalNewDateString = dateTimeInGMT.format(finalNewDate);
		System.out.println(finalNewDateString);
		
		return finalNewDateString;
	}
	
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to add days to current date
	 * refresh
	 */
	public static String addDaysToDateTime(int days) throws InterruptedException {
		
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
		TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
	    for(int i=0;i<days;)
	    {
	        calendar.add(Calendar.DAY_OF_MONTH, 1);
	        //here even sat and sun are added
	        //but at the end it goes to the correct week day.
	        //because i is only increased if it is week day
	        if(calendar.get(Calendar.DAY_OF_WEEK)>1)
	        {
	            i++;
	        }

	    }
		Date finalNewDate = calendar.getTime();
		dateTimeInGMT.setTimeZone(istTimeZone);
		String finalNewDateString = dateTimeInGMT.format(finalNewDate);
		System.out.println(finalNewDateString);
		return finalNewDateString;
		
	}
	
	/*
	 * @author:Srinivas Hippargi
	 * 
	 * Description: This method is to move to element and click
	 * refresh
	 */
	
	public static void actionClick(WebElement element, WebDriver driver, String elementName) throws IOException{

		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();
			MyExtentListners.test.pass("Verify user is able to click on " + "\'" + elementName + "\'"
					+ " ||  User is able to click on " + "\'" + elementName + "\'");
		} catch (AssertionError error) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to click on " + "\'" + elementName
					+ "\'" + "  || User is not able to click on " + "\'" + elementName + "\'", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			Assert.fail("unable to Click on " + "\'" + elementName + "\'");

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			throw error;
		} catch (Exception e) {
			MyExtentListners.test.fail(MarkupHelper.createLabel("Verify user is able to click on " + "\'" + elementName
					+ "\'" + " || User is not able to click on " + "\'" + elementName + "\'", ExtentColor.RED));

			MyExtentListners.test.addScreenCaptureFromPath(capture(driver, element));
			throw e;
		}

	}
	
	

}
