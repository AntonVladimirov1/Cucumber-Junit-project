package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {
        System.out.println("User is on the login page of the library application.");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("Librarian enters username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("Librarian enters password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("Student enters username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("Student enters password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("Admin enters username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("Admin enters password");
    }
}
