package jsonFile;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostOpeartionUsingJsonFile {

	@Test
	public void opeartionpost()
	{
		File f=new File("src\\test\\resources\\post.json");
		
		 baseURI="http://localhost";
	        port=8084;
	        
	        given()
	          .body(f)
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
