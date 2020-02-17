package assignment1111;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value a: ");
		a = scan.nextInt();
		
		System.out.println("Enter value b: ");
		b = scan.nextInt();
		
		System.out.println("Enter value c: ");
		c = scan.nextInt();
		
		if(a>b)
		if(a>c)
			System.out.println("Greatest Value is 'a':" + a);
		if(b>a)
		if(b>c)
			System.out.println("Greatest Value is 'b':" + b);
		if(c>a)
		if(c>b)
			System.out.println("Greatest Value is 'c':" + c);
		if(a==b)
		if(b==c)
		if(a==c)
			System.out.println("All the values are equal.");
			}
}


