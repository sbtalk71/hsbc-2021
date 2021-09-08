package com.hsbc.threads.ex2;

public class Target {

	public  void printMessage(String message) {

		try {
			System.out.print("[" + message);
			Thread.sleep(6000);
			System.out.println("]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}