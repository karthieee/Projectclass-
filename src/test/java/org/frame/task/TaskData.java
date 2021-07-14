package org.frame.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskData {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\ExcelRead\\TASK.xlsx");
		FileInputStream Input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(Input);
		Sheet s = w.getSheet("Sheet1");

		Row createRow = s.createRow(2);

		Cell createCell = createRow.createCell(2);
		createCell.setCellValue("keyan");

		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
		System.out.println("update done");

	}

}
