package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.ContactDetailsPage;

public class ContactDetailsSteps extends BrowserDriver {

    ContactDetailsPage contactDetailsPage = new ContactDetailsPage(driver);

    @When("I click contact details")
    public void iClickContactDetails() {
        contactDetailsPage.ContactDetails();
    }

    @Then("my contact page displayed")
    public void myContactPageDisplayed() {
        Assert.assertTrue(contactDetailsPage.MyContactPageDisplayed());
    }

    @And("email displayed")
    public void emailDisplayed() {
        Assert.assertTrue(contactDetailsPage.EmailDisplayed());
    }

    @When("I enter phone number {string}")
    public void iEnterPhoneNumber(String number) {
        contactDetailsPage.PhoneNumber(number);
    }

    @And("I click save and update button")
    public void iClickSaveAndUpdateButton() {
        contactDetailsPage.SaveAndUpdate();
    }

    @Then("record has been updated")
    public void recordHasBeenUpdated() {
        Assert.assertTrue(contactDetailsPage.RecordUpdated());
    }
}
