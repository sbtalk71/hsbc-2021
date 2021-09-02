package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			bis = new BufferedInputStream(new FileInputStream("sample.txt"));
			bos= new BufferedOutputStream(new FileOutputStream("sample_1.txt",true));

			int b = 0;
			while (true) {
				b = bis.read();
				if (b == -1)
					break;
				System.out.print((char) b);
				bos.write(b);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found..");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
