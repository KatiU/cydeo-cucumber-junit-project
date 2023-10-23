package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VyTrack_step_definition {


    VyTrackPages vyTrackPages = new VyTrackPages();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        vyTrackPages.username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        vyTrackPages.userpassword.sendKeys(ConfigurationReader.getProperty("driver_password"));
        vyTrackPages.loginBtn.click();
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        vyTrackPages.username.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        vyTrackPages.userpassword.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        vyTrackPages.loginBtn.click();

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vyTrackPages.username.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        vyTrackPages.userpassword.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        vyTrackPages.loginBtn.click();


    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        String expectedTitle ="Dashboard";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);



    }
}
