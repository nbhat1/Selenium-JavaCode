package main.java.excelReading;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;

/**
 * Created by neeraj.bhatnagar on 1/17/2017.
 */
public class readExcel_2 {
    public static void main(String[] args) throws Exception{
        File path = new File(System.getProperty("user.dir")+"\\testdata\\testData.xlsx");
        //System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("userData");
        System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getPhysicalNumberOfRows());
        System.out.println("Column count for defined row is "+sheet.getRow(1).getLastCellNum());
        workbook.close();


    }
}
