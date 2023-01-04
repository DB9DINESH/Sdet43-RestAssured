package genericUtility;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	public String getJsonData(Response res,String path)
	{
		String data = res.jsonPath().getString(path);
		return data;
	}

}
