Feature: Test Tagged Hooks 

#************** Local Hooks *******************#

@First 
Scenario: Home page test
	Given User already in home page 
	When Title of the page is home page
	
@Second 
Scenario: Login page test
	Given  User already in home page 
	When Title of the page is home page
	Then Click on login link 
	Then Enter the username and password
	|anilkumar@gmail.com|anil131841|
	
@Third 
Scenario: User home page test
	Given  User already in home page 
	When Title of the page is home page
	Then Click on login link 
	Then Enter the username and password
	|anilkumar@gmail.com|anil131841|
	Then Click on Contacts Button
	Then add new contacts
	|firstname|lastname|
	|venki|kodali|
	|Simran|dimple|
	|balaya|Babu|