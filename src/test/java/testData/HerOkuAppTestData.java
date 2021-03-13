package testData;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class HerOkuAppTestData {
	
	public int statusCode = 200;
	
	Map<String, String> bookingDatesMap = new HashMap<>();
	Map<String, Object> bookingDetailsMap = new HashMap<>();
	
	
	public Map<String, Object> setUpData(){ 
	bookingDatesMap.put("checkin", "2020-02-20");
	bookingDatesMap.put("checkout", "2020-02-20");
	
	bookingDetailsMap.put("firstname", "Sally");
	bookingDetailsMap.put("lastname", "Brown");
	bookingDetailsMap.put("totalprice", 517);
	bookingDetailsMap.put("depositpaid", true);
	bookingDetailsMap.put("bookingdates", bookingDatesMap);
	
	return bookingDetailsMap;
	
	}
	
	public JSONObject setUpDataJSONObject() {
		
		JSONObject bookingDatesJSONObject = new JSONObject();
		bookingDatesJSONObject.put("checkin", "2020-09-09");
		bookingDatesJSONObject.put("checkout", "2020-09-21");
		
		JSONObject bookingDetailsJSONObject = new JSONObject();
		bookingDetailsJSONObject.put("firstname", "Selim");
		bookingDetailsJSONObject.put("lastname", "Ak");
		bookingDetailsJSONObject.put("totalprice", "11111");
		bookingDetailsJSONObject.put("depositpaid", true);
		
		bookingDetailsJSONObject.put("bookingdates", bookingDatesJSONObject);
		
		return bookingDetailsJSONObject; //Her zaman outer a return et
		
	}
	
	public Map<String, Object> setUpData2(){ 
		bookingDatesMap.put("checkin", "2020-05-20");
		bookingDatesMap.put("checkout", "2020-09-26");
		
		bookingDetailsMap.put("firstname", "Eric");
		bookingDetailsMap.put("lastname", "Brown");
		bookingDetailsMap.put("totalprice", 844);
		bookingDetailsMap.put("depositpaid", false);
		bookingDetailsMap.put("bookingdates", bookingDatesMap);
		bookingDetailsMap.put("additionalneeds", "Breakfast");
		
		return bookingDetailsMap;
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
