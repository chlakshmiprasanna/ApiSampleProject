package PraticeRest;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Authentication {

	@Test
	public void checkAuth()
	{
		Response resp = given()
				.auth()
				.oauth2("access_token_id")
				.get("URI");
		
		/*RequestSpecification req = given();
		AuthenticationSpecification auth = req.auth();
		PreemptiveAuthSpec pre = auth.preemptive();
		RequestSpecification req1 = pre.basic
						("ToolsQA", "TestPassword");
		Response resp = req1.get("http://restapi.demoqa.com/"
		+ "authentication/CheckForAuthentication");*/
		System.out.println(resp.asString());
	}
}










