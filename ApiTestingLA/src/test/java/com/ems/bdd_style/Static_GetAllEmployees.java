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
	@Test(enabled=false)
	private void createAnEmployeeBDD() {    //POST 
			    given()
			    .baseUri("http://localhost:3000")
				.header("Content-Type","application/json")
				.body("{\r\n" + 
						"    \"id\": 56553,\r\n" + 
						"    \"first_name\": \"N2aveen4\",\r\n" + 
						"    \"last_name\": \"Sm3ith144\",\r\n" + 
						"    \"email\": \"ann147834@codingthesmartway.com\"\r\n" + 
						"  }")
				.when()
				.post("/employees")
				.prettyPrint();
	}
	@Test(enabled=false)
	private void updateAnEmployee() {    //PUT
		given()
	    .baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n" +
				"    \"first_name\": \"Ajay12323\",\r\n" + 
				"    \"last_name\": \"Teen1aQWQ\",\r\n" + 
				"    \"email\": \"teen1aQWQW@codingthesmartway.com\"\r\n" + 
				"  }")
		.when()
		.put("/employees/56553")
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
	@Test
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
