@exerciseThreeTest
Feature: Test scenarios on exercise three page

  @savingTheFormAllFields
  Scenario: Saving The Form All Fields
    When User navigates to exercise three page
    Then User prepares access to the form
    Then User fills the form with defined values: name Tomek surname Sochacki notes Notatka phone 123123123
    Then User uploads photo to the form
    Then User clicks save button
    And Success message Twoje dane zostały poprawnie zapisane should appear

  @savingTheFormTwoFields
  Scenario: User Saving The Form With Only Notes And Photo
    When User navigates to exercise three page
    Then User prepares access to the form
    Then User fills the form with one value: notes Notatka
    Then User uploads photo to the form
    Then User clicks save button
    And Success message Twoje dane zostały poprawnie zapisane should appear

  @checkingThreeValuesOfTheForm
  Scenario: User Checking Three Values Of The Form
    When User navigates to exercise three page
    Then User reads three values: name, surname, phone and checks them against default values

