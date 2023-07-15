package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on PIM option and Employee list option")
    public void user_clicks_on_pim_option_and_employee_list_option() {
        click(dashboardPage.pimOption);
        click(dashboardPage.employerListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
       sendText("39793833", employeeSearchPage.idTextField);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeSearchPage.searchButton);
    }

    @When("user enters valid employee name in name text box")
    public void user_enters_valid_employee_name_in_name_text_box() {
        sendText("adam ms", employeeSearchPage.nameTextField);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Employee is displayed");
    }

    @When("user enters invalid employee id in idtext box")
    public void user_enters_invalid_employee_id_in_idtext_box() {
        sendText("hfvybkhkhku", employeeSearchPage.idTextField);
    }

    @Then("user is going to see no records found message")
    public void user_is_going_to_see_no_records_found_message () {
        String expectedMessage="No Records Found";
        String actualMessage = employeeSearchPage.notfound.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}