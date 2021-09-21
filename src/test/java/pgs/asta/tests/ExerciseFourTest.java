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
        exerciseFourPage
                .inputName("Alicja Partyńska")
                .inputEmail("alicja.partynska@op.pl")
                .inputPhoneNumber("555-111-222")
                .saveButtonClick();
        Assert.assertTrue(exerciseFourPage.windowSaveSuccessfulText.isDisplayed());
        driver.close();
        exerciseFourPage.switchWindow(0);

    }

    @Test
    public void testBEmailFailTest() {
        Log.logInfo("Test two Starts");
        exerciseFourPage
                .applicationButtonClick()
                .switchWindow(1)
                .switchToIframe(exerciseFourPage.iframePath);
        exerciseFourPage
                .inputName("Alicja Partyńska")
                .inputEmail("alicja.partynska")
                .inputPhoneNumber("555-111-222")
                .saveButtonClick();
        Assert.assertTrue(exerciseFourPage.windowEmailErrorAlert.isDisplayed());
    }
}
