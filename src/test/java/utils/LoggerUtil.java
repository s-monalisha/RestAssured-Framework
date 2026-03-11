package utils;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class LoggerUtil {
	
	public static RequestLoggingFilter requestLogger() {
		return new RequestLoggingFilter();
	}
	
	public static ResponseLoggingFilter responseLogger() {
		return new ResponseLoggingFilter();
	}

}
