package mock3;

 interface Father {
	public void go(); 

	} 

	 interface Mother { 

	public void go(); 

	} 

	class Test implements Father, Mother { // line 1 

	public void go(){ // line 2 

	System.out.println("Child"); 

	} 

	public static void main(String args[]) { 

	new Test().go(); // line 3 

	} 
}
