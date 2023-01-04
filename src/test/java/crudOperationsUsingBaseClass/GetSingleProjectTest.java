package crudOperationsUsingBaseClass;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.IPathConstants;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class GetSingleProjectTest extends BaseClass{
	
	@Test
	public void getSingleProject() throws Throwable, IOException
	{
		String proid = elib.readdatafromExcel("Sheet1", 4, 0);
		given()
		 .spec(requestspec)
		 .pathParam("ID", proid)
		.when()
		 .get(IPathConstants.getSingleProject+"{ID}")
		.then()
		  .assertThat()
		      .contentType(ContentType.JSON)
		      .statusCode(200)
		      .log().all();
		  
	}

}
