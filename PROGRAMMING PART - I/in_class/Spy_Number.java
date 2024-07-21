import java.util.Scanner;

public class Spy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //intialise a variable sum from 0
        int sum = 0;
        //intialise a variable product from 1
        int product = 1;
        //run a while loop until the number is not equal to zero
        while (num != 0) {
            //get the last digit
            int ld = num % 10;
            //add last digit to sum and update accordingly
            sum = sum + ld;
            //multiply last digit to product and update accordingly
            product = product * ld;
            //remove last digit from the number
            num = num / 10;
        }
        //print the sum
        System.out.println("Sum of Digits is: " + sum);
        //print the product
        System.out.println("Product of Digits is: " + product);
        //if sum and product are equal then it is spy number
        //to check they are equal use if condition
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}