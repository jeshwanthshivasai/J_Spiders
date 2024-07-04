public class Aplha_Digit_SpecialChar {
    public static void main(String[] args) {
        String s = "Hyd789#?_";

        int alphacount = 0;
        int digitcount = 0;
        int specialcharcount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                alphacount++;

            } else if (c >= '0' && c <= '9') {
                digitcount++;

            } else {
                specialcharcount++;
            }
        }
        System.out.println("Number of alphabets: " + alphacount);
        System.out.println("Number of digits: " + digitcount);
        System.out.println("Number of special characters: " + specialcharcount);       
    }
}
