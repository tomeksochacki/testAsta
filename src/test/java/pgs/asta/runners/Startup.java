package pgs.asta.runners;

import org.testng.annotations.Test;
import pgs.asta.StartupBase;
import pgs.asta.pages.mainPage.MainPage;


public class Startup extends StartupBase {

    @Test
    public void startupTest() {
        MainPage mainPage = new MainPage(driver);
    }
}
