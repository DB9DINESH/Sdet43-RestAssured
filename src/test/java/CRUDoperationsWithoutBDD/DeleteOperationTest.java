package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteOperationTest {

	@Test
	public void operationDelete()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_001");
		resp.then().log().all();
		resp.then().assertThat().statusCode(204);
		
	}
}
