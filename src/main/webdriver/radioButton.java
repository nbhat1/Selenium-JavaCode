package main.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://html.cita.illinois.edu/nav/form/radio/index.php?example=6");
		
		
		List<WebElement> radioButton = driver.findElements(By.name("crust"));
	
		
		System.out.println(radioButton.size());
	
		for (int i=0; i< radioButton.size();i++)
		{
			System.out.println(radioButton.get(i).getAttribute("value"));	
		}
		

		driver.close();
		
		
	}

}
