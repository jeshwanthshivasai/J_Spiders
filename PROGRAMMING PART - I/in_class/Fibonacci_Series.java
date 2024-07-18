import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++) {
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }
        scanner.close();
    }
}