Feature: login

Background:
  Given I navigate to the website
  When I click login button
  Then login welcome page displayed

  @test
  Scenario: Valid Login
    When I enter the email address "zdds@gmail.com"
    And I enter your Password "Kira123@"
    And I click submit button
    Then my profile page displayed

    @test
 Scenario: invalid wrong email login
      When I enter the email address "zddsgmail.com"
      And I enter your Password "Kira123@"
      And I click submit button
      Then  wrong email message displayed

      @test
  Scenario: invalid wrong password login
    When I enter the email address "zdds@gmail.com"
    And I enter your Password "Kira"
    And I click submit button
    Then wrong password message displayed