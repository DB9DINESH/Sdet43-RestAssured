package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthentication {
	@Test
	public void basicAuth()
	{
		given()
		 .auth().basic("rmg", "rmgy")
		.when()
		  .get("http://localhost:8084/projects/TY_PROJ_1004")
		.then()
		  .log().body();
	}

}
