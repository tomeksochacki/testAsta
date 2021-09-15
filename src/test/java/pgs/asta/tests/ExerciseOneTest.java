package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseOnePage;

public class ExerciseOneTest extends StartupBase {

    @Test
    public void firstTest() {
        ExerciseOnePage exerciseOnePage = new ExerciseOnePage(driver);
        driver.get("https://testingcup.pgs-soft.com/task_1");

    }
}
