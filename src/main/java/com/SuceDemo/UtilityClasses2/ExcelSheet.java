package com.SuceDemo.UtilityClasses2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelSheet 
{
	public void excelData() throws IOException
	{
	String path = "C:\\Users\\Admin\\Desktop\\Excel fetchData\\Book1.xlsx";
    FileInputStream file = new FileInputStream(path);
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    
    XSSFSheet sheet = workbook.getSheet("JavaSheet");
	
    XSSFRow row=sheet.getRow(7);
      XSSFCell cell=row.getCell(7);
      
      String data =cell.getStringCellValue();
      System.out.println(data);
	}
	
}
