package com.hsbc.ex2;

public class MainApp {

	public static void main(String[] args) {
		MailEditor editor= new MailEditor();
		editor.compose("abc@gmail.com", "xyz@yahoo.com", "Break at 5:30pm", "Final Break");
		editor.send();

	}

}
