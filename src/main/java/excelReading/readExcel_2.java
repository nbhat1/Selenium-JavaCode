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
        // Create object of file.
        File path = new File(System.getProperty("user.dir")+"\\testdata\\testData.xlsx");
        // Create object of FileInput Stream.
        FileInputStream fis = new FileInputStream(path);
        // Create object of workbook.
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // Create object of Sheet.
        XSSFSheet sheet = workbook.getSheet("userData");
        // Get Cell Value of First Row & second column
        String value = sheet.getRow(0).getCell(1).getStringCellValue();
        // Print Cell Value.
        System.out.println(value);
        // Get Cell Value of Second Row & second column
        sheet.getRow(1).getCell(1).getStringCellValue();
        // Get Row count using getLastRowNum.
        System.out.println("Total Row is " + " " + sheet.getLastRowNum());
        // // Get Row count using getPhysicalNumberOfRows.
        System.out.println("Total Row is " + " " + sheet.getPhysicalNumberOfRows());
        // Get Column Count.
        System.out.println("Column count for defined row is "+sheet.getRow(1).getLastCellNum());
        workbook.close();

    }
}
