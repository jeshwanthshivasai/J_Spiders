package WrapperClasses;

public class ToString {
	public static void main(String[] args) {
		Byte b = new Byte((byte) 2);
		System.out.println(b.toString());
		
		Short s = new Short((short) 2);
		System.out.println(s.toString());
		
		Integer i = new Integer((int) 22);
		System.out.println(i.toString());
		
		Character ch = new Character((char) 'j');
		System.out.println(ch.toString());
		
		Float f = new Float((float) 2.3f);
		System.out.println(f.toString());
		
		Double d = new Double((double) 2.3333);
		System.out.println(d.toString());
		
		Long l = new Long((long) 222333444);
		System.out.println(l.toString());
		
		Boolean bool = new Boolean((boolean) true);
		System.out.println(bool.toString());
	}
}
