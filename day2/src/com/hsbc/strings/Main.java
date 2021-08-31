package com.hsbc.strings;

public class Main {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello there";
		String s3="Hello";
		
		String s4=new String("hello");
		
		System.out.println(s1==s2);
		
		System.out.println(s4==s1);
		
		System.out.println(s4.equals(s1));
		

		String s6="This is a class of java as java is good for java based application";
		
		System.out.println("Length of s6 : "+s6.length());
		
		System.out.println(s6.indexOf("java",20));
		System.out.println(s6.lastIndexOf("java"));
		
		System.out.println(s6.substring(s6.indexOf("java"), s6.lastIndexOf("java")+"java".length()));
		
		String[] words=s6.split(" ");
		System.out.println(words.length);
		String s7=s6.concat(" for enterprise");
		System.out.println(s7);
		
		String password1="welcome1";
		String password2="welCome1";
		System.out.println(password2.compareTo(password1));
		
		System.out.println(password1.concat(password2));
		
		byte[] pwdBytes=password1.getBytes();
		String pwd = password1.intern();
		System.out.println(pwd);
		
		System.out.println(pwd==password1);
		
	}

}
