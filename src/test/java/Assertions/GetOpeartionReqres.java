package Assertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;

public class GetOpeartionReqres {
	
	@Test
	public void getOperation()
	{
		String expd="eve";
	              Response resp = when()
	                             .get("https://reqres.in/api/users");
	              
	              List<Object> actda = resp.jsonPath().get("data");
	              
	              for(Object b:actda)
	              {
	            	  String data = b.toString();
	            	  if(data.contains(expd))
	            	  {
	            		  System.out.println(data+"data matched");
	            		  break;
	            	  }
	            	  
	              }
	  
	}
}
