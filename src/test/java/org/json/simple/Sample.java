package org.json.simple;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader file= new FileReader(new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\src\\test\\resources\\Reports\\SampleApi.json"));
				

		JSONParser json = new JSONParser();

		Object parse = json.parse(file);

		JSONObject obj = (JSONObject) parse;

		Object object = obj.get("data");

		JSONArray array = (JSONArray) object;

		Object object2 = array.get(0);

		JSONObject jsonObj = (JSONObject) object2;

		String string = jsonObj.get("last_name").toString();

		System.out.println(string);

	}

}
