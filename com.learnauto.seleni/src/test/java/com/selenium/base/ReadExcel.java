package com.selenium.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends BaseClass {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ReadExcel(String excelPath)
	{
		
		   try {
			f=new File(excelPath);
			fio= new FileInputStream(f);
			wb=new XSSFWorkbook(fio);
			
			   	} 
		   catch (Exception e) {
			System.out.println(e.getMessage());
			} 
		   
	   }
	public String getData(int sheetNum,int row, int column)
	   {
		   sheet1=wb.getSheetAt(sheetNum);
		   String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		   return data;
	   }
	public int getRowNum(int sheetNum){
		sheet1=wb.getSheetAt(sheetNum);
		int rowNum=sheet1.getLastRowNum();
		return rowNum;
	}
	public void closeExcel(){
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
