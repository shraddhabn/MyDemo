package exceptions;

public class MultiCatchBlocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {20,30,40,50,60};
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out OfBounds Exception occure");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occure");
		}
		catch(Exception e) {
			System.out.println("Exception Occure");
		}
		System.out.println("Rest of code");
	}

}
