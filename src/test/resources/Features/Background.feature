@tag
Feature: Background feature

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to he homepage

  @smoke
  Scenario: check logout link
  
    When user clicks on welcome link
    Then logout link is displayed

  @tag2
  Scenario: verify quick launch toolbar is present
    
    When user clicks on dashboard link
    Then quick lanch is displayed
