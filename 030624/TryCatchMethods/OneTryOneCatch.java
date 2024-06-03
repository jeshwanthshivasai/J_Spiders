package TryCatchMethods;

public class OneTryOneCatch {
	public static void main(String[] args) {
		try
		{
			divide();
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
	public static void divide() {
		int a = 2;
		int b = 0;
		int res = a/b;
		/*System.out.println(res);
		int i=10;
		int j=0;
		int k= i/j;
		System.out.println(k);*/
	}
}
