package pages;

import webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


    WebDriver driver = DriverFactory.getDriver();
    @FindBy(name = "username") private WebElement username;
    @FindBy(name = "password") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement login;

    public DashBoard login(String userName, String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord);
        login.click();

        return PageFactory.initElements(driver, DashBoard.class);

    }

}
