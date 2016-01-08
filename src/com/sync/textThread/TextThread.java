package com.sync.textThread;

public class TextThread {
	public static void main(String[] args) {
		TxtThread tt = new TxtThread();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}
