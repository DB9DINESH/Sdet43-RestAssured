package responseBodyIntoJsonFile;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class AsString {
	@Test
	public void as() throws IOException
	{
		
		Response rep = given()
		  .pathParam("projectId", "TY_PROJ_1004")
		  .contentType(ContentType.JSON)
		.when()
		  .get("http://localhost:8084/projects/{projectId}");
		 String st = rep.asString();
		byte[] by = st.getBytes();
		File f=new File("./src/test/resources/OutputFileforasString1.json");
		Files.write(by, f);
		
		   
	}

	
	@Test
	public void usingInputStream() throws IOException
	{
		Response repo = given()
		 .pathParam("projectId", "TY_PROJ_251")
		 .contentType(ContentType.JSON)
		.when()
		  .get("http://localhost:8084/projects/{projectId}");
		    InputStream st = repo.asInputStream();
		        byte[] inp = new byte[st.available()];
		        st.read(inp);
		        File fp=new File("./src/test/resources/OutputFileInputStream1.json");
		        Files.write(inp, fp);
	}
	
	@Test
	public void byteA() throws IOException
	{
		Response resp = given()
		  .pathParam("projectId", "TY_PROJ_251")
		  .contentType(ContentType.JSON)
		.when()
		  .get("http://localhost:8084/projects/{projectId}");
		 byte[] st = resp.asByteArray();
		 File fo=new File("./src/test/resources/Outputfilebye.json");
		 Files.write(st, fo);
	}
}
