package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnWebMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
      WebElement NameField = driver.findElement(By.xpath("//input[@id='name']"));
      NameField.sendKeys("Soumya");
      Thread.sleep(3000);
      NameField.clear();
      //driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
    }
}
