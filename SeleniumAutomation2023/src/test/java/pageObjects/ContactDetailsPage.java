package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;

public class ContactDetailsPage {

    public WebDriver driver;
    public ElementUtil eleUtil;

    public ContactDetailsPage(WebDriver driver){
        this.driver= driver;
        eleUtil= new ElementUtil(driver);
    }

    By contactDetails = By.xpath("//a[span='Contact details']");
    By myContactPageDisplayed = By.xpath("//div[h4='My Contact']");
    By emailDisplayed = By.name("contact_info[email_address]");
    By phoneNumber = By.name("contact_info[phone]");
    By saveAndUpdate = By.xpath("//div//a[@class='tu-primbtn-lg tu-save-settings']");
    By recordHasBeenUpdated = By.id("tuturn-modal-popup");


public void ContactDetails(){
    eleUtil.doClick(contactDetails);
}

public boolean MyContactPageDisplayed(){
    //return driver.findElement(myContactPageDisplayed).isDisplayed();
   return eleUtil.doElementIsDisplayed(myContactPageDisplayed);
}

public  boolean EmailDisplayed(){
    return eleUtil.doElementIsDisplayed(emailDisplayed);
}


public void PhoneNumber(String number){
    eleUtil.doSendKeys(phoneNumber, number);
}

public void SaveAndUpdate(){
    eleUtil.doClick(saveAndUpdate);
}

public boolean RecordUpdated(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    driver.findElement(recordHasBeenUpdated);
    return true;

}

}
