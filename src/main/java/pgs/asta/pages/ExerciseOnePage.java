package pgs.asta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class ExerciseOnePage extends PageObjectBase {

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-3']")
    private List<WebElement> productItemList;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement productItemQuantityBox;

    @FindBy(xpath = "//button[@class='btn btn-sm']")
    private WebElement productAddBox;

    @FindBy(xpath = "//div[@class='caption']//p")
    private WebElement productPriceBox;

    @FindBy(xpath = "//div[@class='caption']//h4")
    private WebElement productNameBox;

    @FindBy(xpath = "//span[@class='summary-price']")
    private WebElement basketSummaryPrice;

    @FindBy(xpath = "//span[@class='summary-quantity']")
    private WebElement basketSummaryQuantity;

    @FindBy(xpath = "//div[@class='col-md-12 basket-list']//span[@class='row-in-basket-quantity']")
    private List<WebElement> basketItemRows;

    @FindBy(xpath = "//div[@class='panel-body']//button[contains(.,'Usuń')]")
    private List<WebElement> basketDeleteButtons;

    @FindBy(xpath = "//div[@class='col-md-12 basket-list']//div[@class='col-md-9 text-on-button-level']")
    private List<WebElement> basketItemPriceBoxList;

    private WebElement actualTestedBox;

    public ExerciseOnePage(WebDriver driver) {
        super(driver);
    }

    public ExerciseOnePage chooseItemFromList(int itemNumber) {
        waitForElement(productItemQuantityBox);
        actualTestedBox = productItemList.get(itemNumber);
        return this;
    }

    public ExerciseOnePage chooseItemFromList(String name) {
        String productName;
        for (WebElement webElement : productItemList) {
            productName = webElement
                    .findElement(By
                            .xpath(".//div[@class='caption']//h4"))
                    .getText();
            if (Objects.equals(productName, name)) {
                actualTestedBox = webElement;
                return this;
            }
        }
        return this;
    }

    public ExerciseOnePage addProductQuantity(int quantity) {
        WebElement quantityBox = actualTestedBox
                .findElement(By
                        .xpath(".//input[@class='form-control']"));
        quantityBox.clear();
        quantityBox.sendKeys(Integer.toString(quantity));
        return this;
    }
}
