import java.util.Scanner;

public class Sum_of_Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //initialize a variable 'sum' to zero
        int sum = 0;
        //run a while loop until the number is not equal to zero
        while(num != 0) {
            //to get the  last digit from number
            int ld = num % 10;
            //add the last digit to the sum
            sum = sum + ld;
            //remove the last digit from the number
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}