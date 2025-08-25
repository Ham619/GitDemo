//package Projects;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//import java.io.IOException;
//
//public class AmazonExampleTest {
//
//    WebDriver driver;
//
//    @BeforeClass
//    public void setup() throws IOException {
//       
//       
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//    }
//
//    @Test(priority = 1)
//    public void loginTest() throws InterruptedException {
//        String email = "7061292019";
//        String password = "8084865734";
//
//        driver.get("https://www.amazon.in");
//
//        driver.findElement(By.id("nav-link-accountList")).click();
//        WebElement emailField = driver.findElement(By.id("ap_email_login"));
//        emailField.sendKeys(email);
//        driver.findElement(By.id("continue")).click();
//
//        WebElement passwordField = driver.findElement(By.id("ap_password"));
//        passwordField.sendKeys(password);
//        driver.findElement(By.id("signInSubmit")).click();
//
//        Thread.sleep(3000);
//    }
//
//    @Test(priority = 2)
//    public void searchProductsTest() throws InterruptedException {
//        List<String> products = new ArrayList<>();
//        products.add("laptop");
//        products.add("camera");
//        products.add("Speaker");
//
//        for (String product : products) {
//            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//            searchBox.clear();
//            searchBox.sendKeys(product);
//            driver.findElement(By.id("nav-search-submit-button")).click();
//            Thread.sleep(2000);
//
//           
//            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
//            Thread.sleep(2000);
//        }
//    }
//
//    @Test(priority = 3)
//    public void checkoutTest() throws InterruptedException {
//        driver.findElement(By.xpath("//a[@href='/cart?ref_=ox_ewc_ret_gtc_dsk_in']")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//input[@id='pp-f0bRlF-152']")).click();
//        Thread.sleep(2000);
//    }
//
//    @AfterClass
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
