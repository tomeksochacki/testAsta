package pgs.asta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pgs.asta.utilities.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class PageObjectBase {

    public WebDriver driver;
    public WebDriverWait wait;

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 8);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 8), this);
    }

    public void waitForElement(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void checkIsElementVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void checkIsElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickElement(WebElement webElement) {
        checkIsElementVisible(webElement);
        checkIsElementClickable(webElement);
        webElement.click();
    }

    public void switchTabToSecond() {
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(parentId).close();
        driver.switchTo().window(childId);
    }

    public PageObjectBase switchWindow(int windowNumber) {
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(windowNumber));
        Log.logInfo("window has been changed");
        return this;
    }

    public PageObjectBase switchToIframe(String frame) {
        driver
                .switchTo()
                .frame(driver
                        .findElement(By.xpath(frame)));
        Log.logInfo("iframe has been changed");
        return this;
    }
}
