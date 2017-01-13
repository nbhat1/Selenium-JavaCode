/*
Login to http://www.investorszone.in/
Check if element for user name is present.
Check if element for user name is enabled.
get Text of user name field.

if user name is field is present & if this is enabled 
Enter user name

Check if element for Password is present.
Check if element for Password is enabled.

*/

package main.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.investorszone.in");
		
		WebElement userNameElement = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[1]/td[3]/input"));
			boolean displayStatus = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[1]/td[3]/input")).isDisplayed();
			boolean enableStatus = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[1]/td[3]/input")).isDisplayed();
			if (displayStatus == enableStatus ){
				System.out.println("UserName object is dislaying on page & enabled");
				driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[1]/td[3]/input")).sendKeys("neerajkumarbhatnagar");
				} else {
					System.out.println("ObjectNotFoundException will be displayed & should be handeled");
		}
		
		WebElement passwordElement = driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[2]/td[3]/input"));
				boolean displayStatus1 = passwordElement.isDisplayed();
				boolean enableStatus1 = passwordElement.isEnabled();
				if (displayStatus1 == enableStatus1 ){
					System.out.println("Password object is dislaying on page & enabled");
					passwordElement.sendKeys("nitingzb1983");
						} else {
								System.out.println("ObjectNotFoundException will be displayed & should be handeled");
				}
				
		WebElement loginTypeElement = driver.findElement(By.name("login_type"));
		boolean selectedStatus = loginTypeElement.isSelected();
			if (selectedStatus == true) {
				System.out.println("radio box is already selected.");
				
			} else {
				loginTypeElement.click();
			}
					
		driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[4]/td/table/tbody/tr/td[1]/input")).submit();
	}

}
