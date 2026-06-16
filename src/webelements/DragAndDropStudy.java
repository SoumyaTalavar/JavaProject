package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class DragAndDropStudy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
       WebElement Destination=driver.findElement(By.id("amt8"));
        Actions actions = new Actions(driver);
           // actions.dragAndDrop(source, Destination).perform(); // it drag amout 5000 to blank place
        actions.clickAndHold(source).moveToElement(Destination).release().build().perform();



    }
}
