package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleReplace {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\ExcelRead\\TASK.xlsx");

		FileInputStream input = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(input);

		Sheet s = wb.getSheet("Sheet1");

		Row r = s.getRow(2);

		Cell c = r.getCell(0);

		String cellValue = c.getStringCellValue();

		System.out.println(cellValue);

		if (cellValue.equals("VIJAY")) {

			c.setCellValue("KUMAR");
		}
		FileOutputStream output = new FileOutputStream(f);
		wb.write(output);

	}

}
