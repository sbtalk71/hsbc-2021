package com.hsbc.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Starts");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+": iteration " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().getName()+" Exits");
	}
}
