package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.EndPoints;
import dataproviders.PostDataProvider;
import listeners.TestListener;
import models.Post;
import payloads.PayloadBuilder;
import services.PostService;
import utils.LogManagerUtil;
import utils.RequestSpecBuilderUtil;
import utils.ResponseSpecBuilderUtil;

public class CreatePostTest extends BaseTest{ 
	
	private static final Logger log = LogManagerUtil.getLogger(CreatePostTest.class);
	
	@Test(groups ={"smoke","post"})
	void postTestCreate() {
//		Post payload = new Post();
//		payload.setTitle("API Testing");
//		payload.setBody("Learning Rest Assured FrameWork");
//		payload.setUserId(1);
		
		log.info("Starting post Api");
		
		Post payload = PayloadBuilder.createPostPayload();
		
		given()
//		.contentType("application/json")
		.spec(RequestSpecBuilderUtil.getRequestSpec())
		.body(payload)
		
		.when()
		.post(EndPoints.POSTS)
//		.post("https://jsonplaceholder.typicode.com/posts")
		
		.then()
//		.statusCode(201)
		.spec(ResponseSpecBuilderUtil.getResponseSpec(201))
		.log().all();
		
		log.info("Completed Post API");
	}
	
//	@Test(dataProvider="postdata", dataProviderClass = PostDataProvider.class)
	public void dataProviderPostTest(String title, String body, int userId) {
		Post payload = new Post();
		payload.setTitle(title);
		payload.setBody(body);
		payload.setUserId(userId);
		
		PostService.createPost(payload);
		
	}
}
