package requestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Chaining {
	@Test
	public void request()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sita");
		jobj.put("projectName", "Ramayan");
		jobj.put("status", "Done");
		jobj.put("teamSize", 3);
		
		 Response resp = given()
		  .body(jobj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("http://localhost:8084/addProject");
		  String st =resp.jsonPath().get("projectId");
		  
		  
		  given()
		    .pathParam("pid",st)
		 .when()
		   .get("http://localhost:8084/projects/{pid}")
		 .then()
		   .log().body();
		    
		
	}

	
}
