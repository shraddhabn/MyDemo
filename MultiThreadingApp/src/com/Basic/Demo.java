package com.Basic;

class MyDemo implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(5 + " * " + i + " = " + (5*i));
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}

	}
}
public class Demo {
	public static void main(String[] args) {
		MyDemo th = new MyDemo();
		Thread t = new Thread(th); // thread created
		t.start();
	}
}



