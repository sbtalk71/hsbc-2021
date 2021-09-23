package com.hsbc.spring.impl;

import com.hsbc.spring.GreetMessage;

public class GoodMorning implements GreetMessage {

	@Override
	public String getGreetMessage() {
		return "Good Morning";
	}

}
