Feature: Testing page of notepad

  Scenario: All buttons on the main screen are clickable
    Given notepad is open
    When user clicks file
    And user click edit
    And user click format
    And user click view
    Then user click help

  Scenario: Adding text to the main section
    Given notepad is open
    When user clicks on the text section
    And user types a line of text "This is a line of text"
    And user types a line of text "This is a line of text"
    Then text appears on the notepad