package com.cydeo.step_definitions;

import com.cydeo.pages.devMHhomePage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class devMHHome_StepDefinitions {

    devMHhomePage devMHhomePage = new devMHhomePage();

    @When("User is on the MH home page")
    public void user_is_on_the_mh_home_page() {
        Driver.getDriver().get("https://movinghelp.com");
    }
    @Then("User sees list of expNavbar")
    public void user_sees_list_of_navbar(List<String> expNavbar) {

        /*for (WebElement each:devMHhomePage.actNavbar){
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
         */
// =================================================================
         List<String> Navbar = new ArrayList<>();
      for (WebElement each:devMHhomePage.actNavbar){
          Navbar.add(each.getText());
          System.out.println(each.getText());
        }
        Assert.assertEquals(expNavbar,Navbar);
    }

}
