package main.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSample {

	
	public static String browser = "ie";
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		//ctrl + shift + O
		/*
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		
		
*/		
		
		if(browser.equals("firefox")){
			
			
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")){

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
			
			driver = new ChromeDriver();
		}else if(browser.equals("ie")){
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);



			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
			driver = new InternetExplorerDriver(capabilities);
		}
		
		
		
		driver.get("http://google.com");
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);

		String expected_title = "Google"; 
		
		
		
		if(actual_title.equals(expected_title)){
			
			System.out.println("Test case pass");
		}else{
			
			System.out.println("Test case fail");
		}
		
		
		driver.close(); // current browser
		
		
		driver.quit(); //current browser + Entire session kill
		
	}

}
