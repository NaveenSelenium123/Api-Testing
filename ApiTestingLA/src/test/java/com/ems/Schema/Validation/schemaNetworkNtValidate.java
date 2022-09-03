package com.ems.Schema.Validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

import groovyjarjarantlr4.v4.misc.EscapeSequenceParsing.Result;
public class schemaNetworkNtValidate {
	@Test
private void jsonSchema() throws IOException {
	ObjectMapper mapper=new ObjectMapper();
	JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
File inputJson=new File("src/test/resoureces/input.json");
InputStream inputSchema=new FileInputStream("src/test/resoureces/schema1.json");
JsonNode jsonNode = mapper.readTree(inputJson);
JsonSchema schema = factory.getSchema(inputSchema);
Set<ValidationMessage> result = schema.validate(jsonNode);
if(result.isEmpty()) {
	System.out.println("No Validation Errors");
}else {
	for (ValidationMessage message : result) {
	System.out.println(message);	
	}
}

}
}
