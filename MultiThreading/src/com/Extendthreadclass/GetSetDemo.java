package com.Extendthreadclass;

public class GetSetDemo extends Thread{

	public void run() {
		System.out.println("getName and srtName done.........");
	}
	public static void main(String[] args) {
	
		GetSetDemo gs =new GetSetDemo();
		GetSetDemo gs1 =new GetSetDemo();
		
		System.out.println("Name of First Thread is : "+ gs.getName());

		System.out.println("Name of Second Thread is: "+ gs1.getName());
		
		System.out.println("ID of First Thread is : "+ gs.getId() );
		

		gs.start();
		
		gs.setName("Shraddha");
		System.out.println("After Change First Thread Name is : " + gs.getName());

		gs1.start();
		
	}

}
