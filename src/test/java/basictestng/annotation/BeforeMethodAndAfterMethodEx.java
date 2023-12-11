package basictestng.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethodEx {
    public WebDriver driver;
    @org.testng.annotations.BeforeMethod
    public void BeforeMethodExample(){
        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
    }
    @Test
    public void verifyFlipkartWebsite(){
        driver.get("https://www.flipkart.com");
        driver.manage().window().fullscreen();

    }
    @Test
    public void verifyAmazonWebsite(){
        driver.get("https://www.amazon.com");
        driver.manage().window().fullscreen();

    }
    @AfterMethod
    public void AfterMethodExample(){
        driver.close();
    }
}


