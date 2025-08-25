package Projects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class FacebookExample {

    WebDriver driver;
    Properties prop;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setup() throws IOException {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void loginTest() {
    	
    	String email = "hammadafroz6@gmail.com";
    	String password = "Ilovefacebook@1";
        driver.get("https://www.facebook.com/?stype=lo&flo=1&deoia=1&jlou=AfcL0bD25Z9UP347g5lcXh027S5XFxuY6REh_bldljjsMciQoox-d9OQFpP7jOzrqKiBUX0iGOMTfhjnIUU_cgKLt7uj4sAlT8xx1LhNb8-qlg&smuh=38544&lh=Ac9bMy8NBoCM4R379sI");

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

       
        WebElement homeIcon = driver.findElement(By.xpath("//a[@aria-label='Home']"));
        softAssert.assertTrue(homeIcon.isDisplayed(), "Home page not displayed after login");
    }

    @Test(priority = 2)
    public void createPostTest() throws InterruptedException {
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]/div[1]/a[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")).click();
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/div[1]/a[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")).click();
    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]/div[1]/a[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")).click();
    	 Thread.sleep(2000); 
        WebElement postArea = driver.findElement(By.xpath("//span[contains(text(),'on your mind')]"));
        postArea.click();

        Thread.sleep(2000); 

        WebElement postTextBox = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
        Thread.sleep(2000); 
        String postMessage = "Automation test post using Selenium!";
        postTextBox.sendKeys(postMessage);

        // Click Post button
        driver.findElement(By.xpath("//div[@aria-label='Create a post']//div[@aria-label='Post']")).click();

        Thread.sleep(5000); // wait for post to appear

    }
//
//    @Test(priority = 3)
//    public void commentOnPostTest() throws InterruptedException {
//        String commentMessage = "This is an automated comment!";
//
//        // Find comment box for the recent post
//        WebElement commentBox = driver.findElement(By.xpath("//div[contains(text(),'Automation test post using Selenium!')]/ancestor::div[@role='article']//div[@aria-label='Write a comment']"));
//        commentBox.click();
//        commentBox.sendKeys(commentMessage);
//
//        // Press Enter to submit
//        commentBox.sendKeys(org.openqa.selenium.Keys.ENTER);
//
//        Thread.sleep(3000);
//
//        // Verify comment appears
//        WebElement postedComment = driver.findElement(By.xpath("//span[contains(text(),'" + commentMessage + "')]"));
//        softAssert.assertTrue(postedComment.isDisplayed(), "Comment not displayed under the post");
//    }

    @AfterClass
    public void tearDown() {
        softAssert.assertAll(); // Validate all assertions together
        if (driver != null) {
            driver.quit();
        }
    }
}
