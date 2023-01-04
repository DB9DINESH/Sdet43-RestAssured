package CRUDoperationWithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteOpeartionWithBDDTest {

	@Test
	public void operationDelete()
	{
		
		baseURI="http://localhost";
		port=8084;
		
		when()
		  .delete("/projects/TY_PROJ_807")
		.then()
		  .assertThat().contentType(ContentType.JSON)
		  .assertThat().statusCode(204)
		  .assertThat().statusLine("HTTP/1.1 204 ")
		  .log().all();
		
	}
}
