import java.util.Scanner;

public class HandShake {

	public static void main(String[] args) {
		
		int students;
		int result;
		
		
		System.out.print("Enter the number of students:");
		Scanner scan = new Scanner(System.in);
		students = scan.nextInt();
		result = (students * (students - 1)) / 2;
		System.out.print("Possible number of Handshakes:" + result);

	}

}
