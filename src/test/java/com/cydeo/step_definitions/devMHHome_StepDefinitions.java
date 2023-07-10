package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class devMHHome_StepDefinitions {

    @When("User is on the MH home page")
    public void user_is_on_the_mh_home_page() {
    }
    @Then("User sees list of navbar")
    public void user_sees_list_of_navbar(List<String> navbar) {
        System.out.println(navbar);
    }

}
