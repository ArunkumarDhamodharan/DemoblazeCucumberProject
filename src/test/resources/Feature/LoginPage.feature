Feature: To Verify  Demo E-Commerce WebPage

  Scenario: To Verify Demo E-Commerce Login Webpage with Valid Credentials
    Given User Should in E-Commerce Login Page
    When User Should Enter the UserName and Password
    And User should Click The Login button
    And User Should Choose The Laptop and Add To Cart
    And User Should Cart Click and Accept the Alert
    And User Should Enter The Valid Credentials
    And User Should Get The BuyDetails
    Then User Should verify the Succesfull Message
    
