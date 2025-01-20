package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginSteps extends BrowserDriver {

    LoginPage loginPage = new LoginPage(driver);

    @When("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLoginButton();
    }

    @Then("login welcome page displayed")
    public void loginWelcomePageDisplayed() {
        Assert.assertTrue(loginPage.LoginWelcomePageDisplayed());
    }

    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String email) {
        loginPage.EnterEmailAddress(email);
    }

    @And("I enter your Password {string}")
    public void iEnterYourPassword(String pass) {
        loginPage.EnterYourPassword(pass);
    }


    @And("I click submit button")
    public void iClickSubmitButton() {
        loginPage.ClickSubmit();
    }


    @Then("wrong email message displayed")
    public void errorMessageDisplayed() {
        Assert.assertTrue(loginPage.WrongEmailAddress());
    }

       @Then("wrong password message displayed")
    public void wrongPasswordMessageDisplayed() {
        Assert.assertTrue(loginPage.WrongPassword());
    }


}
