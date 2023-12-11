package parameterization;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class DataProviderWithExcelFileExample {
    @DataProvider(name="text data")
    public Object[][] dataProviderFunction(){
        Object[][] arrObj =getExcelFile("C:\\Users\\Admin\\Documents\\text data.xlsx","sheet1");
        return arrObj;
    }
    public String[][] getExcelFile(String filePath,String sheetName){
        String[][] data = null;
        FileInputStream fileInputStream = null;
        XSSFWorkbook wb = null;
        try {
             fileInputStream=new FileInputStream(filePath);//normal file access.
        }catch (Exception e){
            e.printStackTrace();
        }
try {
     wb = new XSSFWorkbook(fileInputStream);//excel file.
} catch (Exception e){
    e.printStackTrace();
}

        XSSFSheet sheet= wb.getSheet(sheetName);//calling sheet name access.
        XSSFRow row=sheet.getRow(0);
        int noOfRows=sheet.getPhysicalNumberOfRows();
        int noOfColm=row.getLastCellNum();
        Cell cell;
        data = new String[noOfRows][noOfColm];
        for(int i=1;i<noOfRows;i++) {
            for (int j = 0; j < noOfColm; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @Test(dataProvider="text data")
    public void verifySearchValidCourseNameWithCity(String courseName,String cityName) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        WebElement textBoxElement = driver.findElement(By.name("q"));
        textBoxElement.sendKeys( courseName +" "+ cityName);
        textBoxElement.sendKeys(Keys.ENTER);
        driver.close();
    }
}
