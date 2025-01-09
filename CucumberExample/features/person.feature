Feature: person service
  Scenario: person service returns correct person
    Given the default person has name "Susan" and address "USA"
    When I call the person service
    Then i get the answer a person with name "Susan" address "USA"


  Scenario: changing the person
    When I update the person to "Ekkart" "Denmark"
    When I call the person service
    Then I get the answer a person with the name "Ekkart" address "Denmark"

  Scenario: changing the person with address "-none-" fails
    When i update the person to "Ekkart" "-none-"
    Then the update fails with PersonException and error "-none- not allowed as address"

