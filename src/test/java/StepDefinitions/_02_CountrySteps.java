package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_CountrySteps {


    DialogContent dc = new DialogContent();
    Navigation nv=new Navigation();

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        nv.waitUntilVisible(nv.getSetupBtn());
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());

    }

    @When("Create a new country")
    public void createANewCountry() {
        nv.clickMethod(nv.getDashboard());
        nv.sendKeysMethod(nv.getName(),"Umut11111111");
        nv.sendKeysMethod(nv.getCode(),"umu1111");
        nv.clickMethod(nv.getSaveButton());


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        nv.verifyContainsText(nv.getSuccessMessage(), "successfully");

    }

    @When("Delete Country")
    public void deleteCountry() throws InterruptedException {
        dc.sendKeysMethod(dc.getCountryNameSearch(),"Umut1111111");
        dc.sendKeysMethod(dc.getCountryCodeSearch(),"umu111");
        dc.clickMethod(dc.getCountrySearchBtn());

        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
        dc.clickMethod(dc.getDeleteCountry());
        dc.clickMethod(dc.getConfirmDeleteCountry());
        nv.verifyContainsText(nv.getSuccessMessage(),"successfully");
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        nv.clickMethod(nv.getDashboard());
    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String arg0, String arg1) {
        nv.sendKeysMethod(nv.getName(),arg0);
        nv.sendKeysMethod(nv.getCode(),arg1);
        nv.clickMethod(nv.getSaveButton());
    }

    @And("Click on save Button")
    public void clickOnSaveButton() {
        nv.clickMethod(nv.getSaveButton());
    }
}
