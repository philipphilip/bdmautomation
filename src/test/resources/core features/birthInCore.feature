Feature: List of scenarios.

  Scenario: Sign in and sign out
    When I open Core website
    And I sign in
    Then I sign out

  Scenario: Navigate to BRS and check all mandatory fields
    When I open Core website
    And I sign in
    And I navigate to "BRS" new form
    Then I fill in the "BRS" form

  Scenario: Navigate to BRS and check all mandatory fields
    When I open Core website
    And I sign in
    And I navigate to "NOB" new form
    Then I fill in the "NOB" form
