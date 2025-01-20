package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementUtil;

public class AreaOfExpertisePage {

  public WebDriver driver;
  public ElementUtil eleUtil;

    public AreaOfExpertisePage(WebDriver driver)
    {
        this.driver=driver;
        eleUtil = new ElementUtil(driver);
    }

    By areaOfExpertise = By.xpath("");
    By teachPageDisplayed = By.xpath("");
    By addNew = By.xpath("");
    By addEditSubjectsDisplayed = By.xpath("");
    By whatYouCanTeach = By.xpath("");
    By saveAndUpdateChanges= By.xpath("");
    By myCourseDisplayed = By.xpath("");
    By edit = By.xpath("");
    By subCategory= By.xpath("");
    //By saveAndUpdateChanges= By.xpath("");
    //By saveAndUpdate= By.xpath("");
    By recordHasBeenUpdatedPopup = By.xpath("");





}
