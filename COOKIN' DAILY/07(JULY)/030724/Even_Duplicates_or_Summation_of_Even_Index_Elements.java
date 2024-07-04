package StringandArrayPrograms;

public class Even_Duplicates_or_Summation_of_Even_Index_Elements {
	public static void duplicates(int[] a, int[] b) {
		boolean ifFound=false;
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] % 2 == 0 && b[j] % 2 == 0) {
					if(a[i] == b[j]) {
						System.out.println(a[i] + " ");
					}
				}
			}
		}
		if(ifFound == false) {
			for(int i=0; i<a.length; i++) {
				if(i != 0 && i % 2 == 0) {
					sum = sum + a[i];
				}
			}
			for(int j=0; j<b.length; j++) {
				if(j != 0 && j % 2 == 0) {
					sum = sum + b[j];
				}
			}
			System.out.println(sum);
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 4, 6, 8, 10};
		duplicates(a, b);
		}
	}
/*		for(int i=0; i<a.length; i++) {
			if(i%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}*/
