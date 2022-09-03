package com.ems.PojoClass_Concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 extends Employee {
public static void main(String[] args) throws JsonProcessingException {
	Employee employee1=new Employee();
	employee1.setFirstName("Agni");
	employee1.setLastName("A");
	employee1.setEmail("naveen.jan9@gmail.com");
	employee1.setSkills(Arrays.asList("java","selenium"));
	System.out.println(employee1.getFirstName());
	System.out.println(employee1.getLastName());
	System.out.println(employee1.getEmail());
	System.out.println(employee1.getSkills());
	
ObjectMapper mapper=new ObjectMapper();
String employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
System.out.println(employeeJson);
}
}
