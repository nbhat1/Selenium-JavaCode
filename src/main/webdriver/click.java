package main.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://neeraj.bhatnagar:Virtual@3@rsyspedia.india.rsystems.com/SitePages/Home.aspx/");
	
		driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[1]/a")).click();
		String gettext = driver.findElement(By.xpath("//*[@id='nav-primary']/ul/li[1]/a")).getText();
		System.out.println(gettext);
		//WebElement element1 = driver.findElement(By.xpath("//*[@id='nav-sub-menu-information-and-services']/div/div[1]/ul/li[3]/a"));
		//element1.click();
	/*
		WebElement element = driver.findElement(By.linkText("Industries"));
		element.click();
	*/
	}
}