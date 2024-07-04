package TryCatchMethods;

public class TryFinally {
	public static void main(String[] args) {
		try
		{
			divide();
		}
		finally
		{
			System.out.println("Execute Compulsory");
		}
	}
	public static void divide() {
		int [] a = null;
		System.out.println(a.length);
	}
}
