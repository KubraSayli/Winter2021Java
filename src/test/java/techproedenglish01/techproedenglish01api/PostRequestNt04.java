package techproedenglish01.techproedenglish01api;

import java.util.Map;
import org.hamcrest.Matchers;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import TestBaseNtUrls.TestBaseAgroMonitoring;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testData.AgroMonitoringTestDataNt;
public class PostRequestNt04 extends TestBaseAgroMonitoring {
	
	/*
	 When 
		 I send POST Request to the Url "http://api.agromonitoring.com/agro/1.0/polygons?appid=f4ffe3b2ef1fcb3600ab1d7fbc88c2f0"
		 with the Request Body like  {
										   "name":"Polygon Sample",
										   "geo_json":{
										      "type":"Feature",
										      "properties":{},
										      "geometry":{
										         "type":"Polygon",
										         "coordinates":[
										            [
										               [-121.1958,37.6683],
										               [-121.1779,37.6687],
										               [-121.1773,37.6792],
										               [-121.1958,37.6792],
										               [-121.1958,37.6683]
										            ]
										         ]
										      }
										   }
										}
	Then
		Assert Status Code (201) 
		And Response Body should be like {
										    "id": "5fd8c383714b523b2ce1f154",
										    "geo_json": {
										        "geometry": {
										            "coordinates": [
										                [
										                    [
										                        -121.1958,
										                        37.6683
										                    ],
										                    [
										                        -121.1779,
										                        37.6687
										                    ],
										                    [
										                        -121.1773,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6792
										                    ],
										                    [
										                        -121.1958,
										                        37.6683
										                    ]
										                ]
										            ],
										            "type": "Polygon"
										        },
										        "type": "Feature",
										        "properties": {
										            
										        }
										    },
										    "name": "Polygon Sample",
										    "center": [
										        -121.1867,
										        37.67385
										    ],
										    "area": 190.9484,
										    "user_id": "5fd8c02a3da20c000759e0f8",
										    "created_at": 1608041347
										}
	 */
	@Test
	public void post01() {
		
		//1) Set the URL
		spec.pathParams("agroPath", "agro",
				        "id", 1.0,
				        "polygonsPath", "polygons").
		     queryParam("appid", "f4ffe3b2ef1fcb3600ab1d7fbc88c2f0");
		//2) Set the expected data
		AgroMonitoringTestDataNt postReqObj = new AgroMonitoringTestDataNt();
		Map<String, Object> postReqBodyMap = postReqObj.postReqBodySetUp();
			
		//3) Send the request
		Response response = given().
								contentType(ContentType.JSON).
								spec(spec).
								body(postReqBodyMap).
							when().
								post("/{agroPath}/{id}/{polygonsPath}");
		
		response.prettyPrint();
		
		//4) Assert the things which are given in the test case
		//body() and postReqBodyMap
		response.
			then().
			assertThat().
			statusCode(201).
			body("geo_json.geometry.coordinates[0][1][0]", 
					Matchers.equalTo(postReqObj.coordinates[0][1][0]),
				 "geo_json.geometry.coordinates[0][1][1]", 
					Matchers.equalTo(postReqObj.coordinates[0][1][1]),
				 "geo_json.geometry.type",
				    Matchers.equalTo(postReqObj.geometrySetUp().get("type")),
				 "geo_json.properties",
				    Matchers.equalTo(postReqObj.geoJsonSetUp().get("properties")),
				 "geo_json.type",
				    Matchers.equalTo(postReqObj.geoJsonSetUp().get("type")),
				 "name",
				    Matchers.equalTo(postReqBodyMap.get("name")),
				 "center[0]", 
				    Matchers.equalTo(postReqObj.center[0]),
				 "center[1]", 
				    Matchers.equalTo(postReqObj.center[1]),
				 "area",
				    Matchers.equalTo(postReqObj.extraDataSetUp().get("area")),
				 "userId",
				    Matchers.equalTo(postReqObj.extraDataSetUp().get("userId")));
		
		//JsonPath and postReqBodyMap
		
		JsonPath json = response.jsonPath();
		assertEquals(postReqObj.coordinates[0][0][0], (Object)json.get("geo_json.geometry.coordinates[0][0][0]"));
		assertEquals(postReqObj.coordinates[0][0][1], (Object)json.get("geo_json.geometry.coordinates[0][0][1]"));
		assertEquals(postReqObj.coordinates[0][1][0], (Object)json.get("geo_json.geometry.coordinates[0][1][0]"));
		assertEquals(postReqObj.coordinates[0][1][1], (Object)json.get("geo_json.geometry.coordinates[0][1][1]"));
		assertEquals(postReqObj.coordinates[0][2][0], (Object)json.get("geo_json.geometry.coordinates[0][2][0]"));
		assertEquals(postReqObj.coordinates[0][2][1], (Object)json.get("geo_json.geometry.coordinates[0][2][1]"));
		assertEquals(postReqObj.coordinates[0][3][0], (Object)json.get("geo_json.geometry.coordinates[0][3][0]"));
		assertEquals(postReqObj.coordinates[0][3][1], (Object)json.get("geo_json.geometry.coordinates[0][3][1]"));
		assertEquals(postReqObj.coordinates[0][4][0], (Object)json.get("geo_json.geometry.coordinates[0][4][0]"));
		assertEquals(postReqObj.coordinates[0][4][1], (Object)json.get("geo_json.geometry.coordinates[0][4][1]"));
		
		assertEquals(postReqObj.geometrySetUp().get("type"), json.getString("geo_json.geometry.type"));
		
		assertEquals(postReqObj.geoJsonSetUp().get("properties"), json.get("geo_json.properties"));
		assertEquals(postReqObj.geoJsonSetUp().get("type"), json.get("geo_json.type"));
		
		assertEquals(postReqBodyMap.get("name"),json.getString("name"));
		//System.out.println(postReqObj.center[0]);
		//System.out.println(json.get("center[0]"));
		
		
		assertEquals(postReqObj.center[0], (Object)json.get("center[0]"));
		assertEquals(postReqObj.center[1], (Object)json.get("center[1]"));
		
		assertEquals(postReqObj.extraDataSetUp().get("area"), json.getFloat("area"));
		assertEquals(postReqObj.extraDataSetUp().get("user_id"), json.getString("user_id"));
		
		
		
	}
	
}