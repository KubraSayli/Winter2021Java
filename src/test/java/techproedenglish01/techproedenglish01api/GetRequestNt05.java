package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequestNt05 {
	
	/*
	 When 
	 	I send a GET request to REST API URL http://dummy.restapiexample.com/api/v1/employees   
	    And Accept type is “application/JSON”
	 Then 
	    HTTP Status Code should be 200
	    And Response format should be "application/JSON"
	    And there should be 24 employees
	    And "Ashton Cox" should be one of the employees
	    And 21, 61, and 23 should be among the employee ages
	 */
	
	@Test
	public void get01() {
		
	
		//1) Set the URL
	String url = "http://dummy.restapiexample.com/api/v1/employees";
	
	//2) Set the expected data (We will learn it later)
	//3) Send the request
	Response response = given().
							accept(ContentType.JSON).
						when().
							get(url);
	
	response.prettyPrint();
	
	//4) Assert the things which are given in the test case
	response.then().
			assertThat().
			statusCode(200).
			contentType(ContentType.JSON).
			body("data.id",hasSize(24),
			"data.employee_name", hasItem("Tiger Nixon"),
			"data.employee_age",hasItems("61","63","23"));
	}

}
