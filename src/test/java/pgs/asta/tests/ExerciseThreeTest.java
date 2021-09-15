package pgs.asta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pgs.asta.utilities.Log;

public class ExerciseThreeTest extends StartupBase {
    String nameSave = "Tomek";
    String surnameSave = "Sochacki";
    String notesSave = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nibh augue, suscipit a, scelerisque sed, lacinia in, mi. Cras vel lorem";
    String phonesSave = "123123123";
    String nameCheck = "Salma";
    String surnameCheck = "Hayek";
    String phoneCheck = "19154175411";
    String photoPath = "C:\\zdjecie.jpg";

    @Test
    public void savingTheFormAllFields() {
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        exerciseThreePage.clickMenu();
        exerciseThreePage.clickForm();
        exerciseThreePage.clickEditForm();
        exerciseThreePage.fillFields(nameSave, surnameSave, notesSave, phonesSave);
        exerciseThreePage.uploadFile(photoPath);
        exerciseThreePage.clickBtnSave();
    }

    @Test
    public void savingTheFormTwoFields() {
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        exerciseThreePage.clickMenu();
        exerciseThreePage.clickForm();
        exerciseThreePage.clickEditForm();
        exerciseThreePage.clearFields();
        exerciseThreePage.fillOneField(notesSave);
        exerciseThreePage.uploadFile(photoPath);
        exerciseThreePage.clickBtnSave();
    }

    @Test
    public void checkingThreeValuesOfTheForm() {
        driver.get("https://buggy-testingcup.pgs-soft.com/task_3");
        exerciseThreePage.clickMenu();
        exerciseThreePage.clickForm();
        exerciseThreePage.clickEditForm();
        Assert.assertEquals(nameCheck, exerciseThreePage.checkNameValue());
        Assert.assertEquals(surnameCheck, exerciseThreePage.checkSurnameValue());
        Assert.assertEquals(phoneCheck, exerciseThreePage.checkPhoneValue());
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
}
