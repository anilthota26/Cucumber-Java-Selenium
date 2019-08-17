Feature: using tags

@SmokeTest @RegressionTest @End2End
Scenario: test home page
Given user is alreay on home page

@SmokeTest @End2End
Scenario: test home page title
Given test home page title

@RegressionTest @End2End
Scenario: test home page login link
Given Click on ligin link

@RegressionTest @SmokeTest @end2End
Scenario: test login page username and password fields 
Given user is alreay on home page
Then test home page title
Then Click on ligin link
Then enter username and password
|anilkumarthota2179@gmail.com|anil131841|
Then Click on login button



@End2End
Scenario: validating user page
Given user is alreay on home page
Then test home page title
Then Click on ligin link
Then enter username and password
|anilkumarthota2179@gmail.com|anil131841|
Then Click on login button
Then Click on Contacts link

@RegressionTest @End2End
Scenario: addind new Contact 
Given user is alreay on home page
Then test home page title
Then Click on ligin link
Then enter username and password
|anilkumarthota2179@gmail.com|anil131841|
Then Click on login button
Then Click on Contacts link
Then enter firstname and lastname
|firstname|lastname|
|venki|kathi|
|tirumula|burri|
|vasu|burri|












