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
#Comments
@Smoke
Feature: Test Login Functionality

  @SmokeTest
  Scenario Outline: Check login with valid credencials
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples: 
      | username  | password |
      | Cristian  |    12345 |
      | David     |    12345 |
      | Sebastian |    12345 |
