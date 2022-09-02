package com.ems.bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllEmployees {
	@Test
public void getAllEmployees() {
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.when()
	.get("/employees")
	.prettyPrint();
}
}
