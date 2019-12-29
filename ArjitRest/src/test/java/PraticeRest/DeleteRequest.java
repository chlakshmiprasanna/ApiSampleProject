package PraticeRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {

	@Test
	public void sendDeleteRequest()
	{
		Response resp = RestAssured
		.delete("http://localhost:3000/posts/fY7ZN-0");
		
		int statusCode = resp.statusCode();
		System.out.println("status code: " + statusCode);
		
	}
}
