package PraticeRest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void sendPostRequest()
	{
		// set the preconditions
		RequestSpecification req = RestAssured.given();
		
		// create JSON Object in java Form
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Anuja");
		jobj.put("id", 200);
		jobj.put("title", "TE");
		
		// convert Java Object into Json Format
		req.body(JSONObject.toJSONString(jobj));
		
		// set the Content Type
		req.contentType(ContentType.JSON);
		
		Response resp = req
				.post("http://localhost:3000/comments");
		
		String s = resp.asString();
		System.out.println(s);
		
		int statusCode = resp.statusCode();
		System.out.println("status code: " + statusCode);
		
		String contentType = resp.contentType();
		System.out.println("Content Type: " + contentType);
	}
}












