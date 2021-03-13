package testData;

import java.util.HashMap;
import java.util.Map;

public class OpenWeatherMapTestData {
	public int statusCode = 200;
	public Map<String, Float> coordSetUp(){
		Map<String, Float> coord = new HashMap<>();
		coord.put("lon", -0.13f);
		coord.put("lat", 51.51f);
		return coord;
	}
	
	Map weather[] = {weatherSetUp()};
	
	public Map<String, Object> weatherSetUp(){
		Map<String, Object> weather = new HashMap<>();
		weather.put("id", 801);
		weather.put("main", "Clouds");
		weather.put("description", "few clouds");
		weather.put("icon", "02n");
		return weather;
	}
	
	public Map<String, Float> mainSetUp(){
		Map<String, Float> main = new HashMap<>();
		main.put("temp", 282.85f);
		main.put("feels_like", 276.82f);
		main.put("temp_min", 282.04f);
		main.put("temp_max", 283.71f);
		main.put("pressure", 1006f);
		main.put("humidity", 76f);
		return main;
		
	}
	
	public Map<String, Float> windSetUp(){
		Map<String, Float> wind = new HashMap<>();
		wind.put("speed", 7.2f);
		wind.put("deg", 200f);
		wind.put("gust", 12.3f);
		return wind;
	}
	
	public Map<String, Float> rainSetUp(){
		Map<String, Float> rain = new HashMap<>();
		rain.put("1h", 1.06f);
		return rain;
	}
	
	public Map<String, Float> cloudsSetUp(){
		Map<String, Float> clouds = new HashMap<>();
		clouds.put("all", 27f);
		return clouds;
	}
	
	public Map<String, Object> sysSetUp(){
		Map<String, Object> sys = new HashMap<>();
		sys.put("type", 1);
		sys.put("id", 1414);
		sys.put("country", "GB");
		sys.put("sunrise", 1608364978);
		sys.put("sunset", 1608393157);
		return sys;
	}
	
	public Map<String, Object>  expectedDataSetUp(){
		Map<String, Object> expectedDataMap = new HashMap<>();
		expectedDataMap.put("coord", coordSetUp());
		expectedDataMap.put("weather", weather);
		expectedDataMap.put("base", "stations");
		expectedDataMap.put("main", mainSetUp());
		expectedDataMap.put("visibility", 8000);
		expectedDataMap.put("wind", windSetUp());
		expectedDataMap.put("rain", rainSetUp());
		expectedDataMap.put("clouds", cloudsSetUp());
		expectedDataMap.put("dt", 1608395463);
		expectedDataMap.put("sys", sysSetUp());
		expectedDataMap.put("timezone", 0);
		expectedDataMap.put("id", 2643743);
		expectedDataMap.put("name", "London");
		expectedDataMap.put("code", 200);
		return expectedDataMap;
		
		
	}
	
	
	
}