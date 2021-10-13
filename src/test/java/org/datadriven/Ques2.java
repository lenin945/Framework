package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ques2 {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\lenin\\OneDrive\\Documents\\GIt_Cloning\\Framework\\Data\\Login_Details.xlsx");
	
	FileInputStream filein=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(filein);
	
	Sheet sh = w.getSheet("DD_ques1to3");
	
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		
		Row row = sh.getRow(i);
				
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			System.out.print(cell);
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
