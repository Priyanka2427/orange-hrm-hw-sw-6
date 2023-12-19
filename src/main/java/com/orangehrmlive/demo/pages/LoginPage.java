package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginPanelText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement userNameFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement passwordFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement invalidCredentialErrorMessage;


    public void sendDataToUserNameField(String userName) {
        sendTextToElement(userNameField,userName);
        log.info("Send " + userName + " to username field : " + userNameField.toString());
    }

    public void sendDataToPasswordField(String password) {
        sendTextToElement(passwordField, password);
        log.info("Send " + password + " to password field : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login button : " + loginButton.toString());
    }

    public String verifyTheLoginPanelText() {
        log.info("Verify text for login panel : " + loginPanelText.toString());
        return getTextFromElement(loginPanelText);
    }

    public String getUserNameFieldBlankErrorMessage() {
        log.info("Getting username field blank error message : " + userNameFieldBlankErrorMessage.toString());
        return getTextFromElement(userNameFieldBlankErrorMessage);
    }

    public String getPasswordFieldBlankErrorMessage() {
        log.info("Getting password field blank error message : " + passwordFieldBlankErrorMessage.toString());
        return getTextFromElement(passwordFieldBlankErrorMessage);
    }

    public String getInvalidCredentialErrorMessage() {
        log.info("Getting invalid credential error message : " + invalidCredentialErrorMessage.toString());
        return getTextFromElement(invalidCredentialErrorMessage);
    }

    public void loginToTheApplication(String email, String password) {
        sendDataToUserNameField(email);
        sendDataToPasswordField(password);
        clickOnLoginButton();
    }
}
