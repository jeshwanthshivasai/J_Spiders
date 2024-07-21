import java.util.Scanner;

public class Twisted_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverseNum = 0;
        int originalNum = num;
        while (num!= 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        if (isPrime(originalNum) && isPrime(reverseNum)) {
            System.out.println("The number is a twisted prime number.");
        } else {
            System.out.println("The number is not a twisted prime number.");
        }
        sc.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }  // End of isPrime() method.
    // End of Twisted_Prime class.
    // End of main method.
    // End of Java program.
    // End of Twisted_Prime.java file.
}
