package assertionsValidations;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class TimeValidation {
	@Test
	public void time()
	{
		when()
		  .get("http://localhost:8084/projects")
		.then()
		 .assertThat().time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS);
	}

}
