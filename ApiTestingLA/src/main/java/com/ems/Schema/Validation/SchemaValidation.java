package com.ems.Schema.Validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidation {
	@Test(enabled=false)
	private void validate() {
		File inputJson =new File("src/test/resources/input.json");
		RestAssured
		 .given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")	
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		}
	@Test(enabled=false)
	private void validateWithoutPath() {
		File inputJson =new File("src/test/resources/input.json");
		File inputSchema =new File("src/test/resources/schema.json");
		RestAssured
		 .given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")	
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputSchema));
		}
	@Test
	private void validateWithoutPath1() throws FileNotFoundException {
		File inputJson =new File("src/test/resources/input.json");
		Reader inputSchema =new FileReader("src/test/resources/schema.json");
		RestAssured
		 .given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(inputJson)
		.when()
		.post("/employees")	
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema("{\r\n" + 
				"\r\n" + 
				"  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\r\n" + 
				"\r\n" + 
				"  \"type\": \"object\",\r\n" + 
				"\r\n" + 
				"  \"properties\": {\r\n" + 
				"\r\n" + 
				"    \"id\": {\r\n" + 
				"\r\n" + 
				"      \"type\": \"integer\"\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    \"first_name\": {\r\n" + 
				"\r\n" + 
				"      \"type\": \"string\"\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    \"last_name\": {\r\n" + 
				"\r\n" + 
				"      \"type\": \"string\"\r\n" + 
				"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"    \"email\": {\r\n" + 
				"\r\n" + 
				"      \"type\": \"string\"\r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  },\r\n" + 
				"\r\n" + 
				"  \"required\": [\r\n" + 
				"\r\n" + 
				"    \"id\",\r\n" + 
				"\r\n" + 
				"    \"first_name\",\r\n" + 
				"\r\n" + 
				"    \"last_name\",\r\n" + 
				"\r\n" + 
				"    \"email\"\r\n" + 
				"\r\n" + 
				"  ]\r\n" + 
				"\r\n" + 
				"}"));
		}
	}
	
	
	

