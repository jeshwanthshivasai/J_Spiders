/*public class Alpha_Digits {
    public static void main(String[] args) {
        String s = "jesse";
        int alphacount = 0;
        int digitcount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                System.out.println(c);
            } else if (c >= '0' && c <= '9') {
                System.out.println(c);
            }
        }
    }
}*/

public class Alpha_Digits {
    public static void main(String[] args) {
        String s = "jesse";
        int alphacount = 0;
        int digitcount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                alphacount++;
            } else if (Character.isDigit(c)) {
                digitcount++;
            }
        }
        System.out.println(alphacount);
        System.out.println(digitcount);
    }
}