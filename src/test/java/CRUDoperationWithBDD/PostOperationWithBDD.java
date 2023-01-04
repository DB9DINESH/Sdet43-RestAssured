package CRUDoperationWithBDD;

import static org.junit.Assert.assertThat;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperationWithBDD extends JavaUtility{

	@Test
	public void operatonPost()
	{
		//String alpha = RandomStringUtils.randomAlphabetic(2);
		//String alpha = RandomStringUtils.randomNumeric(12);
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "JayanthRathodKumar");
        jobj.put( "projectName", "HMSHM"+randomAlphabet())	;
        jobj.put("status", "Completed");
        jobj.put("teamSize",400);
        
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
