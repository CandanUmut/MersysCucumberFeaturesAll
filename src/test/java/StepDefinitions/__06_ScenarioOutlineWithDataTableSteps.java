package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.SortedMap;

public class __06_ScenarioOutlineWithDataTableSteps {
    @Given("Step one")
    public void stepOne(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));

    }

    @Then("Step two")
    public void stepTwo() {
        System.out.println("Step2 braa");
    }

    @And("Step three")
    public void stepThree(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        System.out.println(dataList.get(0).get(0));
        System.out.println(dataList.get(0).get(1));


    }

    @Then("Step four")
    public void stepFour() {
        System.out.println("Hola");
    }
}
