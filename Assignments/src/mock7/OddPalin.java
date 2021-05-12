package mock7;

import java.util.Scanner;

public class OddPalin {
	
		static boolean isPalindrome(int num)
		{
			int reverse_num = 0, remainder, temp;

		
			temp = num;
			while (temp != 0) {
				remainder = temp % 10;
				reverse_num = reverse_num * 10 + remainder;
				temp /= 10;
			}
			if (reverse_num == num) {
				return true;
			}

			return false;
		}
		static boolean isOddLength(int num)
		{
			int count = 0;
			while (num > 0) {
				num /= 10;
				count++;
			}
			
		}
		
		public static void main(String[] args)
		{
			int L = 110, R = 1130;
			System.out.println(isOddLength(56));
		}
	}


