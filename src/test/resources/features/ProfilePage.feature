Feature: Accessing Profile Pages Options

  @Aya
  Scenario Outline:Verify that the <userType> user can view the following options on My Profile page
    Given the user logged in as "<userType>"
    And user clicks profile dropdown
    And user clicks My Profile option from profile options
    Then user should be able to see the following options on My Profile
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | userType  |
      | hr        |
      | Helpdesk  |
      | Marketing |

  @Aya2
  Scenario Outline: Verify that the email which is  <username> under the General tab is the same as the user’s account.

    Given the user logged in as "<userType>"
    And user clicks profile dropdown
    And user clicks My Profile option from profile options
    Then user should be able to see the email "<username>" under the General tab is the same as the user’s account.

    Examples:
      | username              |
      | hr1@cydeo.com         |
      | helpdesk1@cydeo.com   |
      | marketing94@cydeo.com |

    Examples:
      | userType  |
      | hr        |
      | Helpdesk  |
      | Marketing |