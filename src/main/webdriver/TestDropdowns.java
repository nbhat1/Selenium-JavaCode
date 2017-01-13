package main.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.get("http://gmail.com");
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//driver.findElement(By.xpath("//td[3]/select")).sendKeys("Cheese");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));

		//http://qa.way2automation.com
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Eesti");
		//select.selectByValue("hi");
		
	//	select.getOptions();
		
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
				
		System.out.println("Total values are : "+values.size());
				
		for(int i=0; i<values.size(); i++){
			
			System.out.println(values.get(i).getAttribute("lang"));
			
		}
		
		System.out.println("---Printing links----------");
		
		
		// if values needs to be fetched from a frame.
		WebElement block =driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[2]")); // xpath of frame
			
		List<WebElement> links = block.findElements(By.tagName("a")); //This will store all links in List links
					
		System.out.println("Total links are : "+links.size());
				
		for(WebElement link:links){
			
			System.out.println(link.getText()+"----"+link.getAttribute("href")); // Print URL of all links
			
		}
		
				
	}

}
