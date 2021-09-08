package com.hsbc.threads.pc;

public class Consumer implements Runnable {

	private Resource resource;

	public Consumer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		
		try {
			while (true) {
				int x=resource.get();
				System.out.println("GOT : "+x);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
