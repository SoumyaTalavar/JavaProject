package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ChildWindowPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();;
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
        Thread.sleep(3000);
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
       Set<String> allWindows= driver.getWindowHandles();
        ArrayList<String> arr=new ArrayList<>(allWindows);
       String id1= arr.get(0);
        System.out.println(id1);
       String id2= arr.get(1);
        System.out.println(id2);
       driver.switchTo().window(id2);
        String id3= arr.get(2);
        System.out.println(id3);
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.switchTo().window(mainwindow);
        System.out.println(driver.getTitle());
        Iterator<String> it=arr.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        String expected="XPath Practice - H Y R Tutorials";
        for(String str:arr)
        {
            driver.switchTo().window(str);
            if(Objects.equals(driver.getTitle(), expected))
            {
                break;
            }
        }

    }
}
