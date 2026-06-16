package Excelpgms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException, IOException {
        FileInputStream Myfile= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\exp\\pgm.xlsx");
        Workbook workbook= WorkbookFactory.create(Myfile);
        Cell myCell;
        Sheet mySheet = workbook.getSheet("Sheet5");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
         WebElement nameField= driver.findElement(By.cssSelector("#name"));
        WebElement emailField= driver.findElement(By.cssSelector("#email"));
        WebElement phoneField= driver.findElement(By.cssSelector("#mobile"));
        nameField.sendKeys(mySheet.getRow(0).getCell(0).getStringCellValue());
        emailField.sendKeys(mySheet.getRow(1).getCell(0).getStringCellValue());
        phoneField.sendKeys(mySheet.getRow(2).getCell(0).getStringCellValue());
    }
}
