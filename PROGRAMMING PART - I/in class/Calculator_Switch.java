import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
            {
                System.out.println("You have selected Circle to find it's Area");
                System.out.println("Enter Radius of a Circle");
                double radius = scanner.nextDouble();
                double area = 3.14 * radius * radius;
                System.out.println("Area of a Circle: " + area);
            }
            case 2:
            {
                System.out.println("You have selected Circle to find it's Area");
                System.out.println("Enter Radius of a Circle");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                double area = length * breadth;
                System.out.println("Area of a Rectangle: " + area);
            }
            case 3:
            {
                System.out.println("You have selected Circle to find it's Area");
                System.out.println("Enter Radius of a Circle");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double area = 0.5 * base * height;
                System.out.println("Area of a Triangle: " + area);
            }
            case 4:
            {
                System.out.println("You have selected Circle to find it's Area");
                System.out.println("Enter Radius of a Circle");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                double area = length * breadth;
                System.out.println("Area of a Rhombus: " + area);
            }
            case 5:
            {
                System.out.println("You have selected Circle to find it's Area");
                System.out.println("Enter Radius of a Circle");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                double area = length * breadth;
                System.out.println("Area of a Trapezium0000: " + area);
            }
            break;
            default : System.out.println("Invalid Input");
        }
    }
}
