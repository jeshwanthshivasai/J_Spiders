package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your second number: ");
		int b = s2.nextInt();
		int product = a*b;
		System.out.println(product);
	}
}
