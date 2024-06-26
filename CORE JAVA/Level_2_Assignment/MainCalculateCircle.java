class Circle {
    public void calculateArea() {
        System.out.println("Calculating Area");
    }
    public void calculateCircumference() {
        System.out.println("Calculating Circumference");
    }
}
class Calculator {
    public static void findSqaure() {
        System.out.println("Finding Square");
    }
    public static void findCube() {
        System.out.println("Finding Cube");
    }
}
public class MainCalculateCircle {
    public static void main(String[] args) {
        Calculator.findSqaure();
        Circle c = new Circle();
        c.calculateCircumference();
    }
}
