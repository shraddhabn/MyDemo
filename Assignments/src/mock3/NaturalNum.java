package mock3;

import java.util.Scanner;

public class NaturalNum {


		public static void main(String[] args)  

		{  

		Scanner sc=new Scanner(System.in);  

		System.out.println("Enter the range:"); 

		 naturalNumbers(sc.nextInt(),sc.nextInt());  

		}  

		private static void naturalNumbers(int start, int end)  

		{  

		for(int i=start;i<=end;i++) 

		 { System.out.print(i+" "); 

		 }  

		} 
}
