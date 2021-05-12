package exceptions;

public class MultiCatchBlocks3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				int arr[]= {10,20,30,40,50};
				int data=25/0;
				System.out.println(arr[8]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception Occure");
			} 
			catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occure");	
			}
			catch(Exception e) {
				System.out.println("Parent class exception");
			}
			System.out.println("Rest of code");
	}
}
