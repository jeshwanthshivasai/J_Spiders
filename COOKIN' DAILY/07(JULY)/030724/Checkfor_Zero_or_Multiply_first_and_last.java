package StringandArrayPrograms;

public class Checkfor_Zero_or_Multiply_first_and_last {
	public static boolean zerocheck(int [] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				return true;
			}
		}
		return false;
	}
	public static void multiply(int [] a) {
		int first = a[0];
		int last = a.length-1;
		int multiply = first*last;
		System.out.println(multiply) ;
	}
	public static void main(String[] args) {
		int [] a = {1, 3, 5, 7, 9, 6};
		if(zerocheck(a)) {
			System.out.println("Array contains zero element");
		} else {
			multiply(a);
		}
	}
}