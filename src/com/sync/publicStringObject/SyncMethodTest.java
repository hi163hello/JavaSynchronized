package com.sync.publicStringObject;

public class SyncMethodTest {
	public static void main(String args[]) {
		String value = "printVal";
		Foo f1 = new Foo("Foo 2:", value);
		f1.start();
		Foo f2 = new Foo("Foo 1:", value);
		f2.start();
	}
}
