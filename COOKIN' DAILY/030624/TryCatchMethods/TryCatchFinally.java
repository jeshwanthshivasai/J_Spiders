package TryCatchMethods;

public class TryCatchFinally {
	public static void main(String[] args) {
		try
		{
			divide();
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Division is completed");
		}
	}
	public static void divide() {
		int a = 2;
		int b = 0;
		int res = a/b;
		System.out.println(res);
	}
}
