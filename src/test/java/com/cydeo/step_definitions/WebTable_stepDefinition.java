package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableBasic_Page;
import com.cydeo.pages.WebTableLogin_Page;
import com.cydeo.pages.WebTableOrder_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class WebTable_stepDefinition {

    @Given("user is on the web table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    WebTableLogin_Page webTableLogin_page=new WebTableLogin_Page();

    @When("user enters correct username")
    public void user_enters_correct_username() {
        webTableLogin_page.inputUsername.sendKeys("Test");
    }
    @When("user enters correct password")
    public void user_enters_correct_password() {
        webTableLogin_page.inputPassword.sendKeys("Tester");
    }
    @When("clicks login button")
    public void clicks_login_button() {
        webTableLogin_page.loginButton.click();
    }
    @Then("user should see order word in the URL")
    public void user_should_see_order_word_in_the_url() {
        String actURL = Driver.getDriver().getCurrentUrl();
        String expURL = "orders";
        Assert.assertTrue(actURL.contains(expURL));
        System.out.println(actURL);
    }

    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {
        webTableLogin_page.inputUsername.sendKeys(username);
        webTableLogin_page.inputPassword.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String,String> credentials) {
        webTableLogin_page.inputUsername.sendKeys(credentials.get("username"));
        webTableLogin_page.inputPassword.sendKeys(credentials.get("password"));
    }
    //=====================================================================================================================

    WebTableOrder_Page orderPage=new WebTableOrder_Page();
    @Given("user is already logged into The Web table app")
    public void user_is_already_logged_into_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTableLogin_page.login("Test","Tester");
    }
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {
        orderPage.orderButton.click();
    }
    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expOptions) {
        List<String> actOptions= BrowserUtils.dropdown_as_STRING(orderPage.productDropdown);
        Assert.assertEquals(expOptions,actOptions);
    }

    @Then("user sees radio button Visa enabled")
    public void userSeesRadioButtonVisaEnabled() {
        Assert.assertTrue(orderPage.visa.isEnabled());
    }

    @Then("user sees radio button Mastercard enabled")
    public void userSeesRadioButtonMastercardEnabled() {
        Assert.assertTrue(orderPage.master.isEnabled());
    }

    @Then("user sees radio button American Express enabled")
    public void userSeesRadioButtonAmericanExpressEnabled() {
        Assert.assertTrue(orderPage.amex.isEnabled());
    }
    //=====================================================================================================================

    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        orderPage.quantity.clear();
        orderPage.quantity.sendKeys(quantity);
    }
    @And("user clicks Calculate button")
    public void userClicksCalculateButton() {
        orderPage.calculateButton.click();
    }
    @And("user enters Name {string}")
    public void userEntersName(String inputName) {
        orderPage.name.sendKeys(inputName);
    }
    @And("user enters street {string}")
    public void userEntersStreet(String inputStreet) {
        orderPage.street.sendKeys(inputStreet);
    }
    @And("user enters City {string}")
    public void userEntersCity(String inputCity) {
        orderPage.city.sendKeys(inputCity);
    }
    @And("user enters State {string}")
    public void userEntersState(String inputState) {
        orderPage.state.sendKeys(inputState);
    }
    @And("user enters zip {string}")
    public void userEntersZip(String inputZip) {
        orderPage.zip.sendKeys(inputZip);
    }
    @And("user choose Card type {string}")
    public void userChooseCardType(String expCardType) {
        BrowserUtils.clickRadioButtons(orderPage.cardType,expCardType);
    }
    @And("user enters Card number {string}")
    public void userEntersCardNumber(String cardNumber) {
        orderPage.cardNo.sendKeys(cardNumber);
    }
    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {
        orderPage.cardExp.sendKeys(expDate);
    }
    @And("user click process Order button")
    public void userClickProcessOrderButton() {
        orderPage.precessButton.click();
    }

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expName) {
       Assert.assertEquals(expName,orderPage.orderName.getText());
    }
}
