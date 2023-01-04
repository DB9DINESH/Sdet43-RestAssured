package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BearerToken {
	@Test
	public void bearer()
	{
		given()
		 .auth().oauth2("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")
		.when()
		  .get("https://api.github.com/users/DB9DINESH/repos")
		.then()
		  .log().body();
	}

}
