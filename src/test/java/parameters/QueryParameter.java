package parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void query()
	{
		//baseURI="https://reqres.in";
		given()
		  //.pathParam("path","/api/users")
		  .queryParam("page", 2)
		  .queryParam("A", "B")
		  .contentType(ContentType.JSON)
		.when()
		   .get("https://reqres.in/api/users")
		.then()
		 .log().body();
		
		
	}

}
