package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropDownInAddUser;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOptionInUserRoleDropDownInAddUser;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement ESSOptionInUserRoleDropDownInAddUser;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameFieldInAddUser;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'oxd-form-row']//input[@class = 'oxd-input oxd-input--active']")
    WebElement userNameFieldInAddUser;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
    WebElement statusDropDownInAddUser;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Disabled']")
    WebElement disabledStatusOptionInAddUser;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enabled']")
    WebElement enabledStatusOptionInAddUser;


    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement passwordFieldInAddUser;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordFieldInAddUser;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButtonInAddUser;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancelButtonInAddUser;


    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successfullySavedMessageInAddUser;


    public String verifyAddUserText () {
        log.info("Verifying AddUser text from : " + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    public void mouseHoverAndClickOnUserRoleDropDownInAddUser() {
        log.info("Clicking on UserRole drop-down : " + userRoleDropDownInAddUser.toString());
        mouseHoverToElementAndClick(userRoleDropDownInAddUser);
    }

    public void mouseHoverAndCLickOnAdminOptionInUserRoleDropDownInAddUser() {
        log.info("Clicking on Admin option in UserRole drop-down : " + adminOptionInUserRoleDropDownInAddUser.toString());
        clickOnElement(adminOptionInUserRoleDropDownInAddUser);
    }

    public void mouseHoverAndCLickOnESSOptionInUserRoleDropDownInAddUser() {
        log.info("Clicking on ESS option in UserRole drop-down : " + ESSOptionInUserRoleDropDownInAddUser.toString());
        clickOnElement(ESSOptionInUserRoleDropDownInAddUser);
    }

    public void sendDataToEmployeeNameFieldInAddUser(String eName) {
        sendTextToElement(employeeNameFieldInAddUser, eName);
        log.info("Enter " + eName + " to Employee Name field : " + employeeNameFieldInAddUser.toString());
    }

    public void clickOnStatusDropDownMenuInAddUser() {
        clickOnElement(statusDropDownInAddUser);
        log.info("Clicking on Status drop-down : " + statusDropDownInAddUser.toString());
    }

    public void mouseHoverAndClickOnDisabledOptionInAddUser() {
        mouseHoverToElementAndClick(disabledStatusOptionInAddUser);
        log.info("Clicking on Disable option in Status drop-down : " + disabledStatusOptionInAddUser.toString());
    }

    public void mouseHoverAndClickOnEnabledOptionInAddUser() {
        mouseHoverToElementAndClick(enabledStatusOptionInAddUser);
        log.info("Clicking on Enable option in Status drop-down : " + enabledStatusOptionInAddUser.toString());
    }

    public void sendDataToUserNameFieldInAddUser(String uName) {
        sendTextToElement(userNameFieldInAddUser, uName);
        log.info("Enter " + uName + " to User Name field : " + userNameFieldInAddUser.toString());
    }

    public void sendDataToPasswordFieldInAddUser(String password) {
        sendTextToElement(passwordFieldInAddUser, password);
        log.info("Enter " + password + " to Password field : " + passwordFieldInAddUser.toString());
    }

    public void sendDataToConfirmPasswordFieldInAddUser(String cPassword) {
        sendTextToElement(confirmPasswordFieldInAddUser, cPassword);
        log.info("Enter " + cPassword + " to Confirm Password field : " + confirmPasswordFieldInAddUser.toString());
    }

    public void clickOnSaveButtonInAddUser() {
        clickOnElement(saveButtonInAddUser);
        log.info("Clicking on Save button : " + saveButtonInAddUser.toString());
    }

    public void clickOnCancelButtonInAddUser() {
        clickOnElement(cancelButtonInAddUser);
        log.info("Clicking on Cancel button : " + cancelButtonInAddUser.toString());
    }

    public String getSuccessfullySavedMessageInAddUser() {
        log.info("Getting User Added Successfully message : " +successfullySavedMessageInAddUser.toString());
        return getTextFromElement(successfullySavedMessageInAddUser);
    }
}
