public class Prod_of_Digits {
    public static void main(String[] args) {
        int num = 2345;
        int prod = 1;
        while (num > 0) {
            int digit = num % 10;
            prod *= digit;
            num /= 10;
        }
        System.out.println("Product of digits: " + prod);
    }
}