package testnggg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven2 {
	XSSFWorkbook work_book;
	XSSFSheet sheet;
	public datadriven2(String excelfilePath) {
	try {
	File s = new File(excelfilePath);
	FileInputStream stream = new FileInputStream(s);
	work_book = new XSSFWorkbook(stream);
	}
	catch(Exception e) {
	System.out.println(e.getMessage());
	}
	}
	public String getData(int sheetnumber, int row, int column){
	sheet = work_book.getSheetAt(sheetnumber);
	String data = sheet.getRow(row).getCell(column).getStringCellValue();
	return data;
	}
	public int getRowCount(int sheetIndex){
	int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
	row = row + 1;
	return row;
	}
	}

