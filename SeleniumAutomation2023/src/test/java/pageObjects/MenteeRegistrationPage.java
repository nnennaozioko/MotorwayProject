package pageObjects;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ElementUtil;

import java.util.List;

public class MenteeRegistrationPage {

    public WebDriver driver;
    // public BasePage basePage;
    public ElementUtil eleUtil;

    public MenteeRegistrationPage(WebDriver driver) {

        this.driver = driver;


        // basePage = new BasePage();
        eleUtil = new ElementUtil(driver);

    }

    By menteebutton= By.xpath("//a[@class='tu-primbtn tu-primbtn-gradient']");
    By menteecheckbox = By.xpath("//div[@class='tu-check tu-radiosm']");

    public void ClickMenteeButton()
    {
        eleUtil.doClick(menteebutton);
    }

    public void ClickMenteeRadioButton() {
        List<WebElement> list= eleUtil.getElements(menteecheckbox);
        for(WebElement e: list)
        {
            String text= e.getText();
            if(text.contains("Mentee"))
            {
                e.click();
            }


        }
    }

//    @And("I click mentee radio button")
//    public void iClickMenteeRadioButton() {
//        mrp.ClickMenteeRadioButton();
//    }

}