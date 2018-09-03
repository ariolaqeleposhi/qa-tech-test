Feature: Rendering the challenge
  As a user
  I want to select the render challenge button
  So that I can view my next problem

Background:
  Given I am on the React App page

Scenario: Successfully viewing the button
  Then I should see a "Render the Challenge" button

Scenario: Successfully selecting the button
  When I select the button
  Then I should an Arrays Challenge