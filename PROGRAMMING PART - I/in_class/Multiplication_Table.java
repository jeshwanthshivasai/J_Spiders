import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for(int i=1 ; i<=10 ; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
        scanner.close();
    }
}