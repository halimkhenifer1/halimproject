import webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Home;

public class Utilities {
    WebDriver driver;
    @BeforeMethod
    public void beforeStartingTest(){
        DriverFactory.setBrowser("Chrome");
        driver=DriverFactory.getDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterMethod
    public void afterTest(){
        driver.quit();

    }

    public Home startTest(){

        return PageFactory.initElements(driver, Home.class);

    }

    public void waitUs(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
