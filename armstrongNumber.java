import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		
		
		int firstNumber;
		int secondNumber;
		System.out.println("The program shows Armstrong numbers between two interval");
		System.out.print("\nEnter the first number: ");
		Scanner scan = new Scanner(System.in);
		firstNumber = scan.nextInt();
		System.out.print("Enter the second number: ");
		secondNumber = scan.nextInt();
		
		System.out.print("The armstrong numbers between" + " " + firstNumber + " & " 
         		+ secondNumber + " are:");
		for(int n1 = firstNumber + 1; n1 < secondNumber; ++n1) {
			int digits = 0;
			int result = 0;
			int number = n1;
			
		while (number != 0) {
			 number /= 10;
             ++digits;
			}
		number = n1;
		 while (number != 0) {
             int remainder = number % 10;
             result += Math.pow(remainder, digits);
             number /= 10;
             
		}
		
		 if (result == n1)
			 
             System.out.print(" " + n1);
		 
	}

	}
	}
