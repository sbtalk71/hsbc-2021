package com.hsbc.json;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.spring.entity.Emp;

public class FileToJsonObject {

	public static void main(String[] args) throws Exception {
		File file = new File("emp.json");
		ObjectMapper mapper = new ObjectMapper();
		// Emp emp = mapper.readValue(file, Emp.class);
		JavaType type=mapper.getTypeFactory().constructCollectionType(List.class, Emp.class);
		
		List<Emp> empList = mapper.readValue(file,type );
		// System.out.println(emp.getName());
		
		empList.stream().forEach(System.out::println);

		

	}

}
