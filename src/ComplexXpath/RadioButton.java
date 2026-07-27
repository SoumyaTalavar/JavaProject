package ComplexXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        Thread.sleep(6000);

        clickOnGender("Female");
        Thread.sleep(2000);
        clickOnGender("Other");
        Thread.sleep(2000);
        clickOnGender("Male");
        selectHobbies("Sports");
        Thread.sleep(2000);
        selectHobbies("Reading");
        Thread.sleep(2000);
        selectHobbies("Music");
        Thread.sleep(2000);

    }
    public static void clickOnGender(String Gender)
    {
driver.findElement(By.xpath("//label[text()='"+Gender+"']/preceding-sibling::input")).click();
    }
    public  static void selectHobbies(String Hobby )
    {
        driver.findElement(By.xpath("//label[text()='"+Hobby+"']//preceding-sibling::input")).click();
    }
}
