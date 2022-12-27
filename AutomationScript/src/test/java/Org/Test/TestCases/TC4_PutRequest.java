package Org.Test.TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import Org.Test.TestScripts.HTTPMethods;
import Org.Test.Utlities.HandleJSONFile;
import Org.Test.Utlities.HandleProperties;
import Org.Test.Utlities.JSONReplacement;

public class TC4_PutRequest {
	
	@Test
	public  void testcase4() throws Exception {
		
		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");
		String inputBodyData=HandleJSONFile.readJson("../AutomationScript/src/test/java/Org/Test/Resource/RequestBodyDataUpdate.json");

		String updateBodyData=	JSONReplacement.JSONDataValidationReplacement(inputBodyData, "id", TC1_PostRequest.residvalue);
		
		HTTPMethods http=new HTTPMethods(properties);
		http.updateRequest("QA_URI", TC1_PostRequest.residvalue, updateBodyData);

	}

}
