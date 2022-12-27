package Org.Test.TestCases;

import java.util.Properties;
import java.util.Random;

import org.testng.annotations.Test;

import Org.Test.TestScripts.HTTPMethods;
import Org.Test.Utlities.HandleJSONFile;
import Org.Test.Utlities.HandleProperties;
import Org.Test.Utlities.JSONParsingUsingJSONPath;
import Org.Test.Utlities.JSONReplacement;
import io.restassured.response.Response;


public class TC1_PostRequest {

	static String residvalue;
	
	@Test
	public void testCase1() throws Exception {

		Properties properties=HandleProperties.loadPropertiesFile("../AutomationScript/URI.properties");
		String inputBodyData=HandleJSONFile.readJson("../AutomationScript/src/test/java/Org/Test/Resource/Request.json");
		
		Random ram=new Random();
		Integer idvalue=ram.nextInt();

//		System.out.println("Please enter Id value :: ");
//		Scanner sc=new Scanner(System.in);
//		String idvalue=sc.next();
		String updateBodyData=	JSONReplacement.JSONDataValidationReplacement(inputBodyData, "id", idvalue.toString());

		HTTPMethods http=new HTTPMethods(properties);
		Response resobject=http.postRequest("QA_URI", inputBodyData);
		residvalue=JSONParsingUsingJSONPath.jsonParse(resobject, "id");
		System.out.println("response id value :- "+residvalue);
		
	}
}
