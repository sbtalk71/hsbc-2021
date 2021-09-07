package com.hsbc.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Starts");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("iteration " + i);
				Thread.sleep(6000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()+" Exits");
	}
}
