Feature: Accessing the Drive page

  B32G12-72
  User Story: As a user, I should be able to access the Drive page

  Background: user is already on the login page
    Given the user is on the login page

  @enes
  Scenario Outline:
    Given the user logged in as "<userType>"
    And the user clicks on the "Drive" option
    Then the user sees the modules
      | My Drive                  |
      | All Documents             |
      | Company Drive             |
      | Sales and Marketing       |
      | Top Managements documents |
      | Drive Cleanup             |



    Examples: the user can login as following roles
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |