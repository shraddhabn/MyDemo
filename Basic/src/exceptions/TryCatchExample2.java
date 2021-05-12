//	try {    
//	code that may throw an exception    
// 	}
//	catch(Exception_class_Name ref) {
//  }     



package exceptions;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int result=80/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of code");
		
		
	}

}
