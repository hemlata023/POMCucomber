Feature: Place order


Background: user login
Given: User is on login Page
When User enters "standard_user" and "secret_sauce"


Scenario:  Add Item to cart
Given User should be on Home page
When User add item to cart
Then Item must be added


Scenario: Checkout Order
Given  User is on cart page
When User do checkout
Then  should navigate to Checkout page