
Feature: Activity Stream Page Options Verification

  Background: User is already in the log in page
    Given the user is on the login page

  @elifk
  Scenario Outline: Verify that the user views all options on the Activity Stream page
    Given the user logged in as "<userType>"
    When user is on the Activity Stream page
    Then user views the following options on the Activity Stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

    Examples:
      | userType  |
      | hr        |
      #| marketing |
      #| helpdesk  |

@elifs
  Scenario Outline: Verify that the user views the 4 options under the MORE tab
    Given the user logged in as "<userType>"
    When user is on the Activity Stream page
    When user clicks on the MORE tab
    Then user views the following options under the MORE tab
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

    Examples:
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |


