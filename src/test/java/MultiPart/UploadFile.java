package MultiPart;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.io.File;

public class UploadFile {
	@Test
	public void multipartoperatio()
	{
	
        File f=new File("./src\\test\\resources\\Shiva.jpg");
        given()
         
         .multiPart("file", f, "Multipart/formdata")
        .when()
         .post("https://the-internet.herokuapp.com/upload")
         .thenReturn()
        .then()
          .log().all();
	}

}
