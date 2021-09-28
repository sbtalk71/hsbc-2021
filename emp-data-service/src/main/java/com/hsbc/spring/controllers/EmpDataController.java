package com.hsbc.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.dao.exceptions.EmpExistsException;
import com.hsbc.spring.dao.exceptions.EmpNotFoundException;
import com.hsbc.spring.entity.Emp;

@RestController
public class EmpDataController {

	@Autowired
	EmpDao dao;

	@GetMapping(path = "/emp/find/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findEmp(@PathVariable("empId") int id) {
		try {
			Emp e = dao.findById(id);
			return ResponseEntity.ok(e);

		} catch (EmpNotFoundException e) {
			return ResponseEntity.ok("{\"status\":\"Emp Not Found..\"}");
		}
	}

	@PostMapping(path = "/emp/save", produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Emp e) {
		try {
			String response = dao.save(e);
			return ResponseEntity.ok(response);
		} catch (EmpExistsException e1) {
			return ResponseEntity.ok("Employee Exists..");
		}
	}

	@GetMapping(path = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listAll() {

		return ResponseEntity.ok(dao.listAll());

	}

}
