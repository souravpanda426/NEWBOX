package mypackage;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String C_ID = "2";
		String expFirstName = "Janet";
//		first_name
		
		
		
		String BaseURL = "https://reqres.in";
		RestAssured.baseURI = BaseURL;
		
		Response response = RestAssured.given().when().get("api/users/1");
		String body = response.getBody().asString();
		System.out.println(body);
		
		JsonPath path = response.jsonPath();
		System.out.println(path.getString("data.email"));
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
				

}
	
}
