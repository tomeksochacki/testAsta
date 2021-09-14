package pgs.asta.pages.mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pgs.asta.pages.PageObjectBase;
import pgs.asta.utilities.Log;


public class MainPage extends PageObjectBase {

    @FindBy(xpath = "//a[@data-action='bugfree']")
    public WebElement regularPageButton;
    @FindBy(xpath = "//a[@data-action='buggy']")
    private WebElement buggyPageButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage buggyAppClick() {
        Log.logInfo("Opening buggy page");
        clickElement(buggyPageButton);
        return this;
    }

    public MainPage regularPageClick() {
        Log.logInfo("Opening regular page");
        clickElement(regularPageButton);
        return this;
    }
}
