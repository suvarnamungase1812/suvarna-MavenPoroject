package basictestng.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void verifyHomePage(){

        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().fullscreen();
        String websiteTitle=driver.getTitle();
        System.out.println(10/0);//assert skip only when you get Exception.
        System.out.println("hello");
        Assert.assertEquals(websiteTitle,"Rediffmail","Title Of The website should be Rediffmail");
        System.out.println("welcome");
        driver.close();
    }
}
