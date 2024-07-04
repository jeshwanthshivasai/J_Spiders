package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Three_Integers_Comparison {
	public static void main(String[] args) {
		 System.out.println("Enter your first number");
		 Scanner sc = new Scanner(System.in);
		 int first_int = sc.nextInt();
		 System.out.println("Enter your second number");
		 int second_int = sc.nextInt();
		 System.out.println("Enter your third number");
		 int third_int = sc.nextInt();
		 if(second_int > first_int && third_int > second_int) {
			 System.out.println();
		 }
	}
}