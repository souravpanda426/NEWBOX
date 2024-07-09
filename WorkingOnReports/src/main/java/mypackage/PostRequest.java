package mypackage;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		String BaseURL = "https://reqres.in";
		RestAssured.baseURI = BaseURL;
		
	  JSONObject json = new JSONObject();
	  
	  
	  
	  for(int i=0;i<4;i++) {
		  
		  
		  json.put(CommonMethods.getDataFromExcel("mysheet", i, 0), CommonMethods.getDataFromExcel("mysheet", i, 1));
		  
		  
		  
	  }
	 
	  
	  RequestSpecification header = RestAssured.given().header("Content-Type","application/json");
	  Response response = header.body(json.toString()).post("api/users");
	  int statusCode = response.getStatusCode();
	  System.out.println(statusCode);
	  
	  JsonPath jsonPath = response.jsonPath();
	  String email = jsonPath.getString("email");
	  System.out.println(email);
	  
	  
		
		
		

	}

}
