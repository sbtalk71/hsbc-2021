package com.hsbc.threads.ex2;

public class PrintWorker implements Runnable {

	Target target;
	String message;

	public PrintWorker(Target target,String message) {
		this.target = target;
		this.message=message;
	}

	@Override
	public void run() {
		//for(int i=0;i<6;i++) {
		synchronized (target) {
			target.printMessage(message);
		}
			
		//}
	}

}
