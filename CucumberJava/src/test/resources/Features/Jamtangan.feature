Feature: Buy watch price JAMTANGAN.COM

  Scenario: Buy watch price below 10 million
    Given user open website JAMTANGAN
    When user login account
    Then user see dashboard
    Given user see some watches on dashboard
    When user choose one of the watch below 10 million
    Then User Pay
