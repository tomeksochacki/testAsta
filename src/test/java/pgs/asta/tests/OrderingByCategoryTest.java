package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;

public class OrderingByCategoryTest extends StartupBase {
    ExerciseTwoPage exerciseTwoPage;

    @Test
    public void testOrderingByCategorySport() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
        exerciseTwoPage.orderingByCategory("Sport");
    }

    @Test
    public void testOrderingByCategoryElektronika() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
        exerciseTwoPage.orderingByCategory("Elektronika");
    }

    @Test
    public void testOrderingByCategoryFirma() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
        exerciseTwoPage.orderingByCategory("Firma i usługi");
    }
}
