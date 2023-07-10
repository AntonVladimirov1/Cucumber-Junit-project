package com.cydeo.step_definitions;

import com.cydeo.pages.devMHloginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class devMHlogin_StepDefinitions {

    devMHloginPage devMHloginPage = new devMHloginPage();

    @Given("user is on the login page of the MH application")
    public void user_is_on_the_login_page_of_the_mh_application() {
        Driver.getDriver().get(ConfigReader.getProperty("devMHLogin"));
    }

    @When("user enters customer username, password and submit")
    public void user_enters_customer_username() {
        devMHloginPage.login(ConfigReader.getProperty("devUsername"),ConfigReader.getProperty("devPassword"));
    }

    @Then("user should see current jobs page")
    public void userShouldSeeCurrentJobsPage() {
        BrowserUtils.verifyTitle("Current Jobs");
        System.out.println("Title is - \"" + Driver.getDriver().getTitle() + "\"") ;
    }


}
