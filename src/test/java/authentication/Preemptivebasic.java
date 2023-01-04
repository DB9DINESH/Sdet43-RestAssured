package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Preemptivebasic {
	@Test
	public void prem()
	{
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		  .get("http://localhost:8084/projects/TY_PROJ_1208")
		 .then()
		   .log().body();
	}

}
