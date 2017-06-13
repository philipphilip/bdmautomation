Feature: all tests on eRegistry site.

  Scenario: Sign in and sign out
    When I open "eRegistry" website
    And I sign in
    Then I sign out

  Scenario: Validate NOB fields
    When I open "eRegistry" website
    And I sign in
    And I navigate to "NOB" new form
    And I view errors on the form "NOB" form
    Then I should Get all mandatory fields validation

  Scenario: Validate NOB fields
    When I open "eRegistry" website
    And I sign in
    And I navigate to "COD" new form
    And I view errors on the form "Death" form
    Then I should Get all mandatory fields validation
