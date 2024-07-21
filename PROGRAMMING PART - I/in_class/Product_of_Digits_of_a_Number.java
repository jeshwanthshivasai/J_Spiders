import java.util.Scanner;

public class Product_of_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        //intialise a variable named product equal from 1
        int product = 1;
        //run a while loop until the number is not equal to zero
        while (num != 0) {
            //to get the last digit one by one until the while condition is satisfied
            int ld = num % 10;
            //multiply product with last digit and update the variable value
            product = product * ld;
            //to remove the last digit one by one unti the while condition is satisfied
            num = num / 10;
        }
        System.out.println("Product of digits are: " + product);
        scanner.close();
    }
}