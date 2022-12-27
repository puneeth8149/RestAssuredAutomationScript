package Org.Test.TestScripts;



import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class HTTPMethods {

	Properties pr;
	public HTTPMethods(Properties pr) {
		// TODO Auto-generated constructor stub
		this.pr=pr;
	}
	public Response postRequest(String uri, String bodyData) {
		String urivalue=pr.getProperty(uri);

		Response res=
				given().contentType(ContentType.JSON).body(bodyData).when().post(urivalue);

		System.out.println("post request Status code is ::"+res.statusCode());
		System.out.println("response data :-");
		System.out.println(res.asString());
		return res;
	}

	public void getAllRequest(String uriKey) {
		Response res=
				given().contentType(ContentType.JSON).when().get(pr.getProperty(uriKey));

		System.out.println("getAll request Status code is ::"+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}

	public void getParticuarRecord(String uriKey, String id) {

		String uri=pr.getProperty(uriKey)+"/"+id;
		Response res=
				given().contentType(ContentType.JSON).when().get(uri);

		System.out.println("get particular record Status code is ::"+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}
	
	public void getParticuar(String uriKey, String id) {

		String uri=pr.getProperty(uriKey)+"/"+id;
		Response res=
				given().contentType(ContentType.JSON).when().get(uri);

		System.out.println("get particular record without TC1 Status code is ::"+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}

	public void updateRequest(String uriKey, String idvalue, String bodyData) {

		String uri=pr.getProperty(uriKey)+"/"+idvalue;
		Response res=
				given().contentType(ContentType.JSON).body(bodyData).when().put(uri);

		System.out.println("update request Status code is ::"+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}
	
	public void deleteRequest(String uriKey, String idvalue) {

		String uri=pr.getProperty(uriKey)+"/"+idvalue;
		Response res=
				given().contentType(ContentType.JSON).when().delete(uri);

		System.out.println("detele request Status code is ::"+res.statusCode());
		
	}


}
