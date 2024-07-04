import java.util.Scanner;

public class Largest_Value {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int num1 = s.nextInt();
        System.out.print("Enter your second value: ");
        int num2 = s.nextInt();
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num1");
        }
    }
}
