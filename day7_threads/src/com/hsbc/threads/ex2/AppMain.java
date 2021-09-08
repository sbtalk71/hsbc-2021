package com.hsbc.threads.ex2;

public class AppMain {

	public static void main(String[] args) throws InterruptedException {

		Target target = new Target();

		Thread t1 = new Thread(new PrintWorker(target,"Hello"));
		Thread t2 = new Thread(new PrintWorker(target,"Good"));
		Thread t3 = new Thread(new PrintWorker(target,"World"));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

	}

}
