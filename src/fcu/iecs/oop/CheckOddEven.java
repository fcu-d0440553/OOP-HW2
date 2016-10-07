package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner CheckOddEven = new Scanner(System.in);
		System.out.printf("Enter a integer:");
		int num = CheckOddEven.nextInt();
		if(num%2 == 0)System.out.printf("The input integer is Even Number");
		else System.out.printf("The input integer is Odd Number");

}
}
