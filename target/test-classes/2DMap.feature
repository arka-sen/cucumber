Feature: To add cutomer

  @tag1
  Scenario: Add a customer and validate
    Given The user clicks on add customer from telecom homepage
    When The user inputs data
      | fName   | lName | email              | address | phone      |
      | arka    | sen   | arka.sen@gmail.com | chennai | 8981487573 |
      | amartya | singh | ama.sn@gmail.com   | kolkata | 8932487573 |
    Then validate the customer
