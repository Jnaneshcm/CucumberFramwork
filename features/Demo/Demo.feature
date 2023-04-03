Feature: Demo Cucumber capabalities.


  Scenario: Login into Amazon Application and Add an Item to Cart
    Given User is on the "Amazon" application
    Given User is on "AmazonPage"
    When User enter into Textbox "SearchText" "Selenium Book"
    And click on Button "Search"
    Then click on link "Book"
     And click on Button "AddToCart" 
    
   Scenario: Login into Salesforce Application create a Lead and delete that Lead.
    Given User is on the "Salesforce" application
    Given User is on "SalesforcePage"
    When User enter into Textbox "Username" "anoop123@tekarch.com"
    When User enter into Textbox "Password" "Test@123#"
    And click on Button "Login"
    And click on Button "Home"
    And click on Button "Close"
    And click on Button "Leads"
    When User enter into Textbox "FirstName" "Test1"
    When User enter into Textbox "LastName" "Test2"
    When User enter into Textbox "Company" "Tekarch"
    And click on Button "Save"
    Then click on link "LeadCreated"  
    And click on Button "DeleteLead"
    Then User Accepts the Alert
    
    
    
    Scenario: Launch FlipKart application and enter the value in first screen.
    Given User is on the "Flipkart" application
    Given User is on "FlipkartPage"
    When User enter into Textbox "MobileNumber" "8792212200"
    
    
    
   