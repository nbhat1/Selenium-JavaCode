package main.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by neeraj.bhatnagar on 11/18/2016.
 */
public class JavaScriptAlertHandling {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[1]/input")).click();
        //alert, frame, window
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


            }

        }
