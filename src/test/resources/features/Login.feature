
@regression

Feature: Library login feature

  User story: As a user, I should be able to login with correct credentials to different accounts.
       and dashboard should be displayed.
  Accounts are: librarian, student, admin
@librarian
  Scenario: Login as librarian
    Given user is on the login page of the library application
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    #this is how we comment out
  @student
  Scenario: Login as student
    Given user is on the login page of the library application
    When user enters student username
    And user enters student username password
    Then user should see the dashboard
 @admin
  Scenario: Login as admin
    Given user is on the login page of the library application
    When user enters admin username
    And user enters admin username password
    Then user should see the dashboard