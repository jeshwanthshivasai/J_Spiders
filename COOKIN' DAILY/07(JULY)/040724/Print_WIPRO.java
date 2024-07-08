package string_and_array_programs;

public class Print_WIPRO {
	public static void main(String[] args) {
		String s = "W::I::P::R::O";
		print(s);
	}
	public static void print(String s) {
		String newstring = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				newstring = newstring + ch;
			}
		}
		System.out.println(newstring);
	}
}