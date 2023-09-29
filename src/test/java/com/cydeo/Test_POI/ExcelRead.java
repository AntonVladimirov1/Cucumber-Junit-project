package com.cydeo.Test_POI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

  /*  @Test
    public void Excel_read() throws IOException {

        String path = "SampleData.xlsx";

        // to read from Excel file we need to load it to FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        // Create workbook > sheet > row > cell
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // get sheet(named) > row > cell
        XSSFSheet sheet = workbook.getSheet("Employees");

        // select row and cell
        //TODO: Print out Mary's cell
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));
        //TODO: Print out SDET
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(4).getCell(2));

        // return the count of used rows only
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        int lastRowNum = sheet.getLastRowNum();
        System.out.println("lastRowNum = " + lastRowNum);

        //TODO: Create a logic to print Masha's name Dynamically
        for (int rowNum = 0; rowNum < usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Masha")){
                System.out.println("sheet.getRow(rowNum).getCell(0) = " + sheet.getRow(rowNum).getCell(0));
            }
        }


    }

   */
}
