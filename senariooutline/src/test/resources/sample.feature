Feature: To validate the login fuctionality of facebook application


Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch athe browser and maximize the window
When User has to hit the url email
And User has to pass the data "<emaildata>" in email filed
And User has to click next button
And User has to pass the data "<passdata>" in password filed
And User has to click next button
And User has to click a login button 
Then User has to close the browser

Examples:
|emaildata|passdata|
|inmaeks@gmail.com|inmakes|
|infotect@gmail.com|23432|
|tech@gmail.com|info|

