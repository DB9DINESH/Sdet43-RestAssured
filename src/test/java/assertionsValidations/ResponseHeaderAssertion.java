package assertionsValidations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ResponseHeaderAssertion {
	@Test
	public void header()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Vundrala1");
		jobj.put("projectName", "Dinesh143");
		jobj.put("status", "Kumar1");
		jobj.put("teamSize", 1);
		 
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("http://localhost:8084/addProject")
		.then()
		  .log().all()
		  .statusCode(201)
		  .statusLine("HTTP/1.1 201 ");
		
	}

}
