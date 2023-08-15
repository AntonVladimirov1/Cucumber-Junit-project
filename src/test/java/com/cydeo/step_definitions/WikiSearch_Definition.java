package com.cydeo.step_definitions;

import com.cydeo.utility.BrowserUtils;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikiSearch_Definition {

    @Given("user is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("wiki"));
    }
    @When("user types {string} in the search box")
    public void user_types_steve_jobs_in_the_search_box(String input) {
        Driver.getDriver().findElement(By.id("searchInput")).sendKeys(input);
    }
    @When("user clicks Wiki search button")
    public void user_clicks_wiki_search_button() {
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }


    @Then("user sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String verifyInput) {
        BrowserUtils.verifyTitleContains(verifyInput);
        System.out.println(Driver.getDriver().getTitle());
    }
    @Then("user sees {string} is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header(String verifyInput) {
       WebElement header= Driver.getDriver().findElement(By.id("firstHeading"));
       Assert.assertEquals("Title fail",header.getText(),verifyInput);
        System.out.println(header.getText());
    }
    @Then("user sees {string} is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header(String verifyInput) {
        WebElement imageHeader = Driver.getDriver().findElement(By.xpath("//div[@class='fn']"));
        Assert.assertEquals("Image title fail",imageHeader.getText(),verifyInput);
        System.out.println(imageHeader.getText());
    }

}
