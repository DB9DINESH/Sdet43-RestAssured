package assertionsValidations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseBodyContainsValidation {
	
	@Test
	public void getValidation()
	{
		baseURI="http://localhost";
		port=8084;
		Response resp = when()
		  .get("/projects")
		.then()
		   .log().body()
		   .statusCode(200)
		   .extract().response();
		  
		String st = resp.asString();
		Assert.assertEquals(st.contains("Dinesh"),true);
   	}

}
