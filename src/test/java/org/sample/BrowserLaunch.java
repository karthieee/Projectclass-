package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\ExcelRead\\TASK.xlsx");

		FileInputStream s = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(s);

		Sheet s1 = wb.getSheet("Sheet1");

		// outer for loop

		for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {

			Row r = s1.getRow(i);

			// inner for loop

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				int cellType = c.getCellType();
				if (cellType == 1) {
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (DateUtil.isCellDateFormatted(c)) {

					Date dateCellValue = c.getDateCellValue();

					SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");

					String format = dateformat.format(dateCellValue);

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