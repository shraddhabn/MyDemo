package starting;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int no1=0,no2=1,no3;
		int count=10;
		
		System.out.println(no1 + " " + no2 + " ");
		
		for(int i=2;i<=count;i++) {
			
			no3=no1+no2;
			System.out.println(" " + no3);
			
			no1=no2;
			no2=no3;
		}
	}
}
