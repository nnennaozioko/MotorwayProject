Feature: As a student I want to register successfully

Feature: I want to register to become a mentor.


  Background:
    Given I navigate to the website
    When I click sign up button
    Then welcome page displayed

  @test
  Scenario Outline: valid mentor registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentor checkbox
    And I click terms and condition
    And I click join now
    Then my profile page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Jarkg  |  Johnkh      |  Jarakus@gmail.com          |    Mark123@    |
    #|  Eusy       |   James     |    eusy@yahoo.com        |   Eusy123$     |
