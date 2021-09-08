package com.hsbc.threads.ex3;

public class ThreadFileMain {

	public static void main(String[] args) {
		FileWriterUtil writerUtil=new FileWriterUtil();
		Thread t1 = new Thread(new FileWorker(writerUtil,"Hello"));
		Thread t2 = new Thread(new FileWorker(writerUtil,"Very"));
		Thread t3 = new Thread(new FileWorker(writerUtil,"Good"));
		Thread t4 = new Thread(new FileWorker(writerUtil,"World"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
