Feature: To add customer

  Scenario Outline: Title of your scenario outline
    Given The user should be in telecom homepage and click on add customer
    When The user should provide valid details "<fName>", "<lName>", "<email>" , "<address>", "<phone>"
    Then the user validates the customer id

    Examples: 
      | fName   | lName | email              | address | phone      |
      | arka    | sen   | arka.sen@gmail.com | chennai | 8981487573 |
      | amartya | singh | ama.sn@gmail.com   | kolkata | 8932487573 |
