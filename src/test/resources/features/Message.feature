Feature: Message Functionality
  Agile Story: As a user, I should be able to upload files and pictures as messages
  in the following formats .pdf, .txt, .jpeg, .png, .docx

  Background: user is already on the login page
    Given the user is on the login page
@messageFunctionality
  Scenario Outline: Message Upload Functionality
    When user clicks on the message box
    And user clicks on upload files icon
    And user clicks on upload files and images button
    And user uploads "<supportedFileFormat>"
    Then user is able to see that file uploaded
    And user clicks on insert in text button
    Then user sees file or images as part of text
    And user clicks on X icon to remove image or file
    Then user sees file or images are removed from the message

    Examples: file formats that are supported by the application for upload
      | supportedFileFormat |
      | .pdf                |
      | .txt                |
      | .jpeg               |
      | .png                |
      | .docx               |


