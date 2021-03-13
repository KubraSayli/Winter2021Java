package techproedenglish01.techproedenglish01api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import TestBaseNtUrls.TestBaseHerOkuApp;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRequestNt08 extends TestBaseHerOkuApp{
/*
 When 
            I send a GET request to REST API URL https://restful-booker.herokuapp.com/booking/5 
      Then 
          HTTP Status Code should be 200
          And response content type is “application/JSON” 
          And response body should be like; 
          { "firstname": "Sally", 
            "lastname": "Ericsson", 
            "totalprice": 111,
            "depositpaid": false, 
            "bookingdates": { "checkin": "2017-05-23", 
                              "checkout":"2019-07-02" }
          }
          
          

 */
	@Test
	public void get01() {
		
		//1) Set the URL
		spec.pathParams("bookingPath", "booking",
				         "id",5);
		
		//2) Set the expected data (We will learn it later)
		//3) Send the request
		
		Response response = given().
								spec(spec).
							when().
								get("/{bookingPath}/{id}");
		response.prettyPrint();
		//4) Assert the things which are given in the test case
		//1.st way: 
//		response.
//			then().
//			assertThat().
//			statusCode(200).
//			contentType(ContentType.JSON).
//			body("firstname", equalTo("Jim"), 
//					"lastname", equalTo("Wilson"),
//					"totalprice", equalTo(442),
//					"depositpaid", equalTo(true),
//					"bookingdates.checkin", equalTo("2016-04-07"),
//					"bookingdates.checkout", equalTo("2019-01-12"),
//					"additionalneeds", equalTo("Breakfast")
//					);
		
		//2.way: Use JsonPath Class: We use Json Path class to navigate in Json data. 
		JsonPath json = response.jsonPath();
//		
//		assertEquals("First name is not matching", "Eric", json.getString("firstname"));
//		assertEquals("Ericsson", json.getString("lastname"));
//		assertEquals(633, json.getInt("totalprice"));			
//		assertEquals(false, json.getBoolean("depositpaid"));		
//		assertEquals("2016-06-07", json.getString("bookingdates.checkin"));
//		assertEquals("2016-07-27", json.getString("bookingdates.checkout"));
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(json.getString("firstname"),"Mary");
		softAssert.assertEquals(json.getString("lastname"),"Ericsson");
		softAssert.assertEquals(json.getInt("totalprice"), 825,"Total price did not match");
		softAssert.assertEquals(json.getBoolean("depositpaid"),false);
		softAssert.assertEquals(json.getString("bookingdates.checkin"),"2016-06-07");
		softAssert.assertEquals(json.getString("bookingdates.checkout"),"2016-07-27");
		
		softAssert.assertAll();
		
		
	}
	
}
