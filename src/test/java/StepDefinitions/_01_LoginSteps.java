package StepDefinitions;

import Pages.DialogContent;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class _01_LoginSteps extends DriverClass {


    DialogContent dialogContent = new DialogContent();
    WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(30));

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // Write code here that turns the phrase above into concrete actions
        DriverClass.getDriver().manage().window().maximize();

        DriverClass.getDriver().get("https://test.mersys.io");
        DriverClass.getDriver().manage().deleteAllCookies();





    }
    @When("Enter valid credentials")
    public void enter_valid_credentials() {

        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginUsername()));
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginPassword()));

        dialogContent.getLoginUsername().sendKeys("turkeyts");
        dialogContent.getLoginPassword().sendKeys("TechnoStudy123");

    }
    @When("Click on login Button")
    public void click_on_login_button() {
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginButton()));
        dialogContent.getLoginButton().click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getDashboard()));

        Assert.assertTrue(dialogContent.getDashboard().isDisplayed());
//        dialogContent.




    }


}