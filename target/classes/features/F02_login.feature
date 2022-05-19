@regression
Feature: user must be able to open site and push login

  Scenario: user could login with valid credentials
    When user navigate to login page
    Then user enter "ABCD@GMAIL.COM" and "ABCD@"
    Then user click login button
