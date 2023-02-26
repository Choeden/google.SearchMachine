Feature: searching products

Scenario Outline: searching products on google

Given I am on the google homepage

When I enter the "<product_name>"
And I click on the search button

Then I see the realted search results successfully

Examples:
|product_name|
|Football    |
|Computer    |
|toys        |
