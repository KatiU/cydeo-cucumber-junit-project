Feature:Bing search functionality

  Agile story: as a user, when i am on the Bing search page
  I should  be able search anything and see relevant results


  Scenario: Search page Bing title verification
    Given user is on the bing search page
    When  user enters orange in Bing search box
    Then  user should see title is Bing


  Scenario: Search page Bing title verification
    Given user is on the bing search page
    When  user enters "orange" in Bing search box
    Then  user should see "orange - Search" in the title
