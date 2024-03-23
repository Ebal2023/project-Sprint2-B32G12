@yarif
Feature: Use Functions on Company Structure


  Scenario Outline: Display company structure for all user types
   # Given "<UserType>" user is logged in
    Given the user logged in as "<UserType>"
    When the user navigates to the Company Structure under the Employee menu
    Then the "company structure" should be displayed

    Examples:
      | UserType   |
      | hr         |
      | Helpdesk   |
     | Marketing  |


  Scenario: HR user can add a department
    Given the user logged in as "hr"
    And the user navigates to the Company Structure under the Employee menu
    When the user attempts to add a department
    And the user enter "English" in popup-window
    And the user select "cucumber" from popup-window
    And  the user click add button
    Then the "English" should be added successfully


  Scenario Outline: No "ADD DEPARTMENT" option for specific users

    Given the user logged in as "<UserType>"
    When the user navigates to the Company Structure under the Employee menu
    Then the ADD DEPARTMENT option should not be visible

    Examples:
      | UserType  |
      | helpdesk  |
      | marketing |