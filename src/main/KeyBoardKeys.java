package main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Neeraj on 31-12-2016.
 */
public class KeyBoardKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("test23");
        driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).sendKeys(Keys.ENTER); // Press Enter button on Submit button.


    }


}
