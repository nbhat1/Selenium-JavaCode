package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img = driver.findElement(By.xpath("//p[2]/img"));
			
		Actions action = new Actions(driver);
		action.contextClick(img).perform();
		
		WebElement button1 = driver.findElement(By.xpath(".//*[@id='dm2m1i1tdT']"));
		action.moveToElement(button1).perform();
		String buttonText1 = driver.findElement(By.xpath(".//*[@id='dm2m1i1tdT']")).getText();
		System.out.println(buttonText1);
		
		
		WebElement button2 = driver.findElement(By.xpath(".//*[@id='dm2m2i1tdT']"));
		action.moveToElement(button2).perform();
		String buttonText2 = driver.findElement(By.xpath(".//*[@id='dm2m2i1tdT']")).getText();
		System.out.println(buttonText2);
		
		
		WebElement button3 = driver.findElement(By.xpath(".//*[@id='dm2m3i0tdT']"));
		String buttonText3 = driver.findElement(By.xpath(".//*[@id='dm2m3i0tdT']")).getText();
		System.out.println(buttonText3);
		action.moveToElement(button3);
		action.click(button3).perform();

		
	}

}
