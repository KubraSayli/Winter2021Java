package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;

import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.response.Response;
import testData.JsonPlaceHolderTestData;

public class DeleteResponse02 extends TestBaseJsonPlaceHolder{
	
	/*
	 When
	 		I send DELETE Request to the Url https://jsonplaceholder.typicode.com/todos/198
	 	Then Status code is 200
	 	And Response body is {}
	 */
	
	
	
	@Test
	public void delete01() {
		//Set the url 
		spec.pathParams("todosPath","todos",
				"id",198);
		
		//Set the expected data 
		JsonPlaceHolderTestData expectedJSONObjectObj = new JsonPlaceHolderTestData();
		JSONObject expectedDataJSONObject = expectedJSONObjectObj.setUpDeleteDataByUsingJasonObject();
		
		
		
		//Send the delete request
		Response response = given().
								spec(spec).
							when().
								delete("/{todosPath}/{id}");
		response.prettyPrint();
		
		System.out.println(expectedDataJSONObject.length()-1);
		
		//Assert
		//1.Way
		response.
			then().
		assertThat().
			statusCode(expectedDataJSONObject.getInt("statuscode"));
		
		Map<String, Object> actualDataMap = response.as(HashMap.class);
		
		assertEquals(expectedDataJSONObject.length()-1, actualDataMap.size());
		
		
		
		
		

}
}