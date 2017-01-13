package main.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.thoughtworks.selenium.Wait;

public class way2automationRegistrationForm {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://qa.way2automation.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		
		WebDriverWait wait = new WebDriverWait(driver,600);
		
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[4]/select"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Kuwait");
		select.selectByValue("Korea"); 
		
		driver.findElement(By.xpath(".//*/input[@name='name']")).sendKeys("Neeraj");
		driver.findElement(By.xpath(".//*/input[@name='phone']")).sendKeys("9999911111");
		driver.findElement(By.xpath(".//*/input[@name='email']")).sendKeys("neeraj@gmail.com");
		driver.findElement(By.xpath(".//*/input[@name='city']")).sendKeys("Ghaziabad");

		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("neeraj.engg");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='load_box']/form[@id='load_form']/div/div[2]/input")).click();
		
		
		/*boolean isDisplayed = driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input")).isDisplayed();
		System.out.println(isDisplayed);
		boolean isEnabled = driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input")).isEnabled();
		System.out.println(isEnabled); 
		if (isDisplayed == isEnabled){
			driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input")).click(); }
		else {
			System.out.println("Item is not visible");
			//System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='load_form']/div/div[2]/input"))).getText());
			
		}
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='load_form']/div/div[2]/input"))).getText());
		driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input")).click();
		
		*/
		
		}
		
	
		//driver.close();
	
} 
