Feature: CMS user login

  Scenario: Log in successful
    When User enters username "mobilis" and password "Mobilis123?" combination
    Then I should see CMS landing on Welcome page

  Scenario: Log in failed
    When User enters username "mobilis" and password "Mobilis" combination
    Then I should see CMS stays on log in page
    And invalid username and password input cleared out
    And error message displayed