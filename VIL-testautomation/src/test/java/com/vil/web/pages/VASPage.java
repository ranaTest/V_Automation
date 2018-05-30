package com.vil.web.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.utils.ActionUtil;

public class VASPage {
	
	
	WebDriver driver;

    public VASPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
   

    /*
     * @author : Arushi Sharma
     * @description :Object of different button in VAS page
     *
     *               
     *
     */
   
    @FindBy(xpath = "//a[text()='VAS']")
    private WebElement eleVASBtn;

    public WebElement getEleVASBtn() {
            return eleVASBtn;
    }
   
    @FindBy(xpath = "//a[text()='Pre CT Announcement']")
    private WebElement elePreCTAnnouncementBtn;

    public WebElement getElePreCTAnnouncementBtn() {
            return elePreCTAnnouncementBtn;
    }
   
   
    @FindBy(xpath = "//a[text()='CT Song History']")
    private WebElement elePreCTSongHistoryBtn;

    public WebElement getElePreCTSongHistoryBtn() {
            return elePreCTSongHistoryBtn;
    }
   
    @FindBy(xpath = "//a[text()='VAS Details']")
    private WebElement eleVASDetailsBtn;

    public WebElement getEeleVASDetailsBtn() {
            return eleVASDetailsBtn;
    }

    
    @FindBy(xpath = "//a[text()='VAS Consent History']")
    private WebElement eleVASConsentHistoryBtn;

    public WebElement getEleVASConsentHistoryBtn() {
            return eleVASConsentHistoryBtn;
    }
    
  //div[text()='VAS Consent History']
    
    
    @FindBy(xpath = "//div[text()='VAS Consent History']")
    private WebElement eleVASConsentHistoryTxt;

    public WebElement getEleVASConsentHistoryTxt() {
            return eleVASConsentHistoryTxt;
    }
    
  //a[text()='Vodafone Flash']
    
    @FindBy(xpath = "//a[text()='Vodafone Flash']")
    private WebElement eleVodafoneFlashBtn;

    public WebElement getEleVodafoneFlashBtn() {
            return eleVodafoneFlashBtn;
    }
   
    /************************************************************************
     * @author : Arushi Sharma
     * @throws IOException
     * @description :Reusable methods of VAS page
     *
     *                 
     */
   
    public void verifyVASDetails() throws IOException
    {
            ActionUtil.clickElement(getEleVASBtn(), driver, "VAS button");
            ActionUtil.clickElement(getEeleVASDetailsBtn(), driver, "VAS details button");
    }
   

    public void verifyDeactivationDateInPreCTAnnoun() throws IOException
    {
            ActionUtil.clickElement(getEleVASBtn(), driver, "VAS button");
            ActionUtil.clickElement(getElePreCTAnnouncementBtn(), driver, "VAS CT Announcement button");
    }
    
    
    /************************************************************************
     * @author : Rana Thakur
     * @throws IOException
     * @throws InterruptedException 
     * @description :checks Fetch and Display for Consent History Details
     *
     *                 
     */
    
    public void verifyVASConsentHistoryDetails() throws IOException, InterruptedException{
    	
    	ActionUtil.clickElement(eleVASBtn, driver, "VAS button");
    	Thread.sleep(1500);
    	ActionUtil.clickElement(getEleVASConsentHistoryBtn(), driver, "VAS Consent History button");
    	Thread.sleep(1500);
    	ActionUtil.scrollIntoView(driver, getEleVASConsentHistoryTxt());
    	
    }
    
    
    /************************************************************************
     * @author : Rana Thakur
     * @throws IOException
     * @throws InterruptedException 
     * @description : checks Fetch and Display for Vodafone Flash Details.
     *
     *                 
     */
    
    public void vodafoneFlashDetails() throws IOException, InterruptedException{
    	
    	ActionUtil.clickElement(eleVASBtn, driver, "VAS button");
    	Thread.sleep(1500);
    	ActionUtil.clickElement(getEleVodafoneFlashBtn(), driver, "Vodafone Flash click");
    	
    	
    }
}
