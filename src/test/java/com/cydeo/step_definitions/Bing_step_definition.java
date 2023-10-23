package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearch;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Bing_step_definition {

    BingSearch bingSearch = new BingSearch();

    @When("user is on the bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com");
    }

    @When("user enters orange in Bing search box")
    public void userEntersOrangeInBingSearchBox() {
        bingSearch.searchBox.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user should see title is Bing")
    public void userShouldSeeTitleIsBing() {

        String expectedTitle = "Bing";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);


    }

    @When("user enters {string} in Bing search box")
    public void userEntersInBingSearchBox(String searchWord) {
        bingSearch.searchBox.sendKeys(searchWord + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedInTitle) throws InterruptedException {
        Thread.sleep(2000);
        BrowserUtils.verifyTitle(expectedInTitle);
    }
}
