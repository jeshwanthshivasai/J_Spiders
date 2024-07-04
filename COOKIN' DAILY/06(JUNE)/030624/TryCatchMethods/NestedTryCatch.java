package TryCatchMethods;

public class NestedTryCatch {
	public static void  divide() {
		String s = "jess";
		System.out.println(s.charAt(5));
	}
	public static void main(String[] args) {
		try
		{
			String s1 = "ahha";
			System.out.println(s1.charAt(5));
			try
			{
				divide();
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Exception handled");
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("exception occured and handled");
		}
	}
}

//debug later
