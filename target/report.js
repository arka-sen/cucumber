$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/2DMap.feature");
formatter.feature({
  "name": "To add cutomer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a customer and validate",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user clicks on add customer from telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TwoDMap.the_user_clicks_on_add_customer_from_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user inputs data",
  "rows": [
    {
      "cells": [
        "fName",
        "lName",
        "email",
        "address",
        "phone"
      ]
    },
    {
      "cells": [
        "arka",
        "sen",
        "arka.sen@gmail.com",
        "chennai",
        "8981487573"
      ]
    },
    {
      "cells": [
        "amartya",
        "singh",
        "ama.sn@gmail.com",
        "kolkata",
        "8932487573"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TwoDMap.the_user_inputs_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the customer",
  "keyword": "Then "
});
formatter.match({
  "location": "TwoDMap.validate_the_customer()"
});
formatter.result({
  "status": "passed"
});
});