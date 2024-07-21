import java.util.Scanner;

public class Duck_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //intialise a variable named product from 1
        int product = 1;
        //run a while loop until the num is not equal to zero
        while (num != 0) {
            //get the last digit
            int ld = num % 10;
            //multiply the product with last digit
            product = product * ld;
            //remove the last digit
            num = num / 10;
        }
        //run a if condition to check the number is duck or not
        if (product % 4 == 0) {
            System.out.println(num + " is a duck number.");
        } else {
            System.out.println(num + " is not a duck number.");
        }
    }
}