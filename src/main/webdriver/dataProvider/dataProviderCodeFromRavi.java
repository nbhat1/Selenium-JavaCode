/*
package main.webdriver.dataProvider;import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

*/
/**
 * Created by neeraj.bhatnagar on 1/16/2017.
 *//*

public class dataProviderCodeFromRavi {

        public WebDriver driver;
        public WebDriverWait wait;
        String appURL = "https://www.gmail.com";

        private By byEmail = By.xpath("/*/
/*[@id='Email']");
        private By bynext =  By.xpath("/*/
/*[@id='next']");
        private By byPassword = By.xpath("//input[@id='Passwd']");
        private By bySubmit = By.id("signIn");
        public static String pathh = "C:/Test.xlsx";

        @BeforeClass
        public void setup(){
                                */
/*System.setProperty("webdriver.chrome.driver","C:\\driver\\geckodriver.exe");
                                driver = new FirefoxDriver();*//*

            System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://accounts.google.com/");

        }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }

        @Test(dataProvider="empLogin")
        public void VerifyLogin(String userName, String password) throws InterruptedException {
        */
/*driver.navigate().to(appURL);*//*

            driver.navigate().to("https://accounts.google.com/");
            driver.findElement(byEmail).sendKeys(userName);
            driver.findElement(bynext).click();
            Thread.sleep(1000);
            driver.findElement(byPassword).sendKeys(password);
            //wait for element to be visible and perform click

            driver.findElement(bySubmit).click();

            //Check for error message
        }

   */
/* @Test(dataProvider="empLogin")
    public void VerifyInvalidLogin1(String userName, String password) throws InterruptedException {
        driver.navigate().to(appURL);
                driver.navigate().to("https://accounts.google.com/");
        driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(bynext).click();
        Thread.sleep(1000);
        driver.findElement(byPassword).sendKeys(password);
        //wait for element to be visible and perform click

        driver.findElement(bySubmit).click();

        //Check for error message
    } *//*


        @DataProvider(name="empLogin")
        public Object[][] loginData(Method m) throws IOException {

            Object[][] arrayObject = getExcelData(pathh,"Sheet1", m.getName());

            return arrayObject;


        }

        public String[][] getExcelData(String fileName, String sheetName, String methodName)
                throws IOException {
            String[][] arrayExcelData = null;
            try{
                FileInputStream fs = new FileInputStream(fileName);
                XSSFWorkbook workbook = new XSSFWorkbook(fs);
                XSSFSheet sh = workbook.getSheet(sheetName);

                Map<String, List<String[]>> methodNameToDataArrMap = new HashMap<>();


                int numOfRows = sh.getLastRowNum() - sh.getFirstRowNum(); // We are not adding 1 here because the first row has headers and we would ignore it.
                String[][] values = new String[numOfRows][];

                Iterator<Row> rows = sh.rowIterator();
                int index = 0;

                rows.next(); //just to skip the first row coming from excel sheet.l
                while (rows.hasNext()) {

                    Row row = rows.next();
                    int numOfCells = row.getLastCellNum() - row.getFirstCellNum();
                    values[index] = new String[numOfCells];
                    Iterator<Cell> cells = row.cellIterator();

                    int colCounter = 0;
                    while (cells.hasNext()) {
                        Cell cell = cells.next();
                        values[index][colCounter] = cell.getStringCellValue();
                        colCounter++;
                    }


                    List<String[]> dataList = null;
                    if (methodNameToDataArrMap.get(values[index][0]) == null) {
                        dataList = new ArrayList<String[]>();
                    } else {
                        dataList = methodNameToDataArrMap.get(values[index][0]);
                    }

                    String[] tempDataList = new String[values[index].length - 1];
                    for (int i = 1, j = 0; i < values[index].length; i++, j++) {
                        tempDataList[j] = values[index][i];
                    }
                    dataList.add(tempDataList);
                    methodNameToDataArrMap.put(values[index][0], dataList);

                    index++;
                }

                arrayExcelData = new String[methodNameToDataArrMap.get(methodName).size()][];
                int j = 0;
                for (String[] strArr : methodNameToDataArrMap.get(methodName)) {
                    arrayExcelData[j++] = strArr;
                }
                workbook.close();
            }  catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                e.printStackTrace();
            }
            return arrayExcelData;
        }


    }

}
*/
