package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.EndPoints;
import listeners.TestListener;
import utils.LogManagerUtil;
import utils.RequestSpecBuilderUtil;
import utils.ResponseSpecBuilderUtil;

public class DeletePostTest extends BaseTest{
	private static final Logger log = LogManagerUtil.getLogger(DeletePostTest.class);

	@Test(groups= {"regression","delete"})
	public void deletePostTest() {
		log.info("Starting Delete Process");
		
		given()
		.spec(RequestSpecBuilderUtil.getRequestSpec())
		.pathParam("id", 1)
		
		.when()
		.delete(EndPoints.GET_POST)
		
		.then()
		.spec(ResponseSpecBuilderUtil.getResponseSpec(200))
		.log().all();
		
		log.info("Succesfully completed Delete API Post");
	}
}
