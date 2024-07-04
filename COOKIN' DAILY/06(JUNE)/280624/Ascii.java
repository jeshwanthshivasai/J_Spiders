public class Ascii {
    public static void main(String[] args) {
        String s = "JESS";
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            sum += c;
        }
        System.out.println("Sum of ASCII values: " + sum);
    }
}
