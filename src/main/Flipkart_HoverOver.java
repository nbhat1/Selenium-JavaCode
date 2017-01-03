package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

/**
 * Created by neeraj.bhatnagar on 1/3/2017.
 */
public class Flipkart_HoverOver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //driver.findElement(By.xpath("https://www.flipkart.com/"));
       /* String mainMenu = ".//a[@class='_1QZ6fC' and @title='Men']/span";
        String subMenu = ".//*[@class='_3ZgIXy' and @title='Loafers']/span";

        WebElement menu = driver.findElement(By.xpath(mainMenu));
        WebElement sub_Menu = driver.findElement(By.xpath(subMenu));

        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        sleep(2000);
        //sub_Menu.click();
*/
        //sleep(5000);
       WebElement main_menu=  driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));

        Actions action = new Actions(driver);
        action.moveToElement(main_menu).build().perform();
        //driver.findElement(By.linkText("Jeans")).click();
        sleep(2000);
        driver.findElement(By.xpath(".//*[@class='_3ZgIXy' and @title='Loafers']/span")).click();
    }
}
