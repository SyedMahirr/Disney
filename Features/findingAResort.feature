@ResortFind
Feature: Finding a Resort
In order to find a Resort 
As a visitor 
I want to navigate to the Disney Website, Pick a check in and check out date ,
Pick 2 adults and 2 children, Set the ages of the children to 12 and 5, Make sure All Resort Hotels is selected,Click Find Resort
Select any resort by name, Select any available room in the resort, Select ticket option, Upgrade the tickets to Park Hopper,On the cart page add ground transportation
Select Disney’s Magical Express, just click done,Back on the cart page verify it says Complimentary next to the Ground Transportation line,
Take a screenshot of the cart page, Remove all items from the cart, Take another screenshot, close

 


Scenario: Positive

Given navigate to the Disney Website
When Pick a check in 
And check out date
And Pick two adults 
And two children
And Set the ages of the children to Twelve 
And Setting the children age to Five
And Make sure All Resort Hotels is selected
And Click Find Resort
And Select any resort by name
And Select any available room in the resort
And Select ticket option
And Upgrade the tickets to Park Hopper
And On the cart page add ground transportation
And Select Disney’s Magical Express
And just click done
And Back on the cart page verify it says Complimentary next to the Ground Transportation line
And Take a screenshot of the cart page
And Remove all items from the cart
And Take another screenshot
Then close



