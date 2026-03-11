package schemaValidation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;

public class SchemaValidationTest {
	
	@Test
	public void validatePostSchema() {
		given()
		
		.when()
		.get("https://jsonplaceholder.typicode.com/posts/1")
		
		.then()
		.statusCode(200)
		.body(matchesJsonSchemaInClasspath("schemas/postSchema.json"));
		
	}

}
