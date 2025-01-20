package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {
        driver.get("https://prepmajor.com/user-account/");
    }

    @When("^I click sign up button$")
    public void iClickSignUpButton() {
    }

    @And("^i enter the username$")
    public void iEnterTheUsername() {
    }

    @And("^I enter the email$")
    public void iEnterTheEmail() {
    }

    @And("^i enter Password$")
    public void iEnterPassword() {
    }

    @And("^I enter confirm Password$")
    public void iEnterConfirmPassword() {
    }

    @And("^I tick the terms of use and privacy$")
    public void iTickTheTermsOfUseAndPrivacy() {
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
    }

    @Then("^I get a successful message being displayed$")
    public void iGetASuccessfulMessageBeingDisplayed() {
    }
}
