package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pgs.asta.utilities.Log;

public class ExerciseFourPage extends PageObjectBase {

    @FindBy(xpath = "//span[text()='Nieprawidłowy email']")
    public WebElement windowEmailErrorAlert;
    @FindBy(xpath = "//h1[text()='Wiadomość została wysłana']")
    public WebElement windowSaveSuccessfulText;
    public String iframePath = "//body//iframe";
    @FindBy(xpath = "//button[text()[contains(.,APLIKUJ)]]")
    private WebElement applicateButton;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement windowNameBox;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement windowEmailBox;
    @FindBy(xpath = "//input[@name='phone']")
    private WebElement windowPhoneBox;
    @FindBy(xpath = "//button[@id='save-btn']")
    private WebElement windowSaveButton;

    public ExerciseFourPage(WebDriver driver) {
        super(driver);
    }

    public ExerciseFourPage applicationButtonClick() {
        clickElement(applicateButton);
        Log.logInfo("applicate button clicked");
        return this;
    }

    public ExerciseFourPage inputName(String name) {
        windowNameBox.sendKeys(name);
        Log.logInfo("name " + name + " was added to the box");
        return this;
    }

    public ExerciseFourPage inputEmail(String email) {
        windowEmailBox.sendKeys(email);
        Log.logInfo("email " + email + " was added to the box");
        return this;
    }

    public ExerciseFourPage inputPhoneNumber(String phoneNumber) {
        windowPhoneBox.sendKeys(phoneNumber);
        Log.logInfo("phone number " + phoneNumber + " was added to the box");
        return this;
    }

    public ExerciseFourPage saveButtonClick() {
        clickElement(windowSaveButton);
        Log.logInfo("Save button was clicked");
        return this;
    }
}
