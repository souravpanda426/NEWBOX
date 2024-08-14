package mypackage;



import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MyPostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://swapi.dev/";
		
		JSONObject json = new JSONObject();
		json.put("name","keyfair");
		json.put("climate","rainy");
	
		
		RequestSpecification header = RestAssured.given().header("Content-Type","application/json");
		
		Response response = header.body(json.toString()).post("api/planets/?page=1");
		
		System.out.println(response.getStatusCode());
	}

}
