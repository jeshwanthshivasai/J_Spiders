//CONSTRUCTOR
//class declaration
public class Rectangle {
    //non-static members
    public int length;
    public int breadth;
    public int height;
    //create constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    //create another constructor
    public Rectangle(int length, int breadth, int height) {
        // this(length, breadth);
        this(length, breadth);
        this.height = height;
    }
    //create a method
    public void areaof2drect() {
        int area = length*breadth;
        System.out.println(area);
    }
    //create another method
    public void areaof3drect() {
        int area = length*breadth*height;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Rectangle p1 = new Rectangle(10, 20);
        p1.areaof2drect();
        Rectangle p2 = new Rectangle(10, 20, 30);
        p2.areaof3drect();
    }
}