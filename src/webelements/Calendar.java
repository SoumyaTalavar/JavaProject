package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        while(true) {
            String Actaul = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            if (Actaul.equals("October 2026")) {
                driver.findElement(By.xpath("//a[text()='18']")).click();
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            System.out.println(Actaul);
        }


        }
    }


