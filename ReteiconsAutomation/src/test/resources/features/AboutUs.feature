Feature: aboutUS

  @test
  Scenario: valid about us
    Given  I navigate to the website
    When I click about us
    Then about us displayed
