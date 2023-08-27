package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
    static WebDriver driver;
    public  static void setBrowser(String browserName) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver-win64\\chromedriver.exe");
        if (browserName.equalsIgnoreCase("fireFox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();

        } else {

            driver = new ChromeDriver();

        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
