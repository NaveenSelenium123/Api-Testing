package org.com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class All {
	@Test(enabled=false)
private void Employee() throws InterruptedException {
	RestAssured.baseURI="http://localhost:3000/";
	Thread.sleep(3000);
	RequestSpecification  requestSpecification= RestAssured.given();
	Response  response= requestSpecification.request(Method.GET,"employees");
	System.out.println(response.asPrettyString());	
	System.out.println(response.getStatusLine());	
}
	@Test(enabled=false)
	private void Employee1() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification  requestSpecification= 
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"id\": 5,\r\n" + 
						"    \"first_name\": \"Ann41\",\r\n" + 
						"    \"last_name\": \"Smith14\",\r\n" + 
						"    \"email\": \"ann14@codingthesmartway.com\"\r\n" + 
						"  }");
		Response  response= requestSpecification.request(Method.POST,"employees");
		System.out.println(response.asPrettyString());	
		System.out.println(response.getStatusLine());	
	}	
	@Test(enabled=false)
	public void Employee2() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification  requestSpecification= 
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"id\": 3,\r\n" + 
						"    \"first_name\": \"Ann41\",\r\n" + 
						"    \"last_name\": \"Smith14\",\r\n" + 
						"    \"email\": \"ann14@codingthesmartway.com\"\r\n" + 
						"  }");
		Response  response= requestSpecification.request(Method.PUT,"/employees/1");
		System.out.println(response.asPrettyString());	
		System.out.println(response.getStatusLine());	

	}
	@Test(enabled=false)
	public void deleteAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification  requestSpecification= RestAssured.given();
		Response  response= requestSpecification.request(Method.DELETE,"employees/1");
		System.out.println(response.asPrettyString());	
	}
	@Test
	public void getAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification  requestSpecification= RestAssured.given();
		Response  response= requestSpecification.request(Method.GET,"employees/5");
		System.out.println(response.asPrettyString());	
	}
}
