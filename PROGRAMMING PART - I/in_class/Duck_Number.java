public class Duck_Number {
    public static void main(String[] args) {
        int num = 101;
        int product = 1;
        while (num != 0) {
            int ld = num % 10;
            product = product * ld;
            num = num / 10;
        }
        if (product % 4 == 0) {
            System.out.println(num + " is a duck number.");
        } else {
            System.out.println(num + " is not a duck number.");
        }
    }
}