package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class LoginSteps {

    @Given("I am on login page")
    public void iAmOnLoginPage() {
    }

    @When("I enter username {string}")
    public void iEnterUsername(String uName) {
        new LoginPage().sendDataToUserNameField(uName);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String pass) {
        new LoginPage().sendDataToPasswordField(pass);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully and verify the text {string}")
    public void iShouldLoginSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new DashboardPage().getWelcomeText(), expectedMessage);
    }

    @Then("I should see the OrangeHRM logo")
    public void iShouldSeeTheOrangeHRMLogo() {
        Assert.assertTrue(new HomePage().verifyOrangeHRMLogo());
    }

    @And("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("I mouse hover and click on Logout")
    public void iMouseHoverAndClickOnLogout() {
        new DashboardPage().mouseHoverAndClickOnLogOut();
    }

    @Then("I should navigate to login page and verify {string} text")
    public void iShouldNavigateToLoginPageAndVerifyText(String expectedMessage) {
        Assert.assertEquals(new LoginPage().verifyTheLoginPanelText(), expectedMessage);
    }

    @Then("I should get error message {string} depends on username {string} and password {string}")
    public void iShouldGetErrorMessageDependsOnUsernameAndPassword(String expectedError, String uName, String pass) {
        if(Objects.equals(uName, "")){
            Assert.assertEquals(new LoginPage().getUserNameFieldBlankErrorMessage(), expectedError);
        } else if (Objects.equals(pass, "")){
            Assert.assertEquals(new LoginPage().getPasswordFieldBlankErrorMessage(), expectedError);
        }else{
            Assert.assertEquals(new LoginPage().getInvalidCredentialErrorMessage(), expectedError);
        }
    }
}
