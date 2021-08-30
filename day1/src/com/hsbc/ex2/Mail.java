package com.hsbc.ex2;

public class Mail {
	private String toAddress;
	private String fromAddress;
	private Message message;
	
	public Mail(String toAddress, String fromAddress, Message message) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.message = message;
	}
	
	public String showMail() {
		return toAddress+" "+fromAddress+" "+message.getMessage();
	}
}