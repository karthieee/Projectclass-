package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\ExcelRead\\TASK.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(input);

		Sheet s = wb.getSheet("Sheet1");

		// Outer for loop

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				int cellType = c.getCellType();

				if (cellType == 1) {
					String cellValue = c.getStringCellValue();
					System.out.println(cellValue);

				} else if (DateUtil.isCellDateFormatted(c)) {
					Date cellValue = c.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
					String format = dateFormat.format(cellValue);
					System.out.println(format);

				} else {
					double numericCellValue = c.getNumericCellValue();
					long l = (long) numericCellValue;
					System.out.println(l);

				}

			}

		}

	}

}
