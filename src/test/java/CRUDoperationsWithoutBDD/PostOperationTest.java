package CRUDoperationsWithoutBDD;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostOperationTest {

	@Test
	public void operationPost()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "JayanthRathod");
        jobj.put( "projectName", "HMS")	;
        jobj.put("status", "CompletedPartially");
        jobj.put("teamSize",4);
        
      RequestSpecification reqspe = RestAssured.given();
                 reqspe.body(jobj);
                 reqspe.contentType(ContentType.JSON);
               
              Response resp = reqspe.post("http://localhost:8084/addProject");
              
              resp.then().assertThat().statusCode(201);
              
              resp.then().assertThat().contentType(ContentType.JSON);
              
              resp.then().log().all();
              
                 
                
	}
}
