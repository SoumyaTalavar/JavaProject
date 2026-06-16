package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.vctcpune.com/\"");
        driver.manage().window().maximize();
        Thread.sleep(3000);
      driver.findElement(By.xpath("//a[text()='Upcoming Batches']")).click();
        Actions actions= new Actions(driver);
        Thread.sleep(3000);
      WebElement upcomingBatches  =driver.findElement(By.xpath("//div[@class='card batch-card']"));
      // actions.scrollToElement(upcomingBatches).perform();
        actions.scrollByAmount(500,700).perform();
        Thread.sleep(3000);
        actions.scrollByAmount(900,900).perform();
        Thread.sleep(3000);
        actions.scrollByAmount(900,-400).perform();


    }
}
