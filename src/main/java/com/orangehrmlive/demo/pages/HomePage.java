package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHRMLogo;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement PIMLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Leave']")
    WebElement leaveLink;

    public String getWelcomeText() {
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public Boolean verifyOrangeHRMLogo() {
        log.info("Verifying orangeHRM Logo from : " + orangeHRMLogo.toString());
        return verifyThatElementIsDisplayed(new HomePage().orangeHRMLogo);
    }

    public void clickOnAdminLink() {
        clickOnElement(adminLink);
        log.info("Clicking on Admin link : " + adminLink.toString());
    }

    public void clickOnPIMLink() {
        clickOnElement(PIMLink);
        log.info("Clicking on PIM link : " + PIMLink.toString());
    }

    public void clickOnLeaveLink() {
        clickOnElement(leaveLink);
        log.info("Clicking on Leave link : " + leaveLink.toString());
    }

}
