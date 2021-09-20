package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChoosingProduct {

    @FindBy(xpath = "//a[@data-action='buggy']")
    WebElement buggyButton;

    @FindBy(xpath = "//a[@href='/task_2']")
    WebElement exerciseTwo;

    @FindBy(xpath = "//span[@class='select2-selection__rendered']")
    WebElement productInput;


    public void ExerciseTwoPage(WebDriver driver) {
        buggyButton.click();
        exerciseTwo.click();
        productInput.click();
    }
}
