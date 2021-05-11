package com.Basic;

public class Demo1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println( i );
					try {
						Thread.sleep(1000);
						System.out.println(i);
					}
					catch(Exception e){
						System.out.println(e);
					}
				}
			}
		});

		t1.start();
	}

}
