package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MentorProfilePage;

public class MentorProfileSteps extends BrowserDriver {

  MentorProfilePage mentorProfilePage = new MentorProfilePage(driver);

    @When("I select gender male")
    public void iSelectGenderMale() {
    }

    @And("I enter hourly free {string}")
    public void iEnterHourlyFree(String arg0) {
    }

    @And("I enter your tagline {string}")
    public void iEnterYourTagline(String arg0) {
    }

    @And("I select country United Kingdom")
    public void iSelectCountryUnitedKingdom() {
    }

    @And("I enter address {string}")
    public void iEnterAddress(String arg0) {
    }

    @And("I enter postcode {string}")
    public void iEnterPostcode(String arg0) {
    }

    @And("I select language {string}")
    public void iSelectLanguage(String arg0) {
    }

    @And("I click online teaching location")
    public void iClickOnlineTeachingLocation() {
    }

    @And("I enter a  brief introduction {string}")
    public void iEnterABriefIntroduction(String arg0) {
    }

    @And("I upload photo")
    public void iUploadPhoto() {
    }

    @And("I click save and update")
    public void iClickSaveAndUpdate() {
    }

    @Then("a  successful message displayed")
    public void aSuccessfulMessageDisplayed() {
    }
}
