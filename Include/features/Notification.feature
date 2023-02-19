@Notification @Smoke
Feature: Notification
  As an user, I want to view notification in Secondhand Store App

  @NO001
  Scenario: User want to view notification after login
    Given User has successfully login into the app
    When Users input email "studentqa3@binar.id"
    And Users input password "studentQA3"
    And Users tap login button
    And Users tap notification icon
    And Users scroll notification list
    And Users tap offering details
    Then Notification details displayed 

    