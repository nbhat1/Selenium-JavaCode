package main.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by neeraj.bhatnagar on 1/3/2017.
 */
public class iFrameHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.firstcry.com/");
        driver.switchTo().frame("iframe_Login");
        driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("neeraj.engg@gmail.com");
        driver.findElement(By.xpath(".//*[@id='Mobile']")).sendKeys("9865326598");
        //driver.switchTo().frame("iframe_Login");
        //Close frame using java script function closelogin() embedded in frame.
        ((JavascriptExecutor)driver).executeScript("closelogin()"); //Call Java script to execute closelogin() method to close iframe
        // driver.findElement(By.xpath(".//*[@class='_pop_close _pop_reg_bg']")).click();
        // driver.switchTo().defaultContent(); will move focus to main window.
    }
}