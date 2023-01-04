package CRUDoperationsWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutOperationTest {
	@Test
	public void putOperationUpdate()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Prabhas");
		jobj.put("projectName", "SAHOO");
		jobj.put( "status", "FLOP");
		jobj.put("teamSize", 143);
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(jobj);
		Response resp = reqspec.put("http://localhost:8084/projects/TY_PROJ_001");
		
		ValidatableResponse val = resp.then();
		val.log().all();
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println(resp.getStatusCode());
		//System.out.println(resp.prettyPrint()+"1");
		//System.out.println(resp.prettyPeek());
		//System.out.println(resp.asString()+"2");
	}

}
