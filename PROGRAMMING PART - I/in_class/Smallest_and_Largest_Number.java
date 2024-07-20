import java.util.Scanner;

public class Smallest_and_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        int min = 0;

        while (num != 0) {
            int ld = num % 10;
            if (ld < min) {
                min = ld;
            }
            if (ld > max) {
                max = ld;
            }
            num = num / 10;
        }
        System.out.println("Smallest digit: " + min);
        System.out.println("Largest digit: " + max);
    }
}
