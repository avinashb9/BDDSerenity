#Author: your.email@your.domain.com

@loginFeature
Feature: Login Page Feature

  @title
  Scenario: Verification Home Page Title
    Given User Navigated to Applicaton
    When User enter valid credentials
    And User clicked on SignIn button
    Then User should see Home Page
    And User should log out of the Application

  
  @Header
  Scenario: Verification Home Page Headers
  	Given User Navigated to Applicaton
  	When User logged in with valid credentials
  	Then User should see Home Page
  	And validate the Headers displayed
  	
  @DataDriven	
  Scenario Outline: Verification Home Page Title
    Given User Navigated to Applicaton
    When User enters "<username>" and "<password>" in LoginPage
    And User clicked on SignIn button
    Then User should see Home Page "<Title>"
    And User should log out of the Application
    
   Examples:
   | username			 	 | password 	| Title  |
   | batchautomation | Test@12345 | CRMPRO |
   | batchautomation | Test				| CRMPRO |
   