package Org.Test.Utlities;

import java.io.File;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

//purpose of this method--> to read any json file
// input parameters --> json file path
// output --> the json data in string formate
public class HandleJSONFile {

	public static String readJson(String jsonfilepath) throws Exception {
		File fls=new File(jsonfilepath);
		FileReader reader=new FileReader(fls);
		JSONTokener js=new JSONTokener(reader);
		JSONObject j=new JSONObject(js);
		return j.toString();
	}
}
