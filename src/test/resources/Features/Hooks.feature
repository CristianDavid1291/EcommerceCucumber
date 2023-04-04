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
Feature: Test hooks feature

  @tag1
  Scenario: Login page
    Given user is on login page hooks
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @ScenarioOutline
  Scenario Outline: Test Scenario
    Given we have a <username> and <password>
    Then print <username> and <password>

    Examples: 
      | username | password |
      | Cristian |   123456 |
      | David    |   123456 |
