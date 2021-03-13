package practice;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;

import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testData.JsonPlaceHolderTestData;
public class GetRequest extends TestBaseJsonPlaceHolder{
	/*
	   When
	          I send a GET request to REST API URL https://jsonplaceholder.typicode.com/todos/123
	    Then
	          HTTP Status Code should be 200
	       And "Server" in Headers should be "cloudflare"
	       And response content type is "application/JSON"
	       And "userId" should be 5,
	       And "title" should be "excepturi a et neque qui expedita vel voluptate"
	      And "completed" should be false
	*/
	
	@Test
	public void get01() {
		spec.pathParams("todosPath","todos",
				"id","123");


 JsonPlaceHolderTestData expectedObj = new  JsonPlaceHolderTestData();
 Map<String,Object> expectedDataMap = expectedObj.setUp2();
 System.out.println(expectedDataMap);
 
 Response response = given().
		 				spec(spec).
		 			when().
		 				get("/{todosPath}/{id}");
 response.prettyPrint();
 
 




JsonPath json = response.jsonPath();
 
 assertEquals(expectedDataMap.get("server"), response.getHeader("server"));
 assertEquals(expectedDataMap.get("statusCode"), response.getStatusCode());
 assertEquals(expectedDataMap.get("userId"), json.getInt("userId"));
 assertEquals(expectedDataMap.get("title"), json.getString("title"));
 assertEquals(expectedDataMap.get("completed"), json.getBoolean("completed"));
//
//		
//		
//		
//		
		
		
		
	}

}
