package Utility;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredMethod {
	
	public Response PostMethod(String URI,String Path,Map<String,String> headerMap,String jsonString)
	{
		RestAssured.baseURI = URI;
		
		Response response = given()
				.headers(headerMap)
                .and()
                .body(jsonString)
                .when()
                .post(Path)
                .then()
                .extract().response();
		
		return response;
	}

}
