//It provides services to user threads for background supporting tasks.
//It has no role in life than to serve user threads.
//Its life depends on user threads.
//It is a low priority thread.
//************************
//The sole purpose of the daemon thread is that it provides services
//to user thread for background supporting task. If there is no user thread, 
//why should JVM keep running this thread. 
//That is why JVM terminates the daemon thread if there is no user thread.




package com.Extendthreadclass;

public class DaemonThread extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
		System.out.println("Current Thread is Daemon Thread");
		}
		else {
			System.out.println(" ");
			
			System.out.println("Current Thread is User Thread only");
			
		}
	}
	public static void main(String[] args) {
		
		DaemonThread dt = new DaemonThread();

		DaemonThread dt1 = new DaemonThread();
		
	dt.setDaemon(true);
	
	dt.start();
	dt1.start();
	}

}
