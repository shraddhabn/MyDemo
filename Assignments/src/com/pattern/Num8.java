/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101*/

package com.pattern;

public class Num8 {

	public static void main(String[] args) 
	{
		System.out.println("My pattern....!!!");

		for (int i = 1; i <= 7; i++) 
		{
			int num;

			if(i%2 == 0)
			{
				num = 0;

				for (int j = 1; j <= 7; j++)
				{
					System.out.print(num);

					num = (num == 0)? 1 : 0;
				}
			}
			else
			{
				num = 1;

				for (int j = 1; j <= 7; j++)
				{
					System.out.print(num);

					num = (num == 0)? 1 : 0;
				}
			}

			System.out.println();
		}
	}
}
