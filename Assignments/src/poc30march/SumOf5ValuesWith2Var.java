//1. Write a program to find sum of 5 values with two variables  using  command line arguments?

package poc30march;

public class SumOf5ValuesWith2Var {

	public static void main(String[] args) {

		int i;
		int sum=0;

		for(i=1;i<=5;i++) {

			sum=sum+i;
		}


		System.out.println(sum);
	}

}
