package services;

import constants.EndPoints;
import models.Post;
import utils.RequestSpecBuilderUtil;

import static io.restassured.RestAssured.*;

public class PostService {

	public static void createPost(Post payload) {
		given()
		.spec(RequestSpecBuilderUtil.getRequestSpec())
		.body(payload)
		
		.when()
		.post(EndPoints.POSTS)
		
		.then()
		.log().all();
		
	}
	
	public static void getPostById(int id) {
		given()
		.spec(RequestSpecBuilderUtil.getRequestSpec())
		.pathParam("id", id)
		
		.when()
		.get(EndPoints.GET_POST)
		
		.then()
		.log().all();
	}

}
