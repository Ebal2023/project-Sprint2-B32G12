Feature: Accessing the Drive page

  B32G12-72
  User Story: As a user, I should be able to access the Drive page

  Background: user is already on the login page
    Given the user is on the login page

  @enes
  Scenario Outline:
    Given the user logged in as "<userType>"
    And the user clicks on the "Drive" option
#    Then user should be able to see following 6 modules in the Drive page
#      | My Drive                   |
#      | All Documents              |
#      | Company Drive              |
#      | Sales and Marketing        |
#      | Top Management's documents |
#      | Drive Cleanup              |

    Then the user sees the My Drive module
    And the user sees the All Documents module
    And  the user sees the Company Drive module
    And the user sees the Sales and Marketing module
    And the user sees the Top Management's documents module
    And then user sees the Drive Cleanup module



    Examples: the user can login as following roles
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |