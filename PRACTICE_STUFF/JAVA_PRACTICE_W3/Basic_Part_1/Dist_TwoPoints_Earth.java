package JAVA_PRACTICE_W3.Basic_Part_1;

import java.util.Scanner;

public class Dist_TwoPoints_Earth {
	public static double dist_between_two_points(double lat1, double long1, double lat2, double long2) {
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 = Math.toRadians(lat2);
		long2 = Math.toRadians(long2);
		
		double radius = 6371.01;
		
		return radius = Math.acos(Math.sin(lat1)) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first latitude: ");
		double lat1 = sc.nextDouble();
		System.out.println("Enter the first longitude: ");
		double long1 = sc.nextDouble();
		
		System.out.println("Enter the second latitude: ");
		double lat2 = sc.nextDouble();
		System.out.println("Enter the second longitude: ");
		double long2 = sc.nextDouble();
		
		System.out.println("The distance is " + dist_between_two_points(lat1, long1, lat2, long2));
	}
}
