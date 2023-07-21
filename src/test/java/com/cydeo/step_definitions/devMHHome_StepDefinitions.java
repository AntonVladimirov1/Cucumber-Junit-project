package com.cydeo.step_definitions;

import com.cydeo.pages.devMHhomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class devMHHome_StepDefinitions {

    @When("User is on the MH home page")
    public void user_is_on_the_mh_home_page() {
        Driver.getDriver().get("https://movinghelpd.com");
    }
    devMHhomePage devMHhomePage =new devMHhomePage();
    @Then("User sees list of navbar")
    public void user_sees_list_of_navbar() {

       for (WebElement each:devMHhomePage.actNavbar){

            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
    }

}
