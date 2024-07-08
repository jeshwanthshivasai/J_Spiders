package string_and_array_programs;

public class Print_Elements_in_Ascending_Order {
	public static void main(String[] args) {
		int[] a = {8, 5, 3, 9, 1, 3};
		ascending(a);
	}
	public static void ascending(int[] a) {
		for(int j=0; j<a.length; j++) {
			if(a[j] > a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] + "");
		}
	}
}
