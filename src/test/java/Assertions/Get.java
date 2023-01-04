package Assertions;

import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get {

	@Test
	public void getOperation()
	{
		String expd="eve.holt@reqres.in";
	              Response resp = when()
	                             .get("https://reqres.in/api/users");
	              
	            Object actda = resp.jsonPath().get("data[3]");
	              
	             
	            	  System.out.println(actda);
	            	  
	             
	}
}
