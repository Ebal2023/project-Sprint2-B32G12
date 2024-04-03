@farid
Feature: Accessing the Employee page

  B32G12-66
  User Story: As a user, I should be able to access the Employee page

  Background: user is already on the login page
    Given the user is on the login page

  Scenario Outline:
    Given the user logged in as "<userType>"
    And the user clicks on the "Employee" option
    Then the user sees following modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Examples: the user can login as following roles
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |


  Scenario Outline:
    Given the user logged in as "<userType>"
      And the user clicks on the "Employee" option
      Then the Company Structure module is displayed by default

    Examples: the user can login as following roles
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |