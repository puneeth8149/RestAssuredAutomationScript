package Org.Test.TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import Org.Test.TestScripts.HTTPMethods;
import Org.Test.Utlities.HandleProperties;

public class TC5_DeleteRequest {

	@Test
	public void testcase5() throws Exception {

		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");

		HTTPMethods http=new HTTPMethods(properties);

		http.deleteRequest("QA_URI", TC1_PostRequest.residvalue);
		System.out.println("TC1_PostRequest.residvalue:- "+TC1_PostRequest.residvalue);
	}

}
