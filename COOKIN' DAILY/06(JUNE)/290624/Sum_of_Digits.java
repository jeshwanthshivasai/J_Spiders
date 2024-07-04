public class Sum_of_Digits {
    public static void main(String[] args) {
        int num = 23579;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}