package main.java.excelReading;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by neeraj.bhatnagar on 1/17/2017.
 */
public class writeExcel {
    public static void main(String[] args) throws Exception{
        File path = new File(System.getProperty("user.dir")+"\\testdata\\testData.xlsx");
        //System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("userData");
        sheet.getRow(0).createCell(2).setCellValue("Status");
        sheet.getRow(1).createCell(2).setCellValue("Pass");
        sheet.getRow(2).createCell(2).setCellValue("Fail");
        FileOutputStream fout = new FileOutputStream(path);
        workbook.write(fout);
        workbook.close();
    }
}
