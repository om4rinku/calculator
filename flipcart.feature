Feature: Flipkart Travel Section Test

  Scenario: Validate total flight price
    Given I navigate to flipkart.com
    When I select round trip, choose dates, and locations
    And I click on search
    Then I validate the total price for flights
