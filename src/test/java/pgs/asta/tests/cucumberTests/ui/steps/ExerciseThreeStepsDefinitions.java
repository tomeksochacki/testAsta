package pgs.asta.tests.cucumberTests.ui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import pgs.asta.tests.cucumberTests.ui.BaseStepDefs;

public class ExerciseThreeStepsDefinitions extends BaseStepDefs implements En {

    @When("^User navigates to exercise three page$")
    public void user_navigates_to_exercise_three_page() {
        mainPage.regularPageClick().switchTabToSecond();
        exercisesListPage.exerciseThree();
    }

    @Then("^User prepares access to the form$")
    public void user_prepares_access_to_the_form() {
        exerciseThreePage.clickMenu()
                .clickForm()
                .clickEditForm();
    }

    @Then("^User fills the form with defined values: name (.*) surname (.*) notes (.*) phone (.*)$")
    public void user_fills_the_form_with_defined_values_name_surname_notes_phone(String name, String surname, String notes, String phone) {
        exerciseThreePage.clearFields().fillFields(name, surname, notes, phone);
    }

    @Then("^User uploads photo to the form$")
    public void user_uploads_photo_to_the_form() {
        exerciseThreePage.uploadFileCucumberMethod();
    }

    @Then("^User clicks save button$")
    public void user_clicks_save_button() {
        exerciseThreePage.clickBtnSave();
    }

    @And("^Success message (.*) should appear$")
    public void success_message_should_appear(String message) {
        exerciseThreePage.checkIfSuccessMessageAppeared(message);
    }

    @Then("^User fills the form with one value: notes (.*)$")
    public void user_fills_the_form_with_one_values_notes_notatka(String notes) {
        exerciseThreePage.clearFields().fillOneField(notes);
    }

    @Then("^User reads three values: name, surname, phone and checks them against default values$")
    public void user_reads_three_values_name_surname_phone_and_checks_them_against_default_values() {
        exerciseThreePage.checkingValues();
    }
}

