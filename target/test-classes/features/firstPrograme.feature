Feature: Application login

  # Scenario: Admin page default login
  # Given User is on netbanking page
  # When User login to the application with "<admin>" and password "<12234>"
  # Then HomePage is displayed
  # And cards are displayed
  # Scenario: User page default login
  # Given User is on netbanking page
  # When User login to the application with <user> and password <435>
  # Then HomePage is displayed
  # And cards are displayed
  Scenario Outline: User page default login
    Given User is on netbanking page
    When User login to the application with "<UserName>" and password "<Password>" combi
    Then HomePage is displayed
    And cards are displayed

    Examples:
      | UserName | Password |
      | Abhijeet | 1234     |
      | Sameer   | 2344     |
