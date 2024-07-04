package StringandArrayPrograms;

/*public class Merge_Two_Arrays {
	public static void first_array(int [] first) {
		int length1 = first.length;
	}
	public static void second_array(int [] second) {
		int length2 = second.length;
	}
	public static void third_array(int [] third) {
	}
	
	public static void main(String[] args) {
		int [] first = {2, 3, 4, 5, 6};
		int [] second = {9, 8, 7, 6};
		int [] third = new int [9];
	}
}*/

public class Merge_Two_Arrays {
	public static void merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		int index = a.length;
		for(int i=0; i<b.length; i++) {
			c[index] = b[i];
			index++;
		}
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {9, 8, 7, 6};
		merge(a, b);
	}
}