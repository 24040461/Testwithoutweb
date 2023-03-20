Feature: Test print options
  Scenario: does print tab open when clicked
    Given notepad is open2
    When user clicks on print
    Then print tab opens

  Scenario: checking default print orientation is portrait
    Given notepad is open2
    When user clicks on print
    And user clicks on preferences
    Then default print orientation is "Portrait"


