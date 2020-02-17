package assignment1111;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
	int firstNumber, secondNumber, result;
	
	Scanner scan = new Scanner(System.in);
		
	System.out.print("Enter the first number:");
		
		firstNumber = scan.nextInt();

	System.out.print("Enter Second Number:");
		secondNumber = scan.nextInt();

		result = firstNumber + secondNumber;

		System.out.println("Result: " + result);
		scan.close(); 
		
		return;
	}

}
