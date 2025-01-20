package hooks;

import utilities.OptionManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BasePage {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public Properties prop;
    public OptionManager op;

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    @Before
    public void setUp() {

        prop = new Properties();

        op = new OptionManager(prop);
        tlDriver.set(new ChromeDriver(op.getChromeOptions()));
        getDriver().manage().window().maximize();


    }

    @After
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            tlDriver.remove();
        }
    }
}