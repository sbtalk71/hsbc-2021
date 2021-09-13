package com.hsbc.web.service;

import org.json.JSONObject;

import com.hsbc.web.entity.Emp;

public class EmpJsonService {

	public String getJson(int id) {
		Emp emp = new Emp(id, "Shantanu", "Hyderabad", 89000);
		JSONObject obj = new JSONObject(emp);
		return obj.toString();

	}
}
