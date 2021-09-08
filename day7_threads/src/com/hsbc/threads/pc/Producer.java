package com.hsbc.threads.pc;

public class Producer implements Runnable {

	private Resource resource;

	public Producer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		int i = 0;
		try {
			while (true) {
				resource.put(++i);
				System.out.println("PUT : "+i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
