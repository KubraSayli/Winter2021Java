package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import TestBaseNtUrls.TestBaseDummy;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testData.DummyTestData;

public class DeleteRequest01 extends TestBaseDummy{
	/*When
    I send DELETE Request to the Url http://dummy.restapiexample.com/api/v1/delete/2            
Then 
    Status code is 200
    And Response body is {
                            "status": "success",
                            "data": "2",
                            "message": "Successfully! Record has been deleted"
                        }     
                        
                         */
	
	@Test
	public void delete01() {
		//Set the url 
		spec.pathParams("deletePath","delete",
				"id",2);
		
		//Set the expected data 
		DummyTestData expectedDataObj = new DummyTestData();
		Map<String, Object> expectedDataMap = expectedDataObj.setUpExpectedDeleteDataByUsingMap();
		
		
		//Create delete request
		Response response = given().
								spec(spec).
							when().
								delete("/{deletePath}/{id}");
		response.prettyPrint();
		
		//Do assertion
		//1.Way: body() + expectedDataMap + Hard Assertion 
		response.
			then().
			assertThat().
			statusCode(200).
			body("status", Matchers.equalTo(expectedDataMap.get("status")),
					"data", Matchers.equalTo(expectedDataMap.get("data")),
					"message", Matchers.equalTo(expectedDataMap.get("message")));
	
		//2. Way : JsonPath + expectedDataMap + Hard Assertion 
		
		JsonPath json = response.jsonPath();
		
		assertEquals(expectedDataMap.get("statusCode"), response.getStatusCode());
		assertEquals(expectedDataMap.get("status"), json.getString("status"));
		assertEquals(expectedDataMap.get("data"), json.getString("data"));
		assertEquals(expectedDataMap.get("message"), json.getString("message"));
		
		//3. Way : GSON + expectedDataMap + Soft Assertion 
		Map<String, String> actualDataMap = response.as(HashMap.class);
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(response.getStatusCode(), expectedDataMap.get("statusCode"));
		softAssert.assertEquals(actualDataMap.get("status"), expectedDataMap.get("status"));
		softAssert.assertEquals(actualDataMap.get("data"), expectedDataMap.get("data"));
		softAssert.assertEquals(actualDataMap.get("message"), expectedDataMap.get("message"));
		
		
		softAssert.assertAll();
		
		
	}
	
	
}
