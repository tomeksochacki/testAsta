package pgs.asta.pages.exerciseThree.fragments.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormElements {
    @FindBy(linkText = "Menu")
    protected WebElement menu;

    @FindBy(partialLinkText = "Formula")
    protected WebElement form;

    @FindBy(xpath = "//a[@id='start-edit']")
    protected WebElement editForm;

    @FindBy(id = "in-name")
    protected WebElement inName;

    @FindBy(id = "in-surname")
    protected WebElement inSurname;

    @FindBy(id = "in-notes")
    protected WebElement inNotes;

    @FindBy(id = "in-phone")
    protected WebElement inPhone;

    @FindBy(id = "in-file")
    protected WebElement inFile;

    @FindBy(xpath = "//form[@class='form-horizontal']//button")
    protected WebElement btnSave;

    @FindBy(xpath = "//input[@id='in-file']")
    protected WebElement fileUpload;

    @FindBy(xpath = "//div[contains(@class,'notifyjs-bootstrap-base')]//span")
    protected WebElement successMessage;

    @FindBy(xpath = "//img[@class='preview-photo']")
    protected WebElement photoLocator;

    public WebElement getMenu() {
        return menu;
    }

    public WebElement getForm() {
        return form;
    }

    public WebElement getEditForm() {
        return editForm;
    }

    public WebElement getInName() {
        return inName;
    }

    public WebElement getInSurname() {
        return inSurname;
    }

    public WebElement getInNotes() {
        return inNotes;
    }

    public WebElement getInPhone() {
        return inPhone;
    }

    public WebElement getInFile() {
        return inFile;
    }

    public WebElement getBtnSave() {
        return btnSave;
    }

    public WebElement getFileUpload() {
        return fileUpload;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getPhotoLocator() {
        return photoLocator;
    }
}
