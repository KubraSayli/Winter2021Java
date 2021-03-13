package testData;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;



public class JsonPlaceHolderTestData {
	
	public int statusCode = 200;//status code için variable mantıklı
	public int userId = 10;//ama bunlar için map yapsan daha iyi olur
	public boolean completed = true;//final yaparsan kimse değiştriemez
	
	public HashMap <String, Object> expectedDataMap;
	

	public HashMap<String, Object> setUpData() {
		
		expectedDataMap = new HashMap <String , Object>();	
		expectedDataMap.put("StatusCode", 200);
		expectedDataMap.put("completed", false);
		expectedDataMap.put("userId", 3);
		expectedDataMap.put("title", "nam qui rerum fugiat accusamus");
		expectedDataMap.put("headerVia", "1.1 vegur");
		expectedDataMap.put("Server", "cloudflare");
		
		return expectedDataMap;
		
	}
	
	public JSONObject setUpReqDataByUsingJSONObject(){
		JSONObject reqBodyJSONObject = new JSONObject();
		reqBodyJSONObject.put("userId", 55);
		reqBodyJSONObject.put("title", "Tidy your room");
		reqBodyJSONObject.put("completed", false);
		
		return reqBodyJSONObject;
	}
	
		public Map<String, Object> setUpPutDataByUsingMap(){
		
		Map<String, Object> putReqBodyMap = new HashMap<>();
		
		putReqBodyMap.put("userId", 10);
		putReqBodyMap.put("title", "Wash the dishes");
		putReqBodyMap.put("completed", false);
		
		return putReqBodyMap;
	}
		
		public Map<String, Object> setUpPatchDataByUsingMap(){
			
			Map<String, Object> patchReqBodyMap = new HashMap<>();
			
			patchReqBodyMap.put("title", "Tidy your room");
			
			return patchReqBodyMap;
		}
		
		public JSONObject setUpDeleteDataByUsingJasonObject() {
			
			JSONObject expectedDataJSONObject = new JSONObject();
			expectedDataJSONObject.put("statuscode", 200);
			
			return expectedDataJSONObject;
			
		}
		
		public Map<String, Object> setUp2 (){
			Map<String, Object> getReqMap = new HashMap();
			getReqMap.put("userId", 7);
			getReqMap.put("title", "esse et quis iste est earum aut impedit");
			getReqMap.put("completed", false);
			getReqMap.put("server", "cloudflare");
			getReqMap.put("content type", "application/JSON");
			getReqMap.put("statusCode", 200);
			
			return getReqMap;
			
			
		}
	
	

}
