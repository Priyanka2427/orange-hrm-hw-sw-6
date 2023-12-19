package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUsersPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UserTestSteps {

    @And("I click on Admin tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @And("I should see the System Users text {string}")
    public void iShouldSeeTheSystemUsersTextAs(String expectedMessage) {
        Assert.assertEquals(new ViewSystemUsersPage().getSystemUsersText(), expectedMessage);
    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();
    }

    @And("I should see the Add User text {string}")
    public void iShouldSeeTheAddUserText(String expectedMessage) {
        Assert.assertEquals(new AddUsersPage().verifyAddUserText(), expectedMessage);
    }

    @And("I select User Role as Admin")
    public void iSelectUserRoleAsAdmin() {
        new AddUsersPage().mouseHoverAndClickOnUserRoleDropDownInAddUser();
        new AddUsersPage().mouseHoverAndCLickOnAdminOptionInUserRoleDropDownInAddUser();
    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String eName) {
        new AddUsersPage().sendDataToEmployeeNameFieldInAddUser(eName);
    }

    @And("I enter User Name {string}")
    public void iEnterUserName(String uName) {
        new AddUsersPage().sendDataToUserNameFieldInAddUser(uName);
    }

    @And("I select Status as Disable")
    public void iSelectStatusAsDisable() {
        new AddUsersPage().clickOnStatusDropDownMenuInAddUser();
        new AddUsersPage().mouseHoverAndClickOnDisabledOptionInAddUser();
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String pass) {
        new AddUsersPage().sendDataToPasswordFieldInAddUser(pass);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String cPass) {
        new AddUsersPage().sendDataToConfirmPasswordFieldInAddUser(cPass);
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        new AddUsersPage().clickOnSaveButtonInAddUser();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        Assert.assertEquals(new AddUsersPage().getSuccessfullySavedMessageInAddUser(), expectedMessage);
    }

    @And("I enter user name {string} in system users page")
    public void iEnterUserNameInSystemUsersPage(String uName) {
        new ViewSystemUsersPage().sendDataToUserNameFieldInSystemUsers(uName);
    }

    @And("I select user role as Admin in system users page")
    public void iSelectUserRoleAsAdminInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnUserRoleDropDownInSystemUsers();
        new ViewSystemUsersPage().mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
    }

    @And("I select status as disable in system users page")
    public void iSelectStatusAsDisableInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnStatusDropDownInSystemUsers();
        new ViewSystemUsersPage().mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButtonInSystemUsers();
    }

    @Then("I should verify the user name {string} in result list")
    public void iShouldVerifyTheUserNameInResultList(String expectedUserName) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(), expectedUserName);
    }

    @And("I click on check box against the user name")
    public void iClickOnCheckBoxAgainstTheUserName() {
        new ViewSystemUsersPage().clickOnCheckBoxAgainstFirstUserName();
    }

    @And("I click on delete button against the user name")
    public void iClickOnDeleteButtonAgainstTheUserName() {
        new ViewSystemUsersPage().clickOnDeleteSelectedOption();
    }

    @And("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteOption();
    }

    @Then("I should get successfully deleted message {string}")
    public void iShouldGetSuccessfullyDeletedMessage(String arg0) {
    }

    @And("I select user role {string} in system users page")
    public void iSelectUserRoleInSystemUsersPage(String uName) {
        new ViewSystemUsersPage().clickOnUserRoleDropDownInSystemUsers();

        if(uName == "Admin"){
            new ViewSystemUsersPage().mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
        } else {
            new ViewSystemUsersPage().mouseHoverAndClickOnESSOptionInUserRoleDropDownInSystemUsers();
        }
    }

    @And("I select status {string} in system users page")
    public void iSelectStatusInSystemUsersPage(String status) {
        new ViewSystemUsersPage().clickOnStatusDropDownInSystemUsers();
        if(status == "Enabled"){
            new ViewSystemUsersPage().mouseHoverAndCLickOndEnableStatusOptionInSystemUsers();
        } else {
            new ViewSystemUsersPage().mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
        }
    }

    @And("I see the one record found {string} message")
    public void iSeeTheOneRecordFoundMessage(String expectedMessage) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(), expectedMessage);
    }

    @And("I should verify the username {string}")
    public void iShouldVerifyTheUsername(String uName) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(), uName);
    }

    @Then("I click on reset button")
    public void iClickOnResetButton() {
        new ViewSystemUsersPage().clickOnResetButtonInSystemUsers();
    }
}

