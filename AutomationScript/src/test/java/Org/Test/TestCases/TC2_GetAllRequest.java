package Org.Test.TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import Org.Test.TestScripts.HTTPMethods;
import Org.Test.Utlities.HandleProperties;

public class TC2_GetAllRequest {

	@Test
	public void testCase2() throws Exception {
		// TODO Auto-generated method stub
		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");
		
		HTTPMethods http=new HTTPMethods(properties);
		
		http.getAllRequest("QA_URI");
	}

}
