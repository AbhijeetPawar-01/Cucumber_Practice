Feature:Application login

Scenario: Admin page default login

Given User is on netbanking page
When   User login to the application
Then HomePage is displayed
And cards are displayed
