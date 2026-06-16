package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassStudy
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // text from selenium list button
        WebElement seleniumButton = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));
       //  seleniumButton.click(); //click by using WebElement Method

        // you have alternative method to perform above task by using Action class

        Actions actions = new Actions(driver);
        //moveToElement();-->point mouse at desired element
        //actions.moveToElement(seleniumButton).perform();
           // actions.click().perform();

            // Instead of doing above two lines code we can combine both line in one line by using Build() method

        actions.moveToElement(seleniumButton).click().build().perform();

        //How to double click
        //  actions.click(seleniumButton).perform();
         // WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
         // actions.doubleClick(doubleClickButton).perform();
        //actions.moveToElement(doubleClickButton).doubleClick().build().perform();

         // above line should be comment to execute below code because it shows the UnexpectedAlertFoundException
        //Righ Click
         WebElement RightButton=driver.findElement(By.xpath("//span[text()='right click me']"));
         actions.contextClick(RightButton).perform();




    }
}
