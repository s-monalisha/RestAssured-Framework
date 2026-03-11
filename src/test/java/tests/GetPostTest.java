package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.EndPoints;
import services.PostService;
import utils.LogManagerUtil;
import utils.RequestSpecBuilderUtil;
import utils.ResponseSpecBuilderUtil;


public class GetPostTest extends BaseTest{
	private static final Logger log = LogManagerUtil.getLogger(GetPostTest.class);
	
//	@Test
	public void getSinglePostTest1() {
		log.info("Getting API Post Requests");
		given()
		.spec(RequestSpecBuilderUtil.getRequestSpec())
//		.pathParam("id", 1)
		
		.when()
//		.get(EndPoints.GET_POST)     (Getting a Single post request)
		.get(EndPoints.POSTS)
		
		.then()
		.spec(ResponseSpecBuilderUtil.getResponseSpec(200))
		.log().all();
		log.info("Successfully getting all requests");
	}
	
	@Test(groups= {"smoke","get"})
	public void getSinglePostTest() {
		PostService.getPostById(1);
	}

}
