package techproedenglish01.techproedenglish01api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.hamcrest.Matchers;
import org.junit.Test;
import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testData.JsonPlaceHolderTestData;


public class PatchRequestNt01 extends TestBaseJsonPlaceHolder{
/*
 When
            I send PATCH Request to the Url https://jsonplaceholder.typicode.com/todos/198
            with the PUT Request body like {
                                            "title": "Tidy your room",
                                           }
       Then 
           Status code is 200
           And response body is like  {
                                        "userId": 10,
                                        "title": "Tidy your room",
                                        "completed": true,
                                        "id": 198
                                      }
 */
	@Test
	public void patch01() {
		//1) Set the URL
				spec.pathParams("todosPath", "todos",
						        "id", 198);
						
				//2) Set the expected data
				JsonPlaceHolderTestData patchReqObj = new JsonPlaceHolderTestData();
		Map <String, Object> patchReqDataMap = patchReqObj.setUpPatchDataByUsingMap();
	//3) Send the request
		Response response = given().
				contentType(ContentType.JSON).
					spec(spec).
					body(patchReqDataMap).
					when().
					patch("/{todosPath}/{id}");
		response.prettyPrint();
	//4) Assert the things which are given in the test case
	
		//1.Way: body() + putReqDataMap ==> Homework
		response.then().assertThat().statusCode(patchReqObj.statusCode).
		body("title", Matchers.equalTo(patchReqDataMap.get("title")),
				"userId", Matchers.equalTo(patchReqObj.userId),
				"completed", Matchers.equalTo(patchReqObj.completed));
		
		
				//2.Way: JsonPath + patchReqDataMap ==> Homework
       JsonPath json = response.jsonPath();
		
		assertEquals(patchReqObj.statusCode, response.statusCode());
		assertEquals(patchReqDataMap.get("title"), json.getString("title"));
		assertEquals(patchReqObj.userId, json.getInt("userId"));
		assertEquals(patchReqObj.completed, json.getBoolean("completed"));
	
		
		
				//3.Way: GSON + patchReqDataMap + Soft Assertion
		Map <String, Object> actualDataMap = response.as(HashMap.class);
		assertEquals(patchReqObj.statusCode, response.getStatusCode());
		assertEquals(patchReqObj.userId, actualDataMap.get("userId"));
		assertEquals(patchReqDataMap.get("title"), actualDataMap.get("title"));
		assertEquals(patchReqObj.completed, actualDataMap.get("completed"));
		
				//4.Way : JsonPath + patchReqMap + HardAssertion
		
		
	
	
	
	}
	
	
}
