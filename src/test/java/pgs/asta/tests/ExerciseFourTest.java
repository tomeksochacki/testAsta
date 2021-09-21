package pgs.asta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pgs.asta.pages.ExerciseFourPage;
import pgs.asta.utilities.Log;

public class ExerciseFourTest extends StartupBase {

    ExerciseFourPage exerciseFourPage;

    @Test
    public void testAFormTest() {
        Log.logInfo("TEST ONE STARTS");
        exerciseFourPage = new ExerciseFourPage(driver);
        mainPage.regularPageClick();
        exercisesListPage.switchTabToSecond();
        exercisesListPage.exerciseFour();
        exerciseFourPage
                .applicationButtonClick()
                .switchWindow(1)
                .switchToIframe(exerciseFourPage.iframePath);
        exerciseFourPage.inputName("heyo")
                .inputEmail("pokoroeo@gula.com")
                .inputPhoneNumber("123-123-123")
                .saveButtonClick();
        Assert.assertTrue(exerciseFourPage.windowSaveSuccessfulText.isDisplayed());
        driver.close();
        exerciseFourPage.switchWindow(0);

    }

    @Test
    public void testBEmailFailTest() {
        Log.logInfo("Test two Starts");
        exerciseFourPage
                .applicationButtonClick();
        exerciseFourPage.switchWindow(1)
                .switchToIframe(exerciseFourPage.iframePath);
        exerciseFourPage
                .inputName("Ola Ka")
                .inputEmail("ola.ka")
                .inputPhoneNumber("111-111-111")
                .saveButtonClick();
        Assert.assertTrue(exerciseFourPage.windowEmailErrorAlert.isDisplayed());
    }
}
