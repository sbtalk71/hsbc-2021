package com.hsbc.threads.pc;

import org.omg.CORBA.portable.ValueBase;

public class Resource {
	private int data = 0;
	private boolean valueSet = false;

	public synchronized int get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.valueSet = false;
		notify();
		return data;
	}

	public synchronized void put(int i) {
		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = i;
		this.valueSet=true;
		notify();

	}
}
