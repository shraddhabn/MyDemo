package starting;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		boolean val=isPrime(num);
		if(val) {
			System.out.println(num + " is Prime Number");
		}
		else {
			System.out.println(num + " is not Prime Number");
		}
	}
	private static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0 ) {
				count++;
			}
		}
		if(count==2) 
			return true;
		return false;
	}
}
