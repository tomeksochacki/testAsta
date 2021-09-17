package pgs.asta.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ExercisesListPage extends PageObjectBase {

    @FindBy(xpath = "//a[@href='/task_1']")
    WebElement exerciseOne;

    @FindBy(xpath = "//a[@href='/task_2']")
    WebElement exerciseTwo;

    @FindBy(xpath = "//a[@href='/task_3']")
    WebElement exerciseThree;

    @FindBy(xpath = "//a[@href='/task_4']")
    WebElement exerciseFour;

    @FindBy(xpath = "//a[@href='/task_5']")
    WebElement exerciseFive;

    @FindBy(xpath = "//a[@href='/task_6']")
    WebElement exerciseSix;

    @FindBy(xpath = "//a[@href='/task_7']")
    WebElement exerciseSeven;

    @FindBy(xpath = "//a[@href='/task_8']")
    WebElement exerciseEight;

    @FindBy(xpath = "//a[@href='/task_9']")
    WebElement exerciseNine;

    @FindBy(xpath = "//a[@href='/task_10']")
    WebElement exerciseTen;

    public ExercisesListPage(WebDriver driver) {
        super(driver);
    }

    public void exerciseOne() {
        clickElement(exerciseOne);
    }

    @Step("User choose exercise two")
    public void exerciseTwo() {
        clickElement(exerciseTwo);
    }

    @Step("User choose exercise three")
    public void exerciseThree() {
        clickElement(exerciseThree);
    }

    @Step("User choose exercise four")
    public void exerciseFour() {
        clickElement(exerciseFour);
    }

    @Step("User choose exercise five")
    public void exerciseFive() {
        clickElement(exerciseFive);
    }

    @Step("User choose exercise six")
    public void exerciseSix() {
        clickElement(exerciseSix);
    }

    @Step("User choose exercise seven")
    public void exerciseSeven() {
        clickElement(exerciseSeven);
    }

    @Step("User choose exercise eight")
    public void exerciseEight() {
        clickElement(exerciseEight);
    }

    @Step("User choose exercise nine")
    public void exerciseNine() {
        clickElement(exerciseNine);
    }

    @Step("User choose exercise ten")
    public void exerciseTen() {
        clickElement(exerciseTen);
    }
}
