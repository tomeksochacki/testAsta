package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;

public class OrderingByCategoryTest extends StartupBase {

    ExerciseTwoPage exerciseTwoPage = new ExerciseTwoPage(driver);

    @Test
    public void testOrderingByCategory() throws InterruptedException {
        driver.get("https://buggy-testingcup.pgs-soft.com/task_2");
//        mainPage.buggyAppClick();
//        pageObjectBase.switchTabToSecond();
//        exercisesListPage.exerciseTwo();
        Thread.sleep(10000);
//        driver.get("https://buggy-testingcup.pgs-soft.com/task_2");
        exerciseTwoPage.orderingByCategory("Sport");
    }
}
