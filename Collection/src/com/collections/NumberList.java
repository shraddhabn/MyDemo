package com.collections;
import java.util.Arrays;
import java.util.Scanner;

public class NumberList {
	public static String getNumberList(String list) {
		String str = "";
		if (list == null) {
			return null;

		}
		String[] arr = (list.replaceAll("-", ",").split(","));
		int[] nums = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(nums);
		for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
			str += i + ",";
		}
		return str.substring(0, str.length() - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number list: ");
		String lst = sc.next();
		System.out.println(getNumberList(lst));

	}

}