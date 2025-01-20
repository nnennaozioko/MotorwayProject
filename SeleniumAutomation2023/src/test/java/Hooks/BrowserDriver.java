package Hooks;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ElementUtil;

public class BrowserDriver {

    public WebDriver driver;
    public ElementUtil elementUtil;

    public ChromeOptions options;



    public BrowserDriver()
    {

        System.setProperty("webdriver.firefox.driver","C:\\Users\\Nelly\\IdeaProjects\\SeleniumAutomation2023\\src\\test\\resources\\driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mentorskid.com");


    }
 public  void close(){
        this.driver.close();
 }

}
