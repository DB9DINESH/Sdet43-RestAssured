package CRUDoperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProjectTest {
	@Test
	public void projectGet()
	{
		//step1 add the prerequisites
//		RequestSpecification reqs = RestAssured.given();
//		     Response resp = reqs.get("http://localhost:8084/projects");
//		     resp.then().log().all();
//		     resp.then().assertThat().statusCode(200);
		
		Response resp = RestAssured.get("http://localhost:8084/projects");
		resp.then().log().all();
	}

}
