import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class StartupBase {
    final String URL = "https://asta.pgs-soft.com/";
    protected WebDriver driver;
    protected WebDriverWait wait;

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeClass
    public void newSession() {
        setup();
        wait = new WebDriverWait(driver, 10);
        Log.logInfo("Test is starting");
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
