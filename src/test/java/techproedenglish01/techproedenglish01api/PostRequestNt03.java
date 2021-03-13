package techproedenglish01.techproedenglish01api;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testData.JsonPlaceHolderTestData;

public class PostRequestNt03 extends TestBaseJsonPlaceHolder{
	/*
	 When 
            I send POST Request to the Url https://jsonplaceholder.typicode.com/todos
            with the request body {
                                    "userId": 55,
                                    "title": "Tidy your room",
                                    "completed": false
                                   }
        Then 
            Status code is 200
            And response body is like {
                                        "userId": 55,
                                        "title": "Tidy your room",
                                        "completed": false,
                                        "id": 201
                                      }     
	 */

	@Test
	public void post01() {
		//1) Set the URL
		spec.pathParam("todosPath", "todos");
		
		
	
		//2) Set the Request Body (JSON Object Class)
		JsonPlaceHolderTestData reqBodyObj = new JsonPlaceHolderTestData();
		JSONObject expectingDataJSONObject = reqBodyObj.setUpReqDataByUsingJSONObject();
		
		System.out.println(expectingDataJSONObject);
		
		
	//3) Send the request
		Response response = given().
				contentType(ContentType.JSON).//bazı api lerde gerek olmaz 
				spec(spec).
				auth().basic("admin","password123").//bunu yazmasan da olurdu çünkü bu api public
				body(expectingDataJSONObject.toString()).//tostring olacak burada 
			when().
				post("/{todosPath}");

         response.prettyPrint();
	//4) Assert the things which are given in the test case (GSON)
        Map <String, Object> actualDataMap =  response.as(HashMap.class);
        System.out.println(actualDataMap);
         
        SoftAssert softAssert= new SoftAssert();
		
		softAssert.assertEquals(actualDataMap.get("completed"), expectingDataJSONObject.get("completed"));
		softAssert.assertEquals(actualDataMap.get("title"), expectingDataJSONObject.get("title"));
		softAssert.assertEquals(actualDataMap.get("userId"), expectingDataJSONObject.get("userId"));
		
		softAssert.assertAll();
		

	}
	
	
}
