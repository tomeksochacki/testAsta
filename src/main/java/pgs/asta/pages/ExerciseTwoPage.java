package pgs.asta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExerciseTwoPage extends PageObjectBase {

    @FindBy(xpath = "//span[@class='select2-selection__arrow']")
    WebElement categorySelectArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    WebElement categoryInput;

    @FindBy(xpath = "//h4[contains(text(),'Biuro XYZ')]")
    WebElement selectItem;

    public ExerciseTwoPage(WebDriver driver) {
        super(driver);
    }


    public void orderingByCategory(String category) {
        clickElement(categorySelectArrow);
        clickElement(categoryInput);
        categoryInput.clear();
        categoryInput.sendKeys(category);
    }

    public void orderingByProduct(String product) {
        clickElement(categorySelectArrow);
        clickElement(categoryInput);
        categoryInput.clear();
        categoryInput.sendKeys(product);
    }

    public void selectingItem() {
        selectItem.click();
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
