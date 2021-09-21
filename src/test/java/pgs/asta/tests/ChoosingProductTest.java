package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;

public class ChoosingProductTest extends StartupBase {

    ExerciseTwoPage exerciseTwoPage;

    @Test
    public void orderingByproduct() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        mainPage.switchTabToSecond();
        exercisesListPage.exerciseTwo();
        exerciseTwoPage.orderingByProduct("Koszulka");
    }
}
