package authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DigestiveBasic {
	@Test
	public void digest()
	{
		given()
		.auth().digest("rmgyantra", "rmgy9999")
		.when()
		  .get("http://localhost:8084/projects/TY_PROJ_1207")
		 .then()
		   .log().body();
	}

}
