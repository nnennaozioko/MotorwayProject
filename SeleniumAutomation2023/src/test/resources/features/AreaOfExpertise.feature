Feature: AreaOf Expertise

  Background:
    Given I navigate to the website
    When I click login button
    Then login welcome page displayed
    And I enter the email address "zdds@gmail.com"
    And I enter your Password "Kira123@"
    And I click submit button
    Then my profile page displayed

 @test
 Scenario: valid area of expertise
   When I click area of expertise
   Then I can teach page displayed
   When I click add new
   Then add/edit subjects displayed
   When I select what you can teach
   And I click save and update changes
   Then my course displayed successfully
   When click edit
   And I select sub-category from list
   And I click save and update changes
   And I click save and update
   Then record has been updated





