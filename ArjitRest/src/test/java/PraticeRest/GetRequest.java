package PraticeRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	public void sendGetRequest()
	{
		Response resp = RestAssured
				.get("http://restcountries.eu/rest/v2/all");
		
		resp.then().log().all();
	}
}








