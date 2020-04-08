import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		
		int input;
		int count = 0;
		
		System.out.print("Enter the number: ");
		
		Scanner scan = new Scanner(System.in);
	        input = scan.nextInt();
	      
	      
	      while(input!=0){
	         input = input/10;
	         count++;
	      }
	      System.out.println("Number of digits are : " + count);
	   }

	

}
