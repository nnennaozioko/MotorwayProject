package pageObjects;

import org.openqa.selenium.WebDriver;
import utilities.ElementUtil;

public class MentorProfilePage {

    public WebDriver driver;
    // public BasePage basePage;
    public ElementUtil eleUtil;

    public MentorProfilePage(WebDriver driver) {

        this.driver = driver;


        // basePage = new BasePage();
        eleUtil = new ElementUtil(driver);



    }
}
