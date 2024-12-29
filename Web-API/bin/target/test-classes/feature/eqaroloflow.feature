Feature: eqaroloflow website
  Scenario: order ipad in eqaroloflow website
    Given initiate browser
    When navigate to website
    And enter username and password hit login button
    Then got to shop page
    Then got to technonlogy page
    Then add the ipad in card
    Then check out
    Then place the order
    Then print the order number
