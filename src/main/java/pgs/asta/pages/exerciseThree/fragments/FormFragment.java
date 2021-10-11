package pgs.asta.pages.exerciseThree.fragments;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pgs.asta.pages.PageObjectBase;
import pgs.asta.pages.exerciseThree.fragments.elements.FormElements;

import java.util.ArrayList;

public class FormFragment extends PageObjectBase {

    public FormFragment(WebDriver driver) {
        super(driver);
    }

    public FormElements formElements = new FormElements();

    ArrayList<String> userDataList = new ArrayList<>();

    String photoPath = "C:\\zdjecie.jpg";

    String testCaseName = "Salma";
    String testCaseSurname = "Hayek";
    String testCasePhone = "19154175411";

    ArrayList<String> testCaseUserDataList = new ArrayList<>();

    public FormFragment preparingAccessToTheForm(){
        formElements.getMenu().click();
        formElements.getForm().click();
        clickElement(formElements.getEditForm());
        return this;
    }

    /*public FormFragment clickMenu() {
        formElements.getMenu().click();
        return this;
    }*/

    /*public FormFragment clickForm() {
        formElements.getForm().click();
        return this;
    }*/

    /*public FormFragment clickEditForm() {
        clickElement(formElements.getEditForm());
        return this;
    }*/

    public FormFragment clickBtnSave() {
        wait.until(ExpectedConditions.attributeContains(formElements.getBtnSave(), "style", "display: inline-block"));
        clickElement(formElements.getBtnSave());
        return this;
    }

    public FormFragment clearFields() {
        formElements.getInName().clear();
        formElements.getInSurname().clear();
        formElements.getInNotes().clear();
        formElements.getInPhone().clear();
        return this;
    }

    public FormFragment fillFields(String name, String surName, String notes, String phone) {
        formElements.getInName().sendKeys(name);
        formElements.getInSurname().sendKeys(surName);
        formElements.getInNotes().sendKeys(notes);
        formElements.getInPhone().sendKeys(phone);
        return this;
    }

    public FormFragment fillOneField(String notes) {
        formElements.getInNotes().sendKeys(notes);
        return this;
    }

    public FormFragment checkIfSuccessMessageAppeared(String message) {
        waitForElement(formElements.getSuccessMessage());
        Assertions.assertThat(formElements.getSuccessMessage().getText()).isEqualTo(message);
        return this;
    }

    public FormFragment uploadFileCucumberMethod() {
        formElements.getFileUpload().sendKeys(photoPath);
        waitForElement(formElements.getPhotoLocator());
        return this;
    }

    public void addUserDataList() {
        waitForElement(formElements.getInName());
        userDataList.add(formElements.getInName().getAttribute("value"));
        waitForElement(formElements.getInSurname());
        userDataList.add(formElements.getInSurname().getAttribute("value"));
        waitForElement(formElements.getInPhone());
        userDataList.add(formElements.getInPhone().getAttribute("value"));
    }

    public void checkingValues() {
        addTestCaseValueToList();
        addUserDataList();
        for (int i = 0; i < testCaseUserDataList.size(); i++) {
            Assertions.assertThat(testCaseUserDataList.get(i)).isEqualTo(userDataList.get(i));
        }
    }

    private void addTestCaseValueToList() {
        testCaseUserDataList.add(testCaseName);
        testCaseUserDataList.add(testCaseSurname);
        testCaseUserDataList.add(testCasePhone);
    }
}
