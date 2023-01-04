package Pojo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoLibrary.PostAddProject;

import static io.restassured.RestAssured.*;

public class PostOpeartionPojo extends PostAddProject {
	@Test
	public void postPojo()
	{
		PostAddProject pj=new PostAddProject("Gowda", "Kanak", "PassCreated", 100);
		
		given()
		  .body(pj)
		  .contentType(ContentType.JSON)
		.when()
		   .post("http://localhost:8084/addProject")
		.then()
		   .assertThat().statusCode(201)
		  .contentType(ContentType.JSON)
		  .log().all();
	}

}
