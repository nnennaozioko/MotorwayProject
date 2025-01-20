package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;
    public ElementUtil eleUtil;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        eleUtil = new ElementUtil(driver);
    }

  By loginButton = By.xpath("//li[@id='menu-item-2698']");
  By loginWelcomePageDisplayed = By.xpath("//div[h2='Welcome!']");
  By emailAddress = By.name("login[email]");
  By yourPassword = By.id("tu-passwordinput");
  By wrongEmailAddress = By.id("tuturn-modal-popup");
  By wrongPassword = By.xpath("//div[@class='modal fade tuturn-profilepopup tu-uploadprofile tuturn-popup']");

public void ClickLoginButton(){
    eleUtil.doClick(loginButton);
}

public boolean LoginWelcomePageDisplayed(){
    return eleUtil.doElementIsDisplayed(loginButton);
}

public void EnterEmailAddress(String email)
{
    eleUtil.doSendKeys(emailAddress, email);
}

public void EnterYourPassword(String pass)
{
    eleUtil.doSendKeys(yourPassword, pass);
}

public void ClickSubmit(){
    String csspath= "div .form-group a span";
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,100)", "");
    // eleUtil.doActionsCick(savebutton);
    ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);

}

    public boolean WrongEmailAddress() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(wrongEmailAddress);
        return true;

    }

    public boolean WrongPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(wrongPassword).isDisplayed();
        return true;
    }



}
