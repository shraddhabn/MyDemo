/*
 1 2 3 4 5 6 7 
 2 3 4 5 6 7 
  3 4 5 6 7 
   4 5 6 7 
    5 6 7 
     6 7 
      7 
     6 7 
    5 6 7 
   4 5 6 7 
  3 4 5 6 7 
 2 3 4 5 6 7 
1 2 3 4 5 6 7 
 */

package com.pattern;

public class Num6 {

	public static void main(String[] args) 
	{


		System.out.println("My  pattern....!!!");

		for (int i = 1; i <= 7; i++) 
		{


			for (int j = 1; j < i; j++) 
			{
				System.out.print(" ");
			}



			for (int j = i; j <= 7; j++) 
			{ 
				System.out.print(j+" "); 
			} 

			System.out.println(); 
		} 



		for (int i = 7-1; i >= 1; i--) 
		{


			for (int j = 1; j < i; j++) 
			{
				System.out.print(" ");
			}


			for (int j = i; j <= 7; j++)
			{
				System.out.print(j+" ");
			}

			System.out.println();
		}


	}
}
