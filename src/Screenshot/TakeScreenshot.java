package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Destination=new File("C:\\Users\\Lenovo\\Desktop\\java\\Example\\Test.png");
        FileHandler.copy(source,Destination);

    }
}
