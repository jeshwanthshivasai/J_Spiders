//using new keyword

// public class IntArray {
// 	public static void main(String[] args) {
// 		int [] i = new int[5];
// 		i[0] = 10;
// 		i[1] = 20;
// 		i[2] = 30;
// 		i[3] = 40;
// 		i[4] = 50;
// 		for(int j=0;j<i.length;j++) {
// 			System.out.println(i[j]);
// 		}
// 	}
// }

//using literals

// public class IntArray {
// 	public static void main(String[] args) {
// 		int[] i = {10, 20, 30, 40, 50};
		
// 		for(int j=0;j<i.length;j++) {
// 			System.out.println(i[j]);
// 		}
// 	}
// }

//print an array of evennumbers
public class IntArray {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		for (int i = 0 ; (i < a.length) ; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}