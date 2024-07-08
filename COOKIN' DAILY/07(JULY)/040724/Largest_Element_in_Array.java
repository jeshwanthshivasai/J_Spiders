package string_and_array_programs;

public class Largest_Element_in_Array {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 6, 7, 8};
		largest(a);
	}
	public static void largest(int[] a) {
		int largest = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}
}