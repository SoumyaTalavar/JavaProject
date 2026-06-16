package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FindNumberOfLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.name("q"));
        // driver.findElement(By.className("gLFyf")).sendKeys("Cockroch"); this is another way im using to find locator
        searchBox.sendKeys("cockroach janata party");
        Actions actions = new Actions(driver);
        actions.sendKeys(searchBox, Keys.ENTER).perform();
        Thread.sleep(2000);
        List<WebElement> allLinks = driver.findElements(By.tagName("img"));
        System.out.println("====================================");
        System.out.println("total images are " + allLinks.size());
        System.out.println("====================================");
//        for (WebElement al : allLinks) {
//            Thread.sleep(50);
//            System.out.println(al.getText());

        }
    }
