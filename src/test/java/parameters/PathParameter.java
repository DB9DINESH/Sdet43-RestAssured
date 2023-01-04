package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
	@Test
	public void path()
	{
		String pid="TY_PROJ_806";
	   given()
	     .pathParam("projectId", pid)
	   .when()
	     .get("http://localhost:8084/projects/{projectId}")
	   .then()
	     .log().body();
	}

}
