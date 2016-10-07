package fcu.iecs.oop;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter a integer:");
		int num = keyboard.nextInt();
		System.out.printf("Enter a float point number:");
		float num2 = keyboard.nextFloat();
		System.out.printf("Enter a you name:");
		String word = keyboard.next();
		float end = (float)num*num2;
		System.out.printf("Hi "+ word +" ,the multiplication of "+ num +" and "+ num2 +" is %.2e",end);

	}

}
