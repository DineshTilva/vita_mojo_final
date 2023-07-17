package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import POJO.SignIn;
import POJO.SignUp;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;


import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredTest {

	
		@Test(groups= {"Demo"},priority=1)  
		@Parameters({"name","email","password","subscriptions","storeUUID","locale"}) 
		public void SignUpTest(String name,String email,String password,String subscriptions,String storeUUID,String locale)
		{
			RestAssured.baseURI = "https://vmos2.vmos-demo.com";
			
			SignUp signup = new SignUp();
			signup.setfirstName(name);
			signup.setEmail(email);
			signup.setPassword(password);
			String[] str = {subscriptions};
			signup.setSubscriptions(str);
			signup.setStoreUUID(storeUUID);
			signup.setLocale(locale);
			
			Gson gson = new Gson();
			String jsonString = gson.toJson(signup);
						
			Map<String, String> headerMap = new HashMap<String, String>();
			headerMap.put("Content-type", "application/json");
			headerMap.put("Tenant","582eaf39-7845-4e49-835c-a087032397fc");
					
			Response response = given()
					.headers(headerMap)
	                .and()
	                .body(jsonString)
	                .when()
	                .post("/user/v1/user")
	                .then()
	                .extract().response();
			
			Assertions.assertEquals(201, response.statusCode());
	       
		}
		
		
		@Test(groups= {"Demo"},priority=2)  
		@Parameters({"email","password"}) 
		public void SignInTest(String email,String password)
		{
			RestAssured.baseURI = "https://vmos2.vmos-demo.com";
			
			SignIn si = new SignIn();
			si.setEmail(email);
			si.setPassword(password);
			 
			Gson gson = new Gson();
			String jsonString = gson.toJson(si);
			
			Response response = given()
					.header("Content-type", "application/json")
	                .and()
	                .body(jsonString)
	                .when()
	                .post("/user/v1/auth")
	                .then()
	                .extract().response();
			
			Assertions.assertEquals(201, response.statusCode());
	        Assertions.assertEquals("HTTP/1.1 201 Created", response.getStatusLine());
	       
		}
}