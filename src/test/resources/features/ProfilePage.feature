Feature: Accessing Profile Pages Options

  Scenario : Verify that the  hr can view the following options on My Profile page
    When user login as hr
    And user clicks profile dropdown
    And user clicks My Profile option from profile options
    Then user should be able to see the following options on My Profile
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |


  Scenario: Verify that the email which is  <username> under the General tab is the same as the user’s account.
    When user login as hr
    And user clicks profile dropdown
    Then user should be able to see the email "hr1@cydeo.com" under the General tab is the same as the user’s account.
