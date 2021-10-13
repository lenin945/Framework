package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques3 {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\lenin\\OneDrive\\Documents\\GIt_Cloning\\Framework\\Data\\Login_Details.xlsx");
	
	FileInputStream fIn=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fIn);
	Sheet sh = w.getSheet("DD_ques1to3");
	int rownum = sh.getPhysicalNumberOfRows();
	
	Cell cell1 = sh.createRow(rownum).createCell(0);
	cell1.setCellValue("Eleven");
	FileOutputStream fOut=new FileOutputStream(f);
	w.write(fOut);
}
}
