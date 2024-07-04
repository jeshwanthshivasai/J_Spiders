package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	}
	public static int sumofdigits(int num) {
		int sum = 0;
		
		while(num != 0) {
			sum += num%10;
			num/=10;
		}
		return sum;
	}
}