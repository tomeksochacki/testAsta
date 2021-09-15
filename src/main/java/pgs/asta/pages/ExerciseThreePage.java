package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExerciseThreePage extends PageObjectBase {

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

    public void clickMenu() {
        menu.click();
    }

    public void clickForm() {
        form.click();
    }

    public void clickEditForm() {
        editForm.click();
    }

    public void uploadFile(String path) {
        fileUpload.sendKeys(path);
    }

    public void clickBtnSave() {
        btnSave.click();
    }

    public void clearFields() {
        inName.clear();
        inSurname.clear();
        inNotes.clear();
        inPhone.clear();
    }

    public void fillFields(String name, String surName, String notes, String phone) {
        inName.sendKeys(name);
        inSurname.sendKeys(surName);
        inNotes.sendKeys(notes);
        inPhone.sendKeys(phone);
    }

    public void fillOneField(String notes) {
        inNotes.sendKeys(notes);
    }

    public String checkNameValue() {
        String name = inName.getAttribute("value");
        return name;
    }

    public String checkSurnameValue() {
        String surname = inSurname.getAttribute("value");
        return surname;
    }

    public String checkPhoneValue() {
        String phone = inPhone.getAttribute("value");
        return phone;
    }
}
