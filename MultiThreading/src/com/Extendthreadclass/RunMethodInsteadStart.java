package com.Extendthreadclass;

public class RunMethodInsteadStart extends Thread {
	
		public void run() {
			
			for(int i=1;i<3;i++) {
				try{
					Thread.sleep(1000);
				}
				catch(InterruptedException e){
					System.out.println(e);
				}
				
			System.out.println("My Thread is running Dirctly in Current Stack");
		}

	}
	public static void main(String[] args) {

		RunMethodInsteadStart rs = new RunMethodInsteadStart();
		RunMethodInsteadStart rs1 = new RunMethodInsteadStart();
		RunMethodInsteadStart rs2 = new RunMethodInsteadStart();


		rs.run();

		rs1.run();

		rs2.run();


	}

}
