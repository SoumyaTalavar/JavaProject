package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class iteratorwindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("NewTab")).click();
        Thread.sleep(5000);
        Set<String> allWindowIds = driver.getWindowHandles();
        Iterator<String> it = allWindowIds.iterator();
        String mainWindowID = it.next();
        String newTabID = it.next();
        System.out.println("main page title--> " + driver.getTitle());
        driver.switchTo().window(newTabID);
        Thread.sleep(5000);
        System.out.println("new tab title--> " + driver.getTitle());
        String newTabElementText = driver.findElement(By.xpath("//h3[contains(text(),'QA tools')]")).getText();
        System.out.println(newTabElementText);
        driver.switchTo().window(mainWindowID);
        String mainPageElementText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
        System.out.println(mainPageElementText);

    }
}
