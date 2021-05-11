package com.Extendthreadclass;

public class ThreadExtendDemo extends Thread {

	public void run() {
		System.out.println("My Thread is in                                                                                                                                                                                                                                                       Running state.");
	}
	public static void main(String[] args) {
		
		ThreadExtendDemo obj = new ThreadExtendDemo();
		obj.start();
	}

}
