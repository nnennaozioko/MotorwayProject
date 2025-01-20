package stepDefinitions;


import Hooks.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pageObjects.MentorRegistrationPage;

import java.net.URL;


public class MentorRegistrationSteps {
    public WebDriver driver;
    public MentorRegistrationPage mrp;
    //public pageObjects.RegistrationPage RP;


    public MentorRegistrationSteps() {


//        driver= new ChromeDriver();
//     //WebDriverManager.firefoxdriver().setup();
//        driver= new FirefoxDriver();
//        driver.manage().window().maximize();
        //
        // RP= new pageObjects.RegistrationPage(driver);
        //mrp = new MentorRegistrationPage(mrp.driver);
        mrp = new MentorRegistrationPage(driver);
    }


    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {
        driver.get("https://mentorskid.com");
        //mrp.driver.get("https://mentorskid.com");
        //mrp.Navigate();

      // driver.navigate().to("https://prepmajor.com");
       // mrp.openUrl();

    }

    @When("I click sign up button")
    public void iClickJoinAsAMentor() {
        mrp.ClickSignUpButton();
    }

    @Then("welcome page displayed")
    public void welcomeItIsNiceToSeeYouDisplayed() {
        Assert.assertTrue(mrp.VerifyWelcomePageDisplayed(), "Welcome!");
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String fnametxt) {
        mrp.EnterFirstName(fnametxt);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lnametxt) {
        mrp.EnterLastName(lnametxt);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String emailtxt) {
        mrp.EnterEmailAddress(emailtxt);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String passwordtxt) {
        mrp.EnterPassword(passwordtxt);
    }

    @And("I click mentor checkbox")
    public void iClickMentorCheckbox() {
        mrp.ClickMentorRadioButton();
    }

    @And("I click mentee radio button")
    public void iClickMenteeRadioButton() {
        mrp.ClickMenteeRadioButton();
    }


    @And("I click terms and condition")
    public void iClickTermsAndCondition() {
        mrp.ClickTermsAndConditions();
    }

    @And("I click join now")
    public void iClickJoinNow() {
        mrp.ClickJoinNow();
    }

    @Then("my profile page displayed")
    public void enrolledCoursesDisplayed() {

        Assert.assertTrue(mrp.VerifyMyProfileText());


    }

}