package org.jvm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonFile) {

		// loc of report dir

		File reportDirectory = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");

		Configuration c = new Configuration(reportDirectory, "Adactin Automation");

		c.addClassifications("Browser", "Chrome");
		c.addClassifications("os", "Windows10");
		c.addClassifications("Testing", "Reg");
		c.addClassifications("Sprint", "20");

		List<String> jsonFile1 = new ArrayList<String>();
		jsonFile1.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFile1, c);

		builder.generateReports();

	}

}
