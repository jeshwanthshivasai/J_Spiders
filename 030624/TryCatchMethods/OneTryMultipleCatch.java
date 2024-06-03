package TryCatchMethods;

public class OneTryMultipleCatch {
	public static void main(String[] args) {
		OneTryMultipleCatch a = new OneTryMultipleCatch();
		try
		{
			a.divide();
		}
		catch (ArithmeticException e1)
		{
			System.out.println("Exception Handled");
		}
		catch (Exception e)
		{
			System.out.println("Exception occured and handled");
		}
	}
	public void divide() {
		int a = 2;
		int b = 0;
		int res = a/b;
		System.out.println(res);
	}
}
