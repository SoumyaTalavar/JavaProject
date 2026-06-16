package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.Driver;

public class AlertPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(3000);
        Alert alt = driver.switchTo().alert();
        System.out.println( alt.getText());
        alt.accept();
        String myText = driver.findElement(By.xpath("//h1[text()='Alerts']")).getText();
        System.out.println("text present is " + myText);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        Thread.sleep(6000);
        Alert alt1= driver.switchTo().alert();
        alt1.accept();
        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Alert alt2= driver.switchTo().alert();
        Thread.sleep(3000);
        alt2.accept();
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        Alert alt3=driver.switchTo().alert();
        alt3.sendKeys("soumya");
        Thread.sleep(3000);
        alt3.accept();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("soumya");
        Thread.sleep(3000);
       String Email= driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText();
        System.out.println("the message is"+Email);

    }
}
