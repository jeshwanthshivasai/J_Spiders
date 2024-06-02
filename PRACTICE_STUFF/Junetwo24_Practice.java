/*public class Junetwo24_Practice {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        int i=10;
        int j=0;
        try 
		{
            int res=i/j;
            System.out.println(res);
        }
        catch(Exception e) 
		{
            System.out.println("Exception while running");
        }
    }
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		Junetwo24_Practice x = new Junetwo24_Practice();
		System.out.println(x.getClass());
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int[ ] a =  new int [3];
		a[0] = 30;
		a[1] = 50;
		a[2] = 70;
		System.out.println(a[2]);
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4};
		System.out.println(a[2]);
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try 
		{
			int res = a/b;
			System.out.println(res);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception: Cannot divide by zero");
		}
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		String s = "jess";
		try
		{
			System.out.println(s.charAt(4));
		}
		catch (Exception e)
		{
			System.out.println("Exception: Antha led ikada");
		}
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int [] a = new int[3];
		a [0] = 10;
		a [1] = 20;
		a [2] = 30;
		a [3] = 40;
		try
		{
			System.out.println(a[6]);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception: Antha led ikada");
		}
	}
}*/

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int [] a = {10, 20, 30, 40};
		try
		{
			System.out.println(a[6]);
		}
		catch (Exception e)
		{
			System.out.println("Exception: Antha led akkada");
		}
	}
}*/

/* public class Junetwo24_Practice {
	public static void main(String[] args) {
		try
		{
			int [] a = new int [-1];
			System.out.println(a);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception: Antha led akkada");
		}
	}
} */

/* public class Junetwo24_Practice {
	public static void main(String[] args) {
		try
		{
			divide();
		} 
		catch (Exception e) 
		{
			System.out.println("Exception: Handled man!");
		}
	}
	public static void divide() {
		int a = 10;
		int b = 2;
		int res = a/b;
		System.out.println(res);
	}
} */

public class Junetwo24_Practice {
	public static void main(String[] args) {
		try 
		{
			divide();
		} 
		catch (Exception e) 
		{
			System.err.println("Exception: Handled man!");
		}
	}
	public static void divide() throws Exception {
		int a = 10;
		int b = 0;
		int res = a/b;
		System.out.println(res);
	}
}

/*public class Junetwo24_Practice {
	public static void main(String[] args) {
		int n = 2;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n%2 == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}*/
