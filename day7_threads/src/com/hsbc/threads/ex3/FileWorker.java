package com.hsbc.threads.ex3;

public class FileWorker implements Runnable {
	private String message;
	private FileWriterUtil writerUtil;

	public FileWorker(FileWriterUtil writerUtil,String message) {
		this.message = message;
		this.writerUtil=writerUtil;
	}

	@Override
	public void run() {
		synchronized (message) {

			try {
				writerUtil.writeToFile(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	

}
