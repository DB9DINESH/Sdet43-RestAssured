package CRUDoperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class PutOperationUsingBDDTest {
	@Test
	public void operatonPut()
	{
		baseURI="http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "BANGLADESH");
		jobj.put("projectName", "BIGBASH");
		jobj.put( "status", "COLLABARATED");
		jobj.put("teamSize", 1);
		
		given()
		.contentType(ContentType.JSON)
		 .body(jobj)
		.when()
		  .put("projects/TY_PROJ_251")
		.then()
		  .assertThat().statusCode(200)
		  .assertThat().contentType(ContentType.JSON)
		  .assertThat().statusLine("HTTP/1.1 200 ")
		  .log().all();
	}

}
