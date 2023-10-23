package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {


    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {

        System.out.println("User on login page");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters username");

    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters password");

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees dashboard page");

    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enter student username");
    }

    @And("user enters student username password")
    public void userEntersStudentUsernamePassword() {
        System.out.println("user enter student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enter admin username");
    }

    @And("user enters admin username password")
    public void userEntersAdminUsernamePassword() {
        System.out.println("user enter admin password");
    }
}


