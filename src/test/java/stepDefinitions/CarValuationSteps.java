package stepDefinitions;

import hooks.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CarValuationPage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarValuationSteps{

     WebDriver driver = BasePage.getDriver();
    CarValuationPage carValuationPage = new CarValuationPage(driver);
    Map<String, String[]> expectedOutput = new HashMap<>();
    private final List<String> registration = new ArrayList<>();

    String txtFilePath = "C:\\Users\\Nelly\\IdeaProjects\\MotorwayProject\\src\\test\\resources\\features\\car_input - txt";


    @Given("car registration numbers are extracted from a text a file")
    public void carRegistrationNumbersAreExtractedFromATextAFile() throws IOException {
        loadExpectedOutput();

        BufferedReader reader = new BufferedReader(new FileReader(txtFilePath));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();


        Pattern pattern = Pattern.compile("\\b[A-Z]{2}[0-9]{2}\\s?[A-Z]{3}\\b");
        Matcher matcher = pattern.matcher(content);

        System.out.println("Extracted Registrations:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @When("user searches for each registration number")
    public void userSearchesForEachRegistrationNumber() {
        driver. get("https://motorway.co.uk/");

        for (String registration : expectedOutput.keySet()) {
            carValuationPage.fillCarRegistration(registration);
            carValuationPage.clickValueYourCar();
            driver.navigate().refresh();
        }

    }

    @Then("search result should match the expected outcome")
    public void searchResultShouldMatchTheExpectedOutcome() {
        for (String registration : registration) {
            String[] expectedDetails = expectedOutput.get(registration);
            String actualDetails = carValuationPage.getCarDetails();

            Assert.assertTrue(actualDetails.contains(expectedDetails[0]),
                    "Variant registration does not match for: " + registration);
            Assert.assertTrue(actualDetails.contains(expectedDetails[1]),
                    "Make and model do not match for: " + registration);
            Assert.assertTrue(actualDetails.contains(expectedDetails[2]),
                    "Year does not match for: " + registration);
        }
    }

    private void loadExpectedOutput() {
        expectedOutput.put("SG18 HTN", new String[]{"Volkswagen Golf SE Navigation TSI EVO", "2018"});
        expectedOutput.put("AD58 VNF", new String[]{"BMW 120D M Sport", "2008"});
        expectedOutput.put("BW57 BOF", new String[]{"Toyota Yaris T2", "2008"});
        expectedOutput.put("KT17 DLX", new String[]{"Skoda Superb Sportline TDI S-A", "2017"});
    }


}
