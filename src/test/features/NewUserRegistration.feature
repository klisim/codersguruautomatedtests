Feature: Register new private user

  Scenario: Create new private user
    Given I open coder guru website
    When I go to registration page
    And I select private user
    And I enter email "t2123e1st@mail.com"
    And I enter name "Siwy" surname "Seba"
    And I provide password "OddajMiMojeStoBaniek"
    And I provide address "Wroclaw" "54-520" "Rzeźnicza" "44"
    And I check that I have read terms
    And I click registration button
    Then User should be successfully created
