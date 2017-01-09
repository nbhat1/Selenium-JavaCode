package main.webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.investorszone.in");

		// driver.findElement(By.xpath(".//*[@id='form1']/table/tbody/tr[3]/td/table/tbody/tr/td/label[1]/input")).getAttribute("checked");

		List<WebElement> element = driver.findElements(By.name("login_type"));
		int iSize = element.size();

		System.out.println("Number of check boxes is " + iSize);

		for (int i = 0; i < iSize; i++) {
			String value = element.get(i).getAttribute("value");
			System.out.println("Value of checkbox is " + value);

			if (value.equals("INV")) {
				String iCheck = element.get(i).getAttribute("checked");

				System.out.println(iCheck); // check what is returning from
											// getAttribute.
				if (iCheck.equals("true")) {
					System.out.println("Checkbox is already checked");
				} else {
					element.get(i).click();
				}

			} else if (value.equalsIgnoreCase("ADV")) {
				
				boolean iCheck1 = element.get(i).isSelected();
				if (iCheck1 == true) {
					System.out.println("Checkbox is already checked");
				} else {
					element.get(i).click();
				}
			

			} else if (value.equalsIgnoreCase("ADM")) {
				
				boolean iCheck2 = element.get(i).isSelected();
				if (iCheck2 == true) {
					System.out.println("Checkbox is already checked");
				} else {
					element.get(i).click();
				}
				

			}
		}

		driver.close();

	}

}
