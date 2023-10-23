Feature: Wiki search features
  WPS - 7531
  @wip
  Scenario: Wikipedia search functionality
    Given User is on Wikipedia home page
    When  user types "Steve Jobs" in wiki search box
    And User clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title