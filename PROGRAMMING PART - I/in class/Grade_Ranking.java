import java.util.Scanner;

public class Grade_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student's grade: ");
        char grade = scanner.next().charAt(0);
        if(grade == 'A' || grade == 'a') {
            System.out.println("First rank");
        } else if(grade == 'B' || grade == 'b') {
            System.out.println("Second rank");
        } else if(grade == 'C' || grade == 'c') {
            System.out.println("First class");
        } else if(grade == 'D' || grade == 'd') {
            System.out.println("Second class");
        } else if(grade == 'E' || grade =='e') {
            System.out.println("Just pass");
        } else if(grade == 'F' || grade =='f') {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
