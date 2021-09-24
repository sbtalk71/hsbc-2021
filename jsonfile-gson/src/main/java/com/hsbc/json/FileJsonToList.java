package com.hsbc.json;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.spring.entity.Emp;

public class FileJsonToList {

	public static void main(String[] args) throws Exception {
		File file = new File("emp.json");
		ObjectMapper mapper = new ObjectMapper();
		
		
		List<Emp> empList = mapper.readValue(file,new TypeReference<List<Emp>>() {} );
		
		
		empList.stream().forEach(System.out::println);

		

	}

}
