package com.RunnableInterface;

public class RunnableInterfaceDemo implements Runnable {

	public void run() {
		 System. out.println("My thread is in running state.");  
	}
	
	public static void main(String[] args) {
		
		RunnableInterfaceDemo obj = new RunnableInterfaceDemo();
		Thread tobj = new Thread(obj);
		tobj.start();
	}

	

}
