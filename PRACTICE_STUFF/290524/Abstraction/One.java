abstract class One {
    public abstract double area();
}
class Circle extends One {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area()=" + area() + ", toString()=" + super.toString() + "]";
    }
}
    