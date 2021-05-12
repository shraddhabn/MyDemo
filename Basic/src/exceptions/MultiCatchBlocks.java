package exceptions;

public class MultiCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int arr[]=new int[5];
		arr[5]=50/0;
	}
	catch(ArithmeticException e) {
		System.out.println(" Arithmetic Exception occure");
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array Index Out of Bounds Exception occure");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.println("Rest of code");
	}

}
