import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://velocityecommerceproject-agarb0aagdcvd7fy.canadacentral-01.azurewebsites.net/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='tab-admin']")).click();
        driver.findElement(By.id("admin-username")).sendKeys("9923478751");
        driver.findElement(By.id("admin-password")).sendKeys("Velocity@123");
        driver.findElement(By.id("btn-admin-signin")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@class='admin-stat-card success']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='admin-stat-card'][1]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='admin-stat-card warning']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='admin-stat-card danger']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='admin-stat-card'][2]")).getText());


    }

}
