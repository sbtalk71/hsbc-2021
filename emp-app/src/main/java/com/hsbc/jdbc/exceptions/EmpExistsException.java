package com.hsbc.jdbc.exceptions;

public class EmpExistsException extends Exception {
	public EmpExistsException() {

	}

	public EmpExistsException(String message) {
		super(message);
	}

	@Override
	public String toString() {

		return this.getClass().getName() + ": " + "Emp Exists";
	}
}
