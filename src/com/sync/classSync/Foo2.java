package com.sync.classSync;

public class Foo2 extends Thread {
	private int val;

	public Foo2(int v) {
		val = v;
	}

	public void printVal(int v) {
		synchronized (Foo2.class) {
			while (true)
				System.out.println(v);
		}
	}

	public void run() {
		printVal(val);
	}
}