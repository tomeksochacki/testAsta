package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExerciseTwoPage extends PageObjectBase {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]")
    WebElement categorySelectArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement categoryInput;

    public ExerciseTwoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void orderingByCategory(String category) {
//        categorySelectArrow.click();
        clickElement(categorySelectArrow);
        categoryInput.click();
        categoryInput.clear();
        categoryInput.sendKeys(category);
//        categoryInput.sendKeys(category);
    }

    private Select dropdown;

    private void selectInit(WebElement e) {
        this.dropdown = new Select(e);

    }

    private void selectFromDropdownByValue(WebElement e, String optionValue) {
        selectInit(e);
        dropdown.selectByValue(optionValue);
    }
}
