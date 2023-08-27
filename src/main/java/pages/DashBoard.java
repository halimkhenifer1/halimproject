package pages;

import webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
       WebDriver driver = DriverFactory.getDriver();
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]") private WebElement pim;
    public EmployeeList clickOnPim(){
        pim.click();

        return PageFactory.initElements(driver, EmployeeList.class);
    }
}
