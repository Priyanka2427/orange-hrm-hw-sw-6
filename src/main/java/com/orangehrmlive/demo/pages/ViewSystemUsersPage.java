package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUsersText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameFieldInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]")
    WebElement userRoleDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOptionInUserRoleDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement ESSOptionInUserRoleDropDownInSystemUsers;


    @CacheLookup
    @FindBy(xpath = "(//i)[13]")
    WebElement statusDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Disabled']")
    WebElement disableStatusOptionInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enable']")
    WebElement enableStatusOptionInSystemUsers;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameFieldInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButtonInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButtonInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "(//div[@data-v-6c07a142])[1]")
    WebElement userNameInRecord;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBoxAgainstFirstUserName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteButtonAgainstFirstUSerName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteOption;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFoundMessage;

    public void sendDataToEmployeeNameFieldInSystemUsers(String eName) {
        sendTextToElement(employeeNameFieldInSystemUsers, eName);
        log.info("Enter " + eName + " to Employee Name field : " + employeeNameFieldInSystemUsers.toString());
    }

    public String getSystemUsersText() {
        log.info("Verifying System Users text : " + systemUsersText.toString());
        return getTextFromElement(systemUsersText);
    }

    public void sendDataToUserNameFieldInSystemUsers(String uName) {
        sendTextToElement(userNameFieldInSystemUsers, uName);
        log.info("Enter " + uName + " to User Name field : " + userNameFieldInSystemUsers.toString());
    }

    public void clickOnUserRoleDropDownInSystemUsers() {
        log.info("Clicking on UserRole drop-down : " + userRoleDropDownInSystemUsers.toString());
        clickOnElement(userRoleDropDownInSystemUsers);
    }

    public void mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers() {
        log.info("Clicking on Admin option in UserRole drop-down : " + adminOptionInUserRoleDropDownInSystemUsers.toString());
        mouseHoverToElementAndClick(adminOptionInUserRoleDropDownInSystemUsers);
    }

    public void mouseHoverAndClickOnESSOptionInUserRoleDropDownInSystemUsers() {
        log.info("Clicking on ESS option in UserRole drop-down : " + ESSOptionInUserRoleDropDownInSystemUsers.toString());
        mouseHoverToElementAndClick(ESSOptionInUserRoleDropDownInSystemUsers);
    }

    public void clickOnStatusDropDownInSystemUsers() {
        clickOnElement(statusDropDownInSystemUsers);
        log.info("Clicking on Status drop-down : " + statusDropDownInSystemUsers.toString());
    }

    public void mouseHoverAndCLickOndDisableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(disableStatusOptionInSystemUsers);
        log.info("Clicking on Disable option in Status drop-down : " + disableStatusOptionInSystemUsers.toString());
    }

    public void mouseHoverAndCLickOndEnableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(enableStatusOptionInSystemUsers);
        log.info("Clicking on Enable option in Status drop-down : " + enableStatusOptionInSystemUsers.toString());
    }

    public void clickOnSearchButtonInSystemUsers() {
        clickOnElement(searchButtonInSystemUsers);
        log.info("Clicking on Search button : " + searchButtonInSystemUsers.toString());
    }

    public void clickOnResetButtonInSystemUsers() {
        clickOnElement(resetButtonInSystemUsers);
        log.info("Clicking on Reset button : " + resetButtonInSystemUsers.toString());
    }

    public String getDataFromUserNameInRecord() {
        log.info("Getting UserName from record : " + userNameInRecord.toString());
        return getTextFromElement(userNameInRecord);
    }

    public void clickOnCheckBoxAgainstFirstUserName() {
        clickOnElement(checkBoxAgainstFirstUserName);
        log.info("Clicking on checkbox against User Name found : " + checkBoxAgainstFirstUserName.toString());
    }

    public void clickOnDeleteSelectedOption() {
        clickOnElement(deleteButtonAgainstFirstUSerName);
        log.info("Clicking on delete button against found User Name : " + deleteButtonAgainstFirstUSerName.toString());
    }

    public void clickOnYesDeleteOption() {
        clickOnElement(yesDeleteOption);
        log.info("Clicking on Yes option in the dialog-box : " + yesDeleteOption);
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        log.info("Clicking on Add button : " + addButton.toString());
    }

    public String getOneRecordFoundMessage () {
        log.info("Getting OneRecord Found message : " +oneRecordFoundMessage.toString());
        return getTextFromElement(oneRecordFoundMessage);
    }

    public void searchUserDetails(String uName, String userRole, String eName, String status){
        sendDataToUserNameFieldInSystemUsers(uName);
        clickOnUserRoleDropDownInSystemUsers();

        if(userRole == "Admin"){
            mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        } else {
            mouseHoverAndClickOnESSOptionInUserRoleDropDownInSystemUsers();
        }

        sendDataToEmployeeNameFieldInSystemUsers(eName);

        clickOnStatusDropDownInSystemUsers();
        if(status == "Enabled"){
            mouseHoverAndCLickOndEnableStatusOptionInSystemUsers();
        } else {
            mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        }

        clickOnSearchButtonInSystemUsers();

        String expectedOneRecordFoundMessage = "(1) Record Found";
        String actualOneRecordFoundMessage = getOneRecordFoundMessage();
        Assert.assertEquals(actualOneRecordFoundMessage, expectedOneRecordFoundMessage);

        String actualUserNameInRecord = getDataFromUserNameInRecord();
        Assert.assertEquals(uName, actualUserNameInRecord);

        clickOnResetButtonInSystemUsers();
    }
}