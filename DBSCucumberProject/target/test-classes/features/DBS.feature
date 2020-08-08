Feature: DBS Awards validation
Background: 
Given Browser is launched and DBS web URL is entered

@PositiveTest
Scenario Outline: DBS Awards validation
When User click on Learn More button
And User navigate to Singapore
Then Read the table in excel sheet
And User navigate to About in the header tabs
And User navigate to Who we are tab
And User navigate to Our Awards & Accolades
Then Validate the total number of awards
And validate the name and caption of the awards