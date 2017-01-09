package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSliders {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		new Actions(driver).dragAndDropBy(slider, 300, 0).perform();
		
		

	}

}
