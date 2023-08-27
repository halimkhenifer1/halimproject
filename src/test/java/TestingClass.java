import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddEmployee;
import pages.EmployeeList;
import pages.DashBoard;
import pages.Home;

public class TestingClass extends Utilities {

    @Test
    public void testing(){
        waitUs();
        Home home=startTest();

        DashBoard dashBoard=home.login("Admin", "admin123");

        waitUs();
        EmployeeList employeeList=dashBoard.clickOnPim();
        waitUs();
       AddEmployee addEmployeeObj= employeeList.ClickOnaddEmployee();
        waitUs();
       EmployeeList employeeList1=addEmployeeObj.addEmployee("halim", "halim","halim");
       String employeeID=addEmployeeObj.getId();
        waitUs();
       WebElement employee=employeeList1.searchEmployee(employeeID);
       Assert.assertEquals(employee.getText(), employeeID);




    }
}
