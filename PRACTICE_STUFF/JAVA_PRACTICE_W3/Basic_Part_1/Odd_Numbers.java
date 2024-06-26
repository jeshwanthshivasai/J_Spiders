package JAVA_PRACTICE_W3.Basic_Part_1;

public class Odd_Numbers {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i<100; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
}
