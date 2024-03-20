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
      | userType  |
     #| hr        |
     #| marketing |
      | helpdesk  |

