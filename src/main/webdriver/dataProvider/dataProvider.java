package main.webdriver.dataProvider;

import main.java.excelReading.Excel_Reader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by neeraj.bhatnagar on 1/20/2017.
 */
public class dataProvider {


   // String path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private FileInputStream fis;
    private XSSFWorkbook workBook;
    private XSSFSheet sheet;
    private XSSFRow row;
    private XSSFCell cell;

    private By byEmail = By.xpath(".//*[@id='email']");
    private By byPassword = By.xpath(".//*[@id='passwd']");
    private By bySubmit = By.xpath(".//*[@id='SubmitLogin']");

    public dataProvider(String path) {
        path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
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
        driver.get(appURL);
        driver.manage().window().maximize();
    }

    public Object[][] getData(String workBookName, String SheetName) throws IOException {
        Excel_Reader data = new Excel_Reader(System.getProperty("user.dir")+"\\testdata\\"+workBookName);
        int rowNum = data.getRowCount(SheetName);
        System.out.println(rowNum);
        int colNum = data.getColumnCount(SheetName);
        System.out.println(colNum);
        Object sampleData[][] = new Object[rowNum -1][colNum];
        for(int i = 2; i<=rowNum; i++){
            for (int j = 0; j<=colNum; j++){
                sampleData[i-2][j] = getCellData(SheetName,j,i);
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
        /*driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(byPassword).sendKeys(password);
        driver.findElement(bySubmit).click();*/
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys(password);
    }

    @Test(dataProvider="loginData")
    public void VerifyInvalidLogin1(String userName, String password) throws InterruptedException {
        driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(byPassword).sendKeys(password);
        driver.findElement(bySubmit).click();
    }


    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            int col_mum = 0;
            int sheetIndex = workBook.getSheetIndex(sheetName); // Index of sheet to be worked upon.
            sheet = workBook.getSheetAt(sheetIndex);           // Get Sheet.
            row = sheet.getRow(0);
            for (int i = 0; i < row.getLastCellNum(); i++) {       // This will get you how many column excel sheet have
                if (row.getCell(i).getStringCellValue().equals(colName)) {
                    int col_num = i;
                }
            }
            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(col_mum);
            if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                return cell.getStringCellValue();
            } else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                return String.valueOf(cell.getStringCellValue());
            } else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
                return String.valueOf(cell.getStringCellValue());
            } else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Oevrloading of method getCellData to get all row & columns, based on Columan Index & row index.
     * @param sheetName
     * @param colNum
     * @param rowNum
     * @return
     */

    public String getCellData(String sheetName, int colNum, int rowNum) {
        try {

            int sheetIndex = workBook.getSheetIndex(sheetName); // Index of sheet to be worked upon.
            sheet = workBook.getSheetAt(sheetIndex);           // Get Sheet.
            row = sheet.getRow(0);
            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(colNum);
            if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                return cell.getStringCellValue();
            } else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                return String.valueOf(cell.getStringCellValue());
            } else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
                return String.valueOf(cell.getStringCellValue());
            } else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getRowCount(String sheetName) {
        try{
            int index = workBook.getSheetIndex(sheetName);
            if (index == -1) {
                return 0;
            } else {
                sheet = workBook.getSheetAt(index);
                int number = sheet.getLastRowNum() + 1;
                return number;
            }

        } catch(Exception e){
            e.printStackTrace();

        }
        return 0;
    }

    public int getColumnCount(String sheetName) {
        try {
            int index = workBook.getSheetIndex(sheetName);
            if (index == -1) {
                return 0;
            } else {
                sheet = workBook.getSheet(sheetName);
                row = sheet.getRow(0);
                return row.getLastCellNum();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }



    /*@AfterClass
    public void tearDown(){
        driver.quit();
    }*/
}

