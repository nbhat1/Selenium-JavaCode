package main.webdriver.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by neeraj.bhatnagar on 1/24/2017.
 */
public class dropDown1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//GecoDriver//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");



    }
}

