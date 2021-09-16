package pgs.asta.tests;

import org.testng.annotations.Test;
import pgs.asta.pages.MainPage;


public class Startup extends StartupBase {

    @Test
    public void startupTest() {
        MainPage mainPage = new MainPage(driver);
    }
}
