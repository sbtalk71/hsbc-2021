package com.hsbc.threads;

public class ThreadApp1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" Starts");
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		MyThread t3= new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(Thread.currentThread().getName()+" Exits");

	}

}
