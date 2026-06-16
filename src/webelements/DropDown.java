package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       WebElement element =driver.findElement(By.xpath("//select[@id='state']"));
        Select s= new Select(element);
        s.selectByVisibleText("Rajasthan");
        Thread.sleep(4000);
        s.selectByValue("Haryana");
        Thread.sleep(4000);
        s.selectByIndex(2);
       WebElement city=driver.findElement(By.id("city"));
       Select s1= new Select(city);
       s1.selectByIndex(2);
       Thread.sleep(3000);
       s1.selectByValue("Agra");
       Thread.sleep(4000);
       s1.selectByVisibleText("Lucknow");
       Thread.sleep(3000);
       //check the drop down select the multiple option
        System.out.println(s1.isMultiple());
        System.out.println("____________________________________");
       List <WebElement> Alloption = s1.getOptions();
       for(WebElement a:Alloption)
       {
           System.out.println(a.getText());
       }

    }

}
