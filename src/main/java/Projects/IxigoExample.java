//package Projects;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//public class IxigoExample {
//	
//	WebDriver driver;
//
//    @BeforeClass
//    public void setup() throws IOException {
//       
//       
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        
//    }
//    
//    @BeforeMethod
//    public void IxigoSite() {
//    	driver.get("https://www.ixigo.com/");
//    	
//    }
//    
//    @Test(priority=0)
//    public void Login() throws InterruptedException {
//    	String phone = "7061292019";
//    	driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")).click();
//    	Thread.sleep(5000);
//    	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys(phone);
//    	driver.findElement(By.xpath("//button[@class='inline-flex justify-center items-center bg-brand-solid text-brand-solid hover:bg-brand-solid-over gap-5px rounded-10 min-h-40 button-md icon-md px-15px w-full mt-20 mb-15 h-12 py-3 px-20']")).click();
//    	Thread.sleep(20000);
//    	
//    }
//    
//    @Test(priority=1)
//    public void BookFlight() throws InterruptedException {
//    	WebElement From = driver.findElement(By.xpath("/span[normalize-space()='From']"));
//    	From.click();
//    	Thread.sleep(2000);
////    	From.sendKeys(Keys.BACK_SPACE);
//    	From.sendKeys("Mumbai");
//    	Thread.sleep(2000);
//    	From.sendKeys(Keys.DOWN, Keys.ENTER);
//    	Thread.sleep(2000);
//    	
//    }
//    
//    
//
//}
