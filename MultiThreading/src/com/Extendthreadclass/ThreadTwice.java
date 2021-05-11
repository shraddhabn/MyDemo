//No. After starting a thread, it can never be started again. 
//If you does so, an IllegalThreadStateException is thrown.
//In such case, thread will run once but for second time, it will throw exception.

package com.Extendthreadclass;

public class ThreadTwice extends Thread{

	public void run() {
		for(int i=1;i<5;i++)
	
		System.out.println("Thread not run Twice");
	}
	
	public static void main(String[] args) {
	
		ThreadTwice tt = new ThreadTwice();
		
		tt.start(); //execute normally
		tt.start(); //throw execution bz thread can't run twice
	}

}
