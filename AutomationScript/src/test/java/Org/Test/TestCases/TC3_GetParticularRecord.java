package Org.Test.TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import Org.Test.TestScripts.HTTPMethods;
import Org.Test.Utlities.HandleProperties;

public class TC3_GetParticularRecord {
	
	@Test
	public void testCase3() throws Exception {
		// TODO Auto-generated method stub
		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");
		
		HTTPMethods http=new HTTPMethods(properties);
		
		http.getParticuarRecord("QA_URI", TC1_PostRequest.residvalue);
	}
	
	
//	public void testCase() throws Exception {
//		// TODO Auto-generated method stub
//		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");
//		
//		HTTPMethods http=new HTTPMethods(properties);
//		http.getParticuar("QA_URI", "2");
//	}

}
