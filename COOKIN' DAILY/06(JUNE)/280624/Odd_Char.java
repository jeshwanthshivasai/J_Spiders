public class Odd_Char {
    public static void main(String[] args) {
        String s = "jeshwanth";
        for (int i = 0; i < s.length() - 1; i++) {
            if (i != 0 && i%2 == 1) {
                System.out.println(s.charAt(i));
            }
        }
    }
}
