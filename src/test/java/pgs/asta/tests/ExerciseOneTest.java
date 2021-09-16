package pgs.asta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseOnePage;
import pgs.asta.utilities.Log;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOneTest extends StartupBase {

    double itemsFullPrice = 0.0;
    int firstItemQuantity = 12;
    int secondItemQuantity = 34;
    String itemOne = "Piłka";
    String itemTwo = "Okulary";
    String itemThree = "Kabel";
    ExerciseOnePage exerciseOnePage;

    @Test
    public void firstTest() {
        Log.logInfo("Test one starts - checking item quantity");
        exerciseOnePage = new ExerciseOnePage(driver);

        List<String> productList = new ArrayList<>();
        driver.get("https://testingcup.pgs-soft.com/task_1");
        exerciseOnePage
                .chooseItemFromList(itemOne)
                .addProductQuantity(1)
                .clickAddButton()
                .chooseItemFromList(itemTwo)
                .addProductQuantity(1)
                .clickAddButton()
                .chooseItemFromList(itemThree)
                .addProductQuantity(1)
                .clickAddButton();
        productList.add(itemOne);

        if (!productList.contains(itemTwo)) {
            productList.add(itemTwo);
        }

        if (!productList.contains(itemThree)) {
            productList.add(itemThree);
        }

        Assert.assertEquals(exerciseOnePage.getBasketItemList().size(), productList.size());
        for (String item : productList) {
            Assert.assertTrue(exerciseOnePage.getBasketItemList().contains(item));
        }
        Log.logInfo("Test one passed");
    }

    @Test
    public void secondTest() {
        Log.logInfo("Test two starts - User try to add 101 items to basket");
        exerciseOnePage
                .chooseItemFromList(3)
                .addProductQuantity(101);
        try {
            exerciseOnePage.clickAddButton();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("Łączna ilość produktów w koszyku nie może przekroczyć 100"));
        }
        Log.logInfo("Test two passed");
    }

    @Test
    public void priceTest() {
        Log.logInfo("Test three starts - checking items price");
        exerciseOnePage
                .resetPage()
                .chooseItemFromList(4)
                .addProductQuantity(12)
                .clickAddButton();
        itemsFullPrice += exerciseOnePage.getItemPrice(firstItemQuantity);
        exerciseOnePage
                .chooseItemFromList(2)
                .addProductQuantity(secondItemQuantity)
                .clickAddButton();
        itemsFullPrice += exerciseOnePage.getItemPrice(secondItemQuantity);
        Log.logInfo("Checking prices...");
        Assert.assertEquals(itemsFullPrice, exerciseOnePage.getSummaryPrice());
        Log.logInfo("Prices are the same");
        Log.logInfo("Test three passed");

    }

}
