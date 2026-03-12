Feature: Practice Form

  Scenario: Submit practice form
    Given User is on practice page
    When User enters first name and last name
    And User clicks submit
    Then Form should be submitted