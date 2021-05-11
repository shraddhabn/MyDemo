package com.Extendthreadclass;

public class CurrentThread extends Thread {

	public void run() {
		
		System.out.println("Running Thread");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		CurrentThread ct = new CurrentThread();

		CurrentThread ct1 = new CurrentThread();
		
		ct.start();
		ct1.start();
	}

}
