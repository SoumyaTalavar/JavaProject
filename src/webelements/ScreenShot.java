package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.logging.FileHandler;

public class ScreenShot {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Locate web element
       WebElement logo = driver.findElement(By.xpath("//a[text()='Demo Site']"));

        // Take element screenshot
        File src = logo.getScreenshotAs(OutputType.FILE);

        // Save file
        //FileUtils.copyFile(src, new File("logo.png"));

        driver.quit();
    }
}
