Feature: To add a customer

  Scenario: To add a customer and verify
    Given User should be in homepage and click on new customer
    When The user provides details
      | arka | sen | arka.sen@gmail.com | chennai | 8981487573 |
    Then validate customer
