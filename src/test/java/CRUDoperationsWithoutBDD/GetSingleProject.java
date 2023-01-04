package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	public void singleprojectget()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_806");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType(ContentType.JSON);
	}

}
