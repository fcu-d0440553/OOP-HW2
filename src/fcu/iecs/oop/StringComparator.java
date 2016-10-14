package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner StringComparator = new Scanner(System.in);
		
		String Str1,Str2;
		
		boolean i;
		
		do{
			System.out.printf("Enter a String1:");
			Str1 = StringComparator.next();
			System.out.printf("Enter a String2:");
			Str2 = StringComparator.next();
			System.out.println("The two strings are not the same.");
			i=Str1.equalsIgnoreCase(Str2);
		}while(!i);
			
			System.out.printf("The two strings are the same.");
	}

}
