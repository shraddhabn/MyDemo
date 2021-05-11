//The join() method waits for a thread to die. In other words, it causes 
//the currently running threads to stop executing until the thread it joins with completes its task.
//
//Syntax:
//public void join()throws InterruptedException
//public void join(long milliseconds)throws InterruptedException



package com.Extendthreadclass;

public class JoinMethod extends Thread{

	public void run() {
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		System.out.println("Join Method Completed.....");
	}
	public static void main(String[] args) {

		JoinMethod jm =new JoinMethod();
		JoinMethod jm1 =new JoinMethod();
		JoinMethod jm2 =new JoinMethod();

		jm.start();

		try {
			jm.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}

		jm1.start();
		jm2.start();
	}

}
