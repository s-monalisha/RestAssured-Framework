package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.EndPoints;


public class GetUsersTest extends BaseTest{

	@Test 
	void getsUsers() {
		given()
		
		.when()
		.get(EndPoints.USERS)
		
		.then()
		.statusCode(200)
		.log().all();
	}
}
