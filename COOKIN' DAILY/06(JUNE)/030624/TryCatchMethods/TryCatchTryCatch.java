package TryCatchMethods;

public class TryCatchTryCatch {
	public static void divide() {
		int a = 2;
		int b = 0;
		int res = a/b;
		System.out.println(res);
	}
	public static void array() {
		String s = "jeshwanthshivasai";
		System.out.println(s.charAt(20));
	}
	public static void main(String[] args) {
		try
		{
			divide();
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Exception: Handled!");
		}
		try
		{
			array();
		}
		catch (StringIndexOutOfBoundsException s)
		{
			System.out.println("Exception: Handled!");
		}
	}
}
