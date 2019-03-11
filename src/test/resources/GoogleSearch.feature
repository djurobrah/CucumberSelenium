Feature: Google Search Feature
  # Testing the Google Search Feature

  ######################################################################################
  Scenario Outline: Opening Google Homepage
    Given I am using Chrome as my browser
    When I visit "<page>"
    Then the title will contain "<title>"

    Examples:
      | page               | title  |
      | https://google.com | Google |
      | https://www.blizzard.com | Blizzard Entertainment |
  ######################################################################################