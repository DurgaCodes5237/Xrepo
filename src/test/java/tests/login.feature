Feature: login functionality

Scenario: login with valid inputs 

Given  user navigate to the login page
When   user enter the valid gmail id <studentName>
And    user enter the valid password <Password> 
And    user  click to login
Then   user should be login successfully
Examples: 


|studentName     |Password     |
|student         |Password123  |

 


