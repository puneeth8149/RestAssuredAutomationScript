package Org.Test.Utlities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

// purpose of this method -> load the properties file
// input parameters --> properties file path
// Output -> it will return the object of the properties class
public class HandleProperties {
	
	public static Properties loadPropertiesFile(String filepath) throws Exception {
		
		File fls=new File(filepath);
		FileReader reader=new FileReader(fls);
		Properties prop=new Properties();
		prop.load(reader);
		
		return prop;
	}

}
