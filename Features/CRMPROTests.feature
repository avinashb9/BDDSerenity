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

  