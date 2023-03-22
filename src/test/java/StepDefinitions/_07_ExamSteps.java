package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.BasicDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class _07_ExamSteps {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();


    @Given("Go to Entrance Exam Page")
    public void goToEntranceExamPage() {
        nv.clickMethod(nv.getEntranceExamsButton());
        nv.clickMethod(nv.getSecondSetupButton());
        nv.clickMethod(nv.getEntranceExamsInnerButton());


    }

    @When("Fill the Create Exam Form with Valid Data")
    public void fillTheCreateExamFormWithValidData(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.waitUntilVisible(dc.getDescription());
        dc.sendKeysMethod(dc.getEntranceExamsCreateNameInput(),dataList.get(0));

        dc.clickMethod(dc.getAcademicPeriodSelect());
        dc.clickMethod(dc.getAcademicPeriodOption());
        dc.clickMethod(dc.getGradeLevelSelect());
        dc.clickMethod(dc.getGradeLevelOption());





    }

    @And("Create a Description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.waitUntilVisible(dc.getDescription());
        dc.clickMethod(dc.getDescription());
        dc.waitUntilVisible(dc.getDescriptionAndNoteIFrame());



        BasicDriver.getDriver().switchTo().frame(dc.getDescriptionAndNoteIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNoteInput(),dataList.get(0));
        BasicDriver.getDriver().switchTo().defaultContent();


    }

    @And("Create a Note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.getNote());
        dc.waitUntilVisible(dc.getDescriptionAndNoteIFrame());
        BasicDriver.getDriver().switchTo().frame(dc.getDescriptionAndNoteIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNoteInput(),dataList.get(0));
        BasicDriver.getDriver().switchTo().defaultContent();



    }
}
