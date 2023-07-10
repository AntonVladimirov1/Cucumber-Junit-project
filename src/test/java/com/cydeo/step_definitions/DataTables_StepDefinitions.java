package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println(driverInfo);
        System.out.println(driverInfo.get("name"));
        System.out.println(driverInfo.get("age"));
        System.out.println(driverInfo.size());
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expMonths) {

        List<String> actMonths = BrowserUtils.dropdown_as_STRING(dropdownsPage.monthDropdowns);
        Assert.assertEquals(expMonths,actMonths);
    }
}
