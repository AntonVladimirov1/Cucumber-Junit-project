package com.cydeo.step_definitions;

import com.cydeo.pages.devMHLoginPage;
import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class devMHlogin_StepDefinitions {

    devMHLoginPage devMHloginPage = new devMHLoginPage();

    @Given("user is on the login page of the MH application")
    public void user_is_on_the_login_page_of_the_mh_application() {
        Driver.getDriver().get(ConfigReader.getProperty("devMHLogin"));
    }

    @When("user enters customer username, password and submit")
    public void user_enters_customer_username() {
        devMHloginPage.login();
    }

    @Then("user should see current jobs page")
    public void userShouldSeeCurrentJobsPage() {
        BrowserUtils.verifyTitle("Current Jobs");
        System.out.println("Title is - \"" + Driver.getDriver().getTitle() + "\"") ;
    }


}
