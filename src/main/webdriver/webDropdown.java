package main.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*
		driver.get("http://www.xe.com/");
		driver.findElement(By.xpath("//*[@id='to']")).click();
		driver.findElement(By.xpath("//*[@id='to']")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.xpath("//*[@id='ucc_go_btn_svg']/a/polygon")).sendKeys(Keys.ENTER);
		*/
		
		driver.get("http://www.wikipedia.com");
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
		
		List<WebElement> dropOptions = dropdown.findElements(By.tagName("option"));
		
	/*
		for(int i=0 ; i< dropOptions.size(); i++) {
		
			String name = dropOptions.get(i).getText();
			//System.out.println(name);
			if (name.contentEquals("English") ){  // Print English when English language comes.
				System.out.println(name);
			} 
		}
		System.out.println(dropOptions.size());
		//driver.close();
	*/
		
		System.out.println("************Print All Links on page********");
		
		WebElement links = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']"));
		List<WebElement> allLinksLanguage = links.findElements(By.tagName("div"));
		for (int i = 0; i<allLinksLanguage.size();i++){
		System.out.println(allLinksLanguage.get(i).getText());
		}
		
		
		}
}

		
		
	


