package pageObjects;

import hooks.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarValuationPage {
    WebDriver driver;
    public BasePage basePage;

    public  CarValuationPage(WebDriver driver) {
        this.driver=driver;
        basePage = new BasePage();
    }

    By carRegistration = By.xpath("(//div//input[@type='text'])[1]");
    By valueYourCar = By.xpath("(//span[text()='Value your car'])[1]");
    By carDetails = By.id("result-details-id");

    public void fillCarRegistration(String registration){
        driver.findElement(carRegistration).sendKeys(registration);
    }

    public void clickValueYourCar(){
        driver.findElement(valueYourCar).click();
    }

    public String getCarDetails() {

        return driver.findElement(carDetails).getText();

    }

}
