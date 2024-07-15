import java.util.Scanner;

public class Park_Entrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (gender == "Male" || age > 18 && age < 60) {
            System.out.println("Please pay Rs. 100");
        } else if (gender == "Female" || age > 18 && age < 60) {
            System.out.println("Please pay Rs.80");
        } else if (gender == "Male" || age < 18) {
            System.out.println("Please pay Rs.10");
        } else if (gender == "Transgender" || age > 18 && age < 60) {
            System.out.println("Please pay Rs. 50");
        } else if (gender == " Male"  && gender == "Female" || age > 60) {
            System.out.println("You need not pay any fee.");
        } else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}