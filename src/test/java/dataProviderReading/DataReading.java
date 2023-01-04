package dataProviderReading;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoLibrary.PostAddProject;

public class DataReading extends PostAddProject{
	
	@Test(dataProvider="Friends")
	public void dataReadingTest(String createdBy,String projectName,String status,int teamSize)
	{
		baseURI="http://localhost";
		port=8084;
		PostAddProject paj=new PostAddProject(createdBy, projectName, status, teamSize);
		given()
		  .body(paj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		 .then()
		  .assertThat().statusCode(201)
		  .contentType(ContentType.JSON)
		  .log().all();
				
	}

	
	@DataProvider(name="Friends")
	public Object[][] readData()
	{
		Object[][] obj=new Object[2][4];
		obj[0][0]="Jay";
		obj[0][1]="Mumbai1";
		obj[0][2]="Native";
		obj[0][3]=29;
		
		obj[1][0]="Din";
		obj[1][1]="AndhraPradesh1";
		obj[1][2]="Native";
		obj[1][3]=28;
		return obj;
	}
}
