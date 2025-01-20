Feature: ContactDetails

  Background:
    Given I navigate to the website
    When I click login button
    Then login welcome page displayed
    And I enter the email address "zdds@gmail.com"
    And I enter your Password "Kira123@"
    And I click submit button
    Then my profile page displayed


  @test
 Scenario: valid contact detail
     When I click contact details
     Then my contact page displayed
     And email displayed
     When I enter phone number "07453412374"
     And I click save and update button
     Then record has been updated

  @test
  Scenario: invalid contact detail(accepting anything including alphabet)
    When I click contact details
    Then my contact page displayed
    And email displayed
    When I enter phone number "074"
    And I click save and update button
    Then record has been updated
