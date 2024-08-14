package mypackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://swapi.dev/";
		
		Response response = RestAssured.given().when().get("api/planets/?page=1");
		
		Object object = response.jsonPath().get("results[1].name");
		
		System.out.println(object.toString());

	}

}
