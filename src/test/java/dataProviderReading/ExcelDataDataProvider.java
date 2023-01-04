package dataProviderReading;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import genericUtility.ExcelUtility;
import io.restassured.http.ContentType;
import pojoLibrary.PostAddProject;
import pojoLibrary.PostAddProject1;

import static io.restassured.RestAssured.*;

public class ExcelDataDataProvider extends PostAddProject1 {

		@Test(dataProvider = "Dinesh")
		public void addProjectExcel(String createdBy,String projectName,String status, String teamSize)
		{
			baseURI="http://localhost";
			port=8084;
			PostAddProject1 po=new PostAddProject1(createdBy,projectName,status,teamSize);
			given()
			 .body(po)
			 .contentType(ContentType.JSON)
			 .when()
			   .post("/addProject")
			   .then()
			   .assertThat().statusCode(201)
			   .contentType(ContentType.JSON)
			   .log().all();
			 
		}
		
		@DataProvider(name="Dinesh")
		public Object[][] getData() throws Throwable
		{
			ExcelUtility elib=new ExcelUtility();
			Object[][] value = elib.readMultipledata("Sheet2");
			return value;
		}
	}



