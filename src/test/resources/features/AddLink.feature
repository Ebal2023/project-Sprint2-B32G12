Feature:

  Scenario: Verify that the user can attach a link to the specified text.
    Given the user logged in as "hr"
    And is on the "Activity Stream" page
    Then user clicks on message module
    Then clicks on link icon
    Then adds "cydeo" to the linkTextBox
    Then enters "cydeo.com" in linkURLBox
    Then user clicks save button
    Then user should see added link in message box


  Scenario: Verify that by clicking on the link the user can navigate to the correct URL.
    Given the user logged in as "hr"
    And is on the "Activity Stream" page
    Then user clicks on message module
    Then clicks on link icon
    Then adds "google" to the linkTextBox
    Then enters "google.com" in linkURLBox
    When user clicks save button
    And user clicks send
    And user clicks on attached link in message box
    Then user is able to navigate to "Google"

 Scenario: Verify that the link is opened in a new tab.
   Given the user logged in as "hr"
   And is on the "Activity Stream" page
   Then user clicks on message module
   Then clicks on link icon
   Then adds "google" to the linkTextBox
   Then enters "google.com" in linkURLBox
   When user clicks save button
   And user clicks send
   And user clicks on attached link in message box
   Then user will see link open in new tab

