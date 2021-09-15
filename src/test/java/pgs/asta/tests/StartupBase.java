package pgs.asta.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pgs.asta.pages.ExerciseThreePage;
import pgs.asta.pages.MainPage;
import pgs.asta.utilities.Log;

public class StartupBase {
    final String URL = "https://asta.pgs-soft.com/";
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;
    protected ExerciseThreePage exerciseThreePage;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        exerciseThreePage = new ExerciseThreePage(driver);
    }

    @BeforeClass
    public void newSession() {
        setup();
        wait = new WebDriverWait(driver, 10);
        Log.logInfo("Test has started");
        driver.get(URL);
        driver.manage().window().maximize();
        Log.logInfo(URL);
    }

    @AfterClass
    public void endSession() {
        driver.quit();
        System.out.println("Test ended");
    }
}
