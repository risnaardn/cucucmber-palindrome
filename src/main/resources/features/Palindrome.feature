Feature: Palindrome
  As a user
  I want to use a Palindrome to write string
  So that I don't need to write myself

  Scenario Outline: Write a word <str>
    Given I have a String
    When I reverse <str>
    And the result is <str>
    Then the result should be <jenis>

    Examples:
      | str | jenis  |
      | ada | polindrome |
      | buku | bukan palindrome |