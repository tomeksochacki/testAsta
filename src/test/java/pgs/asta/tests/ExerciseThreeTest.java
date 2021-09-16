package pgs.asta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseThreePage;
import pgs.asta.utilities.Log;

public class ExerciseThreeTest extends StartupBase {
    ExerciseThreePage exerciseThreePage;
    String nameSave = "Tomek";
    String surnameSave = "Sochacki";
    String notesSave = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nibh augue, suscipit a, scelerisque sed, lacinia in, mi. Cras vel lorem";
    String phonesSave = "123123123";
    String defaultName = "Salma";
    String defaultSurname = "Hayek";
    String defaultPhone = "19154175411";
    String photoPath = "C:\\zdjecie.jpg";

    @Test
    public void savingTheFormAllFields() {
        exerciseThreePage = new ExerciseThreePage(driver);
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        accessingToTheForm(exerciseThreePage);
        exerciseThreePage.fillFields(nameSave, surnameSave, notesSave, phonesSave);
        exerciseThreePage.uploadFile(photoPath);
        exerciseThreePage.clickBtnSave();
    }

    @Test
    public void savingTheFormTwoFields() {
        exerciseThreePage = new ExerciseThreePage(driver);
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        accessingToTheForm(exerciseThreePage);
        exerciseThreePage.clearFields();
        exerciseThreePage.fillOneField(notesSave);
        exerciseThreePage.uploadFile(photoPath);
        exerciseThreePage.clickBtnSave();
    }

    @Test
    public void checkingThreeValuesOfTheForm() {
        exerciseThreePage = new ExerciseThreePage(driver);
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        accessingToTheForm(exerciseThreePage);
        Assert.assertEquals(defaultName, exerciseThreePage.checkNameValue());
        Assert.assertEquals(defaultSurname, exerciseThreePage.checkSurnameValue());
        Assert.assertEquals(defaultPhone, exerciseThreePage.checkPhoneValue());
    }

    @Test
    public void mainPageCheckingVisibility() {
        Log.logInfo("Opening main page");
        driver.get("https://asta.pgs-soft.com/");
    }

    @Test
    public void bugAppPageCheckingVisibility() {
        Log.logInfo("Opening main page");
        driver.get("https://asta.pgs-soft.com/");
        mainPage.buggyAppClick();
    }

    private void accessingToTheForm(ExerciseThreePage exerciseThreePage) {
        exerciseThreePage.clickMenu();
        exerciseThreePage.clickForm();
        exerciseThreePage.clickEditForm();
    }
}
