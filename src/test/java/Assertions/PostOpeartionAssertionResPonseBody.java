package Assertions;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostOpeartionAssertionResPonseBody extends JavaUtility{
	
	@Test
	public void AssertionBodyPost()
	{
		String r = randomAlphabet();
		String expd="Cinema"+r;
		JSONObject jobj=new JSONObject();
		jobj.put( "createdBy", "Baba");
		jobj.put("projectName", "Cinema"+r);
		jobj.put("status", "Flop");
		jobj.put("teamSize", 100);
		
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .body("projectName",Matchers.equalTo(expd));
		
		
		
//		String actd = resp.jsonPath().get("projectName");
//		System.out.println(actd);
//		
//		//resp.then().assertThat().statusCode(201);
//		//resp.then().contentType(ContentType.JSON);
//		
//		Assert.assertEquals(actd, expd);
//		//resp.then().log().all();
//		resp.prettyPrint();
//		//resp.then().log().body();
//		
		
		
		
		 
		
	}

}
