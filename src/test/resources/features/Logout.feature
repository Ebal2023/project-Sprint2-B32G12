@masoom
Feature:As a user, I should be able to log out
  Background:
    Given the user is on the login page

  Scenario Outline: Verify that the user can log out from the app after clicking the “Log out” button.
      Given the user logged in as "<userType>"
      When the user clicks profile picture
      And the user clicks Log out option
      Then the user gets Logged out successfully


      Examples:
        |userType |
        |    hr     |

