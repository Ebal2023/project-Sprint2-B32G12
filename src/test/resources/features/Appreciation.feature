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
    And selects file(s) and or picture(s)
    Then the user sees the newly uploaded file(s) name(s)

    Examples: the user can
      | userType  |
      | hr        |
      | marketing |
      | helpdesk  |