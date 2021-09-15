import pages.ExercisesListPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://buggy-testingcup.pgs-soft.com/");
    }

    @Test
    public void testOne() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(1) > a")).click();
        Thread.sleep(1000);
    }

    @Test
    public void testTwo() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(2) > a")).click();
    }

    @Test
    public void testThree() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(3) > a")).click();
    }

    @Test
    public void testFour() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(4) > a")).click();
    }

    @Test
    public void testFive() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(5) > a")).click();
    }

    @Test
    public void testSix() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(6) > a")).click();
    }

    @Test
    public void testSeven() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(7) > a")).click();
    }

    @Test
    public void testEight() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(8) > a")).click();
    }

    @Test
    public void testNine() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(9) > a")).click();
    }

    @Test
    public void testTen() throws InterruptedException {
        ExercisesListPage listPage = new ExercisesListPage(driver);

        driver.findElement(By.cssSelector("body > div > div > div > div.col-md-8.task-list > div:nth-child(10) > a")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

