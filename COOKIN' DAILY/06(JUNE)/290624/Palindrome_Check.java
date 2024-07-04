public class Palindrome_Check {
    public static void main(String[] args) {
        String s = "sees";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            reverse = reverse + c;
        }
        if (reverse.equalsIgnoreCase(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
