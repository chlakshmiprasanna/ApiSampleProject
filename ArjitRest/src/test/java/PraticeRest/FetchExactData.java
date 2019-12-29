package PraticeRest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
public class FetchExactData {

	@Test
	public void fetchDataByKey()
	{
		Response resp = get
("http://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println(resp.asString());
		System.out.println("++++++++++++++++++++++");
		ArrayList<String> obj = resp.jsonPath()
				.get("employee_name");
		
		for(String s : obj)
		{
			System.out.println(s);
		}
		
		Object obj1 = resp.jsonPath().get
							("employee_name[4]");
		System.out.println("Only 4th name: " + obj1);
	}
}









