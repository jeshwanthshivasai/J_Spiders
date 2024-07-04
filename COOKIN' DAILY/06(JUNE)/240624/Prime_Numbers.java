package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Prime_Numbers {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i%2 == 0; i++) {
			if(count==2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
		}
	}
}
