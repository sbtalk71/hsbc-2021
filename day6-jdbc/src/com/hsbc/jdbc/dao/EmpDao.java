package com.hsbc.jdbc.dao;

import com.hsbc.jdbc.entity.Emp;
import com.hsbc.jdbc.exceptions.EmpExistsException;
import com.hsbc.jdbc.exceptions.EmpNotFoundException;

public interface EmpDao {

	Emp findById(int id) throws EmpNotFoundException;

	String save(Emp emp) throws EmpExistsException;

	String update(Emp emp) throws EmpNotFoundException;

	String delete(int id) throws EmpNotFoundException;

}