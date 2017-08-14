Feature: Deductable
 
  Scenario: Selecting your copay
    Given that I live in zip code 76543
    When I ask for a premium of 30.18
    Then my yearly deductable will be 48
  
  Scenario: Selecting your copay
    Given that I live in zip code 76543
    When I ask for a premium of 56.06
    Then my yearly deductable will be 84