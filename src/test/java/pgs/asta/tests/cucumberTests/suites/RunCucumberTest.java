package pgs.asta.tests.cucumberTests.suites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pgs.asta.tests.cucumberTests.listener.StepsListener;
import pgs.asta.tests.cucumberTests.ui.BaseStepDefs;
import pgs.asta.utilities.Log;

@Test(singleThreaded = true)
@Listeners({StepsListener.class})
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "pgs/asta/tests/cucumberTests/ui",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-report/cucumber.json"},
        tags = "@exerciseThreeTest"
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    private static WebDriver driver;

    @BeforeMethod
    public void newSession() {
        final String URL = "https://asta.pgs-soft.com/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver(options);
        this.driver.manage().window().maximize();
        this.driver.get(URL);
        Log.logInfo(URL);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void endSession() {
        this.driver.quit();
        System.out.println("Test ended");
    }
}