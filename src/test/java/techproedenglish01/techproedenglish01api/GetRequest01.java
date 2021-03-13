package techproedenglish01.techproedenglish01api;
   import org.junit.Test;
   import io.restassured.response.Response;
   import static io.restassured.RestAssured.*;

public class GetRequest01 {
	
	/*
	 If you use "Given", "When", "Then", "And" to create scenarios, it means you re using
	            "Gherkin Language"
	 "Given":It declares prerequites
	 "When":It defines action which user will perform 
	 "Then" : Talk about outputs
	 "And":In any part if you have multiple things use "And" between them 
	 */

	/*
	 * 					Positive Scenario 
	   Given
	   	I got URL
	 * When 
	 * 	I send a GET Request to the URL https://restful-booker.herokuapp.com/booking/3 
	 * (And
	 * 	I will print sth) -> when den sonra da and gelebilir 
	 * Then 
	 * 	HTTP Status code should be 200 
	 * And 
	 * 	Content type should be JSON 
	 * And 
	 * 	Status Line should be HTTP/1.1 200 OK
	 */
	
	@Test
	public void get01(){
		
		// 1) Set the URL 
		String url = "https://restful-booker.herokuapp.com/booking/3 ";
		
		// 2) Set the expected data (We will learn it later)
		
		// 3) Send the request (like clicking on send button on postman)
		Response response = given().
				//If you accept ("application/json, it means you want to response in JSON format.
								accept("application/json").
							when().
								get(url);
		
		response.prettyPrint();
		// 4) Assert the things which are given in the test case (Like checking status code, reponse body etc. on Postman)
		//Note: If execution stops after first error it is called HARD ASSERTION (kesin gelirmiş interview de)
		//Note: If execution doesn't stop for any error , it is called "SOFT ASSERTION".
		// 		If you use "Soft Assertion", assertion code will be executed then you will get report
		//		for all errors.
		
		//Following syntax is "Hard Assertion" every time. 
		response.
			then().
			assertThat().
			statusCode(200).
			contentType("Application/json").
			statusLine("HTTP/1.1 200 OK");
		
		//How to print content-type, status code, status line, etc. on the console.
		System.out.println(response.getContentType());//application/json; charset=utf-8
		System.out.println(response.getStatusLine());//HTTP/1.1 200 OK
		System.out.println(response.getStatusCode());//200
		System.out.println(response.getTime());//3316
		System.out.println(response.getHeaders());
		
	}
	
	
	
	
	
	
	

}
