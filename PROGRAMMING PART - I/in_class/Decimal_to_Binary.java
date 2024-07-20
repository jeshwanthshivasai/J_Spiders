import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //take a number from the user input
        int n = sc.nextInt();
        //since placevalue starts from 1
        int placevalue = 1;
        //consider the result(converted binary value) as 0
        int binary = 0;

        //start a while loop runnning from 0
        while (n != 0) {
            int remainder = n % 2;
            //add remainder to binary and multiply it with placevalue
            binary = binary + (remainder * placevalue);
            //divide the number by 2 to get the next digit
            n = n / 2;
            //increase the placevalue by 10
            placevalue = placevalue * 10;
        }
        System.out.println(binary);
    }
}