package com.collections;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class DateCompare {
	public static int compareDates(java.util.Date date1, java.util.Date date2) {
		int result = -1;
		if (date1.after(date2)) {
			result = 2;
		} else if (date1.before(date2)) {
			result = 1;
		} else if (date1.equals(date2)) {
			result = 0;
		}
		return result;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date1");
		java.util.Date date1 = df.parse(sc.next());
		System.out.println("Enter the date2");
		java.util.Date date2 = df.parse(sc.next());
		int res = compareDates(date1, date2);
		if (res == -1) {
			System.out.println("The dates are null");
		} else if (res == 0) {
			System.out.println("The Dates are equal");
		} else if (res == 1) {
			System.out.println("date1 is before date2");
		} else if (res == 2) {
			System.out.println("date1 is after date2");
		}

	}

}
