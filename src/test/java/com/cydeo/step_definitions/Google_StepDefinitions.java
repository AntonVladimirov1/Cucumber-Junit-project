package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();


    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actTitle = Driver.getDriver().getTitle();
        System.out.println(actTitle);
        String expTitle = "Google";
        Assert.assertEquals(expTitle,actTitle);

    }


    @When("user searches for {word}")
    public void userSearchesForApple(String word) {
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);
    }
    @Then("user should see {word} in the title")
    public void userShouldSeeAppleInTheTitle(String word) {
        BrowserUtils.verifyTitle(word+" - Google Search");
        System.out.println(Driver.getDriver().getTitle());
    }


    @When("user searches for a orange")
    public void userSearchesForOrange() {
        googleSearchPage.searchBox.sendKeys("orange" + Keys.ENTER);
    }
    @Then("user should see the orange in the title")
    public void userShouldSeeOrangeInTheTitle() {
        BrowserUtils.verifyTitle("orange - Google Search");
        System.out.println(Driver.getDriver().getTitle());
    }


    @When("user searches for the {string}")
    public void userSearchesFor(String arg0) {
        googleSearchPage.searchBox.sendKeys(arg0 + Keys.ENTER);
    }
    @Then("user should see a {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {
        BrowserUtils.verifyTitleContains(arg0);
        System.out.println(Driver.getDriver().getTitle());
    }
}
