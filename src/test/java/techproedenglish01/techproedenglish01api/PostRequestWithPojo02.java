package techproedenglish01.techproedenglish01api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import TestBaseNtUrls.TestBaseHerOkuApp;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.BookingDatesPojo;
import pojos.BookingPojo;
import pojos.BookingResponsePojo;

public class PostRequestWithPojo02 extends TestBaseHerOkuApp {
	/*
 	When 
 		I send POST Request to the URL https://restful-booker.herokuapp.com/booking
 		with Post Request body  {
								    "firstname": "Alp",
								    "lastname": "Sun",
								    "totalprice": 888,
								    "depositpaid": false,
								    "bookingdates": {
								        "checkin": "2021-01-07",
								        "checkout": "2021-01-25"
								    }
								}
 	Then 
 		Status code is 200
 		And response body is like {
								    "bookingid": 13,
								    "booking": {
								        "firstname": "Alp",
								        "lastname": "Sun",
								        "totalprice": 888,
								        "depositpaid": false,
								        "bookingdates": {
								            "checkin": "2021-01-07",
								            "checkout": "2021-01-25"
								        }
								     }
								  }
 	
	 */

	@Test
	public void postPojo01() {
		//Set the URL
		
		spec.pathParam("bookingPath", "booking");
		
		//Set the expected data 
		BookingDatesPojo bookingdates = new BookingDatesPojo("2021-01-07", "2021-01-25");
		BookingPojo ExpectedBooking = new BookingPojo("Alp", "Sun", 888, false, bookingdates);
		
		//Send Request
		Response response = given().
								contentType(ContentType.JSON).
								spec(spec).
								body(ExpectedBooking).
							when().
								post("/{bookingPath}");
		
		response.prettyPrint();
		
		//Assert
		//1.Way : body() + booking Pojo ==> HW
		//2.Way: JsonPath + booking Pojo ==>hw
		
		//3.Way: GSON + booking Pojo
		//Following codes give error because BookingPojo format is different from response body format.
		//If you see that kind of issue , you have two options 1)Stop using Pojo+GSON, proceed with JsonPath
															//2)Create new Pojo Classes for the response body.
		
	//	BookingPojo actualBooking = response.as(BookingPojo.class);
	//	System.out.println(actualBooking);
		
		BookingResponsePojo actualBooking = response.as(BookingResponsePojo.class);
	//	System.out.println(actualBooking);
		
		
		assertEquals(ExpectedBooking.getFirstname(),actualBooking.getBooking().getFirstname());
		assertEquals(ExpectedBooking.getLastname(),actualBooking.getBooking().getLastname());
		assertEquals(ExpectedBooking.getTotalprice(),actualBooking.getBooking().getTotalprice());
		assertEquals(ExpectedBooking.isDepositpaid(),actualBooking.getBooking().isDepositpaid());
		assertEquals(ExpectedBooking.getBookingdates(),actualBooking.getBooking().getBookingdates().getCheckin());
		
		
		
	}
	

}
