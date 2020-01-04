package com.api.TestScripts;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class SampleTest extends BaseClass{

	@Test
	public void checkSampleTest()
	{
		String apiData = config.getPropertyObject("sampleTest");
		Response resp = config.executeRequest(apiData);
		if(resp != null)
		{
logger = extent.createTest("Post Created" , "Test case pass");
		}
		resp.then().log().all();
		System.out.println("I am changing it.");
		System.out.println("Test Case Pass");

	}
	
}
