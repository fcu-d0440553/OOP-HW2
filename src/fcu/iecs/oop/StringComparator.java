package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner StringComparator = new Scanner(System.in);
		System.out.printf("Enter a String1:");
		String Str1 = StringComparator.next();
		System.out.printf("Enter a String2:");
		String Str2 = StringComparator.next();
		if(Str1.equalsIgnoreCase(Str2))
			System.out.printf("The two strings are the same.");
		else
			System.out.printf("The two strings are not the same.");
	}

}
