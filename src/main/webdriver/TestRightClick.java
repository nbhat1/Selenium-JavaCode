package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("//p[2]/img"));
		
		Actions action = new Actions(driver);
		action.contextClick(img).perform();


	}

}
