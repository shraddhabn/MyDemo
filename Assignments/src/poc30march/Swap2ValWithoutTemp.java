package poc30march;

public class Swap2ValWithoutTemp {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		System.out.println("Befour Swaping Value of X is " + x +" and Y is " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swaping Value of X is " + x +" and Y is " + y);
		
	}

}
