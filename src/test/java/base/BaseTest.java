package base;

import io.restassured.RestAssured;
import utils.ConfigReader;

import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	@BeforeClass
	public void setUp() {
//		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		RestAssured.baseURI = ConfigReader.getProperty("baseUrl");
	}

}
