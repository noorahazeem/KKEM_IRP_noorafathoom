
FIRST TEST CASE(Include 5 features)
In the Automation of the Website https://www.amazon.com/, there added a wait to enter the captcha
after that, the page is loaded.
Verified whether the title AMAZON is displayed or not
In the search bar, searched for the item S23 Ultra.
From the give options, selected to the first item 
Then navigated to the selected item page
Go for more color options and selected Gray color
Navigated to the buying option for the gray color.
Added item to the cart 
Item tab closed and navigated to the home page.


Second Test Case
In the second test scenario, the features of the cart is tested
From the home page, verified whether the cart icon is displayed or not.
Navigated to the cart.
Verified whether the item added to the cart is displayed or not.
Navigating back to the home page
Browser tear down.


Both the case are run in the same test class since  the  user is not registered, and after each 
browser tear down, the data, ie. item added in the cart wont be available 
