package com.cydeo.Test_POI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

   /* String path = "SampleData.xlsx";

    @Test
    public void Excel_write() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");

        // We gonna create another column(Header) and fill out all 5 rows
        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");  // created Header

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(170000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(120000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(130000);

        // open to write and read : FileInputStream --> reading
        // saving changes : FileOutputStream --> writing
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();

    }

    */
}
