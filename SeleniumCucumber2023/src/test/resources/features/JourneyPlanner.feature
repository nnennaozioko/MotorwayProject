Feature: PlanAJourney
  As a user
  I want to navigate to TFL plan journey
  To plan my journey using journey planner widgets

    Scenario: Validate user journey can be planned using the widget
    Given I navigate to Tfl website url
    When I click on cookies button
    Then plan a journey page is displayed
    When I enter from a location
    And I enter to a location
    And I click change time link
    Then I verify that leaving tab is enabled
    When I select leaving date
    And I select leaving time
    And I click plan my journey
    Then quieter Times Message Displayed
