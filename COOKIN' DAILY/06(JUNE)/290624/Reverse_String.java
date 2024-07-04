public class Reverse_String {
    public static void main(String[] args) {
        String s = "Java Developer";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            reverse = reverse + c;
        }
        System.out.println("Reversed string: " + reverse);
    }
}
