import java.util.Scanner;

public class IAS_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        if (age >=21 && age <= 32 ) {
            System.out.println("Eligible to write IAS exam.");
        } else {
            System.out.println("Ineligible to write IAS exam.");
        }
        scanner.close();
    }
}