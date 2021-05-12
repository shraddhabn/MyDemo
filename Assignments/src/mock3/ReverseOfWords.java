package mock3;

import java.util.Scanner;

public class ReverseOfWords {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String");
		 String str=sc.nextLine();
		 reverseOfWords(str);
		}
		private static void reverseOfWords(String str) {
		String rev="";
		String[] input=str.split(" ");
		for(int i=0;i<input.length;i++) {
		String word=input[i];
		String reverseWord=" ";
		for(int j=word.length()-1;j>=0;j--) {
		reverseWord=reverseWord+word.charAt(j);
		}
		rev = rev + reverseWord + " ";
		}
		System.out.println(rev);
		}
}
