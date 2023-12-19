package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;

    public String getWelcomeText() {
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnUserProfileLogo () {
        clickOnElement(userProfileLogo);
        log.info("Clicking on user profile logo : " + userProfileLogo.toString());
    }

    public void mouseHoverAndClickOnLogOut() {
        mouseHoverToElementAndClick(logoutLink);
        log.info("Clicking on logout link : " + logoutLink.toString());
    }
}

