package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenShipSteps {
    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();

    @Given("Navigate to Citizenship Page")
    public void navigateToCitizenshipPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCitizenshipButton());


    }

    @And("Enter citizenship name as {string} and citizenship short name as {string}")
    public void enterCitizenshipNameAsAndCitizenshipShortNameAs(String Citizenshipname, String Citizenshipshort) {
        nv.sendKeysMethod(nv.getName(),Citizenshipname);
        dc.sendKeysMethod(dc.getShortname(),Citizenshipshort);



    }

    @And("Search for Citizenship with name as {string} and search short name as {string}")
    public void searchForCitizenshipWithNameAsAndSearchShortNameAs(String citizenshipname, String citizenshipshort) {
        dc.sendKeysMethod(dc.getCountryNameSearch(),citizenshipname);
        dc.sendKeysMethod(dc.getCitizenshipShortNameSearch(),citizenshipshort);
        dc.clickMethod(dc.getCountrySearchBtn());


    }

    @And("Delete citizenship")
    public void deleteCitizenship() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
        dc.clickMethod(dc.getDeleteCountry());
        dc.clickMethod(dc.getConfirmDeleteCountry());

    }
}
