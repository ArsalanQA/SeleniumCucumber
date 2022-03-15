Feature: Access Dubizzle site
  Background: : open dubizzle site
    Given I launch Chrome browser
    When User open URL "https://dubai.dubizzle.com/"

  Scenario: User should be able to filter Property Listings by Price
    Then click on rent tab
    Then search with price
    Then validate min and max
    When move to page 2
    Then validate min and max again
    And close scenario

