package assertionsValidations;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DynamicResponse {
	@Test
	public void dynamicValidation()
	{
		baseURI="http://localhost";
		port=8084;
		when()
		 .get("/projects")
		.then()
		 .log().body()
		 .assertThat().body("[5].projectName", Matchers.equalTo("Cinema"))
		 .body("projectName", Matchers.hasItems("HMSHM894","Elite2961","Portugal1","VarisuVarasudu1"));
  	}

}
