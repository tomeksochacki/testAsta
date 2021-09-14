package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase {

    public WebDriver driver;
    public WebDriverWait wait;

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 4);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 4), this);
    }

    public void waitForElement(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void clickElement(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }
}
