import java.util.Scanner;

public class Grade_Ranking_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':System.out.println("You got first rank");
            break;
            case 'B':System.out.println("You got second rank");
            break;
            case 'C':System.out.println("You got first class");
            break;
            case 'D':System.out.println("You got second class");
            break;
            case 'E':System.out.println("You have just passed");
            break;
            case 'F':System.out.println("You have failed");
            break;
            default: System.out.println("Enter Valid Grade");
            break;
        }
        scanner.close();
    }
}