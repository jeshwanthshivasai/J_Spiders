import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation you want to execute: ");
        int num = scanner.nextInt();
        if(num == 1) {
            System.out.println("Let's add, Please provide the numbers");
            System.out.println("Provide 1st and 2nd numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum for the given numbers are: ");

        } else if (num == 2) {
            System.out.println("Let's subtract, Please provide the numbers");
            System.out.println("\n");
            System.out.println("Provide 1st and 2nd numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int remainder = num1 - num2;
            System.out.println("The remainder for the given numbers are: ");

        } else if (num == 3) {
            System.out.println("Let's multiply, Please provide the numbers");
            System.out.println("\n");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int product = num1 * num2;
            System.out.println("The product for the given numbers is: ");

        } else if (num == 4) {
            System.out.println("Let's divide, Please provide the numbers");
            System.out.println("\n");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int quotient = num1 / num2;
            System.out.println("The quotient for the given numbers is: ");

        } else if (num == 5) {
            System.out.println("Let's check for Even/Odd, Please provide the number");
            System.out.println("\n");
            int num1 = scanner.nextInt();
            if (num1%2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

        } else if(num == 6) {
            System.out.println("Let's check for Remainder, Please provide the numbers");
            System.out.println("\n");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int remainder = num1 % num2;
            System.out.println("The quotient for the given numbers are: ");
        }
        scanner.close();
    }
}
