@regression @smoke @us-248 
Feature: Ebay Cart Functionality 
	Description: User should be able to add items in cart

Background: 

	Given Open Ebay Homepage 
	
Scenario: Ebay cart functionality for shoes 
	Given Search for Nike Air Jordan 4
	When Select the Nike Air Jordan 4 on item list 
	And Select US Shoe Size 
	And Select Quantity 
	Then Add to shopping cart