package NumberProgramsAndPatternPrograms;

public class One {
	public static void main(String[] args) {
		int a = 9;
		int b = 11;
		System.out.println("Before swapping a = " + a + " and b = " + b);
		
		int temp = a;
		a=b;
		b = temp;
		System.out.println("After swapping a = " + a + " and b = " + b);
	}
}
