package com.hsbc.json;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.spring.entity.Emp;

public class FileToJsonObject {

	public static void main(String[] args) throws Exception {
		File file = new File("emp.json");
		ObjectMapper mapper = new ObjectMapper();
		// Emp emp = mapper.readValue(file, Emp.class);
		List<Emp> empList = mapper.readValue(file, List.class);
		// System.out.println(emp.getName());

		

	}

}
