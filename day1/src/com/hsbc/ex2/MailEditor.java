package com.hsbc.ex2;

public class MailEditor{
	private Mail mail;
	
	public void compose( String from, String to, String msg, String header){
	
		//create a Message Object
		Message message=new Message(header,msg);
		//Create the Mail Object
		Mail mail=new Mail(to, from, message);
		//return the Mail Object;
		this.mail=mail;
	
	}
	
	public void send(){
	
	System.out.println(mail.showMail());
	
	}
}

