package pgs.asta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pgs.asta.utilities.Log;
import pgs.asta.utilities.Round;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExerciseOnePage extends PageObjectBase {

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-3']")
    private List<WebElement> productItemList;

    @FindBy(xpath = "//div[@class='caption']//p")
    private WebElement productPriceBox;

    @FindBy(xpath = "//div[@class='caption']//h4")
    private WebElement productNameBox;

    @FindBy(xpath = "//span[@class='summary-price']")
    private WebElement basketSummaryPrice;

    @FindBy(xpath = "//span[@class='summary-quantity']")
    private WebElement basketSummaryQuantity;

    @FindBy(xpath = "//div[@class='col-md-12 basket-list']//span[@class='row-in-basket-quantity']")
    private List<WebElement> basketItemsQuantityList;

    @FindBy(xpath = "//div[@class='panel-body']//button[contains(.,'Usuń')]")
    private List<WebElement> basketDeleteButtons;

    @FindBy(xpath = "//div[@class='col-md-12 basket-list']//div[@class='col-md-9 text-on-button-level']")
    private List<WebElement> basketItemPriceBoxList;

    private WebElement selectedTestBox;
    private final String BUTTONPATH = ".//button[@class='btn btn-sm']";
    private final String QUANTITYBOX = ".//input[@class='form-control']";
    private final String NAMEBOX = ".//div[@class='caption']//h4";

    public ExerciseOnePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getProductQuantityBox() {
        return selectedTestBox
                .findElement(By
                        .xpath(QUANTITYBOX));
    }

    private WebElement getProductAddButton() {
        return selectedTestBox
                .findElement(By
                        .xpath(BUTTONPATH));
    }

    //  Selecting product box by its place on the product grid - from left to right
    public ExerciseOnePage chooseItemFromList(int itemNumber) {
        waitForElement(productItemList.get(productItemList.size() - 1));
        selectedTestBox = productItemList.get(itemNumber);
        Log.logInfo("User chose product number " + itemNumber);
        return this;
    }

    //  Selecting product box by name string
    public ExerciseOnePage chooseItemFromList(String name) {
        waitForElement(productItemList.get(productItemList.size() - 1));
        for (WebElement webElement : productItemList) {
            if (Objects.equals(webElement
                    .findElement(By
                            .xpath(NAMEBOX))
                    .getText(), name)) {
                selectedTestBox = webElement;
                Log.logInfo("User chose product: " + name);
                return this;
            }
        }
        return this;
    }

    //  Adding item amount to the item quantity box
    //  Adding typed item amount to the "itemsInBasketQuantity" variable for later tests
    //  Adding items price to the "itemsPrice" variable for later tests
    public ExerciseOnePage addProductQuantity(int quantity) {
        getProductQuantityBox().clear();
        getProductQuantityBox().sendKeys(Integer.toString(quantity));
        Log.logInfo("User typed " + quantity + " in the item quantity box");
        return this;
    }

    //  Clicking add button on selected item
    public ExerciseOnePage clickAddButton() {
        clickElement(getProductAddButton());
        Log.logInfo("User clicked add button");
        return this;
    }

    public List<String> getBasketItemList() {
        List<String> itemList = new ArrayList<>();
        for (WebElement row : basketItemsQuantityList) {
            itemList.add(row.getAttribute("data-quantity-for"));
        }
        return itemList;
    }

    public double getSummaryPrice() {
        String price = basketSummaryPrice.getText();
        return Double.parseDouble(price.substring(0, price.indexOf(" ")));
    }

    public double getItemPrice(int quantity) {
        return Round.price(Double
                .parseDouble(getProductAddButton()
                        .getAttribute("data-product-price")) * quantity);
    }

    public ExerciseOnePage resetPage() {
        for (WebElement delete : basketDeleteButtons) {
            clickElement(delete);
        }
        return this;
    }
}
