package crudOperationsUsingBaseClass;

import genericUtility.BaseClass;
import genericUtility.IPathConstants;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostDataUsingBaseClass extends BaseClass{
	@Test
	public void postOperation()
	{
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "HareRam");
        jobj.put( "projectName", "VanaVasam"+jlib.randomNumbers())	;
        jobj.put("status", "OnGoing");
        jobj.put("teamSize",3);
        
        given()
         .spec(requestspec)
         .body(jobj)
        .when()
          .post(IPathConstants.createProject)
        .then()
        .statusLine("HTTP/1.1 201 ")
        .statusCode(201)
          .log().all();
	}

}
