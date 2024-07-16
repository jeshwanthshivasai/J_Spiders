public class Check_Palindrome_Number {
    public static void main(String[] args) {
        int num = 121;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int ld = temp % 10;
            sum = sum * 10 + ld;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
