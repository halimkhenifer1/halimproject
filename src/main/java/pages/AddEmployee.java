package pages;

import webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

    WebDriver driver= DriverFactory.getDriver();
    @FindBy(name = "firstName") private WebElement firstname;
    @FindBy(name = "middleName") private WebElement middlname;
    @FindBy(name = "lastName") private WebElement lastname;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]") private WebElement save;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input") private WebElement employeeID;
   String id;
    public EmployeeList addEmployee(String firstName, String middlName, String lastName){
        firstname.sendKeys(firstName);
        middlname.sendKeys(middlName);
        lastname.sendKeys(lastName);
        id=employeeID.getAttribute("value");
        save.click();
        return PageFactory.initElements(driver, EmployeeList.class);
    }

    public String getId(){
        return id;
    }



}
