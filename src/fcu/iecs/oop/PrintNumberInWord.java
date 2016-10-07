package fcu.iecs.oop;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		Scanner PrintNumberInWord = new Scanner(System.in);
		System.out.printf("Enter a integer is:");
		int num = PrintNumberInWord.nextInt();
		String end;
		switch(num){
		case 1:end ="One";
			break;
		case 2:end ="Two";
			break;
		case 3:end ="Three";
			break;
		case 4:end ="Four";
			break;
		case 5:end ="Five";
			break;
		case 6:end ="Six";
		break;
		case 7:end ="Seven";
			break;
		case 8:end ="Eight";
			break;
		case 9:end ="Nine";
			break;
		default:end ="Other";
		}
		System.out.printf(end);

	}

}
