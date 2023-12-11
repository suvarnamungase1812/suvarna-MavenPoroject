package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizedBeforeMethod {
    public static WebDriver driver;
    @Parameters("browserName")
    @BeforeMethod
    public void BeforeMethodExample(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }else if (browserName.equalsIgnoreCase("fireFox")){
            System.setProperty("WebDriver.fireFox.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("WebDriver.edge.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver();
        }else{
           throw new RuntimeException("please select the correct browser");
        }
        }

    @Parameters({"username","password"})
    @Test
    public void verifyValidUsernameValidPassword(String username,String password) throws InterruptedException {

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().fullscreen();
        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        loginElement.sendKeys(username);
        passwordElement.sendKeys(password);
        driver.close();
    }
}
