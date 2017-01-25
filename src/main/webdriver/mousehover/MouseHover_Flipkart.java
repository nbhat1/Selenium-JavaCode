package main.webdriver.mousehover;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//div/ul/li[3]/a/span"));
				
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
		driver.findElement(By.linkText("Jeans")).click();
		
		WebElement block = driver.findElement(By.xpath(".//div/div[3]/div[1]/div[2]/div"));
		List<WebElement> links  = block.findElements(By.tagName("a"));
		
		System.out.println("Total links : " + " " + links.size());
		
		for (int i = 0 ; i<=links.size()-1;i++){
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
		

		
	}

}
