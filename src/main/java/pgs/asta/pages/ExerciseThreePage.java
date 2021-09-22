package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class ExerciseThreePage extends PageObjectBase {

    //lista danych użytkownika
    ArrayList<String> userDataList = new ArrayList<>();

    @FindBy(linkText = "Menu")
    WebElement menu;

    @FindBy(partialLinkText = "Formula")
    WebElement form;

    @FindBy(xpath = "//a[@id='start-edit']")
    WebElement editForm;

    @FindBy(id = "in-name")
    WebElement inName;

    @FindBy(id = "in-surname")
    WebElement inSurname;

    @FindBy(id = "in-notes")
    WebElement inNotes;

    @FindBy(id = "in-phone")
    WebElement inPhone;

    @FindBy(id = "in-file")
    WebElement inFile;

    @FindBy(id = "save-btn")
    WebElement btnSave;

    @FindBy(xpath = "//input[@id='in-file']")
    WebElement fileUpload;


    public ExerciseThreePage(WebDriver driver) {
        super(driver);
    }

    public ExerciseThreePage clickMenu() {
        menu.click();
        return this;
    }

    public ExerciseThreePage clickForm() {
        form.click();
        return this;
    }

    public ExerciseThreePage clickEditForm() {
        editForm.click();
        return this;
    }

    public ExerciseThreePage uploadFile(String path) {
        fileUpload.sendKeys(path);
        return this;
    }

    public ExerciseThreePage clickBtnSave() {
        btnSave.click();
        return this;
    }

    public ExerciseThreePage clearFields() {
        inName.clear();
        inSurname.clear();
        inNotes.clear();
        inPhone.clear();
        return this;
    }

    public ExerciseThreePage fillFields(String name, String surName, String notes, String phone) {
        inName.sendKeys(name);
        inSurname.sendKeys(surName);
        inNotes.sendKeys(notes);
        inPhone.sendKeys(phone);
        return this;
    }

    public ExerciseThreePage fillOneField(String notes) {
        inNotes.sendKeys(notes);
        return this;
    }

    public ArrayList<String> getUserDataList() {
        userDataList.add(inName.getAttribute("value"));
        userDataList.add(inSurname.getAttribute("value"));
        userDataList.add(inPhone.getAttribute("value"));
        return userDataList;
    }
}
