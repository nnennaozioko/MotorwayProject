Feature: CarValuation

  @test
  Scenario: Valid car valuation
    Given car registration numbers are extracted from a text a file
    When user searches for each registration number
    Then search result should match the expected outcome


