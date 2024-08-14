package mypackage;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String BaseURL = "https://reqres.in";
		RestAssured.baseURI = BaseURL;
		
		JSONObject json = new JSONObject();
		  json.put("Last_name","smith");
		  json.put("first_name","john");
		  
		  
		  RequestSpecification header = RestAssured.given().header("Content-Type","application/json");
		  Response response = header.body(json.toString()).put("api/users/3");
		  int statusCode = response.getStatusCode();
		  System.out.println(statusCode);
		  
		  JsonPath jsonPath = response.jsonPath();
		  String last_name = jsonPath.getString("Last_name");
		  System.out.println(last_name);
		
	}

}
