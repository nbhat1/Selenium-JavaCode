package main.webdriver.mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) {


		/*
		 * MouseOver
		 * Drag and Drop
		 * Sliders
		 * Resizable element
		 * Keyboard
		 * right click
		 * 
		 */

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Boots")).click();
		
		
		
	}

}
