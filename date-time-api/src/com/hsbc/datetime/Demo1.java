package com.hsbc.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class Demo1 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		LocalDate fromString=LocalDate.parse("2009-09-21");
		
		System.out.println(now);
		System.out.println(fromString);
		
		System.out.println(now.plusYears(20));
		
		LocalTime dhakaNow = LocalTime.now(ZoneId.of("Asia/Dhaka"));
		System.out.println(dhakaNow.getHour());

		LocalDate  today = LocalDate.now();
		
		LocalDate bd=LocalDate.parse("1971-02-21");
		
		Period p=Period.between(bd,today);
		
		System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());
		
		
	}

}
