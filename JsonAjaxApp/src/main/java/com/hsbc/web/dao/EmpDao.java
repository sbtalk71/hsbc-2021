package com.hsbc.web.dao;

import java.util.HashMap;
import java.util.Map;

import com.hsbc.web.entity.Emp;

public class EmpDao {

	public static Map<Integer, Emp>  empDb = new HashMap<>();

	static {

		empDb.put(100, new Emp(100, "James", "Hyderabad", 56000));
		empDb.put(101, new Emp(101, "Shantanu", "Hyderabad", 56000));
		empDb.put(102, new Emp(102, "Arun", "Hyderabad", 56000));
		empDb.put(103, new Emp(103, "Pavan", "Hyderabad", 56000));
		empDb.put(104, new Emp(104, "Shekhar", "Hyderabad", 56000));
		empDb.put(105, new Emp(105, "Pretham", "Hyderabad", 56000));
		empDb.put(106, new Emp(106, "Raja", "Hyderabad", 56000));
		empDb.put(107, new Emp(107, "Amit", "Hyderabad", 56000));
	}
	
	
}
