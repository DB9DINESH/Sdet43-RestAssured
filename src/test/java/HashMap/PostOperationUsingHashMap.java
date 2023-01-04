package HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostOperationUsingHashMap {


	@Test
	public void operationHashMapPost()
	{
		HashMap jobj=new HashMap();
		jobj.put("createdBy", "JayanthRathod");
        jobj.put( "projectName", "HMS123")	;
        jobj.put("status", "CompletedPartially");
        jobj.put("teamSize",4);
        
        baseURI="http://localhost";
        port=8084;
        
        given()
          .body(jobj)
          .contentType(ContentType.JSON)
        .when()
          .post("/addProject")
        .then()
           .log().all()
           
           .assertThat().statusCode(201)
           .assertThat().contentType(ContentType.JSON)
           .assertThat().statusLine("HTTP/1.1 201 ");
              
                 
}
}
