package com.hsbc.spring;

class Mail {
	private String toAddress;
	private String fromAddress;
	private Message message;

//no args constructor
	public Mail() {
		// TODO Auto-generated constructor stub
	}
//setter and getter for every variable

	public String getMail() {

		return fromAddress + " " + message;

	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}