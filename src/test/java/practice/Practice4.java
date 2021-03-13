package practice;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TestBaseNtUrls.TestBaseHerOkuApp;
import io.restassured.response.Response;
import testData.HerOkuAppTestData;

public class Practice4 extends TestBaseHerOkuApp {

	/*
    When
       I send GET Request to https://restful-booker.herokuapp.com/booking/1
    Then
       Response body should be like that;
       {
    "firstname": "Eric",
    "lastname": "Jones",
    "totalprice": 131,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2020-03-06",
        "checkout": "2020-08-23"
    }
}
 */
	
	@Test
	
	public void get01() {
		spec.pathParams("bookingPath", "booking",
						"id", 1);
		
	HerOkuAppTestData expectedDataObj = new HerOkuAppTestData();
	Map <String, Object> expectedDataMap = expectedDataObj.setUpData();
	
	Response response = given().spec(spec).when().get("/{bookingPath}/{id}");
	response.prettyPrint();	
	
	Map<String, Object> actualDataMap = response.as(HashMap.class);
	
	assertEquals(expectedDataObj.statusCode, response.getStatusCode());
	assertEquals(expectedDataMap.get("firstname"), actualDataMap.get("firstname"));
	assertEquals(expectedDataMap.get("lastname"), actualDataMap.get("lastname"));
	assertEquals(expectedDataMap.get("totalprice"), actualDataMap.get("totalprice"));
	assertEquals(expectedDataMap.get("depositpaid"), actualDataMap.get("depositpaid"));
	assertEquals(expectedDataMap.get("depositpaid"), actualDataMap.get("depositpaid"));
	assertEquals(((Map)expectedDataMap.get("bookingdates")).get("checkin"), ((Map)actualDataMap.get("bookingdates")).get("checkin"));	
	assertEquals(((Map)expectedDataMap.get("bookingdates")).get("checkout"), ((Map)actualDataMap.get("bookingdates")).get("checkout"));	
	}
}
