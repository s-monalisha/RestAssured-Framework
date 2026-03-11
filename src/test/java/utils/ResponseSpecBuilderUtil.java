package utils;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecBuilderUtil {
	
//	private static ResponseSpecification resspec;
	public static ResponseSpecification getResponseSpec(int statusCode) {
//		if(resspec == null) {
//			resspec = new ResponseSpecBuilder()
			return new ResponseSpecBuilder()
					.expectStatusCode(statusCode)
					.expectContentType(ContentType.JSON)
					.expectResponseTime(lessThan(5000L))
					.build();
//		}
//		return resspec;
	}

}
