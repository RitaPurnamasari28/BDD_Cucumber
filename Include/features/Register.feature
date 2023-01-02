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
@register
Feature: Register
  User want to register

  @register1
  Scenario: User register with invalid email
    Given User open browser and navigate to automationexercise.com
    When Verify homepage
    And Clik signup/login button
    And Input name
    And Input invalid email
    And Click signup button
    Then Verify signup failure
    
    @register2
  Scenario: User register with valid email without name
    And Input valid email
    And Click signup button
    Then Verify signup failure
    
    @register3
  Scenario: User register with existing email and name
    And Input existing name
    And Input existing email
    And Click signup button
    Then Verify email already exist
    
    @register4
  Scenario: User register with valid Credential
    And Input name
    And Input email
    And Click signup button
    And Choose gender
     And Input password
    And Input date of birth
    And Check Signup for our news letter and Receive Special Offer from our partners
    And Input first name, last name, address, backup address
    And Choose country
    And Input state, city, zipcode, and mobile number 
    And Click Create account
    Then Verify create account success
