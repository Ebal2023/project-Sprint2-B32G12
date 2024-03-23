Feature: Add Link in message

  Background:
    Given the user is on the login page

  @something

  Scenario: Verify that the user can attach a link to the specified text.
    Given the user logged in as "hr"
    And on the "Activity Stream" Page
    When user clicks on message module
    And clicks on link icon
    And adds "cydeo" to the linkTextBox
    And enters "cydeo.com" in linkURLBox
    And user clicks save button
    Then user should see added link in message box

  Scenario:Verify that by clicking on the link the user can navigate to the correct URL.
    Given the user logged in as "hr"
    And on the "Activity Stream" Page
    And clicks on link icon
    And enters "cydeo.com" in linkURLBox
    And user clicks save button


  Scenario Outline:Verify that the link is opened in a new tab.
    Given the user logged in as "<userType>"
    And on the "Activity Stream" Page
    When user clicks on message module
    And clicks on link icon
    And user clicks save button
    When user clicks send
    And enters "cydeo.com" in linkURLBox
    Then user will "cydeo.com" open in new tab

    Examples: the user can
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |