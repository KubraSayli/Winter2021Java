package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testData.JsonPlaceHolderTestData;
public class PutRequestNt01 extends TestBaseJsonPlaceHolder {
	
	/*
	   When
	 		I send PUT Request to the Url https://jsonplaceholder.typicode.com/todos/198
	 		with the PUT Request body like {
										    "userId": 21,
										    "title": "Wash the dishes",
										    "completed": false
										   }
	   Then 
	   	   Status code is 200
	   	   And response body is like   {
									    "userId": 21,
									    "title": "Wash the dishes",
									    "completed": false,
									    "id": 198
									   }
	 */
	
	@Test
	public void put01() {
		
		//1) Set the URL
		spec.pathParams("todosPath", "todos",
				        "id", 198);
		
		//2) Set the expected data
		JsonPlaceHolderTestData putReqObj = new JsonPlaceHolderTestData();
		Map<String, Object> putReqDataMap = putReqObj.setUpPutDataByUsingMap();
		
		
		//3) Send the request
		Response response = given().
				                contentType(ContentType.JSON).
								spec(spec).
								body(putReqDataMap).
							when().
								put("/{todosPath}/{id}");
		response.prettyPrint();
		
		
		//4) Assert the things which are given in the test case
		//1.Way: body() + putReqDataMap ==> Homework
		
		response.then().assertThat().statusCode(putReqObj.statusCode).body("userId", Matchers.equalTo(putReqObj.setUpPutDataByUsingMap().get("userId")),
				"title", Matchers.equalTo(putReqObj.setUpPutDataByUsingMap().get("title")),
				"completed", Matchers.equalTo(putReqObj.setUpPutDataByUsingMap().get("completed")));
		//2.Way: JsonPath + putReqDataMap ==> Homework
		JsonPath json = response.jsonPath();
		
		assertEquals(putReqObj.statusCode, response.getStatusCode());
		assertEquals(putReqDataMap.get("userId"), json.getInt("userId"));
		assertEquals(putReqDataMap.get("title"), json.getString("title"));
		assertEquals(putReqDataMap.get("completed"), json.getBoolean("completed"));
		//3.Way: GSON + putReqDataMap + Soft Assertion
		
		Map<String, Object> actualDataMap = response.as(HashMap.class);
		System.out.println(actualDataMap);
		
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualDataMap.get("completed"), putReqDataMap.get("completed"));
		softAssert.assertEquals(actualDataMap.get("userId"), putReqDataMap.get("userId"));
		softAssert.assertEquals(actualDataMap.get("title"), putReqDataMap.get("title"));
		softAssert.assertAll();
	
	}
}