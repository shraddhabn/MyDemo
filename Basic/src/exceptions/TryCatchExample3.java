package exceptions;

public class TryCatchExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[7]);
		}
		catch(Exception e) {
		 System.out.println(e);	
		}
		System.out.println("Rest of code");
	}

}
