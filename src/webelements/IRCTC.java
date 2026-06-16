package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class IRCTC {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("PUN");
        Thread.sleep(4000);
        List<WebElement> results = driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li"));
        System.out.println("search results are " + results.size());
        for (WebElement r : results) {
            System.out.println(r.getText());
        }


        String expected = "SHIVAJINAGAR - SVJR (PUNE)";
//        for (WebElement r : results) {
//            if (r.getText().contains("SHIVAJINAGAR - SVJR (PUNE)")) {
//                r.click();

  //          }


            System.out.println("=====================================");
            Actions actions = new Actions(driver);
            for (WebElement r : results) {
                Thread.sleep(100);
                actions.sendKeys(Keys.ARROW_DOWN).perform();

            System.out.println("checking --- "+r.getText());

            if(r.getText().contains("PUNARAKH - PHK"))
            {
                actions.sendKeys(r,Keys.ENTER).perform();
                break;
            }

        }
    }
}

