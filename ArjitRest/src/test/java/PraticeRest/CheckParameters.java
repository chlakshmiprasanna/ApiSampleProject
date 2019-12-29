package PraticeRest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CheckParameters {

	@Test
	public void checkParameters()
	{
		Response resp = given()
				.param("userId" , "7")
				.pathParam("x", "posts")
.get("https://jsonplaceholder.typicode.com/{x}");
		
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType
		("application/json; charset=utf-8");
// fetch all headers & body
		resp.then().log().all();
	}
}












