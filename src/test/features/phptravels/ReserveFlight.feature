Feature: Reserve flights

  Scenario: Reserver flight from Warsaw to New York and back
    Given I am on phptravels website
    When I reserve two way flights from "WAW" to "ROC" on date "2019-01-24" and "2019-01-31"
    And I pick first available flight
    And I book as a guest with "Jan" "Kowalski" "mail@test.com" "+48123456789" "Wroclaw" "Poland"
    Then I should see prepared invoice

