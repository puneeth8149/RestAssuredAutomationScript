package Org.Test.Utlities;

import io.restassured.response.Response;

public class JSONParsingUsingJSONPath {

	public static String jsonParse(Response res, String jsonpath) {
		
		String extractvalue=res.jsonPath().get(jsonpath);
		return extractvalue;
	}
}
