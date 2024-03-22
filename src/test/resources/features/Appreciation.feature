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
    And writes "<Appreciation Message>" in the editor box
    And adds a recipient to the To field
    And clicks on send button
    Then user sees "<Expected Message>" message posted on the feed

    Examples: the user can login as following roles and send messages
      | userType  | Appreciation Message | Expected Message |
      | hr        | Well Done            | Well Done        |
      | marketing | Good Work            | Good Work        |
      | helpdesk  | Keep Up!             | Keep Up!         |


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

  Scenario Outline: Verify error message when sending appreciation without recipient
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    When the user attempts to send an appreciation without recipient
    Then the system displays an error message "Please specify at least one person."

    Examples: the user can login as following roles
      | userType  |
      #| hr        |
      | marketing |
     # | helpdesk  |

  Scenario Outline: Verify the delivery is 'All employees' by default.
    #(user doesn't select any recipient)
    Given the user logged in as "<userType>"
    And is on the "Activity Stream" page
    When the user clicks on the More drop-down
    And selects the "Appreciation" option
    And writes "<Appreciation Message>" in the editor box
    And clicks on send button
    Then user sees message sent to the "<Expected Recipient>" on the feed

    Examples: the user can login as following roles
      | userType  | Appreciation Message | Expected Recipient |
      | hr        | Well Done            | To all employees   |
      | marketing | Well Done            | To all employees   |
      | helpdesk  | Well Done            | To all employees   |