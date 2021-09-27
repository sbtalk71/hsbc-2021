package com.hsbc.spring.dao;

import java.util.List;

import com.hsbc.spring.dao.exceptions.EmpExistsException;
import com.hsbc.spring.dao.exceptions.EmpNotFoundException;
import com.hsbc.spring.entity.Emp;

public interface EmpDao {

	public Emp findById(int id) throws EmpNotFoundException;

	public String save(Emp e) throws EmpExistsException;

	public String delete(int id) throws EmpNotFoundException;

	public String update(Emp e) throws EmpNotFoundException;

	public List<Emp> listAll();

}
