Feature: Testing the login to eRegistry site

  Scenario: Sign in and sign out
    When I open "eRegistry" website
    And I sign in
    Then I sign out