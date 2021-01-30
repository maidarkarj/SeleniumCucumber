Feature: Search and place the vegetables
@SeleniumTest
Scenario: search the items and validate results
Given user is on greenkart landing page
When user searched for "Cucumber" vegetable
Then "Cucumber" result is displayed

@SeleniumTest
Scenario Outline: search the items and then move to checkout page
Given user is on greenkart landing page
When user searched for <Names>vegetables
And added item to cart
And user proceeded to checkout page for checkout
Then verify selected <Names> items are displayed in check out page

Examples:
|Names   |
|Brinjal |
|Beetroot|
|Carrot  |


