package main.java.excelReading;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;


/**
 * Created by neeraj.bhatnagar on 1/17/2017.
 */
public class readExcel {

    public String path;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public readExcel(String path) throws Exception {
        this.path= path;
                FileInputStream fis = new FileInputStream(path);
        workbook = new XSSFWorkbook(fis);
    }

    public void getCellData() {
        sheet = workbook.getSheet("userData");
        System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
    }

    public int getRowCount(){
        int sheetTopRow = sheet.getFirstRowNum();
        int sheetBottomRow = sheet.getLastRowNum();
        int totalrow = sheetBottomRow - sheetTopRow;
        System.out.println("Number of rows are " + " " + (totalrow+1));

        System.out.println("Row count from getPhysical number of row method." + " " +sheet.getPhysicalNumberOfRows());

        System.out.println("Row count from last row method."+ " " +sheet.getLastRowNum());
        return totalrow;
    }

    public int getColCount(){
        int totalColumn = sheet.getRow(1).getLastCellNum();
        System.out.println("Total Number of Columns are " + " " + totalColumn);

        return totalColumn;
    }

    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir")+"\\testdata\\testData.xlsx";
        readExcel obj = new readExcel(path);
        obj.getCellData();
        obj.getRowCount();
        obj.getColCount();

    }



}
