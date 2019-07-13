Feature: To add cutomer

  Scenario: Add cutomer and validate
    Given Go to telecom home and click on new customer
    When the user provides valid details
      | fname   | arka               |
      | lname   | sen                |
      | email   | arka.sen@gmail.com |
      | address | chennai            |
      | phone   |         9891476564 |
    Then Validate user
