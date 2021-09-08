package com.hsbc.threads.ex3;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterUtil {
	public synchronized void writeToFile(String message) throws FileNotFoundException, IOException, InterruptedException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("thread_test.txt", true));
		dos.writeUTF(Thread.currentThread().getName() + " Writing");
		Thread.sleep(3000);
		dos.writeUTF(message);
	}
}
