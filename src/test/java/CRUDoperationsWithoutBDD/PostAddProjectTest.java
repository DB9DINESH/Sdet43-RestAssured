package CRUDoperationsWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAddProjectTest {
	@Test
	public void postaddProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Talapathy");
		jobj.put("projectName", "VarisuVarasudu12");
		jobj.put("status", "BlockBuster");
		jobj.put("teamSize", 1);
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		Response resp = reqspec.post("http://localhost:8084/addProject");
		
		resp.then().log().all();
		resp.then().assertThat().statusCode(201);
		resp.then().contentType(ContentType.JSON);
		}
	
	

	
}
