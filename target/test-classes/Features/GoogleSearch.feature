#Author: Radha
Feature: feature to test google search Functionality

  Scenario: Validate google search is working
    Given Browser is open
    And user is on google search
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
