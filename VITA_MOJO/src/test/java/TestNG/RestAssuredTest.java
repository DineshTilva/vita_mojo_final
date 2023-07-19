package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import POJO.SignIn;
import POJO.SignUp;
import Utility.RestAssuredMethod;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;


import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredTest {

		RestAssuredMethod RAMethod = new RestAssuredMethod();
	
		@Test(dataProvider = "data-provider", dataProviderClass = DataSource.class,groups= {"Demo"},priority=1)  
		public void SignUpTest(String URI,String Path,String Contenttype,String Tenant,String name,String email,String password,String subscriptions,String storeUUID,String locale,String StatusCode)
		{
			
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
			if (!Contenttype.equals(""))
				headerMap.put("Content-type", Contenttype);
			if (!Tenant.equals(""))
				headerMap.put("Tenant",Tenant);
			
			Response response = RAMethod.PostMethod(URI,Path,headerMap,jsonString);
			Assertions.assertEquals(Integer.parseInt(StatusCode), response.statusCode());
	 		
		}
		
		
		@Test(dataProvider = "data-provider", dataProviderClass = DataSource.class,groups= {"Demo"},priority=2)  
		public void SignInTest(String URI,String Path,String Contenttype,String Tenant,String name,String email,String password,String subscriptions,String storeUUID,String locale,String StatusCode)
		{
			
			SignIn si = new SignIn();
			si.setEmail(email);
			si.setPassword(password);
			 
			Gson gson = new Gson();
			String jsonString = gson.toJson(si);
			
			Map<String, String> headerMap = new HashMap<String, String>();
			if (!Contenttype.equals(""))
				headerMap.put("Content-type", Contenttype);
			
			
			Response response = RAMethod.PostMethod(URI,Path,headerMap,jsonString);
			
			Assertions.assertEquals(Integer.parseInt(StatusCode), response.statusCode());
	  		
		}
}
