#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Log in feature
  As a user I should be able to log in so i can see my profile page 
  
  @ignore
  @tag1
  Scenario: As a user I should be able to log in with valid credentials
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php" 
    And User clicks on sign in
    When User enters valid Email address "test800@hotmail.com"
    And User enters valid password "test123"
    And User clicks sign in button
    Then User should be in profile page
    
    @tag2
    Scenario: As a user I shouldnt be able to log in with invalid email address and correct password 
    Given User opens the browser 
    And User navigate to the following page "http://automationpractice.com/index.php" 
    And User clicks on sign in
    When User enters invalid Email address "invalid@hotmail.com"
    And User enters valid password "test123"
    And User clicks sign in button 
    Then User should see an error message "Invalid email address."
    
    @ignore
    Scenario: As a user I shouldn´t be able to log in with valid email address and incorrect password 
    Given User opens the browser 
    And User navigate to the following page http://automationpractice.com/index.php
    And User click on Sign in 
    When User enters valid email address 
    And User enters invalid password
    And User clics sign in button 
    Then User shouldn´t advance to the next page 
    And Should see an error message 
    
    @ignore
    Scenario: As a user I shouldn´t be able to log in with invalid credentials
    Given User opens the browser 
    And User navigate to the following page http://automationpractice.com/index.php
    And User click on Sign in 
    When User enters invalid email address 
    And User enters invalid password
    And User clics sign in button 
    Then User shouldn´t advance to the next page 
    And Should see an error message 
    
    @ignore
    Scenario: As a user if I forgot the password 
    Given User opens the browser 
    And User navigate to the following page http://automationpractice.com/index.php
    And User click on Sign in 
    When User enters valid email address 
    And User doesn´t know the password
    And User clics on Forgot your password? button
    Then User should go to the retrive password page 
    
    @ignore
    Scenario: As a user I shouldn´t be able to sign in without credentials information
    Given User opens the browser 
    And User navigate to the following page http://automationpractice.com/index.php
    And User click on Sign in 
    And User clics sign in button 
    Then User shouldn´t advance to the next page 
    And Should see an error message 
    
    @ignore
    Scenario: As a new user I should be able to create an account 
    Given New user opens the browser 
    And New user navigate to the following page http://automationpractice.com/index.php
    Then New user enters valid email 
    And New user clics in create account button 
    Then New user should go to the next page 
    And contiunue with the registration 
    
    @ignore
    Scenario: As a new user I shouldn´t be able to create an account hit incorrect email
    Given New user opens the browser 
    And New user navigate to the following page http://automationpractice.com/index.php
    Then New user enters invalid email 
    And New user clics in create account button 
    Then New user shouldn´t go to the next page 
    And see an error message
    
    
    @ignore
    Scenario: As a User I shouldn´t be able to create an account with already used credentials  
    Given User opens the browser 
    And User navigate to the following page http://automationpractice.com/index.php
    Then User enters already existing email 
    And User clics in create account button 
    Then User sees an error message 
    