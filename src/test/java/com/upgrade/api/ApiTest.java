package com.upgrade.api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;
public class ApiTest {
	
	static Response response =  given().
		    when().
		        get("https://credapi.credify.tech/api/loanapp/v1/states").
		    then().extract().response();
	static String json = response.getBody().asString();

    static JsonPath jsonPath = new JsonPath(json);
   static List<HashMap<String,Object>> ret = jsonPath.get("states");
		    
		        //assertThat().
		        //body("states.label",hasSize(10));
@Test
public void check_Number_Of_states() {
	List<String> jsonResponse = response.jsonPath().getList("states"); 
	Assert.assertEquals(48, jsonResponse.size());
 
}
@Test
public void check_One_State_Has_min_Age_19()
{
	//List<HashMap<String,Object>>ret = jsonPath.get("states");
	List<Object> res = new ArrayList<Object>();
	for (int i=0;i<ret.size();i++)
	{
		res.add(i, ret.get(i).get("minAge"));
	}
	
	//System.out.println(Collections.frequency(res, 19));
	Assert.assertEquals(1, Collections.frequency(res, 19));
	Assert.assertEquals("Alabama", ret.get(res.indexOf(19)).get("label"));
	
}
@Test
public void check_Georgia_is_only_state_with_min_Loan_amount_3005()
{
	//List<HashMap<String,Object>>ret = jsonPath.get("states");
	List<Object> res = new ArrayList<Object>();
	for (int i=0;i<ret.size();i++)
	{
		res.add(i, ret.get(i).get("minLoanAmount").toString().trim());
	
	}
	Assert.assertEquals(1, Collections.frequency(res, "3005.0"));
	Assert.assertEquals("Georgia", ret.get(res.indexOf("3005.0")).get("label"));
}
}
