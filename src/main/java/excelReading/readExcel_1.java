package main.java.excelReading;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by neeraj.bhatnagar on 1/17/2017.
 */
public class readExcel_1 {
    String path;
    FileInputStream fis;
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    public readExcel_1(String path) throws IOException {
        this.path = path;
        FileInputStream fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
    }
    public void getCellData(){
        sheet = workbook.getSheet("userData");
        System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
    }

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
        readExcel_1 obj = new readExcel_1(path);
        obj.getCellData();

    }

}
