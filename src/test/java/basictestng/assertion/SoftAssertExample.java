package basictestng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void verifyHomePage(){
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().fullscreen();
        String websiteTitle=driver.getTitle();
        System.out.println("hello");
        softAssert.assertFalse(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        softAssert.assertEquals(websiteTitle,"Rediffmail","Title Of The website should be Rediffmail");
        System.out.println("welcome");
        softAssert.assertAll();
        driver.close();
    }
}

