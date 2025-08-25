package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class EcommerceTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://amazon.in");
        driver.manage().window().maximize();
    }

    
    @Test(groups = {"smoke"})
    public void testTitle() {
        System.out.println("Smoke Test - Title Check");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    
    @Test(groups = {"regression"})
    public void testSearch() {
        System.out.println("Regression Test - Search");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    // Sanity + Regression + Broken group
    @Test(groups = {"sanity", "regression", "broken"})
    public void testCart() {
        System.out.println("Sanity + Regression - Cart Test");
    }

    @AfterClass
    public void teardown() {
    
        if (driver != null) {
            driver.quit();
        }
    }
}
