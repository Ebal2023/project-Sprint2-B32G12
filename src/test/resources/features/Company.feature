Feature: As a user, I should be able to access to the Company page

  Background: Login
    Given the user is on the login page
  @wip_Amir
  Scenario Outline:  Verify that the user can see the following modules on the Company page shown as design.
    Given the user logged in as "<userType>"
    When user clicks on company page
    Then user sees the following modules

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |








    Examples:
      | userType  |
      | hr        |
      #| helpdesk  |
      | marketing |


