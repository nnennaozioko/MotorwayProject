package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.MenteeRegistrationPage;

public class MenteeRegistrationStep extends BrowserDriver {

    MenteeRegistrationPage menteeRegistrationPage = new MenteeRegistrationPage(driver);

    @When("I click start as a mentee")
    public void iClickStartAsAMentee() {
        menteeRegistrationPage.ClickMenteeButton();
    }

    @And("I click mentee checkbox")
    public void iClickMenteeCheckbox() {
        menteeRegistrationPage.ClickMenteeRadioButton();
    }
}
