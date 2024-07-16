import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the final bill price: ");
        double finalBillPrice = scanner.nextDouble();
        if(finalBillPrice >= 5000) {
            System.out.println("Hooray!, You got a discount of 20% ie. "+ finalBillPrice*0.8 + ".");
        } else {
            System.out.println("Sorry, you get a discount of "+ finalBillPrice*0.1 + ".");
        }
        scanner.close();
    }
}