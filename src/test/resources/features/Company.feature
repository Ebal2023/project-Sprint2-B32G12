Feature: As a user, I should be able to access to the Company page

  Background: Login
    Given the user is on the login page
  @wip_Amir
  Scenario Outline:  Verify that the user can see the following modules on the Company page shown as design.
    Given the user logged in as "<userType>"
    When user clicks on company page



    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


