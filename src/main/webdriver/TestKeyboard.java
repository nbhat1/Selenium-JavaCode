package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		driver.findElement(By.id("Email")).sendKeys("trainer@way2automation.com");
		
		
		Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]")).click();
		
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		driver.findElement(By.id("Email")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
	}

}
