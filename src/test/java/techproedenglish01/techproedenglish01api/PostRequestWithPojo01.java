package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import TestBaseNtUrls.TestBaseJsonPlaceHolder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.TodosPojo;

public class PostRequestWithPojo01 extends TestBaseJsonPlaceHolder {

	/*
	 When 
            I send POST Request to the URL https://jsonplaceholder.typicode.com/todos
            with Post Request body  {
                                        "userId": 21,
                                        "id": 201,
                                        "title": "Tidy your room",
                                        "completed": false
                                      }
        Then 
            Status code is 201
            And response body is like {
                                        "userId": 21,
                                        "id": 201,
                                        "title": "Tidy your room",
                                        "completed": false
                                      }
	 							
	 */
	
	
	@Test
	public void postPojo01() {
		
		//Set the URL
		spec.pathParam("todosPath", "todos");
		
		//Set the Expected Data 
		TodosPojo expectedPojoData = new TodosPojo(21, 201, "Tidy your room", false);
		
		//Send Request
		Response response = given().
								contentType(ContentType.JSON).
								spec(spec).
								body(expectedPojoData).
							when().
								post("/{todosPath}");
		response.prettyPrint();
		
		//Assert
		//1. Way : body() + Pojo Class
		response.
			then().
			assertThat().
			statusCode(201).body("userId", Matchers.equalTo(expectedPojoData.getUserId()),
					"id", Matchers.equalTo(expectedPojoData.getId()),
							"title", Matchers.equalTo(expectedPojoData.getTitle()),
							"completed", Matchers.equalTo(expectedPojoData.isCompleted()));		
		
		//2.Way : JsonPath + Pojo Class + Hard Assertion  ==>HW
		
		
		//3.Way : GSON + Pojo Class + Soft Assertion
		TodosPojo actualPojoData = response.as(TodosPojo.class);
		
		//System.out.println(actualPojoData);  //toString sayesinde yazabildik tostring olmasaydı hashcode yazardı. 
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualPojoData.getUserId(), expectedPojoData.getUserId());
		softAssert.assertEquals(actualPojoData.getId(), expectedPojoData.getId());
		softAssert.assertEquals(actualPojoData.getTitle(), expectedPojoData.getTitle());
		softAssert.assertEquals(actualPojoData.isCompleted(), expectedPojoData.isCompleted());
		
		softAssert.assertAll();
		
		
		
	}
	
	
	
}
