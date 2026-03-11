package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.EndPoints;
import listeners.TestListener;
import models.Post;
import payloads.PayloadBuilder;
import utils.LogManagerUtil;
import utils.RequestSpecBuilderUtil;
import utils.ResponseSpecBuilderUtil;

public class UpdatePostTest extends BaseTest{
	private static final Logger log = LogManagerUtil.getLogger(UpdatePostTest.class);
	@Test(groups= {"regression","put"})
	public void updateTestPost() {
		log.info("Starting Update Api post");
		Post payload = PayloadBuilder.updatePostPayload();
		
		given()
		.spec(RequestSpecBuilderUtil.getRequestSpec())
		.pathParam("id", 1)
		.body(payload)
		
		.when()
		.put(EndPoints.GET_POST)
		
		.then()
		.spec(ResponseSpecBuilderUtil.getResponseSpec(200))
		.log().all();
		
		log.info("Completed update post request");
	}

}
