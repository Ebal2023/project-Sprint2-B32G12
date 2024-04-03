Feature: Accessing the Company page

  B32G12-73
  As a user, I should be able to access to the Company page

  Background: user is already on the login page
    Given the user is on the login page
  @wip_Amir
  Scenario Outline:  Verify that the user can see the following modules on the Company page shown as design.
    Given the user logged in as "<userType>"
    And the user clicks on the Company option


#      | Official Information |
#      | Our Life             |
#      | About Company        |
#      | Photo Gallery        |
#      | Video                |
#      | Career               |
#      | Business News (RSS)               |
#      | More                 |
    Then the user sees the Official Information module
    And  the user sees the Our Life module
    And  the user sees About Company module
    And the user sees the Photo Gallery module
    And the user sees the Video module
    And the user sees the Career module
    And the user sees the Business News module
   And the user sees the More module


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


