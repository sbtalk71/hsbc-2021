package com.hsbc.ex2;

public class Message {
	private String header;
	private String body;

	public Message(String header, String body) {
		this.header = header;
		this.body = body;
	}
	
	public String getMessage() {
		return header+" "+body;
	}
}