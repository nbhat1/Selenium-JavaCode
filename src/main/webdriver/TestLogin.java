package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//present - hidden
		//ExplicitWait
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	
	/*	String text = "abcd";
		text.length();
		
		String title = driver.getTitle();
		title.length();
		
		driver.getTitle().length();
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id='Email']"));
		email.sendKeys("trainer@way2automation.com");
	*/	
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("trainer234234242");
		driver.findElement(By.id("next")).click();
		
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='errormsg_0_Email']"))).getText());
		
		
		
		
	/*	Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText());
		*/
	/*	driver.findElement(By.name("Passwd")).sendKeys("sdfsdfsd");
		
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText());
*/		
		
	}

}
