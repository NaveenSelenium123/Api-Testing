package com.ems.bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Static_GetAllEmployees {
	@Test(enabled=false)
	public void getAllEmployees() {
		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees")
		.prettyPrint();
	}
	@Test
	private void createAnEmployeeBDD() {
			    given()
			    .baseUri("http://localhost:3000")
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"id\": 565,\r\n" + 
						"    \"first_name\": \"Naveen4\",\r\n" + 
						"    \"last_name\": \"Smith144\",\r\n" + 
						"    \"email\": \"ann14784@codingthesmartway.com\"\r\n" + 
						"  }")
				.when()
				.post("/employees")
				.prettyPrint();
	}
	@Test(enabled=false)
	private void updateAnEmployee() {
		given()
	    .baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n" +
				"    \"first_name\": \"Ajay1\",\r\n" + 
				"    \"last_name\": \"Teen1a\",\r\n" + 
				"    \"email\": \"teen1a@codingthesmartway.com\"\r\n" + 
				"  }")
		.when()
		.put("/employees/2108006")
		.prettyPrint();	
	}
	@Test(enabled=false)
	public void deleteAlnEmployees() {
		given()
		.baseUri("http://localhost:3000")
		.when()
		.delete("/employees/2108006")
		.prettyPrint();
	}
	@Test(enabled=false)
	private void createEmployeeFromJson() {
		File jsonFile=new  File("db1.json");
		given()
	    .baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonFile)
		.when()
		.post("/employees")
		.prettyPrint();

	}
	
}
