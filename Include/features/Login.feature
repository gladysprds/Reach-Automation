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
Feature: Login
 As a user
 I want to login
 So that i can use my account
 

  @tag1
  Scenario Outline: Login Scenario
    Given Open Browser and choose admin button
    When I input <email> and <password>
    And I click button sign in
    Then I verify the <status>

    Examples: 
      | email  | password | status  |
      | antonius@embreo.global |singapore | success |
      | antonius@embreo.global |sings | failed |
      