package practice;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import TestBaseNtUrls.TestBaseDummy;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Practice3 extends TestBaseDummy {
	
	/*
	 * ("http://dummy.restapiexample.com/api/v1/employees").
	Print all employees on the console
	Assert that 4 rd employee's name is Cedric Kelly
	Print first 4 employees' names
	Assert that 11. employee's salary is 90560
	Assert that 16. employee's age is 66
	 */
	
	
	@Test
	public void get01() {
		
		spec.pathParam("employeesPath", "employees");

		Response response=given().spec(spec).when().get("/{employeesPath}");
		
		response.prettyPrint();
		
        JsonPath json = response.jsonPath();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(json.getString("data[3].employee_name"), "Ashton Cox","Name did not match!");
		softAssert.assertEquals(json.getString("data[10].employee_salary"), "372000", "salary didn't match");
		softAssert.assertEquals(json.getString("data[15].employee_age"), "19","age did not match");
		
		
	
	
	/*When
    I send GET Request to URL http://dummy.restapiexample.com/api/v1/employees
 Then
    Status code is 200
    1)Print all ids smaller than 8 on the console
      Assert that there are 10 ids greater than 14
    2)Print all ages less than 40 on the console
      Assert that maximum age less than 30 is 23
    3)Print all employee names whose salaries are smaller than 500000
      Assert that "Brielle Williamson" is one of the employees whose salary is smaller than 500000
*/
	
	List <String> idList = json.getList("data.findAll{Integer.valueOf(it.id)<8}.id"); 
	System.out.println(idList);
	
	assertEquals(7,idList.size());
	
	List<String> ages = json.getList("data.findAll{Integer.valueOf(it.employee_age)<40}.employee_age");
	System.out.println(ages);
	
	List<Integer> ageListInt = new ArrayList<Integer>();
	for(String w:ages) {						
		ageListInt.add(Integer.valueOf(w));
		
	}
	
	Collections.sort(ageListInt);
	
	assertEquals(Integer.valueOf("39"), ageListInt.get(ageListInt.size()-1));
	
	

	List<String> names = json.getList("data.findAll{Integer.valueOf(it.employee_salary)>50000}.employee_name");
	System.out.println(names);
	
	assertTrue(names.contains("Brielle Williamson"));

	
	
	
	}

}
