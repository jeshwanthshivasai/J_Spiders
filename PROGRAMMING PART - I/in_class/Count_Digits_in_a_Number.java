import java.util.Scanner;

public class Count_Digits_in_a_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //initialize count from zero
        int count = 0;
        //run while loop until the number is not equal to zero
        while (num != 0) {
            //until it is not equal to zero increase count
            count++;
            //remove last digit from the number
            num = num / 10;
        }
        System.out.println("The number of Digits in the number are: " + count);
        scanner.close();
    }
}
