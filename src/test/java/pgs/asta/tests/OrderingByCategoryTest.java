package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;

public class OrderingByCategoryTest extends StartupBase {
    ExerciseTwoPage exerciseTwoPage;

    @Test
    public void testOrderingByCategorySport() {
        testOrdering();
        exerciseTwoPage.orderingByCategory("Sport");
    }

    private void testOrdering() {
        exerciseTwoPage = new ExerciseTwoPage(driver);
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
    }

    @Test
    public void testOrderingByCategoryElektronika() {
        testOrdering();
        exerciseTwoPage.orderingByCategory("Elektronika");
    }

    @Test
    public void testOrderingByCategoryFirma() {
        testOrdering();
        exerciseTwoPage.orderingByCategory("Firma i usługi");
    }
}
