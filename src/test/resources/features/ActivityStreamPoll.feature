Feature: Activity Stream Poll
  Agile Story: As a user, I should be able to create a poll by clicking on Poll tab under Activity Stream

  Background: user is already on the login page
    Given the user is on the login page

    Scenario Outline: verify delivery should be to "All Employees" by default
      Given the user is logged in with username as "hr1@cydeo.com" with password "UserUser"
      And user is on the activity stream page
      Then user has selected the poll module
      Then user will see delivery is set to "all employees"

      Examples: The To: heading shows All Employees selected
    | To | All Employees |

    Scenario Outline: verify user is able to create a poll
      Given user is on the activity stream page
      And user has selected the poll module
      Then user is able to click the question box
      And user is able to enter text in the box
      Then user is able to click the answer box
      And user is able to enter text in the box
      Then user is able to click send

      Examples:
      | question          | answer  |
      | insert question   | insert answer |
