package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class HeaderParameter {
	@Test
	public void head()
	{
		given()
		  .param("projectName", "Ravana")
		  .header("HeaderName","Testing")
		.when()
		  .get("http://localhost:8084/projects/TY_PROJ_806")
		 .then()
		   .log().all();
	}

}
