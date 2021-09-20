package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseTwoPage;

public class SelectingItemTest extends StartupBase {

        ExerciseTwoPage exerciseTwoPage;

        @Test
    public void selectingItem() {
            exerciseTwoPage = new ExerciseTwoPage(driver);
            mainPage.buggyAppClick();
            pageObjectBase.switchTabToSecond();
            exercisesListPage.exerciseTwo();
            exerciseTwoPage.selectingItem();
        }
}
