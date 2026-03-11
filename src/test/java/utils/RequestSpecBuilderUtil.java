package utils;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RequestSpecBuilderUtil {
	
	private static RequestSpecification reqspec;
	public static RequestSpecification getRequestSpec() {
		if(reqspec == null) {
			reqspec = new RequestSpecBuilder()
					
					.setBaseUri(ConfigReader.getProperty("baseUrl"))
					.setContentType(ContentType.JSON)
					.addHeader("Accept", "application/json")
					.addFilter(LoggerUtil.requestLogger())
					.addFilter(LoggerUtil.responseLogger())
					.build();
		}
		
		return reqspec;
	}

}
