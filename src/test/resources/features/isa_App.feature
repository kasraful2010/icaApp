@mobile-regression @mobile-login @mobile
Feature: Mobile Login Feature

# @mobile-login-1
# Scenario: Verify sidebar validation
#    When I click on skip button
#    And I click on menu button
#    Then I verify sidebar menu is displayed
##
#  @mobile-login-2
#  Scenario: Verify favorites empty state text
#    When I click on skip button
#    And I click on favorites button
#    Then I verify "No Sessions Found" text displayed

  @mobile-slide-right-page
  Scenario: Verify user should be able to slide right on tutorial pages
    Given I am on Splash screen of the ionic conference app
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed