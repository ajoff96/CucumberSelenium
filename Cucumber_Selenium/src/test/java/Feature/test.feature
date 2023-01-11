Feature: Login Feature

Scenario: Login as authenticated User
		Given user is on login page
    When user enters username and Password
   	Then success Login and Home Page display
  