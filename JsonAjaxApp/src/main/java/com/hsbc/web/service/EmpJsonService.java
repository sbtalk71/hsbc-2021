package com.hsbc.web.service;

import org.json.JSONObject;

import com.hsbc.web.dao.EmpDao;

public class EmpJsonService {

	public String getJson(int id) {
		if (EmpDao.empDb.containsKey(id)) {

			JSONObject obj = new JSONObject(EmpDao.empDb.get(id));
			return obj.toString();
		} else {
			JSONObject obj = new JSONObject("{\"status\":\"Not Found\"}");
			return obj.toString();
		}
	}
}
