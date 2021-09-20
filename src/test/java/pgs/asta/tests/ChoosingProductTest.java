package pgs.asta.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;
import pgs.asta.pages.PageObjectBase;

public class ChoosingProductTest extends StartupBase {

    ExerciseTwoPage exerciseTwoPage;

    @Test
    public void orderingByproduct() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
        exerciseTwoPage.orderingByProduct("Koszulka");
    }
}
