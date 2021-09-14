package com.hsbc.web;

public class Authenticator {

	public boolean login(String username, String password) {
		System.out.println("Authenticating the user : " + username);
		return username.equals(password);
	}
}
