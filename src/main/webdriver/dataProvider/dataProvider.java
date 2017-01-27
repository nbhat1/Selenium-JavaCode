package main.webdriver.dataProvider;

import main.java.excelReading.Excel_Reader;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by neeraj.bhatnagar on 1/20/2017.
 * https://www.youtube.com/watch?v=xavvQE6qs8s&t=2025s
 */
public class dataProvider {


   // String path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private FileInputStream fis;
    private XSSFWorkbook workBook;
    private XSSFSheet sheet;

    private By byEmail = By.xpath(".//*[@id='email']");
    private By byPassword = By.xpath(".//*[@id='passwd']");
    private By bySubmit = By.xpath(".//*[@id='SubmitLogin']");
    private By byLogOut = By.xpath(".//*[@class='logout']");

    public dataProvider() {
        String path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
        //this.path = path;
        try {
            fis = new FileInputStream(path);
            workBook = new XSSFWorkbook(fis); // Making object of workbook with input stream as argument
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\GecoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();

    }

    public Object[][] getData(String workBookName, String SheetName) throws IOException {
        Excel_Reader data = new Excel_Reader(System.getProperty("user.dir")+"\\testdata\\"+workBookName);
        int rowNum = data.getRowCount(SheetName);
        System.out.println("Row number is "+rowNum);
        int colNum = data.getColumnCount(SheetName);
        System.out.println("Columan Number is "+colNum);
        Object sampleData[][] = new Object[rowNum-1][colNum];
           for(int i =2; i<rowNum;i++){
          for(int j=0;j<colNum;j++){
              sampleData[i-2][j]=data.getCellData(SheetName,j,i);
          }
      }
        return sampleData;
    }

    @DataProvider
    public Object[][] loginData() throws IOException {
        Object[][] data = getData("testData.xlsx","userData");
        return data;
    }

    @Test(dataProvider="loginData")
    public void VerifyLogin(String userName, String password) throws InterruptedException {
        // driver.get(appURL);
        driver.get(appURL);
        driver.manage().window().maximize();
        driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(byPassword).sendKeys(password);
        driver.findElement(bySubmit).click();
        Thread.sleep(2000);
        driver.findElement(byLogOut).click();
        Thread.sleep(2000);
    }

    @Test(dataProvider="loginData", enabled = false)
    public void VerifyInvalidLogin1(String userName, String password) throws InterruptedException {
        driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(byPassword).sendKeys(password);
        driver.findElement(bySubmit).click();
    }
   /* @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }*/
}

