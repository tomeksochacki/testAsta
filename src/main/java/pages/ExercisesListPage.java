package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExercisesListPage {
    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(1)")
    WebElement exerciseOne;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(2) > a")
    WebElement exerciseTwo;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(3) > a")
    WebElement exerciseThree;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(4) > a")
    WebElement exerciseFour;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(5) > a")
    WebElement exerciseFive;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(6) > a")
    WebElement exerciseSix;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(7) > a")
    WebElement exerciseSeven;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(8) > a")
    WebElement exerciseEight;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(9) > a")
    WebElement exerciseNine;

    @FindBy(css = "body > div > div > div > div.col-md-8.task-list > div:nth-child(10) > a")
    WebElement exerciseTen;

    public ExercisesListPage(WebDriver driver) {
    }

    @Step("User choose exercise one")
    public void exerciseOne() {
        exerciseOne.click();
    }

    @Step("User choose exercise two")
    public void exerciseTwo() {
        exerciseTwo.click();
    }

    @Step("User choose exercise three")
    public void exerciseThree() {
        exerciseThree.click();
    }

    @Step("User choose exercise four")
    public void exerciseFour() {
        exerciseFour.click();
    }

    @Step("User choose exercise five")
    public void exerciseFive() {
        exerciseFive.click();
    }

    @Step("User choose exercise six")
    public void exerciseSix() {
        exerciseSix.click();
    }

    @Step("User choose exercise seven")
    public void exerciseSeven() {
        exerciseSeven.click();
    }

    @Step("User choose exercise eight")
    public void exerciseEight() {
        exerciseEight.click();
    }

    @Step("User choose exercise nine")
    public void exerciseNine() {
        exerciseNine.click();
    }

    @Step("User choose exercise ten")
    public void exerciseTen() {
        exerciseTen.click();
    }

}
