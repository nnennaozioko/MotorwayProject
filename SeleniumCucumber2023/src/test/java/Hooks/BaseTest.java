package Hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

   public static WebDriver driver;

@Before
    public void BrowserSetup()
  {

      driver = new ChromeDriver();
      driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver","C://Users//Nelly//IdeaProjects//SeleniumCucumber2023//src//test//resources//drivers/chromedriver.exe");
      //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");

      driver.get("https://tfl.gov.uk");
      driver.manage().window().maximize();



  }
  @After
    public void TearDown(){
     driver.close();
  }

}
