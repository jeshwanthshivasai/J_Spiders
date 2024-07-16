import java.util.Scanner;

public class Positive_Negative_Neutral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if(num > 0 && num != 0) {
            System.out.println("Positive Number");
        } else if(num < 0 && num != 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Neutral Number");
        }
        scanner.close();
    }
}