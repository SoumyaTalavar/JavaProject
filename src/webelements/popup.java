package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
       driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
       driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']")).sendKeys("iphone");
       driver.findElement(By.xpath("//button[@class='XFwMiH']")).click();
       Thread.sleep(5000);
     // driver.findElement(By.xpath("//a[@class='ol1oIH']")).click();
      //driver.findElement(By.xpath("//div[@class='elH3vy']")).click();
      //driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']")).sendKeys("8618839468");
        //driver.findElement(By.xpath("//button[@class='dSM5Ub Kv3ekh KcXDCU']")).click();

    }
}
