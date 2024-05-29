package PRACTICE_STUFF.290524.Abstraction;

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
