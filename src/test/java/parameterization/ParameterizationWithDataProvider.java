package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationWithDataProvider {
    @DataProvider(name = "test data")
    public Object[][] dataProviderFunction(){
    return new Object[][]{{"java","pune"},{"python","mumbai"},{"selenium","kolkata"},{"advance java","delhi"}};
    }
    @Test(dataProvider="test data")
    public void verifySearchValidCourseNameWithCity(String courseName,String cityName) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        WebElement textBoxElement = driver.findElement(By.name("q"));
        textBoxElement.sendKeys( courseName +" "+ cityName);
       textBoxElement.sendKeys(Keys.ENTER);
       Thread.sleep(Long.parseLong("3000"));
        driver.close();
    }
}

