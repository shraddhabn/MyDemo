package com.Extendthreadclass;

public class PriorityThrad extends Thread{

	public void run() {
		System.out.println("Name of Running Thread is : " + Thread.currentThread().getName());
		
		System.out.println("");

		System.out.println("Priority of Running Thread is : " + Thread.currentThread().getPriority());
		System.out.println("");
	}
	public static void main(String[] args) {
		
		PriorityThrad pt = new PriorityThrad();
		PriorityThrad pt1 = new PriorityThrad();
	
		pt.setPriority(MIN_PRIORITY);

		pt1.setPriority(MAX_PRIORITY);
		
		pt.start();
		pt1.start();
		
	}

}
