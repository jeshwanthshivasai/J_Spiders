import java.util.Scanner;

public class Evil_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num!=0) {
            num = num / 10;
            count++;
        }
        num = num / 2;
    }
}
