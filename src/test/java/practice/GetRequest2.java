//package practice;
//
//import static org.junit.Assert.assertEquals;
//import static io.restassured.RestAssured.given;
//import java.util.Map;
//
//import org.junit.Test;
//
//import TestBaseNtUrls.TestBaseHerOkuApp;
//import io.restassured.http.ContentType;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import testData.HerOkuAppTestData;
//
//public class GetRequest2 extends TestBaseHerOkuApp{
//	/*
//	   /*
//	    * When I send a GET request to REST API URL
//	    * https://restful-booker.herokuapp.com/booking/7
//	    * Then HTTP Status Code should be 200
//	    * And response content type is "application/JSON"
//	    * And response body should be like;
//	    * {
//	{
//	    "firstname": "Eric",
//	    "lastname": "Brown",
//	    "totalprice": 844,
//	    "depositpaid": false,
//	    "bookingdates": {
//	        "checkin": "2020-05-20",
//	        "checkout": "2020-09-26"
//	    },
//	    "additionalneeds": "Breakfast"
//	}
//	    */
//
//@Test
//public void get01() {
//	
//	spec.pathParams("bookingPath", "booking",
//					"id", 7);
//	
//	HerOkuAppTestData expectedObj = new  HerOkuAppTestData();
//	 Map<String,Object> expectedDataMap = expectedObj.setUpData2();
//	 System.out.println(expectedDataMap);
//	 
//	 Response response = given().accept(ContentType.JSON).spec(spec).when().get("/{bookingPath}/{id}");
//	 
//	 JsonPath json = response.jsonPath();
//	 
//	 assertEquals(expectedDataMap.get("firstname"), json.getString("firstname"));
//	 assertEquals(expectedDataMap.get("statusCode"), response.statusCode();
//	 assertEquals(expectedDataMap.get("totalprice"), json.getInt("totalprice"));
//	 assertEquals(expectedDataMap.get("additionalneeds"), json.getString("additionalneeds"));
//	 assertEquals(expectedDataMap.get("bookingdates"), json.get("bookingdates"));
//	
//}
//
//
//
//
//
//}
