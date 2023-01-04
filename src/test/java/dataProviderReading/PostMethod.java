package dataProviderReading;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.IPathConstants;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import pojoLibrary.PostAddProject;

public class PostMethod extends BaseClass {
	
	
	
	@Test
	public void addProj() throws Throwable
	{
	
		
		PostAddProject pojo=new PostAddProject("Abhi","Project1232"+jlib.randomAlphabet(),"Completed", 5);
		Response res = given()
				        .spec(requestspec)
		               .body(pojo)
		.when()
		.post(IPathConstants.createProject);
		
		String expData = rlib.getJsonData(res, "projectId");
		System.out.println(expData);
		
		String query = "select * from project";
		String actData = dlib.executeQuery(query, 1, expData);
		
		System.out.println(actData);
		Assert.assertEquals(actData, expData);
		res.then().log().all();
		
		
	}

}
