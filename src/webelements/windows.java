package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class windows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("NewTab")).click();
        Thread.sleep(4000);
        String mainWindowID = driver.getWindowHandle();
        System.out.println(mainWindowID);
        Set<String> allWindowIds = driver.getWindowHandles();
        System.out.println(allWindowIds);
        ArrayList<String> arrayListOfWindowID = new ArrayList<>(allWindowIds);
        String mainWindowID1 = arrayListOfWindowID.get(0);
        String childWindowID = arrayListOfWindowID.get(1);
        System.out.println("main windowID--> " + mainWindowID1);
        System.out.println("child windowID--> " + childWindowID);
        driver.switchTo().window(childWindowID);
        Thread.sleep(1000);
        driver.manage().window().maximize();
        //driver.close();
        driver.quit();
       // driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Automation Testing");



    }

}



