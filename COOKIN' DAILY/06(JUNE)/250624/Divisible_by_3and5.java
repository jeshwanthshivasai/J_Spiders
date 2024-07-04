package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Divisible_by_3and5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int three = sc.nextInt();
		System.out.println("Divisible  by 3");
		
		for (int i=1; i<100; i++) {
			if(i%3 == 0) {
				System.out.println("Divisible by 3");
			} else {
				System.out.println("Not Divisible by 3");
			}
		}
		Scanner sc1 = new Scanner(System.in);
		int five = sc.nextInt();
		for(int i=1; i<100; i++) {
			if(i%5 == 0) {
				System.out.println("Divisible by 5");
			} else {
				System.out.println("Not Divisible by 5");
			}
		}
		Scanner sc2 = new Scanner(System.in);
		int threeandfive = sc.nextInt();
		for(int i=1; i<100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("Divisible by 3 & 5");
			} else {
				System.out.println("Not Divisble by 3 & 5");
			}
		}
		System.out.println("\n");
	}
}
