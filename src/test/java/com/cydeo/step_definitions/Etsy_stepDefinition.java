package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Etsy_stepDefinition {

    EtsySearchPage etsySearchPage=new EtsySearchPage();
    @Given("user is on the etsy site")
    public void user_is_on_the_etsy_site() {
        Driver.getDriver().get(ConfigReader.getProperty("etsy"));
    }
    @Then("user sees expected title")
    public void user_sees_expected_title() {
        String expTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitle(expTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsySearchPage.searchBox.sendKeys("Wooden spoon");
    }
    @And("user clicks search button")
    public void userClicksSearchButton() {
        etsySearchPage.searchButton.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        BrowserUtils.verifyTitleContains("Wooden spoon");
    }

    @When("user types in the search box {string}")
    public void userTypesInTheSearchBox(String keyword) {
        etsySearchPage.searchBox.sendKeys(keyword);
    }
    @Then("user sees {string} in the title")
    public void userSeesIsInTheTitle(String expTitle) {
        BrowserUtils.verifyTitle(expTitle);

    }


}
