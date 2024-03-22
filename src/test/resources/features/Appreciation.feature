@wip_amiri
Feature: As a user, I should be able to upload files and pictures while sending appreciation

  Background:
    Given the user is on the login page

  Scenario Outline:Verify that the user can upload files and pictures (.pdf, .txt, .jpeg, .png, .docx)
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    And clicks on the upload files icon
    And selects the "png" file from the specified directory
    Then the user sees the newly uploaded file(s) name(s)

    Examples: the user can login as following roles
      | userType  |
     #| hr        |
      | marketing |
     #| helpdesk  |


  Scenario Outline:  Verify that the user can insert the files and images into the text.
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    And clicks on the upload files icon
    And selects the "pdf" file from the specified directory
    And clicks on the Insert in text button
    Then the user sees the newly inserted file in text area


    Examples: the user can login as following roles
      | userType |
      | hr       |
     # | marketing |
      #| helpdesk  |


  Scenario Outline:  Verify that the user can remove files and images at any time before sending.
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    And clicks on the upload files icon
    And selects the "jpeg" file from the specified directory
    And clicks on the x icon next to the uploaded file
    Then the uploaded file is no longer visible


    Examples: the user can login as following roles
      | userType |
     #| hr        |
     #| marketing |
      | helpdesk |


  Scenario Outline: Verify that the user can send an appreciation by filling in the mandatory fields.
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    And writes "Good Job" in the editor box
    And clicks on send button
    Then user should see "Good Job" message posted on the feed

    Examples: the user can login as following roles
      | userType |
      | hr       |
     # | marketing |
     # | helpdesk  |


  Scenario Outline: Verify error message when sending appreciation without message content
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    When the user attempts to send an appreciation without message content
    Then the system displays an error message "The message title is not specified"

    Examples: the user can login as following roles
      | userType  |
      #| hr        |
      | marketing |
     # | helpdesk  |