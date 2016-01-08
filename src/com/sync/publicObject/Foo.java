package com.sync.publicObject;

public class Foo extends Thread {
	private int val;
	private static Object lock = new Object();

	public Foo(int v) {
		val = v;
	}

	public void printVal(int v) {
		synchronized (lock) {
			while (true)
				System.out.println(v);
		}
	}

	public void run() {
		printVal(val);
	}
}