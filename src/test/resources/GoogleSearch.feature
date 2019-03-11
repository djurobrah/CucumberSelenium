Feature: Google Search Feature
  # Testing the Google Search Feature

  Scenario: Opening Google Homepage
    Given I am using Chrome as my browser
    When I visit google.com
    Then the title will google