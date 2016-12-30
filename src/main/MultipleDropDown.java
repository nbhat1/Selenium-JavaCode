package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by neeraj.bhatnagar on 12/30/2016.
 */
public class MultipleDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.wikipedia.org");

        Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
        List<WebElement> options = driver.findElements(By.tagName("option"));
        System.out.println("Size of list is" + "" + options.size()+ "" + "Elements");
        //System.out.println(options.);
        // int i;
        for(int i = 0; i<options.size(); i++){
            System.out.println(options.get(i).getText());


    }
} }
