package mypackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String BaseURL = "https://reqres.in";
		RestAssured.baseURI = BaseURL;
		
	Response delete = RestAssured.given().when().delete("api/users/1");
	int statusCode = delete.getStatusCode();
	System.out.println(statusCode);
		
	}

}
