Feature: Application Login

Scenario: Home page default login

Given User is on Netbanking landing page
When User login into applicaion with "Banele" and password "12345"
Then Home page is populated
And Cards are displayed

Scenario: Home page default login

Given User is on Netbanking landing page
When User login into applicaion with "Sanele" and password "54321"
Then Home page is populated
And Cards are not displayed