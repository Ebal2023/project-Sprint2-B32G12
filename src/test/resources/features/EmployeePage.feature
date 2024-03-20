Feature: Access Employees Page

  Scenario: User views the modules on the Employees page
    Given the user has logged in successfully
    When the user navigates to the Employees page
    Then the user should see the following modules:
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

  Scenario: Company Structure is viewed by default on the Employees page
    Given the user has logged in successfully
    And the user navigates to the Employees page
    Then the "Company Structure" module should be displayed by default
