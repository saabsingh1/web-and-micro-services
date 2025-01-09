Feature: Return sum

  Scenario: Zero numbers are passed
    Given an empty string
    When the empty string is passed to the add method
    Then the method should return 0

  Scenario: One number is passed
    Given a number
    When the number is passed to the add method
    Then the method should return the number

  Scenario: Two numbers are passed
    Given two numbers
    When the numbers are passed to the add method
    Then the method should return the sum of the numbers

  Scenario: Multiple numbers are passed
    Given multiple numbers are passed
    When multiple numbers are passed to the add method
    Then the methods should return the sum of the numbers

  Scenario: New lines between numbers
    Given input with newlines in between numbers
    When input is passed with newlines between numbers
    Then the add method should handle newlines

  #Scenario: Support different delimiters
    #Given input is with delimiters
    #When input is passed
    #Then sum should be returned




