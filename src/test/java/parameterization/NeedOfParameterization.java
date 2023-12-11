package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Parameters({"username","password"})
    @Test
    public void verifyValidUsernameValidPassword(String username,String password) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().fullscreen();
        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        loginElement.sendKeys(username);
        passwordElement.sendKeys(password);
        driver.close();
    }    @Parameters({"inValidUsername","password"})
    @Test
    public void verifyInValidUsernameValidPassword(String inValidUsername,String password) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", " C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().fullscreen();
        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        loginElement.sendKeys(inValidUsername);
        passwordElement.sendKeys(password);
        driver.close();
    }
}