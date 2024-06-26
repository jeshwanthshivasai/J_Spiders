package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your desired number for the multiplication table: ");
		int number = sc.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + "x" + i + "=" + number*i);
		}
	}
}
