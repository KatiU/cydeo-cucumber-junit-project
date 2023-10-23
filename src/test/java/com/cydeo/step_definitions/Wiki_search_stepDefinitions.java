package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_search_stepDefinitions {
     WikiPage wikiPage = new WikiPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");

    }


    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchBtn.click();

    }

    @When("user types {string} in wiki search box")
    public void userTypesInWikiSearchBox(String searchValue) {
        wikiPage.searchBox.sendKeys("Steve Jobs");
    }

    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedInTitle) {
        BrowserUtils.verifyTitleContains(expectedInTitle);



    }
}
